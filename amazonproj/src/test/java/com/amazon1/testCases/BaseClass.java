package com.amazon1.testCases;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.amazon1.utilities.ReadConfig;



public class BaseClass {
	ReadConfig config=new ReadConfig();
	public String baseURL=config.getApplicationURL();
	public String username=config.getUsername();
	public String password=config.getPassword();
	public WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger=logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",config.getFireFoxPath());
		driver=new FirefoxDriver();
		}
		else if(br.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();	
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",config.getIePath());
			driver=new InternetExplorerDriver();	
		}
		
		driver.get(baseURL);
	}
	
	/*
	 * @AfterClass public void teardown() { driver.quit();
	 * logger.info("Browser Closed"); }
	 */
	 
	public void captureScreen(String filename) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"/ScreenShots/"+filename+".png"));
				
		
	}
	
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}

}
