package com.tutorialsninja.automation.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty", "html:target/cucumber_Report/cucumber.html"},
		features= {"classpath:FeatureFiles/Register.feature"},
				
		glue= {"classpath:com.tutorialsninja.automation.StepDefinitions"},
		tags="@Register"
		  
		
		
		) 

public class Runner {
	

}
