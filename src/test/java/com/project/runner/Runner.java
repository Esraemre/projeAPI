package com.project.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
      "pretty",
      "html:target/default-cucumber-reports.html",
      "json:target/json-reports/cucumber.json",
      "junit:target/xml-reports/cucumber.xml",
      "rerun:target/failedRerun.txt"
    },
    features = "./src/test/resources",
    glue = {"apistepdef"},
    tags = "@api",
    dryRun = false
)
public class Runner {}
