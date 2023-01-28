package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultsPage {
	
	public SearchResultsPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(linkText="HP LP3065")
	public static WebElement SearchResult;
	
	@FindBy(css="input[type='button']+h2+P")
	public static WebElement NoSearchResult;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement addToCart;
	
	public static void addFirstProductIntoCart() {
		
		Elements.click(addToCart);
	}

}
