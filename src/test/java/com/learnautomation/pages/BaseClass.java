package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.learnautomation.utility.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		driver=BrowserFactory.startApplication("Chrome", "http://automationpractice.com/index.php", driver);
	}

    @AfterMethod 
	public void tearDown()
	{
		BrowserFactory.quitbrowser(driver);
	}

}
