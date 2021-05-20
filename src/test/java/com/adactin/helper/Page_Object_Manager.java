package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pomClass.BookingHotel;
import com.pomClass.Confirmation;
import com.pomClass.Login;
import com.pomClass.Logout;
import com.pomClass.Search_Hotel;
import com.pomClass.Select_Hotel;

public class Page_Object_Manager {
	
public WebDriver driver;
private Login loginpg;
private BookingHotel Bh;
private Select_Hotel Sh1;
private Search_Hotel Sh;
private Confirmation Ch;
private Logout Logout;




public Page_Object_Manager(WebDriver driver2) {

this.driver=driver2;
PageFactory.initElements(driver, this);
return;
}
public Login getInstanceLoginpg() {
loginpg=new Login(driver);
return loginpg;
}

public Search_Hotel getInstanceSh() {
	Sh = new Search_Hotel(driver);
	return Sh;
	
}
public Select_Hotel getInstanceSh1() {
	Sh1 = new Select_Hotel(driver);
	return Sh1;
	
}
public Confirmation getInstanceCh() {
	Ch = new Confirmation(driver);
	return Ch;
	
}
public BookingHotel getInstanceBh() {
	Bh = new BookingHotel(driver);
	return Bh;
	
}
public Logout getInstanceLogout() {
	Logout = new Logout(driver);
	return Logout;
	
}
}