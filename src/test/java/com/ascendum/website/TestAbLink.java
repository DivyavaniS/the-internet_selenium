package com.ascendum.website;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAbLink extends BaseClass {
	/*
	 * @Test public void verifyAbLink() {
	 * 
	 * driver.findElement(By.linkText("A/B Testing")).click(); String text =
	 * driver.findElement(By.id("content")).getText(); System.out.println(text);
	 * Assert.assertEquals(true, text.contains("split testing"));
	 * 
	 * }
	 * 
	 * @Test public void verifyAddRemoveElementLink() {
	 * 
	 * driver.findElement(By.linkText("Add/Remove Elements")).click();
	 * driver.findElement(By.xpath(".//button[text()='Add Element']")).click();
	 * boolean b = driver.findElement(By.className("added-manually")).isDisplayed();
	 * System.out.println(b);
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement element =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.className(
	 * "added-manually"))); element.click();
	 * 
	 * List<WebElement> buttons = driver.findElements(By.tagName("button")); int btn
	 * = buttons.size();
	 * 
	 * System.out.println(btn);
	 * 
	 * if (btn == 1) { System.out.println("Test passed:Only one button exists"); }
	 * else { System.out.println("Test failed:Delete button exists"); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Test public void VerifyCheckBoxes() throws InterruptedException {
	 * driver.findElement(By.linkText("Checkboxes")).click(); // driver.findElement(
	 * By.xpath( "//*[@type='checkbox']") ).click();
	 * 
	 * List<WebElement> els =
	 * driver.findElements(By.xpath("//*[@type='checkbox']"));
	 * //driver.findElements(By.cssSelector("input[type='checkbox']")); for
	 * (WebElement el : els) { if (!el.isSelected()) { el.click();
	 * Thread.sleep(1000);//very bad away of handling wait el.click();
	 * System.out.println("checkboxes are not selected"); } else {
	 * System.out.println("checkboxes are Selected"); } }
	 * 
	 * }
	 * 
	 * @Test public void verifyDropdown() throws InterruptedException {
	 * driver.findElement(By.linkText("Dropdown")).click(); Select DropDown = new
	 * Select(driver.findElement(By.id("dropdown"))); DropDown.selectByValue("1");
	 * List<WebElement> oSize = DropDown.getOptions(); int iListSize = oSize.size();
	 * System.out.println(iListSize); DropDown.selectByIndex(2); Thread.sleep(1000);
	 * 
	 * }
	 * 
	 * @Test public void verifyHovers() throws InterruptedException {
	 * driver.findElement(By.linkText("Hovers")).click(); WebElement element =
	 * driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg'][1]"));
	 * Actions action = new Actions(driver);
	 * action.moveToElement((element)).build().perform();
	 * driver.findElement(By.linkText("View profile")).click(); String url =
	 * driver.getCurrentUrl(); Thread.sleep(1000); Assert.assertEquals(url,
	 * "http://the-internet.herokuapp.com/users/1");
	 * 
	 * }
	 * 
	 * @Test public void verifyBasicAuth() {
	 * driver.findElement(By.linkText("Basic Auth")).click();
	 * driver.switchTo().alert(); driver.switchTo().alert().dismiss();
	 * 
	 * 
	 * 
	 * 
	 * @Test public void verifyFormAuthentication() {
	 * driver.findElement(By.linkText("Form Authentication")).click();
	 * driver.findElement(By.id("username")).sendKeys("tomsmith ");
	 * driver.findElement(By.id("password")).sendKeys("SuperSecretPassword! ");
	 * driver.findElement(By.className("fa fa-2x fa-sign-in")).click(); 
	 * Assert.assertEquals(driver.findElement(By.className("icon-2x icon-signout")).isDisplayed(), true); 
	 * }
	 * 
	 *
	 */
	@Test
	public void verifyDragAndDrop() {
		driver.findElement(By.linkText("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();

	}

	@Test
	public void verifyForgotPassword() {
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.id("email")).sendKeys("divyasri213@gmail.com");
		driver.findElement(By.id("form_submit")).click();
		String textMessage = driver.findElement(By.id("content")).getText();
		Assert.assertEquals(textMessage, " Your e-mail's been sent! ");

	}

	

}
