package com.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.utilities.Utilities;


public class LoginPage {
	WebDriver driver;

	By loginButton = By.id("login-button");
	By alertMessage = By.xpath("//h3[@data-test='error']");
	By username=By.id("user-name");
	By password=By.id("password");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public boolean verifyLoginButton() {
//		return driver.findElement(loginButton).isDisplayed();
		return Utilities.isElementDisplayed(driver, loginButton);
	
	}
	public void clickLoginButton() {
//		driver.findElement(loginButton).click();
		Utilities.clickElement(driver, loginButton);
	}

	public String verifyAlertMessage() {
//		return driver.findElement(alertMessage).getText();
		return Utilities.getTextValue(driver, alertMessage);
	}
	public void enterUsername() throws IOException, ParseException {
//		driver.findElement(username).sendKeys(usrname);
		Utilities.enterText(driver, username, Utilities.readJsonFile("username", "./src/main/resources/login.json"));

	}
	public void enterPassword() throws IOException, ParseException {
//		driver.findElement(password).sendKeys(pwd);
		Utilities.enterText(driver, password, Utilities.readJsonFile("password", "./src/main/resources/login.json"));
	}

}
