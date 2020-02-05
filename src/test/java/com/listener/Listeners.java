package com.listener;

import org.testng.ITestResult;

public class Listeners {

	public void onTestStart(ITestResult tr){
		System.out.println("--- TEST STARTED ---");
	}
	
	public void onTestSuccess(ITestResult tr){
		System.out.println("--- TEST SUCCESSFUL ---");	
	}
	
	public void onTestFailure(ITestResult tr){
		System.out.println("--- TEST FAILED ---");
	}
	
	public void onTestSkiped(ITestResult tr){
		System.out.println("--- TEST SKIPPED ---");
	}
}
