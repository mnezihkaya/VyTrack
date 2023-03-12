package com.StepDefinitions;


import com.Utilities.Utilities;
import com.pages.PinBarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class learning_using_pinbar {

    PinBarPage pinBarPage;

    @And("user clicks the button {string}")
    public void userClicksTheButton(String string) {
        PinBarPage pinBarPage = new PinBarPage();
        Utilities.highlight(pinBarPage.pinBarHelp);
        Assert.assertEquals(pinBarPage.pinBarHelp.getText(), string);
        pinBarPage.pinBarHelp.click();
    }

    @Then("user should see page {string} page")
    public void userShouldSeePagePage(String string) {
        Utilities.highlight(pinBarPage.topic);
        Assert.assertEquals(pinBarPage.topic.getText(), string);
    }

    @And("user click pin icon on the right top corner")
    public void userClickPinIconOnTheRightTopCorner() {
        Utilities.highlight(pinBarPage.pinBarButton);
        Assert.assertTrue(pinBarPage.pinBarButton.isDisplayed());
        pinBarPage.pinBarButton.click();
    }

    @Then("user should see {string} message pinned on top of page")
    public void userShouldSeeMessagePinnedOnTopOfPage(String string) {
        Utilities.highlight(pinBarPage.pinHolder);
        Assert.assertEquals(pinBarPage.pinHolder.getText(), string);
        pinBarPage.pinBarButton.click();

    }

    @Then("user should see an image {string} on the page")
    public void userShouldSeeAnImageOnThePage(String string) {
        Utilities.highlight(pinBarPage.image);
        Assert.assertTrue(pinBarPage.image.getAttribute("src").contains(string));
    }
}
