package com.nopCommerse.StepDefinition;



import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nopCommerse.Base.TestBase;
import com.nopCommerse.pageObjects.CustomersModuleObjects;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class CustomersModuleSteps extends TestBase {
	

	@Then("user clicks on customers menu")
	public void user_clicks_on_customers_menu()  {
		custmod = new CustomersModuleObjects(driver);
		logger.info("************ clicking on CustomersMenu **********");
		custmod.clickCustomersMenu();
 	}
	

	@And("user clicks on customers menu item")
	public void user_clicks_on_customers_menu_item() {
	   logger.info("************ clicking on customer Menu item **********");
		custmod.clickCustomerMenuItem();
		
	}
	
	@Given("user click on Addnew button")
	public void user_click_on_Addnew_button()  {
	   logger.info("********* clicking on AddNew button *********");
	   custmod.clickOnAddbutton();
		
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		logger.info("********* validating AddNew page title *********");
		Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
	}

	@When("Enter the details of customer info")
	public void enter_the_details_of_customer_info() {
	   logger.info("********** giving email information **********");
	   custmod.Enter_email("rajasekhar.rct@gmail.com");
	   logger.info("********** giving password details ***********");
	   custmod.Enter_password("New@2019");
	   logger.info("********** giving First_name ***********");
	   custmod.Enter_Frist_Name("Rajasekhar");
	   logger.info("********** giving Last_name  ***********");
	   custmod.Enter_Last_Name("Maddigalla");
	   logger.info("********** Selecting Gender ***********");
	   custmod.select_gender("male");
	   logger.info("********** Selection DOB ***********");
	   custmod.Enter_DOB("07/20/1990");
	   logger.info("********** Enter companey name ***********");
	   custmod.Enter_company_name("Vinuthana Technologies");
	   logger.info("********** clicking on isTaxEmpty ***********");
	   custmod.clickOn_is_taxempty();
	   logger.info("********** clicking on Newsletter ***********");
	   custmod.cickOn_Newsletter();
	   
	   logger.info("**********  Selecting customer role  ***********");
	   custmod.select_customerRole("Administrators");
	   logger.info("**********  Selecting Vendor  ***********");
	   custmod.select_vendor("Vendor 2");
	   logger.info("**********  Checking Active chbox status  ***********");
	   custmod.activeChbx_status();
	   logger.info("**********  Adding Admin comments  ***********");
	   custmod.AddAdmin_comments("This is an account created for Test by Admin");
	
		
	}

	@And("click on save button")
	public void click_on_save_button() throws InterruptedException {
		 logger.info("**********  clilcking on save button  ***********");
		Thread.sleep(3000);
	   custmod.click_save();
		
	}

	
	@Then("use should get confirmation message {string}")
	public void use_should_get_confirmation_message(String string) {
		 logger.info("**********  validation the confirmation message  ***********");
		String message = driver.findElement(By.tagName("body")).getText();
	   Assert.assertTrue(message.contains("The new customer has been added successfully"));
	}
}



	