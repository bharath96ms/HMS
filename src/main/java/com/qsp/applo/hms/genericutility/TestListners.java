package com.qsp.applo.hms.genericutility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
	}

	
}
