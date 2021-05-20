package com.Final_Project.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	
	public static WebDriver driver;
	public static WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("browser")){
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else {
			System.out.println("invalid");
		}
		driver.manage().window().maximize();
		return driver;
	}
	//url
	public static  void openUrl(String Url) {
		driver.get(Url);
		
		
	}
	//click
		public static void clickOnElement(WebElement login) {
			login.click();
		}
	//sendkeys
		public static void inputValues(WebElement in , String str) {
			in.sendKeys(str);
		}	
			//current url
			public static void curtUrl(String curl) {
			driver.getCurrentUrl();
			
	}
			//title
			public static void  getUrl(String url) {
				driver.getTitle();
				
			}
			//navigate to
			public static void to(String url) {
				driver.navigate().to(url);;
				
			}
			//navigate back 
			public static void backDriver(String url) {
				driver.navigate().back();;
				
			}
			//navigate forward 
			public static void forwardDriver(String url) {
				driver.navigate().forward();
				}
			//refresh
			//navigate back 
			public static void refresh(String url) {
				driver.navigate().refresh();
				
			}
			
			//to get text
			//navigate back 
			public static void obtText(WebElement element,String url) {
				element.getText();
				
			}
			//get attribute
			public static void getAttr(WebElement element,String str) {
				element.getAttribute(str);
				
			}
			//displayed
			public static void displayed(WebElement element,String url) {
				element.isDisplayed();
				
			}
			//to select
			public static void isSelected(WebElement element) {
				element.isSelected();
				
			}
			public static void select(WebElement element ,String str) {
				Select s1=new Select(element);
				s1.selectByVisibleText(str);
			}
			//to enable
			public static void enable(WebElement element) {
				element.isEnabled();
				
			}
			//close
			public static void closeDriver(WebElement element) {
				driver.close();
				
			}
			//quit
			public static void quitDriver(WebElement element) {
				driver.quit();
				
			}
			//alert
			public static void sAlert(WebElement element) {
			element.click();
			Alert sAlert=driver.switchTo().alert();
			sAlert.accept();
			}
			//frame
			public static void toFrame(WebElement element) {
				driver.switchTo().frame(element);
				
			}
			//action
			public static void toAction(WebElement element) {
				element.click();
				Actions ac=new Actions(driver);
				ac.contextClick().build().perform();
				
			}
			//move to element
			public static void moveElement(WebElement element) {
				Actions ac=new Actions(driver);
				ac.moveToElement(element);
				}
			//wait
			public static void driverWait(WebElement url) {
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
			}


			
		
}
	


	

