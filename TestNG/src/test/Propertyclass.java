package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Propertyclass {
	public WebDriver driver=null;
	@Test
	public void prop1() throws IOException{
		
		Properties prop=new Properties();//this code is ready to scan the file
		FileInputStream fis=new FileInputStream("C:\\Users\\karunh\\git\\Framework\\TestNG\\src\\test\\Property.properties");
		//search for that specific file with FIleInputStream java method	
		prop.load(fis);//.load will exicute the code and it will pickup the value from the property file
		System.out.println(prop.getProperty("username"));//to get the value of the username
		
		if(prop.getProperty("browser").equals("firefox")){
			WebDriver driver=new FirefoxDriver();//specify the key and value
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\karunh\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		}
		else{
			WebDriver driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("amazerrr");
		driver.findElement(By.cssSelector("ap_password")).sendKeys("pass1234");
	}
	
}
