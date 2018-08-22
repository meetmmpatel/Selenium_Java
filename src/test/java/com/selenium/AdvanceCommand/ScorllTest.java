package com.selenium.AdvanceCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class ScorllTest {

	WebDriverConfig config = new WebDriverConfig();

	WebDriver driver = config.getFirefox();

	@Test
	public void testScorll() throws InterruptedException {

		driver.get("http://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		//Write the search term - Buddha in search box
		WebElement searchBox = driver.findElement(By.id("fk-top-search-box"));
		searchBox.sendKeys("Buddha");
				
		//Click on searchButton
		WebElement searchButton = driver.findElement(By.className("search-bar-submit"));
		searchButton.click();
		
		//Inserting an optional wait of 3 seconds just to notice scroll down event
		Thread.sleep(3000);
		
		//Scroll down the webpage by 2500 pixels
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 2500)"); 
				
		//Waiting till page:2 text is visible
		WebElement pageNumberdisplayer = (new WebDriverWait(driver, 10)).until
	          (ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.row")));
		
		//Verifying that page got scrolled  and "page-2" text is visible now 
		//and more products become visible
		Assert.assertEquals(pageNumberdisplayer.getText(), "Page: 2");

	}

}
