package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	
	public Select_Hotel(WebDriver driver) {
		this. driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	@FindBy(id="radiobutton_0")
	private WebElement SelectHotel;

	public WebElement getSelectHotel() {
		return SelectHotel;
	}
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}
	



}

