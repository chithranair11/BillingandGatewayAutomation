package com.pratian.billingandgateway.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pratian.billingandgateway.exceptions.HtmlElementsException;

public class AddMember {
	WebDriver driver;
	private final String mandatoryMessageError = "Member is not added.";

	public AddMember(WebDriver driver) {
		this.driver = driver;

	}

	private By AddMemberPageTitle = By
			.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/div/label");

	private By saveButton = By
			.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/form/div[3]/button[1]");

	private By cancelButton = By.xpath("//*[@id='addFormButtons']/button[2]");

	private By mandatoryMessages = By.className("field-validation-error");

	private By memberTermDate = By.name("PersonTerminationDate");

	private By addressTermDate = By.name("AddressTerminationDate");

	private By planTermDate = By.name("PlanTerminationDate");

	private By pcpTermDate = By.name("PcpTerminationDate");
	
	private By patientRelationship= By.id("RelationshipName");
	
	private By uploadButton= By.id("Documents_0__Document");

	

	public String memberTermdateAutofill() {

		return driver.findElement(memberTermDate).getAttribute("value");
	}

	public String addressTermdateAutofill() {

		return driver.findElement(addressTermDate).getAttribute("value");
	}

	public String planTermdateAutofill() {

		return driver.findElement(planTermDate).getAttribute("value");
	}

	public String pcpTermdateAutofill() {

		return driver.findElement(pcpTermDate).getAttribute("value");
	}
	
	public String patientRelationshipAutofill(){
		
		return driver.findElement(patientRelationship).getAttribute("value");
	}
	
	public WebElement patientRelationshipReadOnly(){
		
		return driver.findElement(patientRelationship);
		
	}

	public String getPageTitle() {
		return driver.findElement(AddMemberPageTitle).getText();

	}

	public boolean checkSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(saveButton));
		if (driver.findElement(saveButton).isDisplayed() && driver.findElement(saveButton).isEnabled()) {

			return true;
		}
		return false;
	}

	public void clickOnSaveButton() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(saveButton));
		driver.findElement(saveButton).click();

	}

	public boolean checkCancelButton() throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(cancelButton));
		if (driver.findElement(cancelButton).isDisplayed() && driver.findElement(saveButton).isEnabled()) {

			return true;
		}
		return false;
	}

	public HomePage clickOnCancelButton() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(cancelButton));
		driver.findElement(cancelButton).click();
		return new HomePage(driver);

	}

	public boolean checkAllMandatoryFieldMessages(List<String> messages) throws HtmlElementsException {
		int check = 0;
		boolean result = false;
		for (int i = 0; i < driver.findElements(mandatoryMessages).size(); i++) {
			for (int j = 0; j < messages.size(); j++) {
				if (driver.findElements(mandatoryMessages).get(i).getText().equals(messages.get(j))) {
					check++;
					break;
				}
			}
		}
		if (check > 0) {
			result = true;
		} else {

			throw new HtmlElementsException(mandatoryMessageError);
		}
		return result;
	}
	
	public boolean checkUploadButton() throws InterruptedException {
		
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(uploadButton));
		
		if (driver.findElement(uploadButton).isDisplayed() && driver.findElement(uploadButton).isEnabled()) {

			return true;
		}
		return false;
	}

}