package com.pratian.billingandgatewayTests.HomePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.Button;
import com.pratian.billingandgateway.element.TextInput;
import com.pratian.billingandgateway.loader.HtmlElementLoader;
import com.pratian.billingandgatewayTests.Page.Page;
import com.pratian.billingandgatewayTests.testlisteners.ActivityLogger;

//import mx4j.log.Log;

public class SigninPage extends Page {
	
	@Name("EMAIL_ADDRESS")
	@FindBy(id = "email")
	TextInput emailAddress;
	
	@Name("PASSWORD")
	@FindBy(id = "password")
	TextInput password;
	
	@Name("SIGNIN_BUTTON")
	@FindBy(className  = "_2tmy0")
	Button signInButton;
	
	
	/**
	 * Instantiates a new signin.
	 *
	 * @param driver the driver
	 */
	public SigninPage(WebDriver driver)
	{
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		ActivityLogger.intializeLogger("");
	}


	/**
	 * Enter email address in signin page
	 *
	 * @param email the email
	 */
	public void enterEmail(String email)
	{
		emailAddress.click();
		ActivityLogger.info("Cliked on email text box in sign page.");
		emailAddress.clear();
		emailAddress.sendKeys(email);
		ActivityLogger.info("Entered "+email+ " in email text box in sign page.");
	}
	
	/**
	 * Enter password in signin page
	 *
	 * @param password the password
	 */
	public void enterPassword(String password)
	{
		this.password.click();
		ActivityLogger.info("Clicked on password text box.");
		this.password.clear();
		this.password.sendKeys(password);
		ActivityLogger.info("Entered "+password+" in password text box in sign in page.");
	}
	
	/**
	 * Click on sign in button.
	 */
	public void clickOnSignInButton()
	{
		signInButton.click();
		ActivityLogger.info("Clicked on sign in button in sign in page.");
	}
	
	/**
	 * Sign in into BestBuy
	 *
	 * @param email the email
	 * @param password the password
	 * @return the home page
	 */
	public HomePage signIn(String email,String password)
	{
		enterEmail(email);
		enterPassword(password);
		clickOnSignInButton();
		return new HomePage(getDriver());
	}
}
