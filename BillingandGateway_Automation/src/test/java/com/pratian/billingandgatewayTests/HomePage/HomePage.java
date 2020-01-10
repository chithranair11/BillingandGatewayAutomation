package com.pratian.billingandgatewayTests.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.HtmlElement;
import com.pratian.billingandgateway.element.Link;
import com.pratian.billingandgateway.exceptions.HtmlElementsException;
import com.pratian.billingandgateway.loader.HtmlElementLoader;
import com.pratian.billingandgatewayTests.HomePage.SigninPage;
import com.pratian.billingandgatewayTests.Page.*;
import com.pratian.billingandgatewayTests.testlisteners.TestListener;

public class HomePage extends Page {

	private final String siteUrl = "http://www.bestbuy.ca";
	private final String reviewUrl = "https://www.bestbuy.ca/en-ca/create-review/13527021/";
	private final String expectedUrl = "www.bestbuy.ca";
	private final String expectedUrl1 = "https://www.bestbuy.ca/en-ca/create-review/13527021/";
	private final String expectedTitle = "Best Buy Canada";



	private final String homePageError = "home page is not displayed";
	private final String searchError="There are no results for the search";
	private SearchHeader searchHeader;


	
//	@Name("SIGNIN_BUTTON")
//	@FindBy(linkText = "Sign In")
//	private Link signinBtn;

	@Name("User_Name")
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/header/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/a/span[1]/div/span")
	private Link userclick;

	@Name("Account_Name")
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/header/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/ul/li[1]/a/span")
	private Link accountClick;

	@Name("SignIn_Name")
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/header/div/div/div[1]/div[2]/div/a[2]/span")
	private Link signIn;

	public HomePage(WebDriver driver) {
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
	}

	/**
	 * Open the application
	 *
	 * @return the home page
	 */
	public HomePage open() {		
		getDriver().get(siteUrl);		 
		 TestListener.reportLog("Application opened  "+siteUrl);
		if (!urlContains(expectedUrl) || !titleContains(expectedTitle)) 
		{
			 TestListener.reportLog(homePageError);
			throw new HtmlElementsException(homePageError);
		}	
		return this;
	}

	// created new
	public HomePage openReview() {
		getDriver().get(reviewUrl);

		if (!urlContains(expectedUrl1))
			throw new HtmlElementsException(homePageError);

		return this;
	}		
	
//	public SigninPage getSigninPage() {
//		wait.until(ExpectedConditions.visibilityOf(signinBtn)).click();
//		return new SigninPage(getDriver());
//	}
	
	/*public ResultsPage search(String keyword) {				
		searchHeader.search(keyword);

		ResultsPage resultsPage = new ResultsPage(getDriver());
		if (resultsPage.totalCount() == 0)
		{
			 TestListener.reportLog(searchError);
			throw new RuntimeException(searchError);
		}
		
		return resultsPage;
	}*/


	
	public SigninPage SignIn() {

		signIn.click();
		SigninPage signin = new SigninPage(getDriver());

		return signin;
	}

	public HomePage UsernameClick() throws InterruptedException {

		userclick.click();
		return new HomePage(getDriver());

	}

	/*public AccountPage myAccountClick() throws InterruptedException {

		accountClick.click();
		AccountPage accpage1 = new AccountPage(getDriver());
		return accpage1;

	}*/
	public Page navigateTo(String pageName)
	{

	return new HomePage(getDriver());
	}
	
	
	

}
