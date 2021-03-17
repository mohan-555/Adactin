package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_pom {

public static WebDriver driver;
	
	@FindBy(name="location")
	private WebElement locate;
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	
	@FindBy(name="room_type")
	private WebElement room;
	
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	
	@FindBy(id="datepick_in")
	private WebElement datetime;
	
	@FindBy(name="datepick_out")
	private WebElement dateout;
	
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(name="child_room")
	private WebElement child;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;

	public Search_pom(WebDriver driver2) {
		this.driver = driver2;
		 
		PageFactory.initElements(driver, this );
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocate() {
		return locate;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatetime() {
		return datetime;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	


	
}
