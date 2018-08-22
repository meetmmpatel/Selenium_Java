package com.selenium.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicCommandsForBrowsers {

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver chrome = driver.getChrome();
	
	@Test
	public void basicCommandTest() {
		
		//Implicit wait
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.get("https://google.com");
		chrome.findElement(By.name("q")).sendKeys("QA Automation Class");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(chrome, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		/*
		 * wait for 10 secounds
		 * open an amzon in chrom and firefox browsers
		 * find the name or Id for serch box on amazon
		 * referesh the webpage
		 * fine the name or id for serch box and type iphone case
		 * close the both of brosers 
		 * 
		 * 
		 * 
		 */
		
	}
	
	@AfterTest
	public void closeTest() {
		chrome.close();
		
	}
	

}
