package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/",
        glue = "stepDefinitions",
        stepNotifications = true,
        plugin = {"pretty"}
)
public class Runner {
}
