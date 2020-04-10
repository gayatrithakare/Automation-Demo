package com.learnautomation.testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.SigninPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.UserRegistration;

import junit.framework.Assert;


public class LoginTestCRM extends BaseClass {
	
	/*@Test
	public void userRegistration() throws InterruptedException
	{
		
		
	    ExcelDataProvider excelDataProvider=new ExcelDataProvider();
	    
	    UserRegistration userRegistration=excelDataProvider.readUserRegistration();
	
	    
	    SigninPage signinPage=PageFactory.initElements(driver, SigninPage.class);
	    
	    signinPage.enterEmailAddress(userRegistration);
	    
	    signinPage.enterAccountCredentialsDetails(userRegistration);
	    
	  }*/
	/*@Test
	public void verifyTitle()
	{
		
		String expectedTitle="My Store";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);	
		
	}*/
	@Test
	public void verifyBrokenLinksOnHomePAge()
	{
		SigninPage signinPage=PageFactory.initElements(driver, SigninPage.class);
		
		signinPage.getAllLinks();
	}



}
