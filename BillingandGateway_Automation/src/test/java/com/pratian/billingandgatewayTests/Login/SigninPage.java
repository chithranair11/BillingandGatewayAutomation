package com.pratian.billingandgatewayTests.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.Button;
import com.pratian.billingandgateway.element.HtmlElement;
import com.pratian.billingandgateway.element.Link;
import com.pratian.billingandgateway.element.TextInput;
import com.pratian.billingandgateway.exceptions.HtmlElementsException;
import com.pratian.billingandgateway.loader.HtmlElementLoader;
import com.pratian.billingandgateway.utils.Driver.BrowserDriver;
import com.pratian.billingandgatewayTests.Login.Login;
import com.pratian.billingandgatewayTests.Page.*;
import com.pratian.billingandgatewayTests.testlisteners.TestListener;
import com.pratian.billingandgatewayTests.HomePage.*;

public class SigninPage extends Page {
	
	BrowserDriver browserDriver;
	private Login login;
	private final String siteUrl = "https://test-claims.accesshealthcarephysiciansllc.net/";
	private final String expectedUrl = "https://test-claims.accesshealthcarephysiciansllc.net/";
	private final String expectedTitle = "";
	private final String homePageError = "home page is not displayed";
	private final String searchError="There are no results for the search";
	private SearchHeader searchHeader;
	
	@Name("Username")
	@FindBy(id = "userId")
	private TextInput username;

	@Name("Password")
	@FindBy(id = "Password")
	private TextInput password;

	@Name("SignIn")
	@FindBy(xpath = "/html/body/div[1]/div[2]/form/div/div/div/div[3]/fieldset/div[6]/div/input")
	private Button signInapp;


	public SigninPage(WebDriver driver) {
		super(driver);
		browserDriver = (BrowserDriver) getDriver();
		HtmlElementLoader.populatePageObject(this, driver);
	}

	/**
	 * Open the application
	 *
	 * @return the home page
	 */
	public SigninPage open() {		
		getDriver().get(siteUrl);		 
		// TestListener.reportLog("Application opened  "+siteUrl);
		if (!urlContains(expectedUrl) || !titleContains(expectedTitle)) 
		{
			 //TestListener.reportLog(homePageError);
			throw new HtmlElementsException(homePageError);
		}	
		return this;
	}

	
	public HomePage Login(String Username, String Password) throws InterruptedException {
		username.click();
		username.sendKeys(Username);
		password.click();
		password.sendKeys(Password);
		signInapp.click();
		return new HomePage(getDriver());
	}
	

/*	public HomePage UsernameClick() throws InterruptedException {

		userclick.click();
		return new HomePage(getDriver());

	}

	public AccountPage myAccountClick() throws InterruptedException {

		accountClick.click();
		AccountPage accpage1 = new AccountPage(getDriver());
		return accpage1;

	}*/
	public Page navigateTo(String pageName)
	{

	return new HomePage(getDriver());
	}
	
	
	

}
