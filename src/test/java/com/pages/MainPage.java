package com.pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class=\"dropdown dropdown-level-1 first\"]")
    public static WebElement Dashboards;

    @FindBy(xpath ="//li[@class=\"dropdown dropdown-level-1\"]")
    public static WebElement Fleet;

    @FindBy(xpath = "//li[@class=\"dropdown dropdown-level-1\"][2]")
    public static WebElement Customers;

    @FindBy(xpath = "//li[@class=\"dropdown dropdown-level-1\"][3]")
    public static WebElement Sales;

    @FindBy(xpath = "//li[@class=\"dropdown dropdown-level-1\"][4]")
    public static WebElement Activities;

    @FindBy(xpath = "//li[@class=\"dropdown dropdown-level-1\"][5]")
    public static WebElement Marketing;

    @FindBy(xpath = "//li[@class=\"dropdown dropdown-level-1\"][6]")
    public static WebElement ReportsAndSegments;

    @FindBy(xpath = "//li[@class=\"mobile-hide dropdown dropdown-level-1 last\"]")
    public static WebElement System;

}
