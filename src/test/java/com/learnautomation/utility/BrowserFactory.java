package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	
	public static WebDriver startApplication(String browserName,String appUrl,WebDriver driver)
	
	{
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new  ChromeDriver();
			
		}
		
		else if(browserName.equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver=new  ChromeDriver();
		}
		/*else if(browserName.equals("IE"))
		{
					
		}*/
		else
		{
			System.out.println("We did not support this browser");
		
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;	
		
	}
	public static void quitbrowser(WebDriver driver)
	{
		driver.quit();
	}

}
