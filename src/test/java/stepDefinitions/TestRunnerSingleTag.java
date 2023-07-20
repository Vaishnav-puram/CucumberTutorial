package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featuresWithTags",
        glue = "stepDefinitions",
        tags= ("@smoke or @regression")
)
public class TestRunnerSingleTag {

}
