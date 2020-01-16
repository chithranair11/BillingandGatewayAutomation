package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

	public WebDriver driver;
	private final String chromeDriverPath = ".\\src\\main\\resources\\drivers\\chromedriver.exe";
	// private final String
	// firefoxDriverPath=".\\src\\main\\resources\\drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe";

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit();
	 * 
	 * }
	 */

}
