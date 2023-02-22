package com.pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='prependedInput']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeCheckBox;

    @FindBy(id = "_submit")
    public WebElement logInButton;

    @FindBy(xpath = "//a[text()='Forgot your password?']")
    public WebElement forgotYourPassword;

    public static void LogIn(String username,String password){
        LogInPage logInPage=new LogInPage();
        logInPage.username.sendKeys(username);
        logInPage.password.sendKeys(password);
        logInPage.logInButton.click();
    }

}