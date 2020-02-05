package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.AG.Reporting.Reporting;


public class BaseSetup {

	WebDriver driver;

	@BeforeSuite
	public void suiteSetUp(){		
		Reporting.createFolderStructure();
		
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public void setDriver(WebDriver driver){
		this.driver = driver;
	}
	
	@BeforeClass
	public void initialiseBaseSetup(){
		driver = ChromeBrowser.init();
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("^^^^^^^^^^^^^^ EXECUTING AFTER SUITE");
		Reporting.flushReport();
		driver.quit();
		System.out.println("^^^^^^^^^^^^^^ DONE AFTER SUITE");
		
	}
}
