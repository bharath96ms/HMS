package com.qsp.applo.hms.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmsHomePage {
	WebDriver driver;
public HmsHomePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//h2[text()='Hospital Management System']")
WebElement pageHeading;

public WebElement pageHeading() {
	return pageHeading;
}

}
