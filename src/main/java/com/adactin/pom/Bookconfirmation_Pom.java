package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bookconfirmation_Pom {
	
	
public static WebDriver driver;
	
	@FindBy(id="search_hotel")
	private WebElement searchhotel;

	
	public WebElement getSearchhotel() {
		return searchhotel;
	}

}
