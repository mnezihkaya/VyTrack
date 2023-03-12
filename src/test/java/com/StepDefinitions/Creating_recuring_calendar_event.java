package com.StepDefinitions;

import com.Utilities.Utilities;
import com.pages.CalendarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Creating_recuring_calendar_event {
    CalendarPage calendarPage;

    @And("user click the Create Calendar Event button")
    public void userClickTheCreateCalendarEventButton() {
        Utilities.highlight(calendarPage.createEvent);
        calendarPage.createEvent.click();
    }

    @Then("user should see {string} page")
    public void userShouldSeePage(String string) {
        Utilities.highlight(calendarPage.pageLabel);
        Assert.assertEquals(string, calendarPage.pageLabel.getText());
    }

    @When("user click Repeat checkbox")
    public void userClickRepeatCheckbox() {
        Utilities.highlight(calendarPage.repeatCheckbox);
        calendarPage.repeatCheckbox.click();
    }

    @Then("user should see the number {string} by default")
    public void userShouldSeeTheNumberByDefault(String days) {
        Utilities.highlight(calendarPage.daysInput);
        Assert.assertEquals(days, calendarPage.daysInput.getAttribute("value"));
    }

    @When("user delete the number {string}")
    public void userDeleteTheNumber(String arg0) {
    Utilities.highlight(calendarPage.daysInput);
    calendarPage.daysInput.sendKeys(Keys.BACK_SPACE);
    calendarPage.inputTitle.click();
    }

    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String message) {
    Assert.assertEquals(message,calendarPage.errorMessage.getText());

    }
}
