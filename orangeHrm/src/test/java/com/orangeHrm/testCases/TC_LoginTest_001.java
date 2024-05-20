package com.orangeHrm.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseurl);
		logger.info("url is opened");
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("Entered username");
		
		lp.SetPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,"login test");
			Assert.assertTrue(false);	
			logger.info("login test failed");
		}
	}
}
