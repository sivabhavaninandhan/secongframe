import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionsdemo {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 
		List<WebElement> autosugns=driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
		
		System.out.println("size of Autosuggestions "+autosugns.size());
		
		for(WebElement autos:autosugns)
		{
			if(autos.getText().contains(" automation testing"))
			{
				autos.click();
				break;
			}
		}
		

	}

}
