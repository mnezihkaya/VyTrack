package com.pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='prependedInput']")
    public static WebElement UserName;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    public static WebElement Password;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public static WebElement CheckBoxRememberMeOnThisComputer;

    @FindBy(xpath = "//a[text()='Forgot your password?']")
    public static WebElement ForgotYourPassword;

    @FindBy(id = "_submit")
    public static WebElement LogInButton;

    @FindBy (xpath = "//li[@id=\"user-menu\"]/a")
    public WebElement profileTab;

    @FindBy (xpath = "//a[@class='no-hash']")
    public WebElement logoutBtn;

    @FindBy (xpath = "//div[@class='alert alert-error']/div")
    public WebElement alertMessage;
}