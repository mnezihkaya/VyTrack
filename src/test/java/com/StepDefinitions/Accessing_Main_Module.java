package com.StepDefinitions;

import com.Utilities.Utilities;
import com.Utilities.VytrackUtilities;
import com.pages.MainModule;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Accessing_Main_Module {
    MainModule mainModule=new MainModule();

    @When("driver on Dashboard page")
    public void driverOnDashboardPage() {
        VytrackUtilities.loginAsDriver();
        Utilities.titleContains("Dashboard");

    }

    @Then("driver should see four main modules")
    public void driverShouldSeeFourMainModules(List<String> expected) {
        Utilities.waitUntilLoaderMaskDisappear();
        List<String> actual=new ArrayList<>();
        for (WebElement each:mainModule.allModuleElements) {
            VytrackUtilities.hoverOver(each);
            Utilities.highlight(each);
            actual.add(each.getText());
        }
        Assert.assertEquals(actual,expected);

    }

    @When("store manager on Dashboard page")
    public void storeManagerOnDashboardPage() {
        VytrackUtilities.loginAsStoreManager();
        Utilities.titleContains("Dashboard");
    }

    @Then("manager should see eight main modules")
    public void managerShouldSeeEightMainModules(List<String> expected) {
        Utilities.waitUntilLoaderMaskDisappear();
        List<String>actual=new ArrayList<>();
        for (WebElement each:mainModule.allModuleElements) {
            VytrackUtilities.hoverOver(each);
            Utilities.highlight(each);
            actual.add(each.getText());
        }
        Assert.assertEquals(actual,expected);
    }

    @When("sale manager on Dashboard page")
    public void saleManagerOnDashboardPage() {
        VytrackUtilities.loginAsSalesManager();
        Utilities.titleContains("Dashboard");
    }
}
