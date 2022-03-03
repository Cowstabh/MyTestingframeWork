package com.myframework.utility;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	WebDriver driver;
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl) {
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver =new ChromeDriver();
		}
		else if (browserName.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/Mozilla Firefox _6Ott.exe" );
			driver =new ChromeDriver();
		}
		else {
			System.out.println("The browser is not supported!");
		} 
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}
}
