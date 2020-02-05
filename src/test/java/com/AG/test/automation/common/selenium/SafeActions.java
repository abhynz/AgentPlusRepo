package com.AG.test.automation.common.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.AG.Reporting.Reporting;



public class SafeActions extends Sync{

	WebDriver driver;
	
	public SafeActions(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public void safeType(By locator,String value){
		driver.findElement(locator).sendKeys(value);
	}
	
	public void safeClick(By locator){
		driver.findElement(locator).click();
	}
	
	public void safeFind(By locator){
		driver.findElement(locator);
	}
	
	public void safeSelect(By locator, String selectValue){
		WebElement selectElement = driver.findElement(locator);

		Select select = new Select(selectElement);
		List<WebElement> options = select.getOptions();
		
		if(!options.isEmpty()){
			for(WebElement option:options){
				if(option.getText().contains(selectValue)){
					option.click();
					
				}
			}
		}
		
	}
	
	public void mouseHover(By locator){
		WebElement ele = driver.findElement(locator);
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).build().perform();
	}
	
	
}
