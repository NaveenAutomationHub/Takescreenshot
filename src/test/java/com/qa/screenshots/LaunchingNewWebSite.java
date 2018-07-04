package com.qa.screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LaunchingNewWebSite extends Utility{
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod(){
	    driver = new FirefoxDriver();
		
	}
	
	@Test
	public void newPageLaunch(){
		driver.get("https://www.techonthenet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div[1]/div[2]/div[1]/div[1]/a")).click();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			Utility.failed(driver, result.getName());
			
		}
		
		
	}
	
	
	
}
