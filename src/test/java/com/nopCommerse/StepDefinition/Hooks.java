package com.nopCommerse.StepDefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.nopCommerse.Base.TestBase;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;



public class Hooks extends TestBase{
	
	@Before
	public void startup() {
		
		 BrowserFactory();
	
	}
	
	
	@After
	public void endUp() {
		
//		logger.info("************ clicking on logout link  ************");
//		Thread.sleep(2000);
//	    lp.clickLogout();
	    tearDown();
	 
	}
	
	@AfterStep
	public void atend(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.write("This is failure message");
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			 
			
			scenario.embed(screenshot, "image/png");
		}
	}
	  
}
