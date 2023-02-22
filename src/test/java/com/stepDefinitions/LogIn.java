package com.stepDefinitions;

import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.pages.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogIn {
    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("TestEnv"));
    }

    @When("user enters {string} and user enters {string}")
    public void userEntersUsernameAndUserEntersPassword(String username, String password) {
        LogInPage.UserName.sendKeys(username);
        LogInPage.Password.sendKeys(password);
        LogInPage.LogInButton.click();
    }


    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        Utilities.waitTillLoaderMaskDisappear();
        Utilities.titleContains("Dashboard");
    }

    @Then("user should see warning message")
    public void userShouldSeeWarningMessage() {
        Assert.assertEquals(LogInPage.);
    }
}
