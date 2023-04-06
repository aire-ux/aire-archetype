package ${package};

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.HtmlContainer;

@Tag("${component-name}")
@JsModule(Paths.${component-type-name}_SOURCE)
@CssImport(Paths.${component-type-name}_STYLES)
//@JsModule("@${organization}/${component-name}/${component-name}")
//@CssImport("@${organization}/${component-name}/styles/${component-name}.css")

/**
 * uncomment this if you have deployed this component into NPMJS
 */
//@NpmPackage(value = "@${organzation}/${component-name}", version = Versions.${component-type-name}_VERSION)
public class ${component-type-name} extends HtmlContainer {

  public ${component-type-name}() {
    add(new Button("Hello from ${component-type-name}!"));
  }

}