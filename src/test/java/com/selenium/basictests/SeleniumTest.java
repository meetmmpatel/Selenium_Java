package com.selenium.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumTest {

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver chrome = driver.getChrome();
	WebDriver firefox = driver.getFirefox();

	@Test
	
	public void openWebPageTest() {

		System.out.println("Hello World!");

		chrome.get("HTTP://yahoo.com");
		firefox.get("HTTP://amazon.com");

	}

	@Test
	public void pageResizeTest() {
		String baseUrl = "http://www.google.com";
		chrome.get(baseUrl);

		chrome.manage().window().maximize();
		chrome.findElement(By.name("q")).sendKeys("fun");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		chrome.quit();
	}

	@AfterTest
	public void closeTest() {

		chrome.quit();
		firefox.quit();

	}

}
