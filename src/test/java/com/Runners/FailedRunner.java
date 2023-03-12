package com.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "rerun:target/rerun.txt",
        glue = "com/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedRunner {

}
