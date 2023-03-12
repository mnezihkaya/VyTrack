package com.StepDefinitions;

import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.pages.CalendarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calendar_message_entry {
    CalendarPage calendarPage;
    @When("user write a {string} in the Description field")
    public void userWriteAInTheDescriptionField(String message) {
        Driver.getDriver().switchTo().frame(calendarPage.iframe);
        Utilities.highlight(calendarPage.message);
        calendarPage.textBody.sendKeys(message+Driver.getDriver());
    }

    @Then("user should see his {string} in the Description")
    public void userShouldSeeHisInTheDescription(String message) {
        Utilities.highlight(calendarPage.message);
        Assert.assertEquals(message+Driver.getDriver(),calendarPage.message.getText());

    }
}
