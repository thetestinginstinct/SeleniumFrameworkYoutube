package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilities {

	public static boolean isElementDisplayed(WebDriver driver, By byLocator) {

		return driver.findElement(byLocator).isDisplayed();
	}

	public static void clickElement(WebDriver driver, By byLocator) {

		driver.findElement(byLocator).click();
	}

	public static String getTextValue(WebDriver driver, By byLocator) {

		return driver.findElement(byLocator).getText();
	}

	public static void enterText(WebDriver driver, By byLocator, String value) {
		driver.findElement(byLocator).clear();
		driver.findElement(byLocator).sendKeys(value);
	}

	public static String getPropertilesFileValue(String propertyName) throws IOException {

		String propertyValue;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		prop.load(fis);
		propertyValue = prop.getProperty(propertyName);
		return propertyValue;

	}

	public static String readJsonFile(String nodeValue, String filePath)
			throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(filePath));
		JSONObject jsonObject = (JSONObject) obj;
		String value = (String) jsonObject.get(nodeValue);
		return value;

	}

}
