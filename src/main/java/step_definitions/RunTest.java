package step_definitions;


import org.junit.runner.RunWith;
import org.w3c.dom.views.AbstractView;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"step_definitions.Login"},
        glue = {""},
        plugin = {"pretty"}
        // tags = {}
)
public class RunTest {

}
