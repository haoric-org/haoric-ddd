<#-- @ftlvariable name="project" type="org.haoric.ddd.generator.components.generator.project.domain.entity.ProjectAggregate" -->
<#-- @ftlvariable name="service" type="org.haoric.ddd.generator.components.generator.service.domain.entity.ServiceAggregate" -->
<#assign servicePackage = "${project.getBasePackage()}.${service.getBasePackage()}.common.model">
<#assign haoricPackage = "org.haoric.ddd.starter.common.model">
package ${servicePackage}.application.query.transfer;

import ${haoricPackage}.application.query.transfer.QueryTransfer;

/**
* ${service.getName()}QueryTransfer
* <p>
    * create ${service.getCreateAt()}
    * <p>
    * update ${service.getModifyAt()}
    *
    * @author ${service.getAuthor()}
    * @see QueryTransfer
    * @since ${service.getVersion()}
    */
    public interface ${service.getName()}QueryTransfer extends QueryTransfer {

    }
