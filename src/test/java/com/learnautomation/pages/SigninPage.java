package com.learnautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.learnautomation.utility.UserRegistration;

public class SigninPage {
	
	WebDriver driver;
	
	final int delay=3000;

	
	public SigninPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(id="email_create") WebElement email;
	
	@FindBy(id="SubmitCreate") WebElement createAccount;
	
	@FindBy(xpath= "//a[@class='login']") WebElement signin;
	
	@FindBy(id="customer_firstname") WebElement firstname;
	
	@FindBy(id="customer_lastname") WebElement lastname;
	
	@FindBy(name="passwd") WebElement password;
	
	@FindBy(id="firstname")  WebElement fname;
	
	@FindBy(name="lastname") WebElement lname;
	
	@FindBy(id="company") WebElement company;
	
	@FindBy(name="address1") WebElement address1;
	
	@FindBy(name="address2") WebElement address2;
	
	@FindBy(name="city") WebElement city;
	
	@FindBy(id="id_state") WebElement state;
	
	@FindBy(id="postcode")  WebElement postcode;
	
	@FindBy(id="id_country") WebElement country;
	
	@FindBy(name="other") WebElement addinfo;
	
	@FindBy(name="phone") WebElement phone;
	
	@FindBy(name="phone_mobile") WebElement phoneMobile;
	
	@FindBy(name="alias") WebElement alias;
	
	@FindBy(name="submitAccount") WebElement register;
	
	@FindBy(name="newsletter") WebElement newsletter;
	
	@FindBy(name="optin") WebElement specialoffer;
	
	//@FindBy(id="uniform-days") WebElement dateofbirthDD;
	
	//@FindBy(id="months")  WebElement dateofbirthMM;
	
	//@FindBy(id="years") WebElement dateofbirthYY;
	
	@FindBy(id="id_gender1") WebElement genderMr;
	
	@FindBy(id="id_gender2")  WebElement genderMrs; 	 	
	
	
	
	public void enterEmailAddress(UserRegistration userRegistration) throws InterruptedException
	{
		signin.click();
		Thread.sleep(3000);
		sendKeysWithDelay(email,userRegistration.getEmail(),delay);
		Thread.sleep(3000);
		createAccount.click();
		Thread.sleep(3000);
		
	}
	public void selectBdate()
	{
		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("23");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("3");
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("1990");
		}
	public void selectState()
	{
		Select statename=new Select(driver.findElement(By.id("id_state")));
		statename.selectByIndex(30);
	}
	
	public void enterAccountCredentialsDetails(UserRegistration userRegistration) throws InterruptedException
	{
		
		genderMr.click();
		sendKeysWithDelay(firstname,userRegistration.getFirstName(),delay);
		sendKeysWithDelay(lastname,userRegistration.getLastName(),delay);
		sendKeysWithDelay(password,userRegistration.getPassword(),delay);
		selectBdate();
		newsletter.click();
		specialoffer.click();
		sendKeysWithDelay(company,userRegistration.getCompany(),delay);
		sendKeysWithDelay(address1,userRegistration.getAddress1(),delay);
		sendKeysWithDelay(address2,userRegistration.getAddress2(),delay);
		sendKeysWithDelay(city,userRegistration.getCity(),delay);
		selectState();
		postcode.sendKeys("00000");
		//sendKeysWithDelay(postcode,userRegistration.getPostalcode(),delay);
		sendKeysWithDelay(country,userRegistration.getCountry(),delay);
		sendKeysWithDelay(addinfo,userRegistration.getAddinfo(),delay);
		sendKeysWithDelay(phone,userRegistration.getHomephone(),delay);
		sendKeysWithDelay(phoneMobile,userRegistration.getMobilephone(),delay);
		sendKeysWithDelay(alias,userRegistration.getAlias(),delay);
		register.click();
		Thread.sleep(3000);
		
	}

	private void sendKeysWithDelay(WebElement element,String value,int miliseconds) throws InterruptedException {
		element.sendKeys(value);
		Thread.sleep(miliseconds);
		
	}
	private void sendKeysWithDelay(WebElement element,Double value,int miliseconds) throws InterruptedException {
		element.sendKeys(value.toString());
		Thread.sleep(miliseconds);
		
	}
	
	public void getAllLinks()
	{
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement links: allLinks)
			System.out.println(links.getAttribute("href"));
		
	}

}
