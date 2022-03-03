package com.myframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myframework.utility.HighlightScrol;

public class CheckOutPage {
	
	
	HighlightScrol hs;
	WebDriver driver;
	
	public CheckOutPage(WebDriver ldriver) {
		this.hs=new HighlightScrol();
		this.driver=ldriver;
	}
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	@FindBy(name = "lastName")
	WebElement lastName;
	@FindBy(name = "firstName")
	WebElement firstName;
	@FindBy(name="continue")
	WebElement continueButton;
	
	public void checkOut(String firstNameCheckout,String lastNameCheckout,double postalCodeCheckout) throws InterruptedException
	{
		hs.highLighterMethod(driver, firstName);
	     firstName.sendKeys(firstNameCheckout);
	     
	     hs.highLighterMethod(driver, lastName);
	     lastName.sendKeys(lastNameCheckout);
	     
	     hs.highLighterMethod(driver, postalCode);
	     int postalInt=(int) postalCodeCheckout;
	     String postal=Integer.toString(postalInt);
	     postalCode.sendKeys(postal);
	     
	     hs.highLighterMethod(driver, continueButton);
	     continueButton.click();
	     Thread.sleep(3000);
	}

}
