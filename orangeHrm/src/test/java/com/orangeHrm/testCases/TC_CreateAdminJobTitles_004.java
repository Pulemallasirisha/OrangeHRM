package com.orangeHrm.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.CreateAdminJobTitles;
import com.orangeHrm.pageObjects.LoginPage;

public class TC_CreateAdminJobTitles_004 extends BaseClass
{
	@Test
	public void createadmintitle() throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("username entered");
		
		lp.SetPassword(password);
		logger.info("password entered");
		
		lp.clickSubmit();
		logger.info("successfully logined");
		Thread.sleep(3000);
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
	//	Thread.sleep(3000);
		
		CreateAdminJobTitles job = new CreateAdminJobTitles(driver); 
		logger.info("job titles  creating....");
		
		job.ClickkAdmin();
		logger.info("clicked on admin");
		Thread.sleep(6000);
		
		job.ClickJob();
		logger.info("clicked on jobs");
		
		job.SelectJobTitLes();
		logger.info("select the job titles");
		
		job.ClickAdd();
		job.EnterJobTitle("Manual Test Engineer");
		logger.info("job title provided");
		
		job.EnterJobDescription("responsible for identifying defects");
		logger.info("job desc provided");
		
		job.ClickSave();
		logger.info("job titles created");
		
		
	}

}
