package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class YourStore {
	
	public YourStore() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-cart")
	public static WebElement AddtoCartbuttoninYourStore;
	
	public static void AnotherAddtoCartbutton() {
		
		Elements.click(AddtoCartbuttoninYourStore);
	}

}
