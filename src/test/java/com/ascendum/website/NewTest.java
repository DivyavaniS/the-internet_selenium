package com.ascendum.website;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends BaseClass {
  @Test
  public void testLaunchBrowser() {
	  String text=driver.getTitle();
	  Assert.assertEquals(text,"The Internet"); 
	  
}
}
