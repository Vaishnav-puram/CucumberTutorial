package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Hooks/feature/hooks.feature",
        glue = "Hooks/feature/stepDefinitions"

)
public class TestRunnerForHooks {
}
