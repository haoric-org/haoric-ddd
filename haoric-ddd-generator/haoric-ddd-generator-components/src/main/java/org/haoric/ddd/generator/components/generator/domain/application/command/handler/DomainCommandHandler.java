package org.haoric.ddd.generator.components.generator.domain.application.command.handler;

import org.haoric.ddd.generator.common.model.application.command.handler.DDDGeneratorCommandHandler;
import org.haoric.ddd.generator.components.generator.domain.application.command.transfer.DomainCreateReqCTransferReq;
import org.haoric.ddd.generator.components.generator.domain.domain.entity.DomainAggregate;

/**
 * DomainCommandHandler
 * <p>领域领域命令处理器
 * <p>
 * create 2025/08/07 16:48
 * <p>
 * update 2025/08/07 16:48
 *
 * @author Deng Haozhi
 * @see DDDGeneratorCommandHandler < DomainAggregate >
 * @since 1.0.0
 */
public interface DomainCommandHandler extends DDDGeneratorCommandHandler<DomainAggregate> {

    void create(DomainCreateReqCTransferReq command);

}
