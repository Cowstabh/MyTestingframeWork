package com.myframework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myframework.utility.HighlightScrol;

public class FinishPage {
	
	HighlightScrol hs;
	WebDriver driver;

	
	public FinishPage(WebDriver ldriver) {
		this.hs=new HighlightScrol();
		this.driver=ldriver;
	}
	
	
	@FindBy(xpath="//button[text()='Finish']")
	WebElement finishButton;
	
	
	public void finish() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", finishButton);

		hs.highLighterMethod(driver, finishButton);
		
		finishButton.click();
		Thread.sleep(5000);
	}
	

}
