package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.configuration.Base;
import com.pages.HomePage;
import com.pages.LoginPage;

public class BaseTest extends Base{
//	WebDriver driver;
	LoginPage login;
	HomePage home;

	@BeforeMethod
	public void setUp() throws IOException {
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
		initialisation();
		login = new LoginPage(driver);
		home = new HomePage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
