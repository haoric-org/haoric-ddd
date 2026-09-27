package org.haoric.ddd.generator.components.generator.project.application.query.anticorruption;

import org.haoric.ddd.generator.common.model.application.query.anticorruption.DDDGeneratorQueryRepository;
import org.haoric.ddd.generator.components.generator.project.application.query.transfer.ProjectFindSimpleProfileRespQTransferReq;
import org.haoric.ddd.generator.components.generator.project.domain.anticorruption.ProjectRepository;
import org.haoric.ddd.generator.components.generator.project.domain.entity.ProjectAggregate;

import java.util.List;

/**
 * ProjectQueryRepository
 * <p>项目聚合查询仓储接口
 * <p>
 * create 2025/08/02 19:36
 * <p>
 * update 2025/08/02 19:44
 *
 * @author Deng Haozhi
 * @see ProjectRepository
 * @see ProjectRepository
 * @since 1.0.0
 */
public interface ProjectQueryRepository extends ProjectRepository, DDDGeneratorQueryRepository<ProjectAggregate> {

    List<ProjectFindSimpleProfileRespQTransferReq> findSimpleProfilesByIds(List<String> projectIds);

    Boolean existsById(String projectId);

}
