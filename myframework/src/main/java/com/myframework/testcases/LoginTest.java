package com.myframework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.myframework.utility.BrowserFactory;

public class LoginTest {


	WebDriver driver;

	@Test
	public void loginApp()
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://freecrm.com/");
		System.out.println(driver.getTitle());
	}

}
