package org.haoric.ddd.starter.common.config.rest.server;

import org.haoric.ddd.starter.common.config.endless.properties.HaoricProperties;
import org.haoric.ddd.starter.common.config.rest.converter.FastJson2HttpMessageConverter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.*;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * RestServerConfiguration
 * <p>
 * create 2024/11/09 19:23
 * <p>
 * update 2024/11/17 16:28
 *
 * @author Deng Haozhi
 * @see WebMvcConfigurer
 * @since 1.0.0
 */
public class RestServerConfiguration implements WebMvcConfigurer {

    private final HaoricProperties properties;

    private final FastJson2HttpMessageConverter<Object> fastJson2HttpMessageConverter;

    public RestServerConfiguration(
            HaoricProperties properties,
            FastJson2HttpMessageConverter<Object> fastJson2HttpMessageConverter) {
        this.properties = properties;
        this.fastJson2HttpMessageConverter = fastJson2HttpMessageConverter;
    }

    @Override
    public void configureMessageConverters(@NonNull List<HttpMessageConverter<?>> converters) {
        converters.clear();
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(new StringHttpMessageConverter(properties.charset().getCharset()));
        converters.add(new ResourceHttpMessageConverter());
        converters.add(new ResourceRegionHttpMessageConverter());
        converters.add(new AllEncompassingFormHttpMessageConverter());
        converters.add(fastJson2HttpMessageConverter);
    }

    @ConditionalOnMissingBean(FastJson2HttpMessageConverter.class)
    public @Bean FastJson2HttpMessageConverter<Object> fastJson2HttpMessageConverter() {
        return new FastJson2HttpMessageConverter<>(properties);
    }
}
