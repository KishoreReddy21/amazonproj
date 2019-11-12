package com.amazon1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		
		File src=new File("./Configuration//config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getApplicationURL() {
		String baseURL=pro.getProperty("baseURL");
		return baseURL;
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getFireFoxPath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getChromePath() {
		String ChromePath=pro.getProperty("Chromepath");
				return ChromePath;
	}
	public String getIePath() {
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	

}
