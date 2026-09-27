package org.haoric.ddd.generator.components.generator.domain.sidecar.rest;

import org.haoric.ddd.generator.common.model.facade.rest.DDDGeneratorRestController;
import org.haoric.ddd.generator.components.generator.domain.facade.adapter.DomainDrivingAdapter;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DomainRestController
 * <p>领域领域Rest控制器
 * <p>
 * create 2025/08/07 16:48
 * <p>
 * update 2025/08/07 16:48
 *
 * @author Deng Haozhi
 * @see DDDGeneratorRestController
 * @since 1.0.0
 */
@Lazy
@RestController
@RequestMapping("/generator/domain")
public class DomainRestController implements DDDGeneratorRestController {

    /**
     * 领域领域主动适配器
     */
    private final DomainDrivingAdapter domainDrivingAdapter;

    public DomainRestController(DomainDrivingAdapter domainDrivingAdapter) {
        this.domainDrivingAdapter = domainDrivingAdapter;
    }

    @Override
    public String domainDescription() {
        return "";
    }

    // @PostMapping("/command/create")
    // @Log(message = "领域创建", value = "#command")
    // public ResponseEntity<RestResponse> create(@RequestBody DomainCreateReqCTransferReq command) {
    //     Optional.ofNullable(command)
    //             .map(DomainCreateReqCTransferReq::validate)
    //             .orElseThrow(() -> new CommandReqTransferNullException("领域创建参数不能为空"));
    //     try {
    //         domainDrivingAdapter.create(command);
    //         return response().success("项目创建成功");
    //     } catch (JSONException | NullPointerException e) {
    //         throw new RestFailedException("项目创建失败", e);
    //     }
    // }
}
