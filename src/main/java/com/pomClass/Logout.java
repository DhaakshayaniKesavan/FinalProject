package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
public static WebDriver driver;
	
	public Logout(WebDriver driver) {
		this. driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement Logout;
	
	public WebElement getLogout() {
		return Logout;
	}
}
