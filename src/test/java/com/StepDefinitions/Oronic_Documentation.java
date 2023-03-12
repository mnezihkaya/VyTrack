package com.StepDefinitions;

import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.Utilities.VytrackUtilities;
import com.pages.MainModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oronic_Documentation {
    MainModule mainModule = new MainModule();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user {string} login to the Dashboard")
    public void userUsernameLoginToTheDashboard(String username) {
        VytrackUtilities.login(username);
    }

    @When("user on Dashboard page")
    public void userOnDashboardPage() {
        Utilities.waitUntilLoaderMaskDisappear();
        Utilities.titleVerify("Dashboard");
    }

    @And("user sees and click question icon {string}")
    public void userSeesAndClickQuestionIcon(String string) {
        Utilities.highlight(mainModule.getHelpIcon);
        Assert.assertEquals(mainModule.getHelpQuestionIcon.getAttribute("title"), string);
        mainModule.getHelpQuestionIcon.click();
    }

    @Then("user should see pup up window with url {string}")
    public void userShouldSeePupUpWindowWithUrl(String string) {
        //change the window,handle,and check the URl
        String mainHandle = Driver.getDriver().getWindowHandle();

        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
        }
        wait.until(ExpectedConditions.urlContains(string));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://doc.oroinc.com/");
        //check if return back to dashboard
        Driver.getDriver().switchTo().window(mainHandle);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard");
    }
}
