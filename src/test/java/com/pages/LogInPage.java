package com.pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {


    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="_username")
    public static WebElement UserName;

    @FindBy(name="_password")
    public static WebElement Password;

    @FindBy(id="remember_me")
    public static WebElement CheckBoxRememberMeOnThisComputer;

    @FindBy(xpath = "//a[text()=\"Forgot your password?\"]")
    public static WebElement ForgotYourPassword;

    @FindBy(id="_submit")
    public static WebElement LogInButton;
}
