package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilities;

public class HomePage {
	
	WebDriver driver;
	
	By swagLabsHeading=By.xpath("//div[@class='app_logo']");
	By productsHeading=By.xpath("//span[@class='title']");

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String verifySwagLabsHeading() {
//		return driver.findElement(swagLabsHeading).getText();
		return Utilities.getTextValue(driver, swagLabsHeading);
	}
	public String verifyProductsHeading() {
//		return driver.findElement(productsHeading).getText();
		return Utilities.getTextValue(driver, productsHeading);
	}

}
