<#-- @ftlvariable name="project" type="org.haoric.ddd.generator.components.generator.project.domain.entity.ProjectAggregate" -->
<#-- @ftlvariable name="service" type="org.haoric.ddd.generator.components.generator.service.domain.entity.ServiceAggregate" -->
<#assign servicePackage = "${project.getBasePackage()}.${service.getBasePackage()}.common.model">
<#assign haoricPackage = "org.haoric.ddd.starter.common.model">
package ${servicePackage}.sidecar.rest;

import ${haoricPackage}.sidecar.rest.RestController;

/**
* ${service.getName()}RestController
* <p>
    * create ${service.getCreateAt()}
    * <p>
    * update ${service.getModifyAt()}
    *
    * @author ${service.getAuthor()}
    * @see RestController
    * @since ${service.getVersion()}
    */
    public interface ${service.getName()}RestController extends RestController {

    default ${service.getName()}RestResponse response() {
    return ${service.getName()}RestResponse.builder().build();
    }
    }
