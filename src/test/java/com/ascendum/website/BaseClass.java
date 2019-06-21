package com.ascendum.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	// div
	WebDriver driver;
	String name="divya";
  @BeforeMethod
  public void launchBrowser() {
	  driver=new FirefoxDriver();
	  System.setProperty("webdriver.gecodriver.driver", "C:\\Program Files\\geckodriver");
	  driver.get("http://the-internet.herokuapp.com/");
  }
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
