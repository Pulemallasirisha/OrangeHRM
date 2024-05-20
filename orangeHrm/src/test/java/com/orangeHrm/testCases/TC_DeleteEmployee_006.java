package com.orangeHrm.testCases;

import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.DeleteEmployee;
import com.orangeHrm.pageObjects.LoginPage;


public class TC_DeleteEmployee_006 extends BaseClass
{
	@Test
	public void deleteemployee() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("username entered");
		
		lp.SetPassword(password);
		logger.info("password entered");
		
		lp.clickSubmit();
		logger.info("successfully logined");
		Thread.sleep(3000);
		
		DeleteEmployee delemp = new DeleteEmployee(driver);
		logger.info("Deleting employee ");
		
		delemp.ClickOnPIM();
		logger.info("clicked on pim module");
		
		delemp.ClickOnEmployeeList();
		logger.info("clicked on employeelist lnk");
		
		delemp.EnterEmployeeNameIn("Charles  Carter ");
		logger.info("employee name provided ");
		
		delemp.ClickOnSearch();
		logger.info("successfully searched employee");
		
		delemp.MoveToTrash();
		logger.info("emp deleted");
		
	}

}
