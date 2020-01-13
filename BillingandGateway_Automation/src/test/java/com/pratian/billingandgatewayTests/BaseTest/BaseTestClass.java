package com.pratian.billingandgatewayTests.BaseTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pratian.billingandgateway.utils.Driver.BrowserDriver;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class BaseTestClass {
	
	public WebDriver driver;
	private final String chromeDriverPath = ".\\src\\main\\resources\\drivers\\chromedriver1.exe";
	private final String firefoxDriverPath=".\\src\\main\\resources\\drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe";
	
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver(); 	
		driver.manage().window().maximize(); 
		
	}   
	      
	/*@AfterMethod
	public void tearDown() { 
		driver.quit(); 
		
	}*/

}
