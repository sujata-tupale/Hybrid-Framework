package com.hybrid.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	
	WebDriver driver;
  public  RegisterPage(WebDriver driver)
     {
     	this.driver=driver;
     	PageFactory.initElements(driver,this);
     }
   
   @FindBy(xpath="//input[@id='input-firstname']")
   WebElement firstnamefield;
   
   @FindBy(id="input-lastname")
   WebElement lastnamefield;
		
   @FindBy(id="input-email")
	WebElement emailfield;
   
   @FindBy(id="input-telephone")
   WebElement telephonefield;
   
   @FindBy(id="input-password")
   WebElement passwordfield;
   
   @FindBy(id="input-confirm")
   WebElement confirmpassword;
   
   @FindBy(xpath="//input[@name='agree']")
   WebElement privacypolicy;
   
   @FindBy(xpath="//input[@value='Continue']")
   WebElement clickcontinue;
   
   
   public void FirstNameField(String fname)
   {
	   firstnamefield.sendKeys("fname");
   }
   
   public void LastNameField(String lname)
   {
	   lastnamefield.sendKeys("lname");
   }
   public void EmailField(String email)
   {
	   emailfield.sendKeys("email"); 
   }
   public void TelephoneField(String telephone)
   {
	   telephonefield.sendKeys("telephone");
   }
   public void PasswordField(String password)
   {
	   passwordfield.sendKeys("password");
   }
   public void ConfirmPassword(String cpassword)
   {
	   confirmpassword.sendKeys("cpassword"); 
   }
   public void PrivacyPolicy()
   {
	   privacypolicy.click();
	   
   }
   public void ClickContinue()
   {
	   clickcontinue.click();  
   }

}




