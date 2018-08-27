package extentReportPkg;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.*;

public class exTentReportsClass {

	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void starttest() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentreport.html", true);
		extent.addSystemInfo("Host Name", "ExtentReportGeneration HostName");
		extent.addSystemInfo("", "");
		extent.addSystemInfo("", "");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}

	//Creating a method getScreenshot and passing two parameters 
	//driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	 //below line is just to append the date format with the screenshot name to avoid duplicate names		
	        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
	        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
			String destination = System.getProperty("user.dir") + "\\FailedTestsScreenshots\\"+screenshotName+dateName+".png";			
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
	                //Returns the captured file path
			return destination;
	}	
	@Test
	public void passTest() {
		logger = extent.startTest("PassTest");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case Name PassTest is Passed");
	}
	@Test
	public void passTest1() {
		logger = extent.startTest("PassTest");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case Name PassTest is Passed");
	}
	@Test
	public void passTest2() {
		logger = extent.startTest("PassTest");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case Name PassTest is Passed");
	}

	@Test
	public void FailTest() {
		logger = extent.startTest("FailTest");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Browser\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		/* driver = new ChromeDriver(); */
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "NoTitle");
		//Assert.assertTrue(true);
		logger.log(LogStatus.FAIL, "Test Case Name FailTest is Passed");

	}
	@Test
	public void FailTest1() {
		logger = extent.startTest("FailTest");
		Assert.assertTrue(true);
		logger.log(LogStatus.FAIL, "Test Case Name FailTest is Passed");

	}

	@Test
	public void skipTest() {
		logger = extent.startTest("SkipTest");
		throw new SkipException("This is not ready for testing ");
	}
	@Test
	public void skipTest1() {
		logger = extent.startTest("SkipTest");
		throw new SkipException("This is not ready for testing ");
	}

/*	@AfterMethod
	public void getResult(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
			 String screenshotPath = exTentReportsClass.getScreenshot(driver, result.getName());
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test Case Skiped"+result.getName());
		}
		extent.endTest(logger);

	}*/
	
	 @AfterMethod
	 public void getResult(ITestResult result) throws Exception{
	 if(result.getStatus() == ITestResult.FAILURE){
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	 //To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
	                        //We do pass the path captured by this mehtod in to the extent reports using "logger.addScreenCapture" method. 
	                        String screenshotPath = exTentReportsClass.getScreenshot(driver, result.getName());
	 //To add it in the extent report 
	 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
	 }else if(result.getStatus() == ITestResult.SKIP){
	 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	 }
	 // ending test
	 //endTest(logger) : It ends the current test and prepares to create HTML report
	 extent.endTest(logger);
	 }
	 
	@AfterTest
	private void endReport() {
		extent.flush();
		extent.close();
	}
}