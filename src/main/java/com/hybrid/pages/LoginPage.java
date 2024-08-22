package com.hybrid.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement enteremail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement emailPasswordNotMatchingWarning;


	
	public void EmailAdress(String email)
	{
		enteremail.sendKeys("email");
	}
	
	public void Password(String password)
	{
		enterpassword.sendKeys("password");
	}
	
	public void LoginButton()
	{
		loginButton.click();
	}
	
     public String retrieveEmailPasswordNotMatchingWarningMessageText() 
     {
		
	  String warningText = emailPasswordNotMatchingWarning.getText();
		return warningText;
     }
     
     public void performLogin(String emailText,String passwordText) 
     {
 		
  	   enteremail.sendKeys(emailText);
  	   enterpassword.sendKeys(passwordText);
  	   loginButton.click();		
  		
  	}	



}
