package com.qsp.applo.hms.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.applo.hms.pomrepository.HmsLoginPage;
import com.qsp.applo.hms.pomrepository.HmsLogoutOption;

@Listeners(TestListners.class)
public class BaseClass {
	public WebDriver driver;
	public FileUtility fileUtil=new FileUtility();
	public WebDriverUtility explicityWaitUtility=new WebDriverUtility();
	
	//trigger the main url of the application
	@BeforeClass
	public void configBeforeClass() throws IOException {
		String browser = fileUtil.readDataFromPropertyFile("browsername");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtil.readDataFromPropertyFile("url"));
		explicityWaitUtility.implicitWait(driver);
	}
	//Login to Hms
	@BeforeMethod
	public void loggingIntoHms() throws IOException, InterruptedException {
		HmsLoginPage loginpage = new HmsLoginPage(driver);
		loginpage.emailTextField().sendKeys(fileUtil.readDataFromPropertyFile("username"));
		loginpage.loginPagepassword().sendKeys(fileUtil.readDataFromPropertyFile("password"));
		loginpage.continueButton().submit();
	}
	//logout from the Hms 
	@AfterMethod
	public void loggingOutOfHms() {
		HmsLogoutOption logotBtn=new HmsLogoutOption(driver);
		explicityWaitUtility.explicitWait(driver, logotBtn.logoutButton());
		logotBtn.logoutButton().click();
		
	}
	
	//post condition
	@AfterClass
	public void configAfterClass() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
