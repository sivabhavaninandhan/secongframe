package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropfive {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='sb_form_ic']/textarea")).sendKeys("hyderabad");
		
		List<WebElement> autosugge=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("total options are "+autosugge.size());
		
		Thread.sleep(3000);
		
		for(WebElement onesugg:autosugge)
		{
			if(onesugg.getText().equals("hyderabad weather"))
			{
				onesugg.click();
			}
		}
	}
           
}
