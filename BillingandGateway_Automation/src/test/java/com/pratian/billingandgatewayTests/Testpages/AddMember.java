package com.pratian.billingandgatewayTests.Testpages;
import com.pratian.billingandgatewayTests.HomePage.HomePage;
import com.pratian.billingandgatewayTests.Login.SigninPage;
import com.pratian.billingandgatewayTests.testlisteners.*;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.*;


//@Listeners(TestListener.class)
public class AddMember extends com.pratian.billingandgatewayTests.BaseTest.BaseTestClass 

{

	@Test(enabled=true)
	 public void LoginCheck() throws InterruptedException 
	 {
		 
		//TestListener.reportLog("LoginCheck");
		Properties prop = new Properties();
	
      SigninPage signin= new SigninPage(driver);
	   signin.open();
	   signin.Login("lharris@ahcpllc.com","Password@123");
	   // objHomePage.UsernameClick();
	   // objHomePage.myAccountClick();
	    
	  //  View_Credit_Card card=new View_Credit_Card(driver);
	     Thread.sleep(2000);
	     
	     //Verifying the Add member link is present and enabled in the page
		 

	    driver.close();
	 }
		    	
	
	
	
}
