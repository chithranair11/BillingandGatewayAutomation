package com.pratian.billingandgateway.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchMember {

	WebDriver driver;

	public SearchMember(WebDriver driver) {
		this.driver = driver;

	}

	private By searchMemberPageTitle = By
			.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div/div/div[1]/label");

	private By searchbySubcriberid = By.id("memberIdInput");

	private By seachbyMemberLastName = By.id("lastNameInput");

	private By searchbyMemberFirstName = By.id("firstNameInput");

	private By seachbyDob = By.id("dobInput");

	private By searchbyMemberPCP = By.id("select2-pcpInput-container");

	private By seachbyInsurancecompany = By.id("select2-memberInsuranceCo-container");

	private By searchButton = By.id("searchMembersButton");

	private By clearButton = By.id("clearSearchButton");

	private By searchResultGrid = By.id("MHClaimsSearchMemberGridMain");

	private By searchResultTitle = By.className("table-title");

	private By viewmemberButton = By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[11]/button[2]");

	private By row=By.xpath("//*[@id='SearchResultGrid']/tbody/tr/td/button/i");
	
	
	
	public String getPageTitle() {
		return driver.findElement(searchMemberPageTitle).getText();

	}

	public boolean isSubscriberidPresent() {

		if (driver.findElement(searchbySubcriberid).isDisplayed()
				&& driver.findElement(searchbySubcriberid).isEnabled())

		{
			return true;
		}

		else {

			return false;
		}

	}

	public boolean searchbySubscriberid() throws InterruptedException {

		driver.findElement(searchbySubcriberid).sendKeys("H");
		driver.findElement(searchButton).click();
		Thread.sleep(5000);
		if (driver.findElement(searchResultGrid).isDisplayed() && driver.findElement(searchResultTitle).isDisplayed())
			return true;
		else
			return false;

	}

	public boolean isMemberlastnamePresent() {

		if (driver.findElement(seachbyMemberLastName).isDisplayed()
				&& driver.findElement(seachbyMemberLastName).isEnabled())

		{
			return true;
		}

		else {

			return false;
		}
	}

	public boolean searchbyMemberlastname() throws InterruptedException {

		driver.findElement(seachbyMemberLastName).sendKeys("H");
		driver.findElement(searchButton).click();
		Thread.sleep(8000);
		if (driver.findElement(searchResultGrid).isDisplayed() && driver.findElement(searchResultTitle).isDisplayed())
			return true;
		else
			return false;

	}

	public boolean isMemberFirstnamePresent() {

		if (driver.findElement(searchbyMemberFirstName).isDisplayed()
				&& driver.findElement(searchbyMemberFirstName).isEnabled())

		{
			return true;
		}

		else {

			return false;
		}
	}

	public boolean searchbyMemberfirstname() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(searchbyMemberFirstName));

		driver.findElement(searchbyMemberFirstName).sendKeys("H");
		driver.findElement(searchButton).click();
		Thread.sleep(8000);
		if (driver.findElement(searchResultGrid).isDisplayed() && driver.findElement(searchResultTitle).isDisplayed())
			return true;
		else
			return false;

	}

	public boolean isDobPresent() {

		if (driver.findElement(seachbyDob).isDisplayed() && driver.findElement(seachbyDob).isEnabled())

		{
			return true;
		}

		else {

			return false;
		}
	}

	public boolean searchbyDOB() throws InterruptedException {

		driver.findElement(seachbyDob).sendKeys("27102019");
		Thread.sleep(1000);
		driver.findElement(searchButton).click();
		Thread.sleep(8000);
		if (driver.findElement(searchResultGrid).isDisplayed() && driver.findElement(searchResultTitle).isDisplayed())
			return true;
		else
			return false;

	}

	public boolean isMemberPCPPresent() {

		if (driver.findElement(searchbyMemberPCP).isDisplayed() && driver.findElement(searchbyMemberPCP).isEnabled())

		{
			return true;
		}

		else {

			return false;
		}
	}

	public boolean isInsurancecompanyPresent() {

		if (driver.findElement(seachbyInsurancecompany).isDisplayed()
				&& driver.findElement(seachbyInsurancecompany).isEnabled())

		{
			return true;
		}

		else {

			return false;
		}
	}

	public boolean searchButton()

	{
		if (driver.findElement(searchButton).isDisplayed() && !driver.findElement(searchButton).isEnabled())
			return true;
		else
			return false;

	}

	public SearchMember clickOnsearchButton()

	{
		driver.findElement(searchButton).click();
		return new SearchMember(driver);

	}

	public boolean isclearButtonPresent()

	{
		if (driver.findElement(clearButton).isDisplayed() && !driver.findElement(clearButton).isEnabled())
			return true;
		else
			return false;

	}

	public ViewMember viewMemberButtonClick() throws InterruptedException {

		
		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(viewmemberButton));
		
		driver.findElement(viewmemberButton).click();

		return new ViewMember(driver);

	}

	
	public boolean checkviewMemberButtonPresent() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> rows=driver.findElements(row);
		int i=0,n=0;
		for(WebElement ele:rows){
			i++;
			if(i%3==2){
				if(ele.getAttribute("class").equalsIgnoreCase("fa fa-eye")){
					//System.out.println("View button is present in row: "+ i);
				}
				else
					//System.out.println("View button is not present in row: "+ i);
				    n++;
					
			}
		}
		
		if(n==0)
		
		return true;
		else
			
		return false;		
		
	}
	
	
	
}
