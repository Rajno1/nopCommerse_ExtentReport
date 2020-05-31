package com.nopCommerse.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.nopCommerse.pageObjects.CustomersModuleObjects;
import com.nopCommerse.pageObjects.LoginPageObjects;



public class TestBase extends ElementExtension {
		
	
	public static  Logger logger;
	public static  Properties configProp;
	public CustomersModuleObjects custmod;
	public LoginPageObjects lp ;
	public static WebDriver driver;
	
	
	
	public static WebDriver BrowserFactory() {
	
		try {
			//object creation for logger
			logger = Logger.getLogger("nopCommerse");
			PropertyConfigurator.configure("Log4j.properties");
			logger.setLevel(Level.DEBUG);
		
			
			configProp = new Properties();
			FileInputStream configPropFile;
			configPropFile = new FileInputStream("config.properties");
			configProp.load(configPropFile);
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

		String brsr = configProp.getProperty("browser");
		
		
			
		try {
			ChromeOptions options = new ChromeOptions();     //launching chrome browser in 'incognito' mode
			options.addArguments("--incognito");
			
			
			if(brsr.equalsIgnoreCase("chrome")) {
				logger.info("************ Launching Chrome Browser  ************");
				System.setProperty("webdriver.chrome.driver",configProp.getProperty("chrome_path"));
					driver = new ChromeDriver(options);
				
			}
			else if (brsr.equalsIgnoreCase("firefox")) {
		logger.info("************ Launching Firefox Browser  ************");
				System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefox_path"));
				driver = new FirefoxDriver();
			}
			else if (brsr.equalsIgnoreCase("safari")) {
		logger.info("************ Launching Safari Browser  ************");
				driver = new SafariDriver();	
			}
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
				
			
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 long PageLoadTimeOut=Long.parseLong(configProp.getProperty("PageLoadTimeOut"));
		 driver.manage().timeouts().pageLoadTimeout(PageLoadTimeOut, TimeUnit.SECONDS);
		 
		 long Implicitwait=Long.parseLong(configProp.getProperty("Implicitwait"));
		 driver.manage().timeouts().implicitlyWait(Implicitwait, TimeUnit.SECONDS);
		 
		 return driver;
		 
		}
	
	public void tearDown() {
		
		 logger.info("************ closing the Browser  ************");
		    closeBrowser(driver);
	}
		
	}
	
			   
		 
