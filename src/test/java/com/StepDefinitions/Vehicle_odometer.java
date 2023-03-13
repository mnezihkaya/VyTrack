package com.StepDefinitions;

import com.Utilities.Utilities;
import com.pages.VehicleOdometerPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Vehicle_odometer {
    VehicleOdometerPage vehicleOdometerPage;
    @Then("user should see default page is {string}")
    public void userShouldSeeDefaultPageIs(String pageNumber) {
        Utilities.highlight(vehicleOdometerPage.pageNumber);
        Assert.assertEquals(pageNumber,vehicleOdometerPage.pageNumber.getAttribute("value"));
    }

    @Then("user should see default view per page {string}")
    public void userShouldSeeDefaultViewPerPage(String pageNumber) {
        Utilities.highlight(vehicleOdometerPage.viewPerPage);
        Assert.assertEquals(pageNumber,vehicleOdometerPage.viewPerPage.getText());

    }
}
