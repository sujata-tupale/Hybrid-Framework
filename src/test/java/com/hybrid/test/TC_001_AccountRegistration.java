package com.hybrid.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.hybrid.Utility.Util;
import com.hybrid.base.BaseTest;
import com.hybrid.pages.HomePage;
import com.hybrid.pages.RegisterPage;



public class TC_001_AccountRegistration  extends BaseTest
{
	WebDriver driver;

	
	 @BeforeMethod
	 void initialzedriver() throws InterruptedException, IOException
	{
		loadPropertiesFile();
		this.driver=setup();
		
		HomePage homepage=new HomePage(driver);
		System.out.println("register test");
		homepage.clkonmyaccount();
		homepage.clkonregister();
		Thread.sleep(3000);
	}
	 
	 
	
		@Test
		void Verify_ValidCredentials()
		{
		RegisterPage registerpage=new RegisterPage(driver);
		
		registerpage.FirstNameField("sujata");
		registerpage.LastNameField("Tupale");
		registerpage.EmailField(Util.GenerataEmailwithTimeStamp());
		registerpage.TelephoneField("7349397894");
		registerpage.PasswordField("Sujata@123");
		registerpage.ConfirmPassword("Sujata@123");
		registerpage.PrivacyPolicy();
		registerpage.ClickContinue();
		
		}
		
		
		
		@Test
		void Verify_InvalidCredential()
		{
			RegisterPage registerpage=new RegisterPage(driver);
			
			registerpage.FirstNameField("sujata");
			registerpage.LastNameField("Tupale");
			registerpage.EmailField("anujatupale2@gmail.com");
			registerpage.TelephoneField("7349397892");
			registerpage.PasswordField("test@123");
			registerpage.ConfirmPassword("test@123");
			registerpage.PrivacyPolicy();
			registerpage.ClickContinue();
		}
		
		
		@AfterMethod
		void tearDown()
		{
			
			driver.quit();
		}	


}
