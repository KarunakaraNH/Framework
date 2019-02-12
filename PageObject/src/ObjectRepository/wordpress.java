package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wordpress {
      WebDriver driver;
      //create the constructor with argument
      public wordpress(WebDriver driver){
    	  this.driver=driver;
      }
    	
		By Firstname= By.id("firstName");
    	By lastname=By.id("lastName");
    	By Email=By.id("email");
    	By password=By.id("password");
    	By Createaccount=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");
    	
   public WebElement Firstname(){
	   return driver.findElement(Firstname);
   }
	   public WebElement Lastname(){
		   return driver.findElement(lastname);
	   }
	   public WebElement Email(){
		   return driver.findElement(Email);
	   }
	   
    	
      }
 
      

