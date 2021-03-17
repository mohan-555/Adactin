package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Click {

	
	
public static WebDriver driver;
	
	//@FindBy(xpath="//input[@type='radio'][1]")
	
@FindBy(id="radiobutton_0")
	private WebElement radiobtn;

@FindBy(name="continue")
private WebElement continuebtn;

public Search_Click(WebDriver driver2) {
	
	this.driver = driver2;
	 
	PageFactory.initElements(driver, this );
}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getRadiobtn() {
	return radiobtn;
}

public WebElement getContinuebtn() {
	return continuebtn;
}
}
