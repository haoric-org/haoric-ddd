package org.haoric.ddd.starter.common.utils.model.time;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * DateTimeTools
 * <p>日期时间工具类
 * <p>主要用于日期时间字符串与时间戳之间的转换
 * <p>
 * create 2024/10/31 14:57
 * <p>
 * update 2026/08/19 15:25
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DateTimeTools {

    /**
     * 默认日期时间格式。
     */
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss:SSS";

    /**
     * 获取当前日期时间。
     *
     * @return 当前日期时间字符串
     */
    public static String now() {
        return now(DEFAULT_DATE_TIME_FORMAT);
    }

    /**
     * 获取当前日期时间。
     *
     * @param pattern 日期时间格式
     * @return 当前日期时间字符串
     */
    public static String now(String pattern) {
        return org.haoric.ddd.starter.common.utils.model.time.TimestampTools.format(org.haoric.ddd.starter.common.utils.model.time.TimestampTools.now(), pattern);
    }

    /**
     * 将时间戳转换为默认格式的日期时间字符串。
     *
     * @param timestamp 毫秒时间戳
     * @return 日期时间字符串
     */
    public static String from(Long timestamp) {
        return from(timestamp, DEFAULT_DATE_TIME_FORMAT);
    }

    /**
     * 将时间戳转换为默认格式的日期时间字符串。
     *
     * @param timestamp 毫秒时间戳
     * @param pattern   日期时间格式
     * @return 日期时间字符串
     */
    public static String from(Long timestamp, String pattern) {
        return org.haoric.ddd.starter.common.utils.model.time.TimestampTools.format(timestamp, pattern);
    }
}
