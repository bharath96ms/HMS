package com.qsp.applo.hms.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmsLoginPage {
	WebDriver driver;
public HmsLoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
WebElement loginPageEmail;

@FindBy(id="password")
WebElement loginPagepassword;

@FindBy(xpath ="//button[contains(.,'Login')]")
WebElement loginButton;

@FindBy(tagName = "h2")
WebElement loginPageHeading;

public WebElement emailTextField() {
	return  loginPageEmail;
}
public WebElement loginPagepassword() {
	return  loginPagepassword;
}
public WebElement continueButton() {
	return loginButton;
}
public WebElement loginPageHeading() {
	return loginPageHeading;
	
}
}
