package com.pratian.billingandgatewayTests.Login;

import org.openqa.selenium.support.FindBy;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.Button;
import com.pratian.billingandgateway.element.HtmlElement;
import com.pratian.billingandgateway.element.TextInput;

//@Name("LOGIN_HEADER")
//@FindBy(xpath = "/html/body/div[1]/div[2]/form/div/div/div/div[3]")
public class Login extends HtmlElement {

	@Name("Username")
	@FindBy(id = "userId")
	private TextInput username;

	@Name("Password")
	@FindBy(id = "Password")
	private TextInput password;

	@Name("SignIn")
	@FindBy(xpath = "/html/body/div[1]/div[2]/form/div/div/div/div[3]/fieldset/div[6]/div/input")
	private Button signInapp;


	public void Logintoapplication(String Username, String Password) {
		username.click();
		username.sendKeys(Username);
		password.click();
		password.sendKeys(Password);
		signInapp.click();
	}

}