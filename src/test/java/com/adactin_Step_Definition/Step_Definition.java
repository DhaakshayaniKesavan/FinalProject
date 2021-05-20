package com.adactin_Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactin_runner.Test_Runner;
import com.Final_Project.driver.Base_Class;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.pomClass.BookingHotel;
import com.pomClass.Login;
import com.pomClass.Logout;
import com.pomClass.Search_Hotel;
import com.pomClass.Select_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition  extends Base_Class{
	public static WebDriver driver =Test_Runner.driver;
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		openUrl(url);
	    
	}
	@When("^user enter the \"([^\"]*)\"  in username Field$")
	public void user_enter_the_in_username_Field(String username) throws Throwable {
	   inputValues(pom.getInstanceLoginpg().getusername(), username);
	}

	@When("^user Enter the \"([^\"]*)\" In password field$")
	public void user_Enter_the_In_password_field(String password) throws Throwable {
	   inputValues(pom.getInstanceLoginpg().getPassword(), password);
	}

	@Then("^user Click on the login Button and it navigate to search Hotel Page$")
	public void user_Click_on_the_login_Button_and_it_navigate_to_search_Hotel_Page() throws Throwable {
	   clickOnElement(pom.getInstanceLoginpg().getLoginButton());
		Thread.sleep(1000);
	}
//***************************************************************************************************
	
	@When("^user Select the Location$")
	public void user_Select_the_Location() throws Throwable {
	 select(pom.getInstanceSh().getLocation(), "London");
	   Thread.sleep(1000);
	}

@Then("^User Select the Hotel$")
public void user_Select_the_Hotel() throws Throwable {
select(pom.getInstanceSh().getHotels(),"Hotel Creek");
Thread.sleep(1000);
}
	

@Then("^user Select the type of room$")
public void user_Select_the_type_of_room() throws Throwable {
  select(pom.getInstanceSh().getRoomType(),"Deluxe");
	    Thread.sleep(1000);
	}

@Then("^user select the number of rooms$")
public void user_select_the_number_of_rooms() throws Throwable {
   select(pom.getInstanceSh().getNumberOfRooms(), "3 - Three");
	  Thread.sleep(1000); 
	}

@Then("^user enter the check In Date$")
public void user_enter_the_check_In_Date() throws Throwable {
   inputValues(pom.getInstanceSh().getCheckInDate(), "10/05/2021");
   Thread.sleep(1000);
}
   @Then("^user enter the check out Date$")
   public void user_enter_the_check_out_Date() throws Throwable {
	   inputValues(pom.getInstanceSh().getCheckOutDate(), "13/05/2021");
	   Thread.sleep(1000);
       }

	@Then("^user select the Adults per room$")
	public void user_select_the_Adults_per_room() throws Throwable {
		 select(pom.getInstanceSh().getAdultsPerRoom(), "2 - Two");
		  Thread.sleep(1000);  
	}

	@Then("^user select the childrens per room$")
	public void user_select_the_childrens_per_room() throws Throwable {
		select(pom.getInstanceSh().getChildPerRoom(), "2 - Two");
		  Thread.sleep(1000);  
	    
	}

	@Then("^user Click on the Search Button and it navigate to Select Hotel Page$")
	public void user_Click_on_the_Search_Button_and_it_navigate_to_Select_Hotel_Page() throws Throwable {
	   clickOnElement(pom.getInstanceSh().getSubmit()); 
	   Thread.sleep(1000);
	}

	public static Select_Hotel sh1=new Select_Hotel(driver);
	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
	    clickOnElement(pom.getInstanceSh1().getSelectHotel());
	    Thread.sleep(1000);
	    
	}

	@Then("^user click on continue button and it navigate to book a hotel page$")
	public void user_click_on_continue_button_and_it_navigate_to_book_a_hotel_page() throws Throwable {
		clickOnElement(pom.getInstanceSh1().getContinue());
		Thread.sleep(1000);
	}
	public static BookingHotel Bh=new BookingHotel(driver);
	@When("^user enter the first Name in First Name Field$")
	public void user_enter_the_first_Name_in_First_Name_Field() throws Throwable {
	    inputValues(pom.getInstanceBh().getFirstName(), "dhaakshayani");
	    Thread.sleep(1000);
	}

	@Then("^user enter the Last Name in Last Name Field$")
	public void user_enter_the_Last_Name_in_Last_Name_Field() throws Throwable {
	  inputValues(pom.getInstanceBh().getLastName(), "kesavan");  
Thread.sleep(1000);
	}

	@Then("^user enter  the Billing Address in Billing Address Field$")
	public void user_enter_the_Billing_Address_in_Billing_Address_Field() throws Throwable {
	 inputValues(pom.getInstanceBh().getBillingAddress(),"chennai thirumullaivoyal");  
	 Thread.sleep(1000);
	 
	}

	@Then("^user enter the Credit Card No in the Credit Card No Field$")
	public void user_enter_the_Credit_Card_No_in_the_Credit_Card_No_Field() throws Throwable {
		String creditcardno = File_Reader_Manager.getInstance().getInstanceCR().getCreditCardNo();
	  inputValues(pom.getInstanceBh().getCreditCardNo(), creditcardno);  
	  Thread.sleep(1000);
	}

	@Then("^user Select the Credit Card Type in the Credit Card Type Field$")
	public void user_Select_the_Credit_Card_Type_in_the_Credit_Card_Type_Field() throws Throwable {
	   select(pom.getInstanceBh().getCreditCardType(),"VISA");
	   Thread.sleep(1000);
	}

	@Then("^user Select the Expiry Date in  Month Field$")
	public void user_Select_the_Expiry_Date_in_Month_Field() throws Throwable {
	   select(pom.getInstanceBh().getExpiryMonth(),"May");
	   Thread.sleep(1000);
	}

	@Then("^user Select the Expiry Date in Year Field$")
	public void user_Select_the_Expiry_Date_in_Year_Field() throws Throwable {
	   select(pom.getInstanceBh().getExpiryYear(),"2021") ;
	   Thread.sleep(1000);
	}

	@Then("^user Select the CVV Number in CVV Number Field$")
	public void user_Select_the_CVV_Number_in_CVV_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstance().getInstanceCR().getCvv();
	   inputValues(pom.getInstanceBh().getCVVNo(),cvv );
	   Thread.sleep(1000);
	}

	@Then("^user click on the booknow button and it navigate to  Booking Confirmation Page$")
	public void user_click_on_the_booknow_button_and_it_navigate_to_Booking_Confirmation_Page() throws Throwable {
	 clickOnElement(pom.getInstanceBh().getBookNow());   
	 Thread.sleep(1000);
	}

	public static Logout lo=new Logout(driver);
	@When("^user click on the Log out Button$")
	public void user_click_on_the_Log_out_Button() throws Throwable {
	 clickOnElement(pom.getInstanceLogout().getLogout());  
	}

	

}
