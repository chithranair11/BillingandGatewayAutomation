package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchMember {
	
	
	WebDriver driver;

	public SearchMember(WebDriver driver)
	{
		this.driver=driver;

	}

	private By Searchmemberlink = By.id("Search Member");

	private By SearchMemberPageTitle = By
			.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div/div/div[1]/label");

	public SearchMember searchmemberlinkClick() throws InterruptedException {

		driver.findElement(Searchmemberlink).click();
		
		return new SearchMember(driver);

	}

	public String getPageTitle() 
	{
		return driver.findElement(SearchMemberPageTitle).getText();

	}


}
