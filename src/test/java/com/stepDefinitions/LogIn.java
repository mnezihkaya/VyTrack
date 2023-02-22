package com.stepDefinitions;

import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.pages.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn {

    LogInPage logInPage=new LogInPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("TestEnv"));
    }
    @When("user enters {string} and user enters {string}")
    public void user_enters_and_user_enters(String username, String password) {
        logInPage.username.sendKeys(username);
        logInPage.password.sendKeys(password);
        logInPage.logInButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Utilities.titleContains("Dashboard");
    }
}
