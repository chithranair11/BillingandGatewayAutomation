package com.pratian.billingandgateway.Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pratian.billingandgateway.Pages.HomePage;
import com.pratian.billingandgateway.Pages.SearchMember;
import com.pratian.billingandgateway.Pages.SigninPage;
import com.pratian.billingandgateway.Pages.ViewMember;
import com.pratian.billingandgateway.utils.Property.PropertyFile;

public class ViewMemberTest extends com.pratian.billingandgateway.Pages.BaseTestClass
{

	@Test(enabled = false)
	public void isviewmemberButtonPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		// Verifying the View member Button is present and enabled in the page
        HomePage home= new HomePage(driver);
		home.searchmemberlinkClick();
		SearchMember searchmember = new SearchMember(driver);
		
		if (searchmember.searchbyMemberfirstname() && searchmember.checkviewMemberButtonPresent()){
			
			System.out.println("View member button is present");
					
		}
		
		
		else {
			System.out.println("View member button is not  Present");

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
		
		HomePage home= new HomePage(driver);
		home.searchmemberlinkClick();
		SearchMember searchmember = new SearchMember(driver);
		Thread.sleep(2000);
		// Verifying the view member Page Tile
		if(searchmember.searchbyMemberfirstname())
		{
		searchmember.viewMemberButtonClick();
		}
		
		else
		{
			
			System.out.println("Search Member is not working");
		}
		ViewMember view=new ViewMember(driver);

		String expectedTitle = "View Member";
		String actualTitle = view.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.close();
	}

	
	
}
