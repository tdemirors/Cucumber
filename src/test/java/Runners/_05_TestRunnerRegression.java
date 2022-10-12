package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression or @SmokeTest",  // or olduğunda herhangi bir tanesi varsa çalıştırır
                                             // and olduğunda her ikisinde senaryoda tag olarak olan senaryoları çalıştırır
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
)

public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}  // Bu bölümü Browser tipi vermek için ve rapora ek parametse eklemek için kullanacağız
