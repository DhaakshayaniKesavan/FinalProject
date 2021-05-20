package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	public Search_Hotel(WebDriver driver) {
		this. driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	
	}
	@FindBy(id = "location")
	private WebElement Location;

	public WebElement getLocation() {
		return Location;
	}
	@FindBy(id="hotels")
	private WebElement Hotels;

	public WebElement getHotels() {
		return Hotels;
	}
	@FindBy(id="room_type")
	private WebElement RoomType;

	public WebElement getRoomType() {
		return RoomType;
	}
	@FindBy(id="room_nos")
	private WebElement NumberOfRooms;

	public WebElement getNumberOfRooms() {
		return NumberOfRooms;
	}
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;

	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	@FindBy(id="adult_room")
	private WebElement AdultsPerRoom;

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}
	@FindBy(id="child_room")
	private WebElement ChildPerRoom;

	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}
	@FindBy(id="Submit")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	
	

}
