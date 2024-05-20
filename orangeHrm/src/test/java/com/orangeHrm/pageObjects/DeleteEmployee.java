package com.orangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmployee {
WebDriver ldriver;
	
	public DeleteEmployee(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(how = How.XPATH, using="//aside[@class='oxd-sidepanel']//li[2]")
	@CacheLookup
	WebElement lnkPIM;
	
	@FindBy(how = How.XPATH, using="(//li[@class='oxd-topbar-body-nav-tab --visited'])[1]")
	@CacheLookup
	WebElement lnkEmploeelist;
	
	@FindBy(how = How.XPATH, using="(//input[@placeholder='Type for hints...'])[1]")
	@CacheLookup
	WebElement txtEmployeeName;
	
	@FindBy(how = How.XPATH, using="//button[normalize-space()='Search']")
	@CacheLookup
	WebElement btnSearch;
	
	@FindBy(how = How.XPATH, using="//i[@class='oxd-icon bi-trash']")
	@CacheLookup
	WebElement icontrash;
	

	public void ClickOnPIM()
	{
		lnkPIM.click();
	}
	
	public void ClickOnEmployeeList()
	{
		lnkEmploeelist.click();
	}
	
	public void EnterEmployeeNameIn(String empname)
	{
		txtEmployeeName.sendKeys(empname);
	}
	
	public void ClickOnSearch()
	{
		btnSearch.click();
	}
	
	public void MoveToTrash()
	{
		icontrash.click();
	}
	
}
