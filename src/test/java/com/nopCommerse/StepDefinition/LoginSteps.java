package com.nopCommerse.StepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.model.Log;
import com.nopCommerse.Base.TestBase;
import com.nopCommerse.pageObjects.LoginPageObjects;

import io.cucumber.java.en.*;

public class LoginSteps extends TestBase{
	
	
	@Given("user open URL {string}")
	public void user_open_URL(String string) {
		// Creating LoginPage class object		
		lp = new LoginPageObjects(driver);
		
		
	logger.info("************ open URL  ************");
		   getDriver(driver, "https://admin-demo.nopcommerce.com/login");
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String string, String string2) {
		 
		logger.info("************ Enter Username & password  ************");
		   lp.enterEmail("admin@yourstore.com");
		   
		   lp.enterPassword("admin");
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {
		 logger.info("************ clicking on login button  ************");
		   lp.clickLogin();
	}
	
	@And("page Title should be {string}")
	public void page_Title_should_be(String string) {
		
		logger.info("************ Validating page Title  ************");
			if(driver.getPageSource().contains("Login was unsuccessful")) {
				driver.close();
				Assert.assertTrue(false);
			}else{
				Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
			}
	}


}
