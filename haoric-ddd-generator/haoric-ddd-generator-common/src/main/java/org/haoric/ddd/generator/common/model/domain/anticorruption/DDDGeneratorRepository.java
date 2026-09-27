package org.haoric.ddd.generator.common.model.domain.anticorruption;

import org.haoric.ddd.generator.common.model.domain.entity.DDDGeneratorAggregate;
import org.haoric.ddd.starter.common.ddd.domain.anticorruption.Repository;

/**
 * DDDGeneratorRepository
 * <p>
 * create 2025/08/02 19:31
 * <p>
 * update 2025/08/02 19:32
 *
 * @author Deng Haozhi
 * @see Repository
 * @since 1.0.0
 */
public interface DDDGeneratorRepository
        <A extends DDDGeneratorAggregate> extends Repository<A> {

}
