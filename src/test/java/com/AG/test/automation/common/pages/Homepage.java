package com.AG.test.automation.common.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.AG.Reporting.Reporting;
import com.AG.test.automation.common.locators.Locators;
import com.AG.test.automation.common.selenium.SafeActions;

public class Homepage extends SafeActions implements Locators {
	
	WebDriver driver;
	public Homepage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public void verifyTitle(){
		Assert.assertTrue(isElementPresent(Locators.logo), "Logo verified");
	}
	
	public void clickCustomerLink(){
		safeClick(Locators.link_customer);
		Reporting.testInfo("Clicked :: "+link_customer);
	}
	
	public void clickCustomerCustLink(){
		safeClick(Locators.link_Customer_customer);
		Reporting.testInfo("Clicked :: "+link_Customer_customer);
	}

	
	
}
