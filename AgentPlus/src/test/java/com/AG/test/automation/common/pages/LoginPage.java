package com.AG.test.automation.common.pages;

import org.openqa.selenium.WebDriver;

import com.AG.Reporting.Reporting;
import com.AG.test.automation.common.locators.Locators;
import com.AG.test.automation.common.selenium.SafeActions;

public class LoginPage extends SafeActions implements Locators{

	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void loginToApp(String username, String password){
		safeType(Locators.input_username, username);
		Reporting.testInfo("Entered :: "+username);
		safeType(Locators.input_password, password);
		Reporting.testInfo("Entered :: "+password);
		safeClick(Locators.btn_login);
		Reporting.testInfo("Clicked :: "+btn_login);
	}
	
	
	
}
