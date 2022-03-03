package com.myframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myframework.utility.HighlightScrol;

public class LoginPage {

	HighlightScrol hs;
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.hs=new HighlightScrol();
		this.driver=ldriver;
	}

//	@FindBy(xpath="//a[text()='Login']") WebElement loginOption;
	@FindBy(name = "user-name")
	WebElement uname;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(name = "login-button")
	WebElement loginButton;
//	@FindBy(xpath="//div[text()='Login']") WebElement loginButton;


	public void loginToSwagLabs(String unameApplication, String passwordApplication) throws InterruptedException {
//		loginOption.click();
		hs.highLighterMethod(driver, uname);
		uname.sendKeys(unameApplication);
		
		hs.highLighterMethod(driver, pass);
		pass.sendKeys(passwordApplication);
		
		hs.highLighterMethod(driver, loginButton);
		loginButton.click();
		Thread.sleep(3000);
	}

}
