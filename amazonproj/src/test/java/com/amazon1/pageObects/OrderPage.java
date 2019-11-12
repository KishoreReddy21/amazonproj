package com.amazon1.pageObects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	WebDriver ldriver;
	public OrderPage(WebDriver rdriver){
		 
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 

}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	public void EnterSearchBox(String stext) {
		SearchBox.sendKeys(stext);
	}
}
