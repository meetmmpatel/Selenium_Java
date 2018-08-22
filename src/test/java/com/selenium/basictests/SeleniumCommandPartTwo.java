package com.selenium.basictests;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class SeleniumCommandPartTwo {
	
	WebDriverConfig driver = new WebDriverConfig();

	WebDriver chrome = driver.getChrome();
	WebDriver firefox = driver.getFirefox();
	
	
	// to open website 
	
	@Test
	public void openWebPage() throws AWTException {
		chrome.get("HTTP://google.com");
		
	
		
	}
	
	@AfterTest
	private void closeTest() {
		chrome.quit();
		firefox.quit();
	}
	

}
