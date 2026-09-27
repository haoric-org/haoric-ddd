package org.haoric.ddd.starter.common.utils.model.time;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.haoric.ddd.starter.common.exception.utils.model.time.TimestampException;
import org.springframework.util.StringUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TimestampTools
 * <p>
 * 时间戳工具类
 * <p>
 * 主要用于：
 * <ul>
 * <li>获取当前时间戳</li>
 * <li>时间戳之间的时间差计算</li>
 * <li>日期时间字符串转换为时间戳</li>
 * <li>ISO-8601 时间字符串转换为时间戳</li>
 * <li>时间戳单位换算</li>
 * </ul>
 * <p>
 * 时间点统一使用
 * {@link Instant}
 * 表示，避免时间工具类内部依赖具体时区。
 * <p>
 * 字符串时间转换规则：
 * <ul>
 * <li>Pattern 必须符合 Java
 * {@link DateTimeFormatter}
 * 规范</li>
 * <li>日期是时间戳转换的最低要求</li>
 * <li>没有时间部分时，默认使用 00:00:00</li>
 * <li>有时间但缺少分钟、秒、纳秒时，由 Java Time API 默认补 0</li>
 * <li>输入包含 Offset 或 Zone 时，优先使用输入提供的时间区域</li>
 * <li>输入没有 Offset 或 Zone 时，使用系统默认时区</li>
 * </ul>
 * <p>
 * create 2024/10/30 11:24
 * <p>
 * update 2026/08/19 18:12
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TimestampTools {

    /**
     * 一秒对应的毫秒数。
     */
    public static final Long ONE_SECOND = 1_000L;

    /**
     * 一分钟对应的毫秒数。
     */
    public static final Long ONE_MINUTE = 60L * ONE_SECOND;

    /**
     * 一小时对应的毫秒数。
     */
    public static final Long ONE_HOUR = 60L * ONE_MINUTE;

    /**
     * 一天对应的毫秒数。
     */
    public static final Long ONE_DAY = 24L * ONE_HOUR;

    /**
     * 一周对应的毫秒数。
     */
    public static final Long ONE_WEEK = 7L * ONE_DAY;

    /**
     * 30 天对应的毫秒数。
     * <p>
     * 注意：这里表示固定的 30 天，不代表自然月。
     */
    public static final Long ONE_MONTH = 30L * ONE_DAY;

    /**
     * 系统默认时区。
     * <p>
     * 用于没有明确指定 Offset 或 Zone 的日期时间字符串转换。
     */
    private static final ZoneId SYSTEM_ZONE_ID = ZoneId.systemDefault();

    /**
     * DateTimeFormatter 缓存。
     * <p>
     * DateTimeFormatter 是线程安全的，可以在多线程环境下复用。
     * <p>
     * 相同 Pattern 只创建一次，避免高并发场景重复创建 Formatter。
     */
    private static final ConcurrentHashMap<String, DateTimeFormatter> FORMATTERS = new ConcurrentHashMap<>();

    /**
     * 获取当前时间戳。
     * <p>
     * Instant 表示 UTC 时间线上的绝对时间点，因此不需要指定时区。
     *
     * @return 当前时间的毫秒时间戳
     */
    public static Long now() {
        return Instant.now().toEpochMilli();
    }

    /**
     * 计算两个时间戳之间的时间差。
     *
     * @param start 开始时间戳，单位：毫秒
     * @param end   结束时间戳，单位：毫秒
     * @return 时间差，单位：毫秒
     */
    public static Long between(Long start, Long end) {
        if (start == null || end == null) {
            throw new TimestampException("时间戳不能为空");
        }
        return Duration.between(Instant.ofEpochMilli(start), Instant.ofEpochMilli(end)).toMillis();
    }

    /**
     * 将日期时间字符串转换为毫秒时间戳。
     * <p>
     * Pattern 使用 Java {@link DateTimeFormatter} 标准格式。
     * <p>
     * 转换过程：
     * <pre>
     * String
     *     ↓
     * DateTimeFormatter
     *     ↓
     * TemporalAccessor
     *     ↓
     * LocalDate / LocalTime / Offset / Zone
     *     ↓
     * Instant
     *     ↓
     * epochMilli
     * </pre>
     *
     * <p>
     * 例如：
     *
     * <pre>
     * from("2026-08-19", "yyyy-MM-dd")
     * from("2026-08-19 15", "yyyy-MM-dd HH")
     * from("2026-08-19 15:30", "yyyy-MM-dd HH:mm")
     * from("2026-08-19 15:30:20", "yyyy-MM-dd HH:mm:ss")
     * from("2026-08-19 15:30:20+08:00", "yyyy-MM-dd HH:mm:ssXXX")
     * </pre>
     *
     * @param timestamp 日期或日期时间字符串
     * @param pattern   Java DateTimeFormatter 格式
     * @return 毫秒时间戳
     */
    public static Long from(String timestamp, String pattern) {
        if (!StringUtils.hasText(timestamp)) {
            throw new TimestampException("格式化时间戳失败，时间为空");
        }
        if (!StringUtils.hasText(pattern)) {
            throw new TimestampException("格式化时间戳失败，格式化字符串为空");
        }
        try {
            DateTimeFormatter formatter = formatter(pattern);
            TemporalAccessor temporal = formatter.parse(timestamp);
            LocalDate date = temporal.query(TemporalQueries.localDate());
            if (date == null) {
                throw new TimestampException("格式化时间戳失败，时间格式必须包含完整日期，时间: " + timestamp + "，格式: " + pattern);
            }
            LocalTime time = temporal.query(TemporalQueries.localTime());
            if (time == null) {
                time = LocalTime.MIDNIGHT;
            }
            ZoneId zone = temporal.query(TemporalQueries.zone());
            return date.atTime(time)
                    .atZone(zone == null ? SYSTEM_ZONE_ID : zone)
                    .toInstant()
                    .toEpochMilli();
        } catch (DateTimeException e) {
            throw new TimestampException("格式化时间戳失败，时间或格式化字符串格式错误，时间: " + timestamp + "，格式: " + pattern, e);
        }
    }

    /**
     * 将 ISO-8601 时间字符串转换为毫秒时间戳。
     * <p>
     * ISO-8601 时间字符串自身必须包含足够的信息确定时间点。
     * 例如：
     *
     * <pre>
     * 2026-08-19T15:30:00Z
     * 2026-08-19T15:30:00+08:00
     * </pre>
     *
     * @param timestamp ISO-8601 时间字符串
     * @return 毫秒时间戳
     */
    public static Long fromISO(String timestamp) {
        if (!StringUtils.hasText(timestamp)) {
            throw new TimestampException("格式化时间戳失败，时间为空");
        }
        try {
            return Instant.parse(timestamp).toEpochMilli();
        } catch (DateTimeException e) {
            throw new TimestampException("格式化时间戳失败，ISO-8601 时间格式错误: " + timestamp, e);
        }
    }

    /**
     * 将毫秒时间长度转换为固定 30 天的数量。
     *
     * @param timestamp 时间长度，单位：毫秒
     * @return 30 天的数量
     */
    public static Long months(Long timestamp) {
        return timestamp / ONE_MONTH;
    }

    /**
     * 将毫秒时间长度转换为周数。
     *
     * @param timestamp 时间长度，单位：毫秒
     * @return 周数
     */
    public static Long weeks(Long timestamp) {
        return timestamp / ONE_WEEK;
    }

    /**
     * 将毫秒时间长度转换为天数。
     *
     * @param timestamp 时间长度，单位：毫秒
     * @return 天数
     */
    public static Long days(Long timestamp) {
        return timestamp / ONE_DAY;
    }

    /**
     * 将毫秒时间长度转换为小时数。
     *
     * @param timestamp 时间长度，单位：毫秒
     * @return 小时数
     */
    public static Long hours(Long timestamp) {
        return timestamp / ONE_HOUR;
    }

    /**
     * 将毫秒时间长度转换为分钟数。
     *
     * @param timestamp 时间长度，单位：毫秒
     * @return 分钟数
     */
    public static Long minutes(Long timestamp) {
        return timestamp / ONE_MINUTE;
    }

    /**
     * 将毫秒时间长度转换为秒数。
     *
     * @param timestamp 时间长度，单位：毫秒
     * @return 秒数
     */
    public static Long seconds(Long timestamp) {
        return timestamp / ONE_SECOND;
    }

    /**
     * 将时间戳按指定格式转换为日期时间字符串。
     *
     * @param timestamp 时间点
     * @param pattern   Java DateTimeFormatter 格式
     * @return 格式化后的日期时间字符串
     */
    static String format(Long timestamp, String pattern) {
        if (timestamp == null) {
            throw new TimestampException("时间不能为空");
        }
        if (!StringUtils.hasText(pattern)) {
            throw new TimestampException("格式化字符串不能为空");
        }
        try {
            return Instant.ofEpochMilli(timestamp).atZone(SYSTEM_ZONE_ID).format(formatter(pattern));
        } catch (DateTimeException e) {
            throw new TimestampException("格式化时间失败，时间: " + timestamp + "，格式: " + pattern, e);
        }
    }

    /**
     * 获取缓存的 DateTimeFormatter。
     * <p>
     * DateTimeFormatter 是线程安全的，可以安全地在多个线程之间复用。
     *
     * @param pattern Java DateTimeFormatter 格式
     * @return DateTimeFormatter
     */
    private static DateTimeFormatter formatter(String pattern) {
        try {
            return FORMATTERS.computeIfAbsent(pattern, DateTimeFormatter::ofPattern);
        } catch (IllegalArgumentException e) {
            throw new TimestampException("时间格式错误，格式: " + pattern, e);
        }
    }
}
