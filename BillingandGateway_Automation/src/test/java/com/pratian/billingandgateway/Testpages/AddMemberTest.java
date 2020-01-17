package com.pratian.billingandgateway.Testpages;

import com.pratian.billingandgateway.utils.Property.PropertyFile;
import com.pratian.billingandgateway.Pages.HomePage;
import com.pratian.billingandgateway.Pages.MandatoryMessageInAddMember;
import com.pratian.billingandgateway.Pages.SigninPage;
import com.pratian.billingandgateway.Pages.AddMember;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(TestListener.class)
public class AddMemberTest extends com.pratian.billingandgateway.Pages.BaseTestClass

{
	List<String> mandatoryMessages= new ArrayList<String>();
	
	@Test(enabled = false)
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

	@Test(enabled = false)
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
	
	@Test(enabled = true)
	public void addmemberSaveButton() throws InterruptedException {

		
		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		//Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		Thread.sleep(2000);
		addmember.addmemberlinkClick();
		Thread.sleep(2000);
		if(addmember.checkSaveButton())
		{
			System.out.println("Save Button is visible and enabled in the add member page");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
	@Test(enabled = false)
	public void checkMandatoryFieldMessages() throws InterruptedException {

	
		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		//Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		Thread.sleep(2000);
		addmember.addmemberlinkClick();
		Thread.sleep(2000);
		addmember.clickOnSaveButton();
		Thread.sleep(2000);
		mandatoryMessages.add(MandatoryMessageInAddMember.AddrEffDate.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.AddressLine1.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.City.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.Country.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.InsuranceCompany.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.IPAName.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.PCPEffFrom.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.PCPName.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.PhoneNumber.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.PlanEffDate.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.PlanName.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.State.toString());
		mandatoryMessages.add(MandatoryMessageInAddMember.UploadDocument.toString());
		addmember.checkAllMandatoryFieldMessages(mandatoryMessages);
		Thread.sleep(2000);
		driver.close();
	}

}
