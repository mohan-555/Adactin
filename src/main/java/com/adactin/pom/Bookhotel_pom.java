package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel_pom {

	
public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address ;
	
	
	
	@FindBy(id="cc_num")
	private WebElement ccnumber;
	
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	
	@FindBy(id="book_now")
	private WebElement booknow;


	public Bookhotel_pom(WebDriver driver2) {
		this.driver = driver2;
		 
		PageFactory.initElements(driver, this );
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCcnumber() {
		return ccnumber;
	}


	public WebElement getCctype() {
		return cctype;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getCvv() {
		return cvv;
	}


	public WebElement getBooknow() {
		return booknow;
	}


	public WebElement getSearchotelbtn() {
		// TODO Auto-generated method stub
		return null;
	}
	
}