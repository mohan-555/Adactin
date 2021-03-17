package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.Page_Object_Manager;
import com.adactin.pom.Base_Class;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	
	public static WebDriver driver=Runner.driver;

	/*
	 * Login_Pom login = new Login_Pom(driver); Search_Pom search = new
	 * Search_Pom(driver); Searchclick_Pom searchclick = new
	 * Searchclick_Pom(driver); Bookhotel_Pom bookhotel = new Bookhotel_Pom(driver);
	 * Logout_Pom logout = new Logout_Pom(driver);
	 */
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
		
//		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
//		getUrl(url);

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		inputValueElement(pom.get_InstanceLogin().getUsername(), "Afrajainul");
		Thread.sleep(1000);
	}

	@When("^user Enter The PasswordIn Pasaword Field$")
	public void user_Enter_The_PasswordIn_Pasaword_Field() throws Throwable {
		inputValueElement(pom.get_InstanceLogin().getPassword(), "123456");
		Thread.sleep(1000);
	}

	@Then("^user Click On The Login Button And Is Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Is_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_InstanceLogin().getSign());
		Thread.sleep(1000);
	}

	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
		selectTheElement(pom.get_InstanceSearch().getLocate(), "value", "Sydney");
		Thread.sleep(1000);

	}

	@When("^user Select The Hotels In The Hotel Field$")
	public void user_Select_The_Hotels_In_The_Hotel_Field() throws Throwable {
		selectTheElement(pom.get_InstanceSearch().getHotel(), "value", "Hotel Sunshine");
		Thread.sleep(1000);

	}

	@When("^user Select The RoomType In The RoomType Field$")
	public void user_Select_The_RoomType_In_The_RoomType_Field() throws Throwable {
		selectTheElement(pom.get_InstanceSearch().getRoom(), "value", "Standard");

		Thread.sleep(1000);
	}

	@When("^user Enter The CheckInDate In The CheckInDate Field$")
	public void user_Enter_The_CheckInDate_In_The_CheckInDate_Field() throws Throwable {
		inputValueElement(pom.get_InstanceSearch().getDatetime(), "13/03/2021");
		Thread.sleep(1000);
	}

	@When("^user Enter The CheckOutDate In The CheckOutDate Field$")
	public void user_Enter_The_CheckOutDate_In_The_CheckOutDate_Field() throws Throwable {
		inputValueElement(pom.get_InstanceSearch().getDateout(), "14/03/2021");
		Thread.sleep(1000);
	}

	@When("^user Select The AdultsPerRoom In The AdultsPerRoom Field$")
	public void user_Select_The_AdultsPerRoom_In_The_AdultsPerRoom_Field() throws Throwable {
		selectTheElement(pom.get_InstanceSearch().getAdult(), "value", "1");
	}

	@When("^user Select The ChildernPerRoom In The ChildernPerRoom Field$")
	public void user_Select_The_ChildernPerRoom_In_The_ChildernPerRoom_Field() throws Throwable {
		selectTheElement(pom.get_InstanceSearch().getChild(), "value", "1");
	}

	@Then("^user Click On The Search Button And Is Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_Is_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_InstanceSearch().getSearch());
	}

	@When("^user Click The RadioBtn In The RadioBtn Field$")
	public void user_Click_The_RadioBtn_In_The_RadioBtn_Field() throws Throwable {
		clickOnElement(pom.get_InstanceSearchclick_Pom().getRadiobtn());
		Thread.sleep(1000);
	}

	@Then("^user Click On The Continue Button And Is Navigate To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_Is_Navigate_To_The_Book_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_InstanceSearchclick_Pom().getContinuebtn());
	}

	@When("^user Enter The Firstname In The Firstname Field$")
	public void user_Enter_The_Firstname_In_The_Firstname_Field() throws Throwable {
		inputValueElement(pom.get_InstanceBookhotel_Pom().getFirstname(), "afra");
	}

	@When("^user Enter The Lastname In The Lastname Field$")
	public void user_Enter_The_Lastname_In_The_Lastname_Field() throws Throwable {
		inputValueElement(pom.get_InstanceBookhotel_Pom().getLastname(), "nourin");
	}

	@When("^user Enter The BillingAddress In The BillingAddress Field$")
	public void user_Enter_The_BillingAddress_In_The_BillingAddress_Field() throws Throwable {
		inputValueElement(pom.get_InstanceBookhotel_Pom().getAddress(), "chennai");

	}

	@When("^user Enter The Creditcadrno In The Creditcardno Field$")
	public void user_Enter_The_Creditcadrno_In_The_Creditcardno_Field() throws Throwable {
		inputValueElement(pom.get_InstanceBookhotel_Pom().getCcnumber(), "1234567890123456");

	}

	@When("^user Select The Creditcardtype In The Creditcardtype Field$")
	public void user_Select_The_Creditcardtype_In_The_Creditcardtype_Field() throws Throwable {
		selectTheElement(pom.get_InstanceBookhotel_Pom().getCctype(), "value", "VISA");

	}

	@When("^user Select The Month In The MonthType Field$")
	public void user_Select_The_Month_In_The_MonthType_Field() throws Throwable {

		selectTheElement(pom.get_InstanceBookhotel_Pom().getMonth(), "value", "2");
		

	}

	@When("^user Select The Year In The Year Field$")
	public void user_Select_The_Year_In_The_Year_Field() throws Throwable {
		selectTheElement(pom.get_InstanceBookhotel_Pom().getYear(), "value", "2022");
	}

	@When("^user Enter The CCV In The CCV Field$")
	public void user_Enter_The_CCV_In_The_CCV_Field() throws Throwable {
		inputValueElement(pom.get_InstanceBookhotel_Pom().getCvv(), "1234");

	}

	@Then("^user Click On The BookNow Button And Is Navigate To The Booking Confirmation Page$")
	public void user_Click_On_The_BookNow_Button_And_Is_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.get_InstanceBookhotel_Pom().getBooknow());
		Thread.sleep(1000);
	}

	
	
//	  @Then("^user Click On The SearchHotel Button$") public void
//	  user_Click_On_The_SearchHotel_Button() throws Throwable {
//	  clickOnElement(bookhotel.getSearchotelbtn());
//	  
//	  }
	 
	  
//	  @Then("^user Click On The LogoutButton$") 
//	  public void user_Click_On_The_LogoutButton() throws Throwable {
//		  clickOnElement(logout.getLogout());
//		  Thread.sleep(1000);
//	  
	  
	  
	

}
