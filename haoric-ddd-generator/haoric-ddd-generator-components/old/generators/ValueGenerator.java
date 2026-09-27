package org.haoric.ddd.generator.components.generators;

import org.haoric.ddd.generator.components.generator.domain.domain.entity.Field;
import org.haoric.ddd.generator.components.generator.domain.domain.entity.Value;
import org.haoric.ddd.generator.object.entity.Aggregate;

import java.util.List;
import java.util.Set;

import static org.haoric.ddd.generator.template.CommentTemplate.comment;
import static org.haoric.ddd.generator.template.DefineTemplate.classDefine;
import static org.haoric.ddd.generator.template.EndTemplate.end;
import static org.haoric.ddd.generator.template.FieldTemplate.fields;
import static org.haoric.ddd.generator.template.HeaderTemplate.importHeaderValue;
import static org.haoric.ddd.generator.template.HeaderTemplate.packageHeader;
import static org.haoric.ddd.generator.template.MethodTemplate.create;
import static org.haoric.ddd.generator.template.ValidateTemplate.validate;
import static org.haoric.ddd.generator.template.ValidateTemplate.validateMethods;
import static org.haoric.ddd.generator.utils.DDDUtils.*;

/**
 * ValueGenerator
 * <p>
 * create 2024/09/18 00:02
 * <p>
 * update 2024/09/18 00:02
 *
 * @author Deng Haozhi
 * @since 1.0.0
 */
public class ValueGenerator {

    public void generateValue(Aggregate aggregate, Value value) throws Exception {
        generate(aggregate, value.getFields(), value.getName(), value.getDescription());
    }

    private void generate(Aggregate aggregate, List<Field> fields, String className, String description) throws Exception {

        StringBuilder stringBuilder = new StringBuilder();

        String domainPackage = domainPackage(aggregate);
        String subPackage = "domain.value";
        String packageName = domainPackage + "." + subPackage;
        String superClassName = superClassName(aggregate.getServiceName(), className, 1);
        Set<String> entityNames = entityNames(aggregate);
        String rootPath = aggregate.getRootPath();

        packageHeader(stringBuilder, packageName);
        importHeaderValue(stringBuilder, aggregate.getGroupId(), servicePackage(aggregate), domainPackage, subPackage, !enumNames(aggregate).isEmpty());
        comment(stringBuilder, className, superClassName, description, aggregate.getAuthor(), aggregate.getVersion());
        classDefine(stringBuilder, className, superClassName);
        fields(stringBuilder, entityNames, valueNames(aggregate), fields, className);
        create(stringBuilder, fields, className);
        validate(stringBuilder, fields, className);
        validateMethods(stringBuilder, fields, className);
        end(stringBuilder);

        deleteFileIfExists(rootPath, packageName, className);
        writeFile(rootPath, packageName, className, stringBuilder.toString());
    }
}
