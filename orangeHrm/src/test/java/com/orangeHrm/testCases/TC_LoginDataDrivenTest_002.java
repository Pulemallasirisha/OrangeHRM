package com.orangeHrm.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.LoginPage;
import com.orangeHrm.utilities.XLUtils1;

public class TC_LoginDataDrivenTest_002 extends BaseClass
{
	@Test(dataProvider="login data")
	public void LoginDataDrivenTest(String user, String pwd ) throws InterruptedException
	{
		LoginPage lp1 = new LoginPage(driver);
		lp1.SetUserName(user);
		logger.info("enter username ");
		lp1.SetPassword(pwd);
		logger.info("enter password");
		lp1.clickSubmit();
		
		Thread.sleep(3000);
		
		
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert 
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login faled");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("login passed");
			lp1.dropdownSelect();
			lp1.ClickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); //close logout alert
			driver.switchTo().defaultContent();
		}
	}
	





	//user defined  method created to check alert is present or not
		public boolean isAlertPresent()
		{
			try
			{
			driver.switchTo().alert();
			return true;
			}
			catch(NoAlertPresentException e)
			{
				return false;
			}
		}
	
	@DataProvider(name="login data")
	String [][]getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/orangeHrm/testData/LoginData1.xlsx";
		int rownum = XLUtils1.getRowCount(path, "Sheet1");
		int colcount = XLUtils1.getCellCount(path, "Sheet1",1);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount
					;j++)
			{
				logindata[i-1][j]=XLUtils1.getCellData(path, "Sheet1", i,j);
			}
		}
		return logindata;
		
	}
}
