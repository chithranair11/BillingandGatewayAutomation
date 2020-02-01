package com.pratian.billingandgateway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

	WebDriver driver;


	private By Addmemberlink = By.id("Add Member");

	private By Searchmemberlink = By.id("Search Member");
	
	private By HomePageTitle=By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div/div[1]/div/form[1]/div[2]/label[1]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() throws InterruptedException {
		
		return driver.findElement(HomePageTitle).getText();
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
	
    public SearchMember searchmemberlinkClick() throws InterruptedException {

		
		Thread.sleep(2000);
		driver.findElement(Searchmemberlink).click();
		return new SearchMember(driver);
	}
    
    public AddMember addmemberlinkClick() throws InterruptedException {

    	Thread.sleep(2000);
    	driver.findElement(Addmemberlink).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(Addmemberlink));

		return new AddMember(driver);

	}

}
