package com.selenium.AdvanceCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class RightClick {
	WebDriverConfig driver = new WebDriverConfig();

	WebDriver firefox = driver.getFirefox();
	
	
	@Test
	public void rightClickTest() throws InterruptedException {
		firefox.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		Actions action = new Actions(firefox);
		WebElement searchBox = firefox.findElement(By.id("fname"));
		action.contextClick(searchBox).perform();
		action.doubleClick(searchBox).perform();
		Thread.sleep(6000);
		
		firefox.quit();
		
	}
	

}
