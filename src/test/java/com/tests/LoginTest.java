package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	@Test(priority = 0)
	public void verifyLoginButtonTest()
	{
		Assert.assertEquals(login.verifyLoginButton(), true);
	}
	@Test(priority = 1)
	public void verifyAlertMessageTest()
	{

		login.clickLoginButton();
		Assert.assertEquals(login.verifyAlertMessage(), "Epic sadface: Username is required");
	}

}
