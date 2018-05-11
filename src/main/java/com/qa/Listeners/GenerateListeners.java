package com.qa.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class GenerateListeners implements ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("The testcase failure detail is :"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("The Testcase skipped details is :"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The Testcase Started details is :"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
