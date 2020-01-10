package com.pratian.billingandgatewayTests.HomePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;

import com.pratian.billingandgateway.annotations.Name;
import com.pratian.billingandgateway.element.*;
import com.pratian.billingandgatewayTests.testlisteners.ActivityLogger;

//import mx4j.log.Log;

@Name("SEARCH_HEADER")
@FindBy(className = "searchBarContainer_3c_uZ") 
public class SearchHeader extends HtmlElement{
		
	@Name("SEARCH_FIELD")
	@FindBy(className = "textField_e79SD")	
	private TextInput searchKeywordTxt;
	
	@Name("SEARCH_BUTTON")
	@FindBy(className = "searchButton_T4-BG")
	private Button searchBtn;	
	  		
	public void search(String keyword) {
		ActivityLogger.intializeLogger("");
		searchKeywordTxt.click();  
		ActivityLogger.info("Clicked on search textbox in home page.");
		searchKeywordTxt.clear();
		searchKeywordTxt.sendKeys(keyword);
		ActivityLogger.info("Entered "+keyword +"in search text box in home page.");
		searchBtn.click();		
	}
	
}
