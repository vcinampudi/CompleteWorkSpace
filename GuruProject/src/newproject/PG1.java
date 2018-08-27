package newproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		WebDriver driver = null;
		
		DateFormat  dateformat = new SimpleDateFormat("HH:mm:ss");
		
		Date date = new Date();
		System.out.println( "Strating Time is : "+dateformat.format(date));
		
		//Browser should be selected from Below.
		String NameStr = "f";
		String BrowserNm = "";
		if (NameStr == "f") {
			System.setProperty("webdriver.firefox.marionette","D:\\Nedbank\\Personal\\Learning\\Selenium Jars\\Browseres\\x64\\geckodriver.exe");			
			driver = new FirefoxDriver();
			BrowserNm = "Fire Fox"; 
		} else if (NameStr == "c") {
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","D:\\Nedbank\\Personal\\Learning\\Selenium Jars\\Browseres\\x32\\chromedriver.exe");
			 driver = new ChromeDriver();
			BrowserNm = "Google Chrome";
		}
		else {
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		String expectedTitle = "Welcome: Mercury Tours";
		
		String actualTitle = "";
		
		// launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
     // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test execute in "+ BrowserNm +" Browser and it has Passed!");
        } else {
            System.out.println("Test execute in "+ BrowserNm +" Browser and it has Failed");
        }       
        //close Fire fox
        driver.close();
        long endtime = System.currentTimeMillis();
        long totalTime = endtime - starttime;
        System.out.println("Total test execution time is "+ totalTime/1000 +" milliseconds");
        Date date1 = new Date();
		System.out.println( "Ending Time is : "+dateformat.format(date1));
	}
}