package com.amazon1.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amazon1.pageObects.AccountandLists;
import com.amazon1.utilities.Xls_Reader;

public class TC1_RegistrationSuccess extends BaseClass {
	
	
	@Test(priority=1)
	public void registerTest() throws IOException, InterruptedException {
		
		AccountandLists al=new AccountandLists(driver);
		al.signInMH();
		al.ClicksignIN();
		al.ClickcreateAmznacc();
	    Xls_Reader reader=new Xls_Reader(System.getProperty("user.dir") + "/src/test/java/com/amazon1/testData/Data.xlsx");
	    System.out.println(reader);
	    
		
		  String name=reader.getCellData("Register", "yourname", 2); String
		  emailadd=reader.getCellData("Register", "email", 2); String
		  password=reader.getCellData("Register", "password", 2); String
		  pwdcheck=reader.getCellData("Register", "reenterpassword",2);
		  al.setYourName(name);
		  al.setYourEmail(emailadd); 
		  al.setYourPwd(password);
		  al.setYourPwdChck(pwdcheck); 
		  al.ClickonCreateButton();
		  
		  Thread.sleep(15000);
		  al.ClickOtpButton();
		  captureScreen("Registration Success");
		 
}
}
