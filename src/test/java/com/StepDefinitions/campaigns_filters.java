package com.StepDefinitions;

import com.Utilities.Utilities;
import com.Utilities.VytrackUtilities;
import com.pages.CampaignsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class campaigns_filters {
    CampaignsPage campaignsPage;
    @And("user click Manage Filters button")
    public void userClickManageFiltersButton() {
        Utilities.highlight(campaignsPage.manageFilters);
        campaignsPage.manageFilters.click();
    }

    @Then("user should see all {int} filters checked")
    public void userShouldSeeAllFiltersChecked(int num) {
        Assert.assertEquals(num,campaignsPage.filterCheckboxes.size());
        for (WebElement each:campaignsPage.filterCheckboxes) {
            Utilities.highlight(each);
            Assert.assertTrue(each.isSelected());
        }
    }

    @And("user uncheck all filters")
    public void userUncheckAllFilters() {
        for (int i = 0; i <campaignsPage.filterCheckboxes.size() ; i++) {
            Utilities.highlight(campaignsPage.filterCheckboxes.get(i));
            campaignsPage.filterCheckboxes.get(i).click();
            VytrackUtilities.waitTillLoaderMaskDisappear();

        }
    }

    @Then("user should see all {int} filters unchecked")
    public void userShouldSeeAllFiltersUnchecked() {
        for (WebElement each:campaignsPage.filterCheckboxes) {
            Assert.assertFalse(each.isSelected());
        }
    }
}
