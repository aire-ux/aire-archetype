package ${package};

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.aire.ux.test.AireTest;
import com.aire.ux.test.Context;
import com.aire.ux.test.Navigate;
import com.aire.ux.test.RouteLocation;
import com.aire.ux.test.Select;
import com.aire.ux.test.TestContext;
import com.aire.ux.test.ViewTest;
import com.aire.ux.test.spring.EnableSpring;
import com.vaadin.flow.component.button.Button;
import ${package}.${component-type-name}DemoApplication;
import ${package}.routes.${component-type-name}Route;
import lombok.val;
import org.springframework.boot.test.context.SpringBootTest;

@AireTest
@EnableSpring
@RouteLocation(scanPackage = "${package}.routes")
@SpringBootTest(classes = ${component-type-name}DemoApplication.class)
class ${component-type-name}Test {

  @ViewTest
  @Navigate("${component-name}")
  void ensure${component-type-name}HostIsInjectable(@Select ${component-type-name}Route ex) {
    assertNotNull(ex);
  }

}
