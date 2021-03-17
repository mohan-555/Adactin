package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	
	
	
public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement  sign;
	
	public Login_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	

	public WebElement getUsername() {
		return username;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}



}
