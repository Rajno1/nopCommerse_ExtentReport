package com.nopCommerse.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerse.Base.TestBase;

public class LoginPageObjects extends TestBase{
	
	// Constructor
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//identiy webElements
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
	WebElement LoginEmail;
	
	@FindBy(how= How.XPATH,using="//input[contains(@id,'Password')]")
	WebElement LoginPassword;
	
	@FindBy(how = How.XPATH,using = "//input[contains(@value,'Log in')]")
	WebElement loginButton;
	
	@FindBy(how = How.XPATH,using ="//a[contains(@href,'/logout')]")
	WebElement logoutlink;
	
	
	//Create action methods for the elements identified
	public void enterEmail(String string) {
		clearAll(LoginEmail);
		EnterText(LoginEmail, string);
	}
	
	public void enterPassword(String string) {
		clearAll(LoginPassword);
		EnterText(LoginPassword, string);
	}
	
	public void clickLogin() {
		ClickOnIt(loginButton);
	}
	
	public void clickLogout() {
		ClickOnIt(logoutlink);
	}
	
}
