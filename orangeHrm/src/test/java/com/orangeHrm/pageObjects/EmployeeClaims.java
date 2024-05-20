package com.orangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeClaims {
WebDriver ldriver;
	
	public EmployeeClaims(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(how = How.XPATH, using="(//li[@class='oxd-main-menu-item-wrapper'])[11]")
	@CacheLookup
	WebElement lnkClaim;
	
	
	@FindBy(how = How.XPATH, using="//header[@class='oxd-topbar']//li[5]")
	@CacheLookup
	WebElement lnkAssignClaim;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Type for hints...']")
	@CacheLookup
	WebElement txtempname;
	
	@FindBy(how = How.XPATH, using="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	@CacheLookup
	WebElement eventdropdown;
	
	@FindBy(how = How.XPATH, using="//div[@class='oxd-form-row']//div[3]")
	@CacheLookup
	WebElement medicalfromDropdown;
	
	@FindBy(how = How.XPATH, using="//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text--after']")
	@CacheLookup
	WebElement currencyDropdown;
	
	@FindBy(how = How.XPATH, using="//span[normalize-space()='Indian Rupee']")
	@CacheLookup
	WebElement indianrupeeviaDropdown;
	
	
	@FindBy(how = How.XPATH, using="(//button[normalize-space()='Create'])[1]")
	@CacheLookup
	WebElement btncreate;
	
	
	public void ClickOnClaim()
	{
		lnkClaim.click();
	}
	
	public void AssignClaim()
	{
		lnkAssignClaim.click();
	}
	
	public void EnterEmployeeNmae(String ename)
	{
		txtempname.sendKeys(ename);
	}
	
	public void EventDropdown()
	{
		eventdropdown.click();
	}
	
	public void MedicalviaDropdown(String medical)
	{
		Select drop = new Select(medicalfromDropdown);
		drop.selectByVisibleText(medical);
	}
	 public void CurrencyDropdown() 
	 {
		 currencyDropdown.click();
	 }
	 
	 public void IndianRupeeViaDropdown(String rupee)
	 {
		 Select drop1 = new Select(indianrupeeviaDropdown);
		 drop1.selectByVisibleText(rupee);
	 }
	 
	 public void ClickCreate()
	 {
		 btncreate.click();
	 }

}
