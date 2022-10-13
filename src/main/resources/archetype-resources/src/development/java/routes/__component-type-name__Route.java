package ${package}.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import ${package}.${component-type-name};

@RouteScope
@Route("${component-name}")
public class ${component-type-name}Route extends VerticalLayout {


  public ${component-type-name}Route() {
    add(new ${component-type-name}());
  }
}
