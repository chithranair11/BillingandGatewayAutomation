package com.pratian.billingandgateway.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddMember {
	WebDriver driver;

	public AddMember(WebDriver driver) {
		this.driver=driver;

	}

	private By Addmemberlink = By.id("Add Member");

	private By AddMemberPageTitle = By
			.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/div/label");

	public AddMember addmemberlinkClick() throws InterruptedException {

		driver.findElement(Addmemberlink).click();
		
		return new AddMember(driver);

	}

	public String getPageTitle() {
		return driver.findElement(AddMemberPageTitle).getText();

	}

}