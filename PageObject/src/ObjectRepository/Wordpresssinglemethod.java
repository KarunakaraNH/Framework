package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wordpresssinglemethod {
      WebDriver driver;
      //create the constructor with argument
      public Wordpresssinglemethod(WebDriver driver){
    	  this.driver=driver;
      }
    	
		By Firstname= By.id("firstName");
    	By lastname=By.id("lastName");
    	By Email=By.id("email");
    	By pw=By.id("password");
    	By Createaccount=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");
    	
    public void Login(String firstname, String Lname, String email, String password){
    	driver.findElement(Firstname).sendKeys("Karunya");
    driver.findElement(lastname).sendKeys("K");
    driver.findElement(Email).sendKeys("karunya@gmail.com");
    driver.findElement(pw).sendKeys("121314");
    driver.findElement(Createaccount).click();
 
    	 
    	 
     }
	   
    	
      }
 
      

