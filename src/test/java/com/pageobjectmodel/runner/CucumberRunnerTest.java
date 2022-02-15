package com.pageobjectmodel.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features = {"src/test/resources/SalesforceLogin.feature"},
			glue= {"com.pageobjectmodel.definitions"}
	       
	)
	
	public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
