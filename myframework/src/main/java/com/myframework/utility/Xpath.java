package com.myframework.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {

	static WebDriver driver;

	public Xpath(WebDriver ldriver) {
		Xpath.driver = ldriver;
	}

	public static WebElement findXpath(String xPath) {

		return driver.findElement(By.xpath(xPath));

	}

}
