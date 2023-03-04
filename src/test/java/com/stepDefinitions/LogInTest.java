package com.stepDefinitions;

import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogInTest {

    LogInPage logInPage;

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("TestEnv"));
        logInPage = new LogInPage();
    }

    @When("user enters {string} and user enters {string}")
    public void userEntersUsernameAndUserEntersPassword(String username, String password) {
        logInPage.username.clear();
        logInPage.password.clear();
        logInPage.username.sendKeys(username);
        logInPage.password.sendKeys(password);
    }

    @And("user clicks the Login button")
    public void userClicksTheLoginButton() {
        logInPage.logInButton.click();
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        Utilities.waitUntilLoaderMaskDisappear();
        Utilities.titleContains("Dashboard");
        logInPage.closeMessageButton.click();
        LogInPage.LogOut();
    }

    @Then("user should see warning message")
    public void userShouldSeeWarningMessage() {
        Assert.assertEquals(logInPage.alertMessage.getText(), "Invalid user name or password.");
        Utilities.titleContains("Login");
    }

}
