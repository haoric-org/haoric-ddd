<#-- @ftlvariable name="project" type="org.haoric.ddd.generator.components.generator.project.domain.entity.ProjectAggregate" -->
<#-- @ftlvariable name="service" type="org.haoric.ddd.generator.components.generator.service.domain.entity.ServiceAggregate" -->
<#assign servicePackage = "${project.getBasePackage()}.${service.getBasePackage()}.common.model">
<#assign haoricPackage = "org.haoric.ddd.starter.common.model">
package ${servicePackage}.domain.event;

import ${servicePackage}.domain.entity.${service.getName()}Aggregate;
import ${haoricPackage}.domain.event.Event;

/**
* ${service.getName()}Event
* <p>
    * create ${service.getCreateAt()}
    * <p>
    * update ${service.getModifyAt()}
    *
    * @author ${service.getAuthor()}
    * @see Event
    * @since ${service.getVersion()}
    */
    public interface ${service.getName()}Event&lt;A extends ${service.getName()}Aggregate&gt; extends Event&lt;A&gt; {

    }
