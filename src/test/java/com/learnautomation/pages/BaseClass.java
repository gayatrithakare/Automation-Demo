package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utility.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication("Chrome", "http://automationpractice.com/index.php", driver);
	}

    @AfterClass
	public void tearDown()
	{
		BrowserFactory.quitbrowser(driver);
	}

}
