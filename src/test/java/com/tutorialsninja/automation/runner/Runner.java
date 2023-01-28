package com.tutorialsninja.automation.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty", "html:target/cucumber_Report/cucumber.html"},
		features= {"classpath:FeatureFiles/order.feature","classpath:FeatureFiles/Login.feature","classpath:FeatureFiles/Register.feature"
				,"classpath:FeatureFiles/Search.feature"},		
		glue= {"classpath:com.tutorialsninja.automation.StepDefinitions"}
		
		
		
		
		  
		
		
		) 

public class Runner {
	

}
