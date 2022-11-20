package com.qsp.apllo.hms.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qsp.applo.hms.genericutility.BaseClass;
import com.qsp.applo.hms.pomrepository.HmsLoginPage;

public class HmsLoginPageTestCase extends BaseClass{
	
	@Test
	public void tcLoginPage002() {
		HmsLoginPage hmsLogin=new HmsLoginPage(driver);
		String expectedLoginHeaderText = "Hospital Management System";
		String actualLoginHeaderText = hmsLogin.loginPageHeading().getText();
		if(actualLoginHeaderText.equals(expectedLoginHeaderText))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertFalse(false);
		
	}
}
