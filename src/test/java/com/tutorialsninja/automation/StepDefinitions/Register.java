package com.tutorialsninja.automation.StepDefinitions;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.RegisterPage;
import com.tutorialsninja.automation.pages.SucessPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Register {
	
	HeadersPage headerspage = new HeadersPage();
	RegisterPage registerPage = new RegisterPage();
	SucessPage sucessPage = new SucessPage();
	
	
	
	@Given("^Launch the application and provided the application url$")
	public void launch_the_application_and_provided_the_application_url() {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to Account Register page$")
	public void i_navigate_to_Account_Register_page() {
		
		
		Elements.click(HeadersPage.MyAccount);
		Elements.click(HeadersPage.Register);
	   
	}

	@Then("^provide the valid detail into the Register page$")
	public void provide_the_valid_detail_into_the_Register_page(DataTable dataTable) {
		
	    RegisterPage.enterAllDetails(dataTable, "unique");
		
	
		
	    
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
		
		Elements.click(RegisterPage.PrivacyPolicy);
	   
	}

	@Then("^I click on continue button$")
	public void i_click_on_continue_button()  {
		
		Elements.click(RegisterPage.Continue);
	   
	}

	@Then("^I should see the user account has been created sucessfully$")
	public void i_should_see_the_user_account_has_been_created_sucessfully()  {
		
		Assert.assertTrue(Elements.isDisplayed(SucessPage.Sucess));
		
	
	   
	}
	
	@Then("I should see the Warning messages into the respective field")
	public void i_should_see_the_warning_messages_into_the_respective_field() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.FirstnameError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.LastnameError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.EmailError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.TelephoneError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.PasswordError));
	 
	}
	
	@Then("^provide the Duplicated detail into the Register page$")
	public void provide_the_Duplicated_detail_into_the_Register_page(DataTable dataTable) {
		
	    RegisterPage.enterAllDetails(dataTable, "duplicate");
		
	
		
	    
	}
	
	@Then("I should see the main Warning message")
	public void i_should_see_the_main_warning_message() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarningMessage));
	   
	}



}
