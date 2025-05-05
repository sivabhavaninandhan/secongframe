import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyFlightTicketbookingtwo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		 
		 driver.findElement(By.xpath("//input[@id='product_549']")).click();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(400,800)", "");
		 
		 driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("ganga");
		 
		 driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("kadali");
		 
		 driver.findElement(By.xpath("//input[@id='dob']")).click();
		 
		 WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 
		 Select selmonth=new Select(month);
		 selmonth.selectByVisibleText("Feb");
		 
		 WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 Select selyear=new Select(year);
		 selyear.selectByVisibleText("2024");
		 
		 String actdate="19";
		 
		 List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		 
		 for(WebElement expdate:dates)
		 {
			 if(expdate.getText().equals(actdate))
			 {
				 expdate.click();
				 break;
			 }
		 }
		 
		 driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();
		// Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Hyderabad");
		 
		 driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Vijayawada");
		 driver.findElement(By.xpath("//input[@id='departon']")).click();
		 
		 Thread.sleep(2000);
		 
		 JavascriptExecutor jss=(JavascriptExecutor)driver;
		 jss.executeScript("window.scrollBy(400,1000)", "");
		 
		 	WebElement selectmonth=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		 	Select monthsel=new Select(selectmonth);
		 	monthsel.selectByVisibleText("May");

		 	WebElement selectyear=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		 	Select yearsel=new Select(selectyear);
		 	yearsel.selectByVisibleText("2026");
		 	
		 	String depaturdate="11";
		 	 List<WebElement> depardates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			 
			 for(WebElement dedate:depardates)
			 {
				 if(dedate.getText().equals(depaturdate))
				 {
					 dedate.click();
					 break;
				 }
			 }
			 driver.findElement(By.xpath("//textarea[@name='notes']")).sendKeys("good maintenace");
		//WebElement dropopt=driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']"));
		
	/*	Select seldropopt=new Select(dropopt);
		
		List<WebElement> seloption=seldropopt.getOptions();
		for(WebElement options:seloption)
		{
			if(options.getText().equals(""))
			{
				options.click();
				break;
			}
		}*/
			 driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
			 
			 List<WebElement> select=driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));
			 
			 System.out.println("The totla options in drop down "+select.size());
			 
			 for(WebElement clickopt:select)
			 {
				 if(clickopt.getText().equals("Prank a friend"))
				 {
					 clickopt.click();
					 break;
				 }
			 }
			 driver.findElement(By.xpath("//input[@type='radio'][@value='3']")).click();
			 
			 driver.findElement(By.id("billname")).sendKeys("9234ghrk97845");
			 
			 driver.findElement(By.id("billing_phone")).sendKeys("0956789345");
			 
			 driver.findElement(By.id("billing_email")).sendKeys("kadali23456789@gmail.com");
			 
			 driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
			 
			 List<WebElement> countrys=driver.findElements(By.xpath("//ul[@id='select2-billing_country-results']/li"));
			 
			 System.out.println("total countrys are "+countrys.size());
			 
			 for(WebElement country:countrys)
			 {
				 if(country.getText().equals("Cuba"))
				 {
					 country.click();
					 break;
				 }
			 }
			driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("mylavaram D.No:7-23");
			driver.findElement(By.xpath("//input[@id='billing_address_2']")).sendKeys("RamalayamStret HaziPet");
			driver.findElement(By.id("billing_city")).sendKeys("Hyderabad");
			driver.findElement(By.id("billing_state")).sendKeys("Andhra Pradesh");
			driver.findElement(By.id("billing_postcode")).sendKeys("521230");
			 
			
	}

}
