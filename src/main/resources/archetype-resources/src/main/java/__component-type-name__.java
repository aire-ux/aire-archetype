package ${package};

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.Button;

@Tag("${component-name}")
@JsModule("@${organization}/${component-name}/${component-name}")
@CssImport("@${organization}/${component-name}/styles/${component-name}.css")
public class ${component-type-name} extends HtmlContainer {

  public ${component-type-name}() {
    add(new Button("Hello from ${component-type-name}!"));
  }

}