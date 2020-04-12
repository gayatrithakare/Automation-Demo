package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShotCapture {
	
	
	public void captureScreenshot(WebDriver driver,String filename) throws IOException
	{
	
		 //1. take screenshot
	     File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
	     //2. copy the screenshot at desired location
	     
	     FileUtils.copyFile(screenshotFile, new File("C:\\Users\\gthakare\\git-checkout\\Automation-Demo\\Screenshots" +filename+".jpg"));	     

	}
	
	



}
