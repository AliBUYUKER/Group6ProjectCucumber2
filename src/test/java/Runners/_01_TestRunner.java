package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        plugin= {"pretty","html:target/site/cucumber-pretty.html","json:target/cucumber/cucumber.json"}
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
