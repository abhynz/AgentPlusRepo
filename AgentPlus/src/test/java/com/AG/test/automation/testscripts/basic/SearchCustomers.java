package com.AG.test.automation.testscripts.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AG.Reporting.Reporting;
import com.AG.dataprovider.ExcelManager;
import com.AG.test.automation.common.locators.Locators;
import com.AG.test.automation.common.pages.CustomersPage;
import com.AG.test.automation.common.pages.Homepage;
import com.AG.test.automation.common.pages.LoginPage;
import com.base.BaseSetup;

public class SearchCustomers extends BaseSetup  {

	String url = "https://admin-demo.nopcommerce.com/login";
	Homepage hp;
	LoginPage lp;
	CustomersPage cp;
	//ExcelManager exl;
	
	@DataProvider
	public Iterator<Object[]> getTestData() throws Exception{
		ArrayList<Object[]> testData = ExcelManager.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void listCustomersWithSearch(String xemail, String xfname, String xlname) throws Exception{
		Reporting.testDescription(" *** SEARCH CUSTOMERS TEST ***");
		getDriver().get(url);
		lp = new LoginPage(getDriver());
		lp.loginToApp("admin@yourstore.com","admin");
		hp = new Homepage(getDriver());
		hp.verifyTitle();
		hp.clickCustomerLink();
		System.out.println("Clicked Customer link and waiting");
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hp.clickCustomerCustLink();
		cp = new CustomersPage(getDriver());
		cp.fillForm(Locators.fld_Email, xemail, Locators.fld_Fname, xfname, Locators.fld_Lname, xlname);
		/*exl = new ExcelManager();
		cp.enterEmail(Locators.fld_Email, exl.ExcelRead(1,1));
		cp.enterFname(Locators.fld_Fname, exl.ExcelRead(1, 2));
		cp.enterLname(Locators.fld_Lname, exl.ExcelRead(1, 3)); */
	}

}
