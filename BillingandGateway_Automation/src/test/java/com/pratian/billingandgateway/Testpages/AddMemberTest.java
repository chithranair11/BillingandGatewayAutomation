package com.pratian.billingandgateway.Testpages;

import com.pratian.billingandgateway.utils.Property.PropertyFile;
import com.pratian.billingandgateway.Pages.HomePage;
import com.pratian.billingandgateway.Pages.SigninPage;
import com.pratian.billingandgateway.Pages.AddMember;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(TestListener.class)
public class AddMemberTest extends com.pratian.billingandgateway.Pages.BaseTestClass

{

	@Test(enabled = true)
	public void addmemberLink() throws InterruptedException {

		// TestListener.reportLog("Add member Link");
		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		// Verifying the Add member link is present and enabled in the page

		HomePage home = new HomePage(driver);
		if (home.getAddmemberlink()) {
			System.out.println("Add Member Link is Present");

		}

		driver.close();
	}

	@Test(enabled = true)
	public void addmemberPageTitle() throws InterruptedException {

		// TestListener.reportLog("Add member Link");
		PropertyFile propertyfile = new PropertyFile();

		SigninPage signin = new SigninPage(driver);
		signin.open();

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		Thread.sleep(2000);
		AddMember addmember = new AddMember(driver);

		addmember.addmemberlinkClick();

		// Verifying the Add member Page Tile

		Thread.sleep(2000);

		String expectedTitle = "Add Member";
		String actualTitle = addmember.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.close();
	}

}
