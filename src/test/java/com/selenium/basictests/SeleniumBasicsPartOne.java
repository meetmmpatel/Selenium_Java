package com.selenium.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumBasicsPartOne {

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver chrome = driver.getChrome();
	WebDriver firefox = driver.getFirefox();

//	@Test
	public void locatorsInWeb() {
		chrome.get("HTTP://google.com");

		WebElement searchBox = chrome.findElement(By.name("q"));
		searchBox.sendKeys("ArtOfTesting");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	
	@Test 
	public void basicCommands() {
		
		firefox.navigate().to("https://amazon.com");
		firefox.navigate().refresh();
		
		
		try {
			Thread.sleep(1000);
			throw new InterruptedException();
		} catch (InterruptedException e) {
			System.out.println("The catch block execute");
			e.printStackTrace();
		}
		
		
		
	}

	@AfterTest
	public void closeTest() {

		chrome.quit();
		firefox.quit();

	}

}
