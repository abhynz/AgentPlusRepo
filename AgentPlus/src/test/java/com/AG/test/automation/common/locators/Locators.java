package com.AG.test.automation.common.locators;

import org.openqa.selenium.By;

public interface Locators {

	public static By input_username = By.xpath("//input[@class='email']");
	public static By input_password = By.xpath("//input[@class='password']");
	public static By btn_login = By.xpath("//input[contains(@class,'login-button')]");

	//Homepage Locators
	public static By logo = By.xpath("//span[@class='logo-mini']");
	public static By link_customer = By.xpath("//ul[@class='sidebar-menu tree']/li[4]/a/span");
	
	public static By link_Customer_customer = By.xpath("//li[@class='treeview menu-open']/ul[@class='treeview-menu']/li/a/span");
	public static By fld_Email = By.name("SearchEmail");
	public static By fld_Fname = By.name("SearchFirstName");
	public static By fld_Lname = By.name("SearchLasstName");
/*	public static By fld_Email = By.name("");
	public static By fld_Email = By.name("");*/
	
	
	
}
