package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	
	//This initElements method will create all WebElements


   //this is called as pageFactory and its very simple to use
	WebDriver driver;
	public PageFactory(WebDriver driver)
	{
		this.driver=driver;
	
	}
	@FindBy(xpath="//input[@id='login1']")
	WebElement usename;
	
	@FindBy(name="passwd")
	WebElement Password;
   
	@FindBy(name="proceed")
	WebElement Go;
	
		public WebElement Email(){
			return usename;
						}
		public WebElement Password(){
			return Password;

}
	
	

}
