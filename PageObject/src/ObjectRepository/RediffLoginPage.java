package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

		WebDriver driver;
		public RediffLoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
       By username=By.xpath("//input[@id='login1']");
       By Password=By.name("passwd");
       By proceed= By.name("proceed");
       
       public WebElement Emailid(){
    	   return driver.findElement(username);
    	  
    	  }
       public WebElement Password(){
    	   return driver.findElement(Password);
       }
       public WebElement Go(){
    	   return driver.findElement(proceed);
}}


