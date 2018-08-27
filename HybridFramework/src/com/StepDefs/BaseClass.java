package com.StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver = null;
	// provide IE driver path here
	public static String IEDriverPath = "";
	// provide Chrome Driver path here
	public static String chromeDriverPath = "";

	public BaseClass() {
	}

	public WebDriver openBrowser(String browserType) {
		if (driver == null) {
			if ("Mozilla".equalsIgnoreCase(browserType)) {
				driver = new FirefoxDriver();
			} else if ("IE".equalsIgnoreCase(browserType)) {
				System.setProperty("webdriver.ie.driver", IEDriverPath);
				driver = new InternetExplorerDriver();
			} else if ("chrome".equalsIgnoreCase(browserType)) {
				System.setProperty("webdriver.chrome.driver",
						chromeDriverPath);
				driver = new ChromeDriver();
			}
			System.out.println("Driver initialized");
		}

		driver.manage().window().maximize();
		return driver;
	}

}
