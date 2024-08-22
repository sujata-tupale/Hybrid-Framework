package com.hybrid.Utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
{
	public static  ExtentReports  generateextentreport()
	{
		ExtentReports extentreport = new ExtentReports();
		
		File extentreportfile=new File(System.getProperty("user.dir")+"\\test-output\\ExtentReport");
		
		
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Hybrid framework execution");
		spark.config().setDocumentTitle("Hybrid Framework Report");
		spark.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");
		
		extentreport.attachReporter(spark);
		
		 return extentreport;

		
	}

}
