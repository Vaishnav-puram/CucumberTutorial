package stepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinition",
        monochrome = true,
        plugin = {"pretty","html:target/HTMLReports/reports.html",
                "json:target/JSONReports/reports.json"
        }

)
public class TestRunner {
}
