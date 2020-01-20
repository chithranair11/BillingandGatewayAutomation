package com.pratian.billingandgateway.Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pratian.billingandgateway.Pages.HomePage;
import com.pratian.billingandgateway.Pages.SearchMember;
import com.pratian.billingandgateway.Pages.SigninPage;
import com.pratian.billingandgateway.utils.Property.PropertyFile;

public class SearchMemberTest extends com.pratian.billingandgateway.Pages.BaseTestClass

{

	@Test(enabled = false)
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

	@Test(enabled = false)
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

	@Test(enabled = false)
	public void isSubscriberidPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isSubscriberidPresent())

		{
			System.out.println("Subscriber id field is present and enabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isMemberlastnamePresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isMemberlastnamePresent())

		{
			System.out.println("Member Last Name field is present and enabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isMemberfirstnamePresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isMemberFirstnamePresent())

		{
			System.out.println("Member First Name field is present and enabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isDobPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isDobPresent())

		{
			System.out.println("Member DOB field is present and enabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isMemberPCPPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isMemberPCPPresent())

		{
			System.out.println("Member PCP field is present and enabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isInsurancecompanyPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isInsurancecompanyPresent())

		{
			System.out.println("Insurancecompany field is present and enabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isSearchbuttonPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.searchButton())

		{
			System.out.println("Search Button is present and disabled in the page ");
		}

		driver.close();
	}

	@Test(enabled = false)
	public void isClearbuttonPresent() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.isclearButtonPresent())

		{
			System.out.println("Clear Button is present and disabled in the page ");
		}

		driver.close();
	}
	

	@Test(enabled = false)
	public void checksearchbySubscriberId() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.searchbySubscriberid())
			System.out.println("Search by Subscriber id is executed successfully");
		else
			System.out.println("Search by Subscriber id is not executed");

		driver.close();
	}

	@Test(enabled = false)
	public void checksearchbyMemberlastname() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.searchbyMemberlastname())
			System.out.println("Search by Memberlastname is executed successfully");
		else
			System.out.println("Search by Memberlastname is not executed");

		driver.close();
	}

	@Test(enabled = false)
	public void checksearchbyMemberfirstname() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.searchbyMemberfirstname())
			System.out.println("Search by Memberfirstname is executed successfully");
		else
			System.out.println("Search by Memberfirstname is not executed");

		driver.close();
	}

	@Test(enabled = true)
	public void checksearchbyMemberDOB() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));

		SearchMember search = new SearchMember(driver);
		Thread.sleep(2000);

		search.searchmemberlinkClick();
		Thread.sleep(2000);

		if (search.searchbyDOB())
			System.out.println("Search by MemberDOB is executed successfully");
		else
			System.out.println("Search by MemberDOB is not executed");

		driver.close();
	}

}