package com.AG.Reporting;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;

public class Reporting {
	
	private static ExtentHtmlReporter extent;
	private static ExtentReports report;
	private static ExtentTest testlog;

	public static void createFolderStructure(){
		extent  = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/AutomationReports/ExecutionReport.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		
		System.out.println("$$$$  EXTENT report attached");
		
	}
	
	public static void testDescription(String description){
		testlog = report.createTest(description);
		System.out.println("---- Test started");
	}
	
	public static void testInfo(String info){
		testlog.info(info);
		
	}
	
	public static void testPass(String pass){
		testlog.pass(pass);
		
	}
	
	public static void testFail(String fail){
		testlog.pass(fail);
		
	}
	
	public static void flushReport(){
		report.flush();
	}
}
