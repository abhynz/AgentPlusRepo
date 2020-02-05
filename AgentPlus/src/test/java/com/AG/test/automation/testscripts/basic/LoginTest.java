package com.AG.test.automation.testscripts.basic;

import org.testng.annotations.Test;

import com.AG.Reporting.Reporting;
import com.AG.test.automation.common.pages.Homepage;
import com.AG.test.automation.common.pages.LoginPage;
import com.base.BaseSetup;

public class LoginTest extends BaseSetup {

	String url = "https://admin-demo.nopcommerce.com/login";
	Homepage hp;
	LoginPage lp;
	
	@Test
	public void login(){
		Reporting.testDescription(" *** LOGIN TEST ***");
		getDriver().get(url);
		Reporting.testInfo("Entered url :: "+url);
		lp = new LoginPage(getDriver());
		lp.loginToApp("admin@yourstore.com","admin");
		hp = new Homepage(getDriver());
		hp.verifyTitle();
		hp.clickCustomerLink();
	}
}


