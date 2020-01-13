package com.pratian.billingandgatewayTests.HomePage;

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
import com.pratian.billingandgatewayTests.Login.SigninPage;
import com.pratian.billingandgatewayTests.Page.*;
import com.pratian.billingandgatewayTests.testlisteners.TestListener;

public class HomePage extends Page {
	
	BrowserDriver browserDriver;
	
	
	@Name("Addmemberlink")
	@FindBy(id = "Add Member")
	private TextInput Addmemberlink;

	@Name("Password")
	@FindBy(id = "Password")
	private TextInput password;

	@Name("SignIn")
	@FindBy(xpath = "/html/body/div[1]/div[2]/form/div/div/div/div[3]/fieldset/div[6]/div/input")
	private Button signInapp;


	public HomePage(WebDriver driver) {
		super(driver);
		browserDriver = (BrowserDriver) getDriver();
		HtmlElementLoader.populatePageObject(this, driver);
	}

	
	public boolean getAddmemberlink()
	   {
		if (Addmemberlink.isDisplayed() && Addmemberlink.isEnabled()) {
		   
	     return  true;
	    }
	     return false;
	   }
	
	

}
