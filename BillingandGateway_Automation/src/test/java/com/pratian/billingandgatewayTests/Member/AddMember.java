package com.pratian.billingandgatewayTests.Member;
import com.pratian.billingandgatewayTests.Page.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.HtmlElement;
import com.pratian.billingandgateway.element.TextInput;


public class AddMember extends Page {

	public AddMember(WebDriver driver) {
		super(driver);
		
	}
	
	@Name("Addmemberlink")
	@FindBy(id = "Add Member")
	private TextInput Addmemberlink;
	
	@Name("ADDMEMBERPAGETITLE")
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div/div/label")
	private HtmlElement AddMemberPageTitle;
	

 public AddMember addmemberlinkClick() throws InterruptedException {

		Addmemberlink.click();
		return new AddMember(getDriver());

	}
  	

  public String getPageTitle()
   {
	return AddMemberPageTitle.getText();
	
  }

  

}