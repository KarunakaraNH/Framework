package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1actionclass {
	@Test
	public void action(){
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.zoopla.co.uk/");
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("london");
    driver.findElement(By.xpath("//button[@value='Search']")).click();
	}
	
	@Test
	public void print()
	{
		System.out.println("we are included");
	}
	@Test(groups={"smoke"})
	public void groupss()
	{
		System.out.println("group example");
	}
}
