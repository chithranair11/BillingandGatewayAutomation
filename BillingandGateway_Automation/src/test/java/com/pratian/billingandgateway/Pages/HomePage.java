package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	WebDriver driver;

	private By Addmemberlink = By.id("Add Member");

	private By Searchmemberlink = By.id("Search Member");

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

	public boolean getSearchmemberlink() throws InterruptedException {
		Thread.sleep(2000);
		if (driver.findElement(Searchmemberlink).isDisplayed() && driver.findElement(Searchmemberlink).isEnabled()) {

			return true;
		}
		return false;
	}

}
