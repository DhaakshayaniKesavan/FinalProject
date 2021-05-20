package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
public static WebDriver driver;
	
	public Confirmation(WebDriver driver) {
		this. driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	@FindBy(id="my_itinerary")
	private WebElement Myitinerary;

	public WebElement getMyitinerary() {
		return Myitinerary;
	}

}
