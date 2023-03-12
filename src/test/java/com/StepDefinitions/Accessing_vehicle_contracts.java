package com.StepDefinitions;

import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.Utilities.VytrackUtilities;
import com.pages.MainModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Accessing_vehicle_contracts {

    MainModule mainModule;
    @And("user navigates to {string} module and clicks {string}")
    public void userNavigatesToModuleAndClicks(String module, String submodule) {
        VytrackUtilities.navigateTo(submodule);
    }

    @Then("user should see expected URL {string}")
    public void userShouldSeeExpectedURL(String expectedURL) {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedURL);
    }

    @Then("users should see expected title {string}")
    public void usersShouldSeeExpectedTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    @Then("user should see error message {string}")
    public void userShouldSeeErrorMessage(String expectedErrorMessage) {
        Utilities.highlight(mainModule.warningMessage);
        Assert.assertTrue(mainModule.warningMessage.isDisplayed());
        Assert.assertEquals(mainModule.warningMessage.getText(),expectedErrorMessage);
    }
}
