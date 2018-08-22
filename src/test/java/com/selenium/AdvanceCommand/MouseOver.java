package com.selenium.AdvanceCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class MouseOver {
	WebDriverConfig driver = new WebDriverConfig();

	WebDriver firefox = driver.getFirefox();

	@Test
	public void mouseOverTest() throws InterruptedException {

		firefox.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		firefox.manage().window().maximize();

		Actions action = new Actions(firefox);
		WebElement btn = firefox.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();

		Thread.sleep(6000);

		firefox.quit();
	}

}
