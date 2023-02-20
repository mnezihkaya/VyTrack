package com.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src/test/java/com/stepDefinitions",
        dryRun = true,
        tags = "",
        publish = false
)

public class CukesRunner {
}
