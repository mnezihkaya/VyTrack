package com.StepDefinitions;

import com.Utilities.Utilities;
import com.pages.CalendarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Calendar_invalid_entry {
    CalendarPage calendarPage=new CalendarPage();
    @And("user enters {string}")
    public void userEnters(String entry) {
        Utilities.highlight(calendarPage.daysInput);
        calendarPage.daysInput.sendKeys(Keys.BACK_SPACE+entry);
        calendarPage.inputTitle.click();
    }

    @When("user cancel and start over")
    public void userCancelAndStartOver() {
        Utilities.highlight(calendarPage.cancelButton);
        calendarPage.cancelButton.click();
        Utilities.highlight(calendarPage.createEvent);
        calendarPage.createEvent.click();

    }
}
