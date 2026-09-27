<#-- @ftlvariable name="project" type="org.haoric.ddd.generator.components.generator.project.domain.entity.ProjectAggregate" -->
<#-- @ftlvariable name="service" type="org.haoric.ddd.generator.components.generator.service.domain.entity.ServiceAggregate" -->
<#assign servicePackage = "${project.getBasePackage()}.${service.getBasePackage()}.common.model">
<#assign haoricPackage = "org.haoric.ddd.starter.common.model">
package ${servicePackage}.infrastructure.adapter.transfer;

import ${haoricPackage}.infrastructure.adapter.transfer.DrivenTransfer;

/**
* ${service.getName()}DrivenTransfer
* <p>
    * create ${service.getCreateAt()}
    * <p>
    * update ${service.getModifyAt()}
    *
    * @author ${service.getAuthor()}
    * @see DrivenTransfer
    * @since ${service.getVersion()}
    */
    public interface ${service.getName()}DrivenTransfer extends DrivenTransfer {

    }
