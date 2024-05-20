package com.orangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	@CacheLookup
	WebElement lnkSelect;
	
	
	@FindBy(xpath="(//a[normalize-space()='Logout'])[1]")
	@CacheLookup
	WebElement lnklogout;
	
	
	
	public void SetUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void SetPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	public void dropdownSelect()
	{
		lnkSelect.click();
	}
	public void ClickLogout() {
		lnklogout.click();
	}
	
}
