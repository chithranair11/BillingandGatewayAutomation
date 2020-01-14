package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pratian.billingandgateway.exceptions.HtmlElementsException;


public class SigninPage {

	WebDriver driver;
	private final String siteUrl = "https://test-claims.accesshealthcarephysiciansllc.net/";
	private final String expectedUrl = "https://test-claims.accesshealthcarephysiciansllc.net/";
	private final String expectedTitle = "";
	private final String homePageError = "home page is not displayed";

	//private SearchHeader searchHeader;

	private By username = By.id("userId");

	private By password = By.id("Password");

	private By signInapp = By.xpath("/html/body/div[1]/div[2]/form/div/div/div/div[3]/fieldset/div[6]/div/input");

	public SigninPage(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 * Open the application
	 *
	 * @return the home page
	 */
	public SigninPage open() {
		driver.get(siteUrl);

		if (!driver.getCurrentUrl().contains(expectedUrl) || !driver.getTitle().contains(expectedTitle)) {
			// TestListener.reportLog(homePageError);
			throw new HtmlElementsException(homePageError);
		}
		return this;
	}

	public HomePage Login(String Username, String Password) throws InterruptedException {
		driver.findElement(username).click();
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).click();
		driver.findElement(password).sendKeys(Password);
		driver.findElement(signInapp).click();
		return new HomePage(driver);
	}

	/*
	 * public HomePage UsernameClick() throws InterruptedException {
	 * 
	 * userclick.click(); return new HomePage(getDriver());
	 * 
	 * }
	 * 
	 * public AccountPage myAccountClick() throws InterruptedException {
	 * 
	 * accountClick.click(); AccountPage accpage1 = new
	 * AccountPage(getDriver()); return accpage1;
	 * 
	 * }
	 */
	public WebDriver navigateTo(String pageName) {

		return (driver);
	}

}
