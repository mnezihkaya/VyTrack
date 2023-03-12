package com.StepDefinitions;


import com.Utilities.Driver;
import com.Utilities.Utilities;
import com.pages.VehiclesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class vehicle_checkboxes{
    VehiclesPage vehiclesPage=new VehiclesPage();

    @Then("user should see all the checkboxes are unchecked")
    public void userShouldSeeAllTheCheckboxesAreUnchecked() {
        for (WebElement each : vehiclesPage.carCheckboxes) {
            Assert.assertTrue(each.isDisplayed());
            Assert.assertFalse(each.isSelected());
        }
    }

    @And("user click first checkbox")
    public void userClickFirstCheckbox() {
        vehiclesPage.firstCheckbox.click();
    }

    @Then("user should see all the checkBoxes are checked")
    public void userShouldSeeAllTheCheckBoxesAreChecked() {
        for (WebElement each : vehiclesPage.carCheckboxes) {
            Assert.assertTrue(each.isSelected());
        }

    }


    public int random = (int) (Math.random()*(20)) + 1;
    public WebElement randomCheckBox = Driver.getDriver().findElement(By.xpath("//tr["+random+"]//td//input[@type='checkbox']"));

    @And("user click any checkbox")
    public void userClickAnyCheckbox() {
        randomCheckBox.click();
    }

    @Then("user should see that checkbox is selected")
    public void userShouldSeeThatCheckboxIsSelected() {
        Assert.assertTrue(randomCheckBox.isSelected());
    }


}
