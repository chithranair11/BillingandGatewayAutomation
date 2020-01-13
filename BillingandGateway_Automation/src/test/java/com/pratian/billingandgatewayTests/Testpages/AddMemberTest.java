package com.pratian.billingandgatewayTests.Testpages;
import com.pratian.billingandgateway.utils.Property.PropertyFile;
import com.pratian.billingandgatewayTests.HomePage.HomePage;
import com.pratian.billingandgatewayTests.Login.SigninPage;
import com.pratian.billingandgatewayTests.testlisteners.*;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.*;


//@Listeners(TestListener.class)
public class AddMemberTest extends com.pratian.billingandgatewayTests.BaseTest.BaseTestClass 

{

	@Test(enabled=true)
	 public void addmemberLink() throws InterruptedException 
	 {
		 
		//TestListener.reportLog("Add member Link");
		PropertyFile propertyfile= new PropertyFile();
	
       SigninPage signin= new SigninPage(driver);
	   signin.open();
	   signin.Login(propertyfile.get("username"), propertyfile.get("password"));
	   Thread.sleep(2000);
	     
	   //Verifying the Add member link is present and enabled in the page
	  
	   HomePage home=new HomePage(driver);
	   if(home.getAddmemberlink())
		 { 
			 System.out.println("Add Member Link is Present"); 
			 
		 }

	    driver.close();
	 }
		    	
	
	
	
}
