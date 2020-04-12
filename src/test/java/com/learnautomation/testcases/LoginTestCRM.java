package com.learnautomation.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.ScreenCapture;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.SigninPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.ScreenShotCapture;
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
		
	}
	@Test
	public void VerifyInvalidEmailAddress() throws InterruptedException
	{
		 String expectedErrorMsg="Invalid email address.";
		
		 SigninPage signinPage=PageFactory.initElements(driver, SigninPage.class);
		 
		 String actualErrorMsg=signinPage.invalidEmailAddr(); 
 
		 Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
		
	}*/
	/*@Test
	public void VerifySignInWithAlreadyRegister() throws InterruptedException, IOException
	{
		 SigninPage signinPage=PageFactory.initElements(driver, SigninPage.class);
		 ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		 UserRegistration userRegistration=excelDataProvider.readUserRegistration();
		 ScreenShotCapture screenCapture=new ScreenShotCapture();
		 signinPage.registration(userRegistration);
		 screenCapture.captureScreenshot(driver,"screenshot1");
		 
	}*/
	@Test
	public void verifyUserName() throws InterruptedException
	{
		 SigninPage signinPage=PageFactory.initElements(driver, SigninPage.class);
		 ExcelDataProvider excelDataProvider=new ExcelDataProvider();
		 UserRegistration userRegistration=excelDataProvider.readUserRegistration();
		 signinPage.registration(userRegistration);
		 String expectedUserName=signinPage.userNameCheck(userRegistration);
		 String actualUserName=signinPage.userNameCheckWeb();
		 //System.out.println(expectedUserName);
		 //System.out.println(actualUserName);
		 
		 Assert.assertEquals(expectedUserName, actualUserName);
		 
	}
	
	
	
	

}
