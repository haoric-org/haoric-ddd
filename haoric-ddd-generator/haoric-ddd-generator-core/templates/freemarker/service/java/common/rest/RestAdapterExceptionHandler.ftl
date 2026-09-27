<#-- @ftlvariable name="project" type="org.haoric.ddd.generator.components.generator.project.domain.entity.ProjectAggregate" -->
<#-- @ftlvariable name="service" type="org.haoric.ddd.generator.components.generator.service.domain.entity.ServiceAggregate" -->
<#assign servicePackage = "${project.getBasePackage()}.${service.getBasePackage()}.common.model">
<#assign haoricPackage = "org.haoric.ddd.starter.common.model">
package ${servicePackage}.common.rest;

import ${servicePackage}.sidecar.rest.${service.getName()}RestResponse;
import ${haoricPackage}.handler.exception.rest.AbstractRestAdapterExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
* ${service.getName()}RestExceptionHandler
* <p>
    * create ${service.getCreateAt()}
    * <p>
    * update ${service.getModifyAt()}
    *
    * @author ${service.getAuthor()}
    * @see AbstractRestAdapterExceptionHandler
    * @since ${service.getVersion()}
    */
    @RestControllerAdvice
    public class ${service.getName()}RestAdapterExceptionHandler extends AbstractRestAdapterExceptionHandler {

    @Override
    public ${service.getName()}RestResponse response() {
    return ${service.getName()}RestResponse.builder().build();
    }
    }
