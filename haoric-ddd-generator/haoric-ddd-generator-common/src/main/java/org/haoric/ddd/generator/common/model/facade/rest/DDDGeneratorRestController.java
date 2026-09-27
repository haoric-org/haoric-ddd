package org.haoric.ddd.generator.common.model.facade.rest;

import org.haoric.ddd.starter.common.ddd.facade.rest.RestController;

/**
 * DDDGeneratorRestController
 * <p>
 * create 2024/09/06 15:29
 * <p>
 * update 2024/09/11 00:59
 *
 * @author Deng Haozhi
 * @see RestController
 * @since 1.0.0
 */
public interface DDDGeneratorRestController extends RestController {

    default String serviceDescription() {
        return "";
    }
}
