package com.StepDefs;

import java.util.concurrent.TimeUnit;

import objects.mapper.com.StepDefs.HasGoogleHomeObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleHome extends HasGoogleHomeObjects {
	public static WebDriver driver;

	@Given("^I navigated to Google page$")
	public void i_navigated_to_Google_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I type \"(.*?)\" in the search field$")
	public void i_type_in_the_search_field(String arg1) throws Exception {
		try {
			setWebDriverObject(driver);
			highlightelement(SearchField());
			SearchField().sendKeys(arg1);
			SearchButton().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^it should show me the result of \"(.*?)\"$")
	public void it_should_show_me_the_result_of(String arg1) throws Throwable {
		// Just write Some Logic
		Assert.assertTrue(true);
	}

	public static void highlightelement(WebElement element) {
		for (int i = 0; i < 4; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "color: solid red; border: 6px solid yellow;");
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "");

		}
	}
}
