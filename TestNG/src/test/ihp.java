package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ihp {

	@Test
	public void presence() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karunh\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://kitchenplanner.ikea.com/gb/UI/Pages/VPUI.htm");
		Thread.sleep(9000);
		//boolean isenabledbefore=driver.findElement(By.xpath("//a[@id='button_AgreeButton']")).isEnabled();
		//System.out.println(isenabledbefore);
		driver.findElement(By.xpath("//input[@id='Agreement_CheckBox']")).click();
		boolean isenabledaftere=driver.findElement(By.xpath("//a[@id='button_AgreeButton']")).isEnabled();
		System.out.println(isenabledaftere);
		driver.findElement(By.xpath("//a[@id='button_AgreeButton']"));

	}
}
