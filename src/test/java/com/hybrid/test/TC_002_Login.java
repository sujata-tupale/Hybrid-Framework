package com.hybrid.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hybrid.Utility.Util;
import com.hybrid.base.BaseTest;
import com.hybrid.pages.HomePage;
import com.hybrid.pages.LoginPage;

public class TC_002_Login extends BaseTest
{
	WebDriver driver;
	
	
	@BeforeMethod
	void initialzedriver() throws IOException
	{
		 loadPropertiesFile();
		  this.driver=setup();
		  
		  HomePage homepage=new HomePage(driver);
		  homepage.clkonmyaccount();
		  homepage.clkonlogin();
	}
	
	
  @Test
  void Verify_ValidCredential() throws IOException
  {
	  
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.EmailAdress("sujatatupale2@gmail.com");
	  loginpage.Password("Sujata@123");
	  loginpage.LoginButton();
	  
	  //Assert.assertTrue(driver.findElements(By.xpath("//div[@id='content']//h2[text()='My Account']")).isDisplayed());
	  
  }
  
  
    @Test
  void Verify_InvalidCredential()
  {
	  //this.driver=setup();
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.EmailAdress("sujatatupale2@gmail.com");
	  loginpage.Password("sujata12");
	  loginpage.LoginButton();
	  
	  
	  
  }
    
    @AfterMethod
    void tearDown()
    {
    	
    	driver.quit();
    }
	
}
