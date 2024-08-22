package com.hybrid.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@title='My Account']")  ////span[text()='My Account']//ancestor::a"
	WebElement ClickonMyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement ClickonRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement ClickonLogin;
	
	public void clkonmyaccount()
	{
		System.out.println("clickonmy account");
		ClickonMyAccount.click();
		
	}
	
	public void clkonregister()
	{
		ClickonRegister.click();
	}
	
	public void clkonlogin()
	{
		ClickonLogin.click();
	}
	
	public void performlogin()
	{
		clkonmyaccount();
		clkonlogin();
		
	}
	
	public void performregister()
	{
		clkonmyaccount();
		clkonregister();
		
	}
	
}
