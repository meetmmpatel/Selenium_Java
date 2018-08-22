package com.selenium.AdvanceCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class DropDown {
	WebDriverConfig driver = new WebDriverConfig();

	WebDriver firefox = driver.getFirefox();
	
	@Test
	public void selectDropDownTest() throws InterruptedException {
		firefox.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropDown = firefox.findElement(By.name("country"));
		
		Select selectDropDown = new Select(dropDown);
		
		Thread.sleep(3000);
		selectDropDown.selectByIndex(2);
		
		Thread.sleep(3000);
		selectDropDown.selectByValue("AUSTRALIA");
		Thread.sleep(3000);
		
		selectDropDown.selectByVisibleText("INDIA");
		Thread.sleep(5000);
		
		
		selectDropDown.getOptions();
		Thread.sleep(5000);
		
		firefox.close();
		
		
	}
	
	

}
