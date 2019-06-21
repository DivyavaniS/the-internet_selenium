package com.ascendum.website;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestDay2 extends BaseClass {

	@Test
	public void verifyMutlipleWindow() {
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println(driver.getTitle());
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iterator = windowIds.iterator();
		String parentId = iterator.next();
		System.out.println(parentId);
		String childId = iterator.next();
		System.out.println("************" + childId);
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}

	@Test
	public void verifyEntryAd() {
		driver.findElement(By.linkText("Entry Ad")).click();
		driver.findElement(By.linkText("click here")).click();
		driver.switchTo().alert().dismiss();

	}

	@Test
	public void verifyJsAlert() {

		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(".//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: divya");

	}

	@Test
	public void verifyBrokenImage() throws IOException {
		driver.findElement(By.linkText("Broken Images")).click();
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		for (int iElement = 0; iElement < allImages.size(); iElement++) {
			String url = allImages.get(iElement).getAttribute("href");
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			if (String.valueOf(con.getResponseCode()).equals("200")) {
				System.out.println("Image @ url " + url + "exists at server");
			} else {
				System.out.println("Image @ url " + url + " does not exists at server");
			}
		}
	}

	@Test
	public void verifyFrames() {
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.name("frame-left ")).getText());

	}

	@Test
	public void verifyFileUpload() {
		driver.findElement(By.linkText("File Upload")).click();
		WebElement fileInput = driver.findElement(By.name("file"));
		fileInput.click();
		fileInput.sendKeys("C://Users//Srikanth//Desktop");
		driver.findElement(By.id("file-submit")).click();
		Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "New Microsoft Word Document.docx");

	}

}
