package com.myframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.myframework.pages.BaseClass;
import com.myframework.pages.CartPage;
import com.myframework.pages.CheckOutPage;
import com.myframework.pages.FinishPage;
import com.myframework.pages.LoginPage;
import com.myframework.utility.Reports;

public class LoginTestSWAG extends BaseClass 
{
	
  @Test
  public void loginApp() throws InterruptedException
  {
	  LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
	  CartPage cartPage=PageFactory.initElements(driver,CartPage.class);
	  CheckOutPage checkoutPage=PageFactory.initElements(driver,CheckOutPage.class);
	  FinishPage finishPage=PageFactory.initElements(driver,FinishPage.class);
	  Reports report=new Reports();
	  
	  
	  loginPage.loginToSwagLabs(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
	  cartPage.cartSwagLabs();
	  checkoutPage.checkOut(excel.getStringData("login", 0, 2), excel.getStringData("login", 0, 3), excel.getNumericData("login", 0, 4));
	  finishPage.finish();
	  report.reports();
  }
}
