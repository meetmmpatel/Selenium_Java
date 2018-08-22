package com.selenium.AdvanceCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class WaitClass {
	WebDriverConfig driver = new WebDriverConfig();

	WebDriver firefox = driver.getFirefox();
	
	@Test
	public void sampleImplicitWait() {
		firefox.navigate().to("http://qaautomated.com");
		//impicitWait
		firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(firefox, 20);
		WebElement aboutMe;
		aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));
		aboutMe.click();
		
		
		firefox.close();
		
		
	}

}
