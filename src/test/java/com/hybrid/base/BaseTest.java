package com.hybrid.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hybrid.pages.HomePage;

public class BaseTest 
{ 
	WebDriver driver;
	Properties prop;
	
	
	public void loadPropertiesFile() throws IOException
	{
		 prop=new Properties();
		File propfile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\hybrid\\config\\config.properties");
		FileInputStream file=new FileInputStream(propfile);
		prop.load(file);
		
	}
	
	

public WebDriver setup() 
{
	
	driver=new ChromeDriver();
	
	String BrowserName=prop.getProperty("BrowserName");
	
	if(BrowserName.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	if(BrowserName.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(prop.getProperty("url"));
	return driver;
	
	
}


	
	
	
}



