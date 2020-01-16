package com.pratian.billingandgateway.Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pratian.billingandgateway.Pages.HomePage;
import com.pratian.billingandgateway.Pages.SearchMember;
import com.pratian.billingandgateway.Pages.SigninPage;
import com.pratian.billingandgateway.utils.Property.PropertyFile;

public class SearchMemberTest extends com.pratian.billingandgateway.Pages.BaseTestClass

{

	@Test(enabled = true)
	public void searchmemberLink() throws InterruptedException {

		// TestListener.reportLog("Search member Link");
		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		// Verifying the Search member link is present and enabled in the page

		HomePage home = new HomePage(driver);
		if (home.getSearchmemberlink()) {
			System.out.println("Search Member Link is Present");

		}

		driver.close();
	}

	@Test(enabled = true)
	public void searchmemberPageTitle() throws InterruptedException {

		// TestListener.reportLog("Search member Link");
		PropertyFile propertyfile = new PropertyFile();

		SigninPage signin = new SigninPage(driver);
		signin.open();

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		Thread.sleep(2000);
		SearchMember searchmember = new SearchMember(driver);

		searchmember.searchmemberlinkClick();

		// Verifying the Search member Page Tile

		Thread.sleep(2000);

		String expectedTitle = "Search Member";
		String actualTitle = searchmember.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.close();
	}

}