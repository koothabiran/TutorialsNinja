package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import io.cucumber.datatable.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	
	
	@FindBy(name="firstname")
	public static WebElement FirstName;
	
	@FindBy(name="lastname")
	public static WebElement LastName;
	
	@FindBy(name="email")
	public static WebElement Email;
	
	@FindBy(name="telephone")
	public static WebElement Telephone;
	
	@FindBy(name="password")
	public static WebElement Password;
	
	@FindBy(name="confirm")
	public static WebElement Confirm;
	
	@FindBy(name="agree")
	public static WebElement PrivacyPolicy;
	
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement Continue;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement FirstnameError;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement LastnameError;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement EmailError;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement TelephoneError;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement PasswordError;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarningMessage;
	
	public static void enterAllDetails(DataTable dataTable, String detailsType) {
		
		Map<String, String> map =dataTable.asMap(String.class, String.class);
		
		Elements.TypeText(RegisterPage.FirstName, map.get("FirstName") );
		Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.Telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.Password, map.get("Password"));
		Elements.TypeText(RegisterPage.Confirm, map.get("Password"));
		
		if(detailsType.equalsIgnoreCase("duplicate")) {
			
			Elements.TypeText(RegisterPage.Email, map.get("Email"));
			
		}else
			
			Elements.TypeText(RegisterPage.Email, System.currentTimeMillis()+map.get("Email"));
		
		
		
	}
	

}
