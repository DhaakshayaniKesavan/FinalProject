package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {
public static WebDriver driver;
	
	public BookingHotel (WebDriver driver) {
		this. driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement LastName;

	@FindBy(id="address")
	private WebElement BillingAddress;

	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	@FindBy(id="cc_type")
	private WebElement CreditCardType;

	@FindBy(id="cc_exp_month")
	private WebElement ExpiryMonth;

	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	@FindBy(id="cc_cvv")
	private WebElement CVVNo;
	@FindBy(id="book_now")
	private WebElement BookNow;

	public WebElement getFirstName() {
		return FirstName;
	}
	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public void setBillingAddress(WebElement billingAddress) {
		BillingAddress = billingAddress;
	}
	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}
	public void setCreditCardNo(WebElement creditCardNo) {
		CreditCardNo = creditCardNo;
	}
	public WebElement getCreditCardType() {
		return CreditCardType;
	}
	public void setCreditCardType(WebElement creditCardType) {
		CreditCardType = creditCardType;
	}
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}
	public void setExpiryMonth(WebElement expiryMonth) {
		ExpiryMonth = expiryMonth;
	}
	public WebElement getExpiryYear() {
		return ExpiryYear;
	}
	public void setExpiryYear(WebElement expiryYear) {
		ExpiryYear = expiryYear;
	}
	public WebElement getCVVNo() {
		return CVVNo;
	}
	public void setCVVNo(WebElement cVVNo) {
		CVVNo = cVVNo;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	public void setBookNow(WebElement bookNow) {
		BookNow = bookNow;
	}
	
	

	



}
