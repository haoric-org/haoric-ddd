package org.haoric.ddd.generator.components.generator.domain.application.query.anticorruption;

import org.haoric.ddd.generator.common.model.application.query.anticorruption.DDDGeneratorQueryRepository;
import org.haoric.ddd.generator.components.generator.domain.domain.anticorruption.DomainRepository;
import org.haoric.ddd.generator.components.generator.domain.domain.entity.DomainAggregate;

/**
 * DomainQueryRepository
 * <p>领域聚合查询仓储接口
 * <p>
 * create 2025/08/07 16:48
 * <p>
 * update 2025/08/07 16:48
 *
 * @author Deng Haozhi
 * @see DomainRepository
 * @see DDDGeneratorQueryRepository
 * @since 1.0.0
 */
public interface DomainQueryRepository extends DomainRepository, DDDGeneratorQueryRepository<DomainAggregate> {

}
