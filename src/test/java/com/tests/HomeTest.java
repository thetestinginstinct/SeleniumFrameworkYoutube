package com.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

	@Test(priority = 0)
	public void swagLabsHeadingTest() throws IOException, ParseException
	{
		login.enterUsername();
		login.enterPassword();
		login.clickLoginButton();
		Assert.assertEquals(home.verifySwagLabsHeading(), "Swag Labs");
	}
	@Test(priority = 1)
	public void productsHeadingTest() throws IOException, ParseException
	{
		login.enterUsername();
		login.enterPassword();
		login.clickLoginButton();
		Assert.assertEquals(home.verifyProductsHeading(), "Products");
	}
}
