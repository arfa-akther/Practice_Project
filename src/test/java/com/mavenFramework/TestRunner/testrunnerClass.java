package com.mavenFramework.TestRunner;




import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.mavenFramework.Utility.base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature1"} ,//copy the feature folder location here starting from src
plugin = {"json:target/cucumber.json"} ,
glue = "stepDefinationss")//tags = {"@test"})
//glue = "stepDefinationss",tags = {"@bhaiya"})
//glue = "stepDefination",tags = {"@first,@third"})
//glue = "stepDefination")//tags = {"@kjhjk , @knmn,"})

public class testrunnerClass extends AbstractTestNGCucumberTests{
	@BeforeTest
	public void startURL() {
		base_class testobj = new base_class();//created obj for parent class here
		testobj.initializeBrowser(); //called the browser setup stored in initializeBrowser from base_class here
	}
	
	@AfterTest
	public void closeURL() {
		base_class testobj = new base_class();//created obj for parent class here
		testobj.driver.quit();//closed it here
	}
}
