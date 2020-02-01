package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewMember {
	
	WebDriver driver;
	private By viewmemberTitle= By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/div[1]/label");
	
	
	public ViewMember(WebDriver driver)
	{
		
		this.driver= driver;
	}
	
	
	public String getPageTitle() throws InterruptedException
	{
		
		return driver.findElement(viewmemberTitle).getText();
	}

}
