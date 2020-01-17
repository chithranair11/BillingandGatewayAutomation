package com.pratian.billingandgateway.Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.pratian.billingandgateway.exceptions.HtmlElementsException;



public class AddMember
{
	WebDriver driver;
	private final String mandatoryMessageError="Member is not added.";

	public AddMember(WebDriver driver)
	{
		this.driver=driver;

	}

	private By Addmemberlink = By.id("Add Member");

	private By AddMemberPageTitle = By
			.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/div/label");
	
	private By saveButton =By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/form/div[3]/button[1]");

	private By mandatoryMessages=By.className("field-validation-error");
	
	public AddMember addmemberlinkClick() throws InterruptedException {

		driver.findElement(Addmemberlink).click();
		
		return new AddMember(driver);

	}

	public String getPageTitle() 
	{
		return driver.findElement(AddMemberPageTitle).getText();

	}
	public boolean checkSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(saveButton));
		if (driver.findElement(saveButton).isDisplayed() && driver.findElement(saveButton).isEnabled()) {

			return true;
		}
		return false;
	}
	
	
	
	public void clickOnSaveButton() throws InterruptedException
	{
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(saveButton));
		driver.findElement(saveButton).click();
		
	}
	
	public boolean checkAllMandatoryFieldMessages(List<String> messages) throws HtmlElementsException
	{
		int check=0;
		boolean result=false;
		for (int i = 0; i < driver.findElements(mandatoryMessages).size(); i++) {
			for (int j = 0; j < messages.size(); j++) {
				if(driver.findElements(mandatoryMessages).get(i).getText().equals(messages.get(j)))
				{
					check++;
					break;
				}
			}
		}
		if(check>0)
		{
			result=true;
		}
		else {
			
			throw new HtmlElementsException(mandatoryMessageError);
		}
		return result;
	}
}