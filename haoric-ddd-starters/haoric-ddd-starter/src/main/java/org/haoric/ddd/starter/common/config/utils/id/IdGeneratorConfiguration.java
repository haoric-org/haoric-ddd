package org.haoric.ddd.starter.common.config.utils.id;

import jakarta.annotation.PostConstruct;
import org.haoric.ddd.starter.common.config.endless.properties.HaoricProperties;

/**
 * IdConfiguration
 * <p>
 * create 2025/08/21 02:37
 * <p>
 * update 2025/08/21 02:37
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
public class IdGeneratorConfiguration {

    private final HaoricProperties properties;

    public IdGeneratorConfiguration(HaoricProperties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void init() {
        org.haoric.ddd.starter.common.config.utils.id.IdGenerator.init(properties.getDataCenterId(), properties.getWorkerId());
    }
}
