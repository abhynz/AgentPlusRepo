package com.AG.test.automation.testscripts.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.AG.Reporting.Reporting;
import com.base.BaseSetup;

public class RegistrationTest extends BaseSetup {

	
	@Test
	public void newRegistration() {
		
	
		Reporting.testDescription("<--------- New Registration Test --------->");
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	
		getDriver().get("https://register.freecrm.com/register/");
		
		String title = getDriver().getTitle();
		Reporting.testInfo("Title of the page is :: "+title);
		Assert.assertEquals(title, "Cogmento CRM", "Success");
		
		Reporting.testPass("################### PASSED ################### ");
	
		
	}
}
