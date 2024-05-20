package com.orangeHrm.testCases;

import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.LoginPage;
import com.orangeHrm.pageObjects.SearchEmployee;

public class TC_SearchEmployee_005 extends BaseClass
{
	@Test
	public void searchemployeetist() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("username entered");
		
		lp.SetPassword(password);
		logger.info("password entered");
		
		lp.clickSubmit();
		logger.info("successfully logined");
		Thread.sleep(3000);
		
		SearchEmployee searchemp = new SearchEmployee(driver);
		logger.info("searchinh employee list");
		
		searchemp.ClickPIM();
		logger.info("clicked on pim module");
		searchemp.ClickEmployeeList();
		logger.info("clicked on employeelist lnk");
		searchemp.EnterEmployeeName("sirisha Pulemalla");
		logger.info("employee name provided ");
		searchemp.ClickSearch();
		logger.info("successfully searched employee");
		
	}
}
