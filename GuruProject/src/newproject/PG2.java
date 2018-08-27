package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","D:\\Nedbank\\Personal\\Learning\\Selenium Jars\\Browseres\\x64\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
//        driver.findElement(By.id("email")).sendKeys("myname");
        tagName = driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).getTagName();
        System.out.println(tagName);
        driver.quit();
	}
}