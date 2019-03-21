package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent {
 @Test
	public void Reporter()
	{
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("./Reports/sample.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(htmlreporter);
		ExtentTest logger=report.createTest("sampletest");
		logger.log(Status.FAIL, "login to aplication");
		logger.log(Status.PASS, "pass the text");
		report.flush();
	}
	
}