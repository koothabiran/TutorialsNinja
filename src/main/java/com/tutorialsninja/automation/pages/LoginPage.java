package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(id="input-email")
	public static WebElement EmailField;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement LoginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement MainWarning;
	
	
	public static void doLogin(String email, String password) {
		
		
		Elements.TypeText(LoginPage.EmailField, email);
		Elements.TypeText(LoginPage.passwordField, password);
		Elements.click(LoginPage.LoginButton);
		
	}
	
	public static void doLogin() {
		
		Elements.TypeText(EmailField, Base.reader.getUsername());
		Elements.TypeText(passwordField, Base.reader.getpassword());
		Elements.click(LoginButton);
	}

}
