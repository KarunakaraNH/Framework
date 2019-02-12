package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Wordpresssinglemethod;
import ObjectRepository.wordpress;

public class wordpressTC {
	@Test
public void login(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karunh\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://wordpress.com/start/user");
	Wordpresssinglemethod wp=new Wordpresssinglemethod(driver);
	wp.Login("karuna", "NH", "karuna@gmail.com", "128");//this is one way of shortening our code
	//by using only one method with creating one method with all the parameter with data type and By calling that specific methos
	//we can able to do all the functions associate with that method
	
}

}
