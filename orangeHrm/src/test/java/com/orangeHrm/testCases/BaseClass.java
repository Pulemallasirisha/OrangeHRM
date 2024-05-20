package com.orangeHrm.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.orangeHrm.utilities.ReadConfig1;

import freemarker.log.Logger;

public class BaseClass {

	ReadConfig1 readconfig1 = new ReadConfig1();
	public String baseurl = readconfig1.getApplicationURL();
	public String username = readconfig1.getUsername();
	public String password =readconfig1.getPassword() ;
	public static  WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void Setup(String br)
	{
		
		logger = Logger.getLogger("HrmApplication");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
		System.setProperty("Webdriver.chrome.driver",readconfig1.getChromepath());
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver",readconfig1.getFirefoxpath());
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("edge"))
		{
			System.setProperty("Webdriver.edge.driver",readconfig1.getEdgepath());
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
	}
	
	@AfterClass
	public void Teardown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public  String randomestring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
}
