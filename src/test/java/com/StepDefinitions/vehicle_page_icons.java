package com.StepDefinitions;

import com.Utilities.Utilities;
import com.Utilities.VytrackUtilities;
import com.pages.VehiclesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class vehicle_page_icons {
    VehiclesPage vehiclesPage;
    @And("user hover over three dots ...")
    public void userHoverOverThreeDots() {
        Utilities.highlight(vehiclesPage.dots);
        VytrackUtilities.hoverOver(vehiclesPage.dots);
    }

    @Then("user should see three buttons")
    public void userShouldSeeThreeButtons(List<String> expectedButtons) {
        List<String>actualButtons=new ArrayList<>();
        actualButtons.add(vehiclesPage.button1.getAttribute("title"));
        actualButtons.add(vehiclesPage.button2.getAttribute("title"));
        actualButtons.add(vehiclesPage.button3.getAttribute("title"));
        Assert.assertEquals(expectedButtons,actualButtons);
    }
}
