package second.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class JavaApp {
	WebDriver driver;

	public WebDriverWait WebWait(int  n){
		WebDriverWait wait = new WebDriverWait(this.driver, n);
		return wait;
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		WebElement from = driver.findElement(By.id("fromCity"));
		from.click();
		// WebDriverWait wait = new WebDriverWait(driver, 120);
		JavaApp app = new JavaApp();
		app.WebWait(120)
		   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='From']")));
		WebElement FromTextBox = driver.findElement(By.xpath("//input[@placeholder='From']"));
		FromTextBox.sendKeys("Delhi");
		FromTextBox.click();
		WebElement To=driver.findElement(By.xpath("//input[@placeholder='To']"));
		To.sendKeys("Bangalore");
		To.click();
		
		/*from.sendKeys("del");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
		to.sendKeys("bangalore");
		to.sendKeys(Keys.ARROW_DOWN);
		Actions action = new Actions(driver);
		action.moveToElement(to).click().perform(); 
		 to.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//input[@id='departure']")).click();
		 
		    	ExtentHtmlReporter htmlreports=new ExtentHtmlReporter("./Reports/sample.html");
				ExtentReports reports=new ExtentReports();
				reports.attachReporter(htmlreports);
				ExtentTest logger=reports.createTest("Flightbooking");
				reports.flush();
*/		   
		/*List<WebElement> cal1 = driver.findElements(By
				.xpath("//div[@class='DayPicker-Months']/div[1]"));
		int cal1total = cal1.size();
		for (int i = 0; i < cal1total; i++) {
			String day = cal1.get(i).getText();
			if (day.equals("25")) {
				cal1.get(i).click();
			}
		}
		List<WebElement> cal2 = driver.findElements(By
				.xpath("//div[@class='DayPicker-Months']/div[2]"));
		int cal2total = cal2.size();
		for (int i = 0; i < cal2total; i++) {
			String day = cal2.get(i).getText();
			if (day.equals("1")) {
				cal2.get(i).click();
			}
		}
*/
	}

}
