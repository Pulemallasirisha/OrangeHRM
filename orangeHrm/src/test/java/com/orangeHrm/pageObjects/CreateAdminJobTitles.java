package com.orangeHrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAdminJobTitles {
WebDriver ldriver;
	
	public CreateAdminJobTitles(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//aside[@class='oxd-sidepanel']//li[1]")
	@CacheLookup
	WebElement lnkAdmin;
	
	
	@FindBy(xpath="//span[normalize-space()='Job']")
	@CacheLookup
	WebElement lnkJob;
	
	@FindBy(className="oxd-topbar-body-nav-tab-link")
	@CacheLookup
	WebElement lnkjobtitles;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	@CacheLookup
	WebElement lnkadd;
	
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	@CacheLookup
	WebElement txtjobtitle;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	@CacheLookup
	WebElement txtjobdesc;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement btnsave;
	
	
	
	public void ClickkAdmin()
	{
		lnkAdmin.click();
	}
	
	public void ClickJob()
	{
		lnkJob.click();
	}
	
	public void SelectJobTitLes()
	{
		lnkjobtitles.click();
	}
	
	public void ClickAdd()
	{
		lnkadd.click();
	}
	
	public void EnterJobTitle(String jobtitle)
	{
		txtjobtitle.sendKeys(jobtitle);
	}
	
	
	public void EnterJobDescription(String jobdes)
	{
		txtjobdesc.sendKeys(jobdes);
	}
	
	public void ClickSave()
	{
		btnsave.click();
	}

}
