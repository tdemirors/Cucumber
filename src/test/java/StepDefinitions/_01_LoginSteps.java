package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _01_LoginSteps {
    DialogContent dc = new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {

        Duration dr =  Duration.ofSeconds(60);
        GWD.getDriver().manage().timeouts().pageLoadTimeout(dr);

        GWD.getDriver().get("https://demo.mersys.io");
        GWD.getDriver().manage().window().maximize();
    }
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

//       WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//       wait.until(ExpectedConditions.visibilityOf(dc.username));
//       dc.username.sendKeys("richfield.edu");
//       wait.until(ExpectedConditions.visibilityOf(dc.password));
//       dc.password.sendKeys("Richfield2020!");
//       dc.loginButton.click();

        // 1. Aşama
        dc.findAndClick("cookies");
        dc.findAndSend("username" , "richfield.edu");
        dc.findAndSend("password", "Richfield2020!");
        dc.findAndClick("loginButton");
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

//       WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//       wait.until(ExpectedConditions.textToBePresentInElement(dc.dashboard, "Dashboard"));
//       dc.waitUntilVisible(dc.dashboard);
//       Assert.assertTrue(dc.dashboard.getText().contains("Dashboard"));

        dc.findAndContainsText("dashboard","Dashboard");
    }

}
