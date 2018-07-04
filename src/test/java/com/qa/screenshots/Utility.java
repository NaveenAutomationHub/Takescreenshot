package com.qa.screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	
	public static void initialization(){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.techonthenet.com/");
		
		
	}
	
	public static WebDriver driver;
	
	public static void failed(WebDriver driver ,String testMethodName){
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			
			FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//ScreenShots"+testMethodName+"_"+".jpg"));
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}

}
