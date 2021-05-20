package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	@FindBy(id="username")
	private WebElement username;
	public WebElement getusername() {
		return username;
	}
@FindBy(id="password")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(id="login")
private WebElement LoginButton;
public WebElement getLoginButton() {
	return LoginButton;
}


}
