package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com.feature/bms.feature",
    glue = "com.StepDefinition",  
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = false,
  //  dryRun = true,
    publish = false
)
public class Runner {

}