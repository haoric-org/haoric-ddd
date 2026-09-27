package org.haoric.ddd.starter.common.config.endless.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * HaoricConstant
 * <p>
 * create 2024/11/19 01:58
 * <p>
 * update 2024/11/19 01:58
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HaoricConstant {

    public static final Set<String> SENSITIVE_KEYS = Set.of(
            "password", "passcode", "pwd", "secret", "key", "salt", "token", "verification");

    public static final String[] JSON_ALLOWED_TYPES = new String[]{
            "java.lang.String", "java.lang.Integer", "java.lang.Boolean", "java.util.List", "java.util.Map"
    };
}
