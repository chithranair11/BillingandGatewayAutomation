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
	List<String> mandatoryMessages = new ArrayList<String>();

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

		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();

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
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		
		// Save button in Add memeber Page is present and enabled
		if (addmember.checkSaveButton()) {
			System.out.println("Save Button is visible and enabled in the add member page");
		}

		Thread.sleep(2000);

		driver.close();
	}

	@Test(enabled = true)
	public void checkMandatoryFieldMessages() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
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

	@Test(enabled = true)
	public void addmemberCancelButton() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		if (addmember.checkCancelButton()) {
			System.out.println("Cancel Button is visible and enabled in the add member page");
		}

		Thread.sleep(2000);

		driver.close();
	}

	@Test(enabled = true)
	public void addmemberCancelButtonNavigation() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		HomePage home = new HomePage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		Thread.sleep(2000);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		addmember.clickOnCancelButton();
		Thread.sleep(5000);
		//Verifying the add member cancel button and title of the navigated page
		String expectedTitle = "Claims Status";
		String actualTitle = home.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.close();

	}
	
	@Test(enabled = true)
	public void checkMemberTermdateAutofill() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		
		//Verifying the add member MemberTermdate Field auto fill 
		String expectedValue = "12/31/9999";
		String actualValue = addmember.memberTermdateAutofill();
		Assert.assertEquals(actualValue, expectedValue);
		driver.close();

	}


	@Test(enabled = true)
	public void checkAddressTermdateAutofill() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		
		//Verifying the add member AddressTermdate Field auto fill 
		String expectedValue = "12/31/9999";
		String actualValue = addmember.addressTermdateAutofill();
		Assert.assertEquals(actualValue, expectedValue);
		driver.close();

	}
	
	@Test(enabled = true)
	public void checkPlanTermdateAutofill() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		
		//Verifying the add member PlanTermdate Field auto fill 
		String expectedValue = "12/31/9999";
		String actualValue = addmember.planTermdateAutofill();
		Assert.assertEquals(actualValue, expectedValue);
		driver.close();

	}
	
	@Test(enabled = true)
	public void checkpcpTermdateAutofill() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		
		//Verifying the add member pcpTermdate Field auto fill 
		String expectedValue = "12/31/9999";
		String actualValue = addmember.pcpTermdateAutofill();
		Assert.assertEquals(actualValue, expectedValue);
		driver.close();

	}
	
	@Test(enabled = true)
	public void checkpatientRelationshipAutofill() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		
		//Verifying the add member patientRelationship Field auto fill 
		String expectedValue = "SELF";
		String actualValue = addmember.patientRelationshipAutofill();
		Assert.assertEquals(actualValue, expectedValue);
		driver.close();

	}
	
	@Test(enabled = true)
	public void checkpatientRelationshipReadOnly() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		// Thread.sleep(2000);

		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		//Verifying the add member patientRelationship Field Read Only 
        Assert.assertTrue(addmember.patientRelationshipReadOnly().getAttribute("readOnly").equals("true"),"Element ReadOnly");
		driver.close();

	}
	
	@Test(enabled = true)
	public void checkUploadbutton() throws InterruptedException {

		PropertyFile propertyfile = new PropertyFile();
		SigninPage signin = new SigninPage(driver);
		signin.open();
		signin.Login(propertyfile.get("username"), propertyfile.get("password"));
		AddMember addmember = new AddMember(driver);
		HomePage home =new HomePage(driver);
		home.addmemberlinkClick();
		Thread.sleep(2000);
		//Verifying the add member document upload button 
        if(addmember.checkUploadButton())
        {
        	
        	System.out.println("Document Upload button is displayed and enabled");
        }
        
        Thread.sleep(2000);
		driver.close();

	}
}
