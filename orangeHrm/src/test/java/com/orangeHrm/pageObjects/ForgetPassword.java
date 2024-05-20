package com.orangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword {
WebDriver ldriver;
	
	public ForgetPassword(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	@CacheLookup
	WebElement lnkforegetpwd;

	
	
	@FindBy(xpath = "//input[@placeholder='username']")
	@CacheLookup
	WebElement txtUsername    ;
	
	@FindBy(xpath = "//button[normalize-space()='Reset Password']")
	@CacheLookup
	WebElement resetpwd;
	
	
	
	public void ClickForgetPwd()
	{
		lnkforegetpwd.click();
	}
	
	
	public void EnterUsenameReset(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void ResetPassword()
	{
		resetpwd.click();
	}
	
	

}
