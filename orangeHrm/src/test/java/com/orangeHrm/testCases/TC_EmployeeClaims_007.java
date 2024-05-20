package com.orangeHrm.testCases;

import org.testng.annotations.Test;

import com.orangeHrm.pageObjects.EmployeeClaims;
import com.orangeHrm.pageObjects.LoginPage;

public class TC_EmployeeClaims_007 extends BaseClass
{
	@Test
	public void employeeclaims() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("username entered");
		
		lp.SetPassword(password);
		logger.info("password entered");
		
		lp.clickSubmit();
		logger.info("successfully logined");
		Thread.sleep(3000);
		EmployeeClaims claims = new EmployeeClaims(driver);
		logger.info("creating Claims");
		
		claims.ClickOnClaim();
		logger.info("clicked on  Claims");
		
		claims.AssignClaim();
		logger.info("clicked on  assignClaims");
		
		String empname=randomestring();
		claims.EnterEmployeeNmae(empname);
		logger.info("entered employee name");
		
		claims.EventDropdown();
		logger.info("clicked on event dropdown");
		
		Thread.sleep(3000);
		
		claims.MedicalviaDropdown("Medical Reimbursement");
		logger.info("selected medical reembusment");
		
		claims.CurrencyDropdown();
		logger.info("clickked on currency dropdown");
		
		claims.IndianRupeeViaDropdown("Indian Rupee");
		logger.info("selected indian rupee");
		
		claims.ClickCreate();
		logger.info("successfully  Claims created");
	}
}
