package com.tutorialsninja.automation.StepDefinitions;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import io.cucumber.java.en.*;

public class Search {
	
	HeadersPage headersPage = new HeadersPage();
	SearchResultsPage searchResults= new SearchResultsPage(); 
	
	
	@When("I search the product {string}")
	public void i_search_the_product(String product) {
		
		Elements.TypeText(HeadersPage.searchTextBox, product);
		Elements.click(HeadersPage.SearchIcon);
	   
	}

	@Then("I should see the search product")
	public void i_should_see_the_search_product() {
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.SearchResult));
		
	}
	
	@Then("I should see the No search results with {string}")
	public void i_should_see_the_no_search_results_with(String message) {
	    
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.NoSearchResult, message));
	}

}
