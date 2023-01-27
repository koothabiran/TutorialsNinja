package com.tutorialsninja.automation.StepDefinitions;



import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import io.cucumber.java.en.*;

public class Login {
	
	HeadersPage headersPage = new HeadersPage();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccount = new MyAccountPage();
	
	
	@And("I navigate to the Application Login page")
	public void i_navigate_to_the_application_login_page() {
		
		Elements.click(HeadersPage.MyAccount);
		Elements.click(HeadersPage.Login);
	   
	}
	
	
	@Then("I enter the username {string} and the password {string}")
	public void i_enter_the_username_and_the_password(String email, String password) {
		
		LoginPage.doLogin(email, password);
	    
	}
	
	
	@Then("I should see the user should logged successfuly or not")
	public void i_should_see_the_user_should_logged_successfuly_or_not() {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.RegisteForAnAffiliateAccount));
	    
	}
	
	@Then("I should see the user should not be logged successfuly")
	public void i_should_see_the_user_should_not_be_logged_successfuly() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.MainWarning, "Warning: No match for E-Mail Address and/or Password."));
	    
	}


}
