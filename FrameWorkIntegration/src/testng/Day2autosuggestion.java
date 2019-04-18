package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2autosuggestion {
   @Test
	public void autosuggestion()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		WebElement from=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		driver.manage().window().maximize();
//		Thread.sleep(3000);
	    from.clear();
	    from.sendKeys("ban");
	    from.sendKeys(Keys.ARROW_DOWN);
	    from.sendKeys(Keys.ENTER);
	    WebElement to=driver.findElement(By.xpath("//input[@id='toCity']"));//the elements found using locator is called as webelement
	    to.clear();
	    to.sendKeys("man");
	    to.sendKeys(Keys.ARROW_DOWN);
	    to.sendKeys(Keys.ENTER);
	}
}
