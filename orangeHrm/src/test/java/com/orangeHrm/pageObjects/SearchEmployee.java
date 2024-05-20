package com.orangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployee {
WebDriver ldriver;
	
	public SearchEmployee(WebDriver rdriver){
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
	
	
	public void ClickPIM()
	{
		lnkPIM.click();
	}
	
	public void ClickEmployeeList()
	{
		lnkEmploeelist.click();
	}
	
	public void EnterEmployeeName(String empname)
	{
		txtEmployeeName.sendKeys(empname);
	}
	
	public void ClickSearch()
	{
		btnSearch.click();
	}
	
	

}
