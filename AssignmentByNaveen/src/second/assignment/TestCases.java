package second.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class TestCases {
    WebDriver driver;
    /*@AfterClass
    public static void reports()
    {
    	ExtentHtmlReporter htmlreports=new ExtentHtmlReporter("./Reports/sample.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(htmlreports);
		ExtentTest logger=reports.createTest("Flightbooking");
		reports.flush();
    }*/
	@Test
	public void FlightBooking() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		ExtentHtmlReporter htmlreports=new ExtentHtmlReporter("./Reports/sample.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(htmlreports);
		ExtentTest logger=reports.createTest("FlightBooking");
		logger.log(Status.INFO, "flight searching");
     	HomePageObject homepage=PageFactory.initElements(driver, HomePageObject.class);
     	homepage.clickonflight();
     	homepage.clickonroundtrip();
     	homepage.clickonfrom();
     	homepage.Fromcityvalue();
     	homepage.Tocityvalue();
     	
     	 
     	 
		
	}
}
