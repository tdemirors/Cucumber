package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},

        plugin = {"html:target\\cucumber-reports.html" } // pom.xml dosyasının üstünde target dosyasında rapor uluşturuyor
)
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {
}
