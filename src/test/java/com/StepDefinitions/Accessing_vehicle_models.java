package com.StepDefinitions;

import com.Utilities.Utilities;
import com.Utilities.WebTableUtils;
import com.pages.VehicleModelPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Accessing_vehicle_models {

    VehicleModelPage vehicleModelPage;

    @Then("user should see table column names")
    public void userShouldSeeTableColumnNames(List<String> expectedNames) {

        List<String> actualNames = WebTableUtils.getHeadersFromVehicleModelTable();
        Assert.assertEquals(10, actualNames.size());
        Assert.assertEquals(actualNames, expectedNames);
    }
}
