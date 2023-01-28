package com.tutorialsninja.automation.StepDefinitions;



import com.tutorialsninja.automation.framework.Browser;

import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;
import com.tutorialsninja.automation.pages.YourStore;

import io.cucumber.java.en.*;

public class Order {
	
	HeadersPage headersPage = new HeadersPage();
	SearchResultsPage searchResults = new SearchResultsPage();
	LoginPage loginpage = new LoginPage();
	ShoppingCartPage shoppingCartpage = new ShoppingCartPage();
	YourStore yourstore = new YourStore();
	
	@Given("I login to the application")
	public void i_login_to_the_application() {
		
		Browser.OpenApplicationUrl();
		HeadersPage.navigateToLogin();
		LoginPage.doLogin();
		
	   
	}
	@When("I add a product to bag and checkout")
	public void i_add_a_product_to_bag_and_checkout() {
		
		HeadersPage.SearchProduct();
		SearchResultsPage.addFirstProductIntoCart();
		YourStore.AnotherAddtoCartbutton();
		HeadersPage.ShoppingCart();
		ShoppingCartPage.navigatetoCheckoutPage();
	    
	}
	


}
