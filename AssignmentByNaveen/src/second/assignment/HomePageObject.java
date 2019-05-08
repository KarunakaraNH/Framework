package second.assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePageObject {

	WebDriver driver;

	public HomePageObject(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(how = How.XPATH, using = "//a[@class='active makeFlex hrtlCenter column']")
	WebElement FlightButton;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]")
	WebElement RoundTrip;
	@FindBy(how = How.ID, using = "fromCity")
	WebElement FromCity;
	@FindBy(how = How.XPATH,using="//span[contains(text(),'BLR, Kempegowda International Airport India')]")
	WebElement ToCity;
	@FindBy(how = How.XPATH, using = "//input[@id='departure']")
	WebElement DepartureDate;
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/label[1]")
	WebElement Returndate;
	@FindBy(how = How.CSS, using = "//a[@class='primaryBtn font24 latoBlack widgetSearchBtn'] ")
	WebElement SearchButton;
	@FindBy(how = How.ID, using = "filter_stop0")
	WebElement NonStopcheckbox;
	@FindBy(how = How.ID, using = "filter_stop1")
	WebElement OneStopcheckbox;
	//findelements
	@FindBys(@FindBy(how = How.XPATH, using = "//div[@id='ow_domrt-jrny'] //label[@class='splitVw-radio clearfix cursor_pointer']"))
	public List<WebElement> departureflights;
	@FindBys(@FindBy(how = How.XPATH, using = "//div[@id='rt-domrt-jrny'] //label[@class='splitVw-radio clearfix cursor_pointer']"))
	public List<WebElement> ReturnFlights;
	@FindBy(how = How.XPATH, using = "(//div[@class='pull-right marL5 text-right split-price-sctn']/p/span)[1]")
	WebElement DepartureTotal;
	@FindBy(how = How.XPATH, using = "(//div[@class='pull-right marL5 text-right']/p/span)[2]")
	WebElement ReturnTotal;
	@FindBy(how = How.XPATH, using = "//div[@class='splitVw-footer-total make_relative make_flex alC'] //span[@class='INR']")
	WebElement Total;
	
	public void clickonflight() throws Exception
	{
		ClickOperation(FlightButton, "Flighticon");
	}
	public void clickonroundtrip() throws Exception
	{
		ClickOperation(RoundTrip, "Roundtrip");
	}
	public void clickonfrom() throws Exception
	{
		try {
			ClickOperation(FromCity, "FromCity");
		} catch (Exception e) {
			throw new Exception(FromCity + " is NOt clickable");
		}
	}
	public void Fromcityvalue()
	{
		FromCity.sendKeys("del");
		FromCity.sendKeys(Keys.ARROW_DOWN);
		FromCity.sendKeys(Keys.ENTER);
	}
	public void Tocityvalue()
	{
		ToCity.sendKeys("bang");
		ToCity.sendKeys(Keys.ARROW_DOWN);
		ToCity.sendKeys(Keys.ENTER);
	}
	public void departuredate()
	{
		DepartureDate.click();
		driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[2]")).click();
		
	}
	
	
	
	public void booking(){
		FlightButton.click();
		RoundTrip.click();
		FromCity.click();
		FromCity.sendKeys("Delhi");
		FromCity.sendKeys(Keys.ARROW_DOWN);
		FromCity.sendKeys(Keys.ENTER);
		ToCity.click();
		ToCity.sendKeys("Bangalore");
		ToCity.sendKeys(Keys.ARROW_DOWN);
		ToCity.sendKeys(Keys.ENTER);
		DepartureDate.click();
		List<WebElement> cal1=driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div[1]"));
		int cal1total=cal1.size();
		for(int i=0; i<cal1total; i++)
		{
			String day=cal1.get(i).getText();
			if(day.equals("25"))
			{
				cal1.get(i).click();
			}
		}
		Returndate.click();
		List<WebElement> cal2=driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div[2]"));
		int cal2total=cal2.size();
		for(int i=0; i<cal2total; i++)
		{
			String day=cal2.get(i).getText();
			if(day.equals("1"))
			{
				cal2.get(i).click();
			}
		}
		SearchButton.click();
		
	}
	public void validation1()
	{
		NonStopcheckbox.click();
		int Departureflights=departureflights.size();
		departureflights.get(2).click();
		departureflights.get(4).click();
		Assert.assertEquals(departureflights.get(2).getText(), ReturnFlights.get(4).getText());
		System.out.println("validation passed");
		
	}
	public void validation2()
	{
		NonStopcheckbox.click();
		int Departureflights=departureflights.size();
		departureflights.get(2).click();
		departureflights.get(4).click();
		Assert.assertEquals(departureflights.get(2).getText(), ReturnFlights.get(4).getText());
		System.out.println("validation passed");	
	}
	
	
	public void clickFlight() throws Exception{
		/*try {
			this.FlightButton.click();
		} catch (Exception e) {
		 throw new Exception("flight button NOt able to clickable");
		}*/
		this.ClickOperation(this.FlightButton, "Flight BUTTON");
	}
	
	public void ClickDate() throws Exception{
	this.ClickOperation(this.DepartureTotal, "Departure Total");

	}
	
	
	private void ClickOperation(WebElement element, String ElementName) throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			throw new Exception(ElementName + " is NOt clickable");
		}
	}
	

	
	
	 
}
