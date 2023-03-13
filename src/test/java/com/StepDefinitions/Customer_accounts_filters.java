package com.StepDefinitions;

import com.Utilities.Utilities;
import com.pages.AccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Customer_accounts_filters {

    AccountsPage accountsPage = new AccountsPage();

    @And("user click Filter button")
    public void userClickFilterButton() {
        Utilities.highlight(accountsPage.filters);
        accountsPage.filters.click();
    }

    @Then("user should see {int} filters on the page")
    public void userShouldSeeFiltersOnThePage(int number) {
        Utilities.highlight(accountsPage.manageFilters);
        Assert.assertEquals(number, accountsPage.allFilters.size());
    }

    @Then("user should see filters")
    public void userShouldSeeFilters(List<String> expectedFilterNames) {
        List<String> actualFilterNames = new ArrayList<>();
        for (WebElement each : accountsPage.allFilters) {
            Utilities.highlight(each);
            actualFilterNames.add(each.getText().replace(": All", ""));
        }

        Assert.assertEquals(expectedFilterNames,actualFilterNames);
    }
}
