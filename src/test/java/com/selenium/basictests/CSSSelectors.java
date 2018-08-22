package com.selenium.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CSSSelectors {

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver firefox = driver.getFirefox();

	@Test
	public void searchWitCssPath() {

		firefox.navigate().to("http://google.com");

		WebDriverWait wait = new WebDriverWait(firefox, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#lst-ib")));
		
		WebElement searchBox = firefox.findElement(By.cssSelector("#lst-ib"));
		searchBox.sendKeys("CSS Selectors");
		

	}

	@AfterTest
	public void closeTest() {
		firefox.close();
	}

}
