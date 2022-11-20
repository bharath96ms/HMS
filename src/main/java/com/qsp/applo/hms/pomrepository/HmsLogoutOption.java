package com.qsp.applo.hms.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmsLogoutOption {
	WebDriver driver;
public HmsLogoutOption(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	WebElement logotButton;
	
	public WebElement logoutButton() {
		return logotButton;
	}
}
