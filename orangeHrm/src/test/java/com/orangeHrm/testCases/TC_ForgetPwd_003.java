package com.orangeHrm.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.ForgetPassword;
import com.orangeHrm.pageObjects.LoginPage;

public class TC_ForgetPwd_003 extends BaseClass
{
	@Test
	public void forgetpwd() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUserName(username);
		logger.info("user name provided");
		
		lp.SetPassword(password);
		logger.info("password provided");
		
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ForgetPassword forpwd = new ForgetPassword(driver);
		logger.info("resetting password..");
	
		forpwd.ClickForgetPwd();
		Thread.sleep(3000);
		forpwd.EnterUsenameReset("Admin");
		forpwd.ResetPassword();
		Thread.sleep(2000);
		boolean res = driver.getPageSource().contains("Reset Password link sent successfully");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed");
		}
		else
		{
			captureScreen(driver,"forgetpwd");
			Assert.assertTrue(false);
			logger.info("test casee failed");
		}
	}
	
}
