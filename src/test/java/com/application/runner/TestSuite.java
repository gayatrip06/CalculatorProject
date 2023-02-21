package com.application.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "com.application.stepdefinition",
		"com.framework.webdriver" }, plugin = { "pretty", "html:Reports/AutomationReport.html" }
)

public class TestSuite {

}
