package com.Utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class Utilities {

    public static WebDriver switchWindowAndVerify(String expectedInUrl) {

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl))
                break;
        }
        return Driver.getDriver();
    }

    public static void titleVerify(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public static void titleContains(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void waitUntilLoaderMaskDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void highlight(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();

        jsExecutor.executeScript("arguments[0].style.border='3px solid orange'", element);
        jsExecutor.executeScript("arguments[0].style.backgroundColor='yellow'", element);
        jsExecutor.executeScript("arguments[0].style.color='black'", element);
        //BrowserUtils.sleep(0.01);

        jsExecutor.executeScript("arguments[0].style.backgroundColor=''", element);
        jsExecutor.executeScript("arguments[0].style.border='0px solid black'", element);
        jsExecutor.executeScript("arguments[0].style.color=''", element);
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollPage(int y, int x){
        // Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy("+y+","+x+")");
    }



    }



