package org.haoric.ddd.starter.common.utils.model.time;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * DateTools
 * <p>
 * 日期工具类
 * <p>
 * 主要用于日期字符串与时间戳之间的转换
 * <p>
 * 日期格式化默认使用系统时区
 * <p>
 * create 2024/10/30 11:17
 * <p>
 * update 2026/08/19 15:25
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DateTools {

    /**
     * 默认日期格式。
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * 获取当前日期。
     *
     * @return 当前日期
     */
    public static String now() {
        return now(DEFAULT_DATE_FORMAT);
    }

    /**
     * 获取当前日期。
     *
     * @param pattern 日期格式
     * @return 当前日期
     */
    public static String now(String pattern) {
        return org.haoric.ddd.starter.common.utils.model.time.TimestampTools.format(org.haoric.ddd.starter.common.utils.model.time.TimestampTools.now(), pattern);
    }

    /**
     * 将时间戳转换为默认格式的日期。
     *
     * @param timestamp 毫秒时间戳
     * @return 日期字符串
     */
    public static String from(Long timestamp) {
        return from(timestamp, DEFAULT_DATE_FORMAT);
    }

    /**
     * 将时间戳按照指定格式转换为日期字符串。
     *
     * @param timestamp 毫秒时间戳
     * @param pattern   日期格式
     * @return 日期字符串
     */
    public static String from(Long timestamp, String pattern) {
        return org.haoric.ddd.starter.common.utils.model.time.TimestampTools.format(timestamp, pattern);
    }
}
