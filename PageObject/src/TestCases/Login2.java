package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;

public class Login2 {
    @Test
	public void login2(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karunh\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	RediffLoginPage l=new RediffLoginPage(driver);
    	l.Emailid().sendKeys("email.com");
    	l.Password().sendKeys("27");
    	l.Go().click();
    	
	}
	
}
