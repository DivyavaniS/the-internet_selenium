package com.ascendum.website;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class CheckAllLinks extends BaseClass {
  @Test
  public void verifyAllLinks() {	  
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  int a=allLinks.size();
	  System.out.println(a);
	  for(WebElement link:allLinks) {
		  System.out.println(link.getText()+"-"+link.getAttribute("href"));
	  }
  }
}
