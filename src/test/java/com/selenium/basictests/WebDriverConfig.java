package com.selenium.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
	public WebDriver getChrome() {
		System.setProperty("webdriver.chrome.driver", "/Users/milanpatel/Documents/core/software/chromedriver-2");
		WebDriver driver = new ChromeDriver();

		return driver;

	}

	public WebDriver getFirefox() {

		System.setProperty("webdriver.gecko.driver", "/Users/milanpatel/Documents/core/software/geckodriver");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
