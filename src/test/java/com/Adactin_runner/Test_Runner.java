package com.Adactin_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Final_Project.driver.Base_Class;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Adactin_Feature",
glue="com.adactin_Step_Definition",
monochrome=true,
dryRun=false,
strict=true,
//tags=("@s1,@s2"),
plugin= {"html:Report/Html_Report",
		"pretty",
		"json:Reports/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
}
)


public class Test_Runner {
	public static WebDriver driver;//----------->null
	@BeforeClass
	public static void set_Up() throws Throwable {
		
	String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
	driver=Base_Class.getDriver("browser");
	}
	@AfterClass
	public static void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.wait();
	}
	

}
