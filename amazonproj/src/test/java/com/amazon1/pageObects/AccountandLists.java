package com.amazon1.pageObects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountandLists {
	WebDriver ldriver;
	public AccountandLists(WebDriver rdriver){
		 
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	}
	
	/*
	 * @FindBy(id="nav-signin-tooltip") WebElement signInTool;
	 */
	
	@FindBy(id="nav-link-accountList")
	WebElement signInTool;
	
	
	public void ClicksignIN() throws InterruptedException {
		
		//Thread.sleep(3000);
		String url=ldriver.getCurrentUrl();
		 System.out.println("=="+url);
		 if(url.equals("https://www.amazon.com/")){
		// Thread.sleep(2000);
		 signInTool.click();
		}
		 Thread.sleep(5000);
		 String url1=ldriver.getCurrentUrl();
		 System.out.println("==**=="+url1);
		 if(url1.equals("https://www.amazon.com/")){
				// Thread.sleep(2000);
		signInTool.click();
		Thread.sleep(2000);
		 }
	}
	 public void signInMH() throws InterruptedException {
		 
		 Actions actions = new Actions(ldriver);
		actions.moveToElement(signInTool);
		 Thread.sleep(4000);
		
	 }
	
	
	@FindBy(id="createAccountSubmit")
	WebElement CreateAmznacc;
	
	public void ClickcreateAmznacc() {
		CreateAmznacc.click();
	}
	
	@FindBy(id="ap_customer_name")
	WebElement yourname;
	
	public void setYourName(String yname) {
		yourname.sendKeys(yname);
	}
	
	@FindBy(id="ap_email")
	WebElement email;
	
	public void setYourEmail(String yemail) {
		email.clear();
		email.sendKeys(yemail);
		
	}
	
	@FindBy(id="ap_password")	
	WebElement pwd;
	
	public void setYourPwd(String ypwd) {
		pwd.clear();
		pwd.sendKeys(ypwd);
	}
	
	@FindBy(id="ap_password_check")
	WebElement pwdcheck;
	
	public void setYourPwdChck(String ypwdchk) {
		pwdcheck.sendKeys(ypwdchk);
		
	}
	
	@FindBy(id="continue")
	WebElement createYourAmznButton;
	
	public void ClickonCreateButton() {
		createYourAmznButton.click();
		
	}
	
	 @FindBy(className="a-button-input")
	 WebElement OtpSubmit;
	 
	 public void ClickOtpButton() {
		 OtpSubmit.click();
	 }
	 
	 //Sign-IN Objects are below
	 
	 @FindBy(id="signInSubmit")
	 WebElement signINBtn;
	 public void ClicksignINSubmit() {
		 signINBtn.click();
	 }
	 
	 @FindBy(className ="a-button-input")
	 WebElement OtpLoginBtn;
	 
	 public void ClickOtpLogin()
	 {
		 OtpLoginBtn.click();
	 }
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

   
   
   

