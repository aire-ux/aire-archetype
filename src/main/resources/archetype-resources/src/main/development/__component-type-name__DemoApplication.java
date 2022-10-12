package ${package};

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import ${package}.routes.${component-type-name}Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@PWA(name = "${component-type-name} Demo", shortName = "Demo")
@ComponentScan(basePackageClasses = ${component-type-name}Example.class)
@EnableVaadin({"${package}.routes"})
public class ${component-type-name}DemoApplication extends VerticalLayout implements AppShellConfigurator {

  public static void main(String[] args) {
    SpringApplication.run(${component-type-name}DemoApplication.class, args);
  }
}
