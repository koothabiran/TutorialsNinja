package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeadersPage {
	
	public HeadersPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement MyAccount;
	
	@FindBy(linkText="Register")
	public static WebElement Register;
	
	
	@FindBy(linkText="Login")
	public static WebElement Login;
	
	
	@FindBy(name="search")
	public static WebElement searchTextBox;
	
	@FindBy(css="button[type='button'][class$='btn-lg']")
	public static WebElement SearchIcon;
	

}
