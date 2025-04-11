import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	
	public static void FuctureDate(WebDriver driver,String date,String month,String year)
	{
		while(true)
		{
			String ActMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ActYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(ActMonth) && ActYear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		     List<WebElement> ExpDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		     
		     for(WebElement dates:ExpDates)
		     {
		    	 if(dates.getText().equals(date))
		    	 {
		    		 dates.click();
		    		 break;
		    	 }
		     }
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		FuctureDate(driver,"15","February","2027");
		
		//String ExpMonth="January";
		//String ExpYear="2026";
		//String ExpDate="12";
		
		/*while(true)
		{
			String ActMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ActYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(ExpMonth.equals(ActMonth) && ActYear.equals(ExpYear))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		     List<WebElement> ExpDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		     
		     for(WebElement dates:ExpDates)
		     {
		    	 if(dates.getText().equals(ExpDate))
		    	 {
		    		 dates.click();
		    		 break;
		    	 }
		     }*/
	}

}
