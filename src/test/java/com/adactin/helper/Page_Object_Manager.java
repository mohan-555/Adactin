package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Bookhotel_pom;
import com.adactin.pom.Login_Pom;
import com.adactin.pom.Search_Click;
import com.adactin.pom.Search_pom;

public class Page_Object_Manager {
	
	
public static WebDriver driver;
	
	private Login_Pom login ;
	
	private Search_pom search;
	
	private Search_Click searchclick;
	
	private Bookhotel_pom bookhotel ;
	
	

	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public Login_Pom get_InstanceLogin() {
	login= new Login_Pom(driver);
	return login;

	}
	
	
	public Search_pom get_InstanceSearch() {

   search=new Search_pom(driver);
   return search;
	}
	
	
	public  Bookhotel_pom get_InstanceBookhotel_Pom() {
	bookhotel=new Bookhotel_pom(driver);
	return bookhotel;

	}
	
	public Search_Click get_InstanceSearchclick_Pom() {
		searchclick = new  Search_Click(driver);
		return searchclick;
		

	}
	

}
