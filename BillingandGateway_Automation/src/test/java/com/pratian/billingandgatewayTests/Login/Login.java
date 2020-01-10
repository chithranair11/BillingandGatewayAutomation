package com.pratian.billingandgatewayTests.Login;

import org.openqa.selenium.support.FindBy;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.Button;
import com.pratian.billingandgateway.element.HtmlElement;
import com.pratian.billingandgateway.element.TextInput;

@Name("LOGIN_HEADER")
@FindBy(className = "_2lBc-")
public class Login extends HtmlElement {

	@Name("Username")
	@FindBy(id = "email")
	private TextInput username;

	@Name("Password")
	@FindBy(id = "password")
	private TextInput password;

	@Name("SignIn")
	@FindBy(xpath = "//*[@id=\"signIn\"]/div/button/span/span")
	private Button signInapp;


	public void Logintoapplication(String Username, String Password) {
		username.click();
		username.sendKeys(Username);
		password.click();
		password.sendKeys(Password);
		signInapp.click();
	}

}