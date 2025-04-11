import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesttwo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> autosug=driver.findElements(By.xpath("//div[@id='sa_sug_block']//ul//li"));
		
		System.out.println("the total auto suggest options are  "+autosug.size());
		
		for(WebElement suggestions:autosug)
		{
			if(suggestions.getText().equals("selenium tutorial"))
			{
				suggestions.click();
				break;
			}
		}
		
      
	}

}
