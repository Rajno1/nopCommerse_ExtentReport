package com.nopCommerse.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./com.features/CustomersModule.feature",
		glue = "com.nopCommerse.StepDefinition",
		plugin = {"pretty","html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		dryRun = false
		
			
		)

public class Runner {
}
	