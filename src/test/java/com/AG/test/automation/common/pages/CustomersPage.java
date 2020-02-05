package com.AG.test.automation.common.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.AG.test.automation.common.locators.Locators;
import com.AG.test.automation.common.selenium.SafeActions;

public class CustomersPage extends SafeActions implements Locators {

	//private WebDriver driver;
	public CustomersPage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	public void enterEmail(By locator, String email){
		safeType(locator,email);
	}
	
	public void enterFname(By locator, String fname){
		safeType(Locators.fld_Fname,fname);
	}
	
	public void enterLname(By locator, String lname){
		safeType(Locators.fld_Lname,lname);
	}
	
	public void fillForm(By locator, String email, By locator1, String fname, By locator2, String lname){
		safeType(locator,email);
		safeType(locator1,fname);
		safeType(locator2,lname);
	}
}
