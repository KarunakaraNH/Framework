package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;

public class loginapplication {
	
@Test
	public void Login(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karunh\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginPage rl=new RediffLoginPage(driver);
	rl.Emailid().sendKeys("karunakarakbc@gmail.com");
	rl.Password().sendKeys("123456");
	rl.Go().click();
		
	}
	
	
	
	
	
}
