package com.AG.test.automation.common.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sync {

	private WebDriver driver;
	
	public Sync(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean isElementPresent(By locator){
		return driver.findElements(locator).size()>0;
	}
	
	
}
