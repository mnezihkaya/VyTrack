package com.StepDefinitions;

import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.Utilities.VytrackUtilities;
import com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login{

    LoginPage loginPage;

    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        loginPage=new LoginPage();
    }

    @When("user enters {string} and user enters {string}")
    public void user_enters_and_user_enters(String username, String password) {
        Utilities.highlight(loginPage.usernameInput);
        loginPage.usernameInput.sendKeys(username);
        Utilities.highlight(loginPage.passwordInput);
        loginPage.passwordInput.sendKeys(password);
    }

    @When("user clicks the Login button")
    public void user_clicks_the_login_button() {
        Utilities.highlight(loginPage.logInButton);
        loginPage.logInButton.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Utilities.waitUntilLoaderMaskDisappear();
        Utilities.titleContains("Dashboard");
        VytrackUtilities.logout();
        Utilities.highlight(loginPage.usernameInput);
    }


    @Then("user should see warning message")
    public void user_should_see_warning_message() {
        Utilities.highlight(loginPage.alertMessage);
        Assert.assertEquals(loginPage.alertMessage.getText(), "Invalid user name or password.");
        Utilities.titleContains("Login");
        Driver.getDriver().navigate().refresh();
    }
}
