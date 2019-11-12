package com.amazon1.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.annotations.Test;

import com.amazon1.pageObects.AccountandLists;
import com.amazon1.pageObects.OrderPage;
import com.amazon1.utilities.Xls_Reader;

public class TC3_SignIn extends BaseClass {
  
	@Test(priority=3)
	public void signIN() throws InterruptedException, IOException {
		
		  AccountandLists al=new AccountandLists(driver);
		  OrderPage op=new OrderPage(driver);
		//al.signInMH();
		  al.ClicksignIN();
		  Xls_Reader reader=new Xls_Reader(System.getProperty("user.dir") + "/src/test/java/com/amazon1/testData/Data.xlsx");
	      System.out.println(reader);
		  String emailadd=reader.getCellData("SignIn", "Email", 2); 
		  String password=reader.getCellData("SignIn", "Password", 2);
		  String product=reader.getCellData("SearchData", "Item", 2);
		  al.setYourEmail(emailadd);
		  al.ClickonCreateButton();
		  al.setYourPwd(password);
		  al.ClicksignINSubmit();
		  
		 if(isElementPresent(By.id("continue")))
		 {
			 al.ClickonCreateButton();
			 Thread.sleep(15000);
			 al.ClickOtpLogin();
			 captureScreen("SignIN Success");
		 }
		 else
		 {
		 captureScreen("SignIN Success");
		 op.EnterSearchBox(stext);
		 
		 
		
		
	}
	
	
}}
