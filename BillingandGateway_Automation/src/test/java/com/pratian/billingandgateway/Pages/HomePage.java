package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.Button;
import com.pratian.billingandgateway.element.TextInput;




public class HomePage {

	WebDriver driver;

	private By Addmemberlink = By.id("Add Member");

	@Name("Password")
	@FindBy(id = "Password")
	private TextInput password;

	@Name("SignIn")
	@FindBy(xpath = "/html/body/div[1]/div[2]/form/div/div/div/div[3]/fieldset/div[6]/div/input")
	private Button signInapp;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean getAddmemberlink() throws InterruptedException {
		Thread.sleep(2000);
		if (driver.findElement(Addmemberlink).isDisplayed() && driver.findElement(Addmemberlink).isEnabled()) {

			return true;
		}
		return false;
	}

}
