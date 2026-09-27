package org.haoric.ddd.starter.common.config.rest.converter;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.Filter;
import lombok.extern.slf4j.Slf4j;
import org.haoric.ddd.starter.common.config.endless.properties.HaoricProperties;
import org.haoric.ddd.starter.common.exception.config.rest.RestFailedException;
import org.haoric.ddd.starter.common.utils.model.json.JsonTools;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

import static org.haoric.ddd.starter.common.config.endless.constant.HaoricConstant.JSON_ALLOWED_TYPES;

/**
 * FastJson2HttpMessageConverter
 * <p>
 * create 2024/11/09 19:28
 * <p>
 * update 2024/11/17 16:28
 *
 * @author Deng Haozhi
 * @see AbstractHttpMessageConverter
 * @since 1.0.0
 */
@Slf4j
@NullMarked
public class FastJson2HttpMessageConverter<T> extends AbstractGenericHttpMessageConverter<T> {

    private final Charset charset;

    public FastJson2HttpMessageConverter(HaoricProperties properties) {
        super(MediaType.APPLICATION_JSON);
        this.charset = properties.charset().getCharset();
        setDefaultCharset(this.charset);
    }

    @Override
    public T read(Type type, @Nullable Class<?> contextClass, HttpInputMessage inputMessage) {
        try (InputStream inputStream = inputMessage.getBody()) {
            byte[] buffer = inputStream.readAllBytes();
            String string = new String(buffer, charset);
            log.trace("[Rest反序列化对象]: {}", JsonTools.maskSensitive(string.replaceAll("\\s", "")));
            return JSON.parseObject(string, type, filter());
        } catch (Exception e) {
            throw new RestFailedException("Rest反序列化对象异常: " + e.getMessage(), e);
        }
    }

    @Override
    protected void writeInternal(T t, HttpOutputMessage outputMessage) {
        try {
            writeInternal(t, t.getClass(), outputMessage);
        } catch (IOException | HttpMessageNotWritableException e) {
            throw new RestFailedException("Rest序列化对象异常: " + e.getMessage(), e);
        }
    }

    @Override
    protected void writeInternal(T t, @Nullable Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        try {
            String json = JSON.toJSONString(t, filter(), JSONWriter.Feature.PrettyFormat);
            log.trace("[Rest序列化对象]: {}", JsonTools.maskSensitive(json.replaceAll("\\s", "")));
            outputMessage.getBody().write(json.getBytes(charset));
        } catch (Exception e) {
            throw new RestFailedException("Rest序列化对象异常: " + e.getMessage(), e);
        }
    }

    @Override
    protected T readInternal(Class<? extends T> clazz, HttpInputMessage inputMessage) {
        try {
            return read(clazz, clazz, inputMessage);
        } catch (HttpMessageNotReadableException e) {
            throw new RestFailedException("Rest反序列化对象异常: " + e.getMessage(), e);
        }
    }

    private Filter filter() {
        return JSONReader.autoTypeFilter(JSON_ALLOWED_TYPES);
    }
}
