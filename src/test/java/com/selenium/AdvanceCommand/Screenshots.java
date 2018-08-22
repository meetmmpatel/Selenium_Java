package com.selenium.AdvanceCommand;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.selenium.basictests.WebDriverConfig;

public class Screenshots {

	WebDriverConfig driver = new WebDriverConfig();

	WebDriver firefox = driver.getFirefox();

	@Test
	public void testScreenshot() throws InterruptedException {

		firefox.get("http://google.com");
		Thread.sleep(5000);
		File scrFile = ((TakesScreenshot) firefox).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(scrFile, new File("screenshot.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
