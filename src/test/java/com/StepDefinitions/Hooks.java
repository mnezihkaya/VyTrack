package com.StepDefinitions;

import com.Utilities.Driver;
import org.junit.After;
import org.junit.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpDriver(Scenario scenario){
        System.out.println("Scenario name: "+scenario.getName());
        System.out.println("Scenario name: "+scenario.getSourceTagNames());
    }
    @After
    public void TearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }


}

