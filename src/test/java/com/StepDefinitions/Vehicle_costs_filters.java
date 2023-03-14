package com.StepDefinitions;

import com.Utilities.Utilities;
import com.Utilities.WebTableUtils;
import com.pages.VehicleCostsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Vehicle_costs_filters {
    VehicleCostsPage vehicleCostsPage;
    @Then("user should see {int} three columns")
    public void userShouldSeeThreeColumns(int number) {
        Assert.assertEquals(number, WebTableUtils.getHeadersFromVehicleModelTable().size());
    }

    @Then("user should see names of columns")
    public void userShouldSeeNamesOfColumns(List<String> expectedColumns) {
        List<String>actualColumnNames=WebTableUtils.getHeadersFromVehicleModelTable();
        Assert.assertEquals(expectedColumns,actualColumnNames);
    }

    @Then("user should be able to use all filters")
    public void userShouldBeAbleToUseAllFilters() {
        Utilities.highlight(vehicleCostsPage.thirdFilter);
        vehicleCostsPage.thirdFilter.click();
        Utilities.highlight(vehicleCostsPage.secondFilter);
        vehicleCostsPage.secondFilter.click();
        Utilities.highlight(vehicleCostsPage.firstFilter);
        vehicleCostsPage.firstFilter.click();
    }


}
