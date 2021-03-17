package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	
	public static Properties p;
	public Configuration_Reader() throws Throwable
	{
		File f =new File("C:\\Users\\mohan\\eclipse-workspace\\Adactin_project\\src\\test\\java\\com\\adactin\\helper\\Configuration_Reader.java");
		
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	//load
	p.load(fis);
	
	
	
	
	}
	
	
	
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		
		return browser;
	}

	
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

		}

	
	public String getDb_username() {
		String username = p.getProperty("db_Username");
		return username;
		

	}
	
	public String getDb_password() {
	String password = p.getProperty("db_Password");
	return password;
	}
	

}
