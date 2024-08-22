package com.hybrid.Listneres;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class MyListeners implements ITestListener
{
	
	ExtentReports extentreport;
	
	 public void onTestStart(ITestResult result) 
	 {
		 //extentreport = ExtentReporter.generate
	  }
	 
	 public  void onTestSuccess(ITestResult result) 
	 {
		    // not implemented
     }
	 
	 public  void onTestFailure(ITestResult result) 
	  {
		    // not implemented
	  }

}
