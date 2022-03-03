package com.myframework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myframework.utility.HighlightScrol;

public class CartPage {
	
	HighlightScrol hs;
	WebDriver driver;

	
	public CartPage(WebDriver ldriver) {
		this.hs=new HighlightScrol();
		this.driver=ldriver;
	}


	@FindBy(xpath = "(//div[text()='Sauce Labs Onesie']//following::button[text()='Add to cart'])[1]")
	WebElement addOnesie;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartButton;
	@FindBy(name = "checkout")
	WebElement checkout;

	public void cartSwagLabs() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		hs.highLighterMethod(driver, addOnesie);
		addOnesie.click();
		
		hs.highLighterMethod(driver, cartButton);
		cartButton.click();
		
        js.executeScript("arguments[0].scrollIntoView();", checkout);

		hs.highLighterMethod(driver, checkout);
		Thread.sleep(3000);
		checkout.click();
		Thread.sleep(3000);
	}

}
