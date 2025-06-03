package com.javaIntroductPart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestSix {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		
		List<WebElement> autosuggests=driver.findElements(By.xpath("//div[@id='sa_sug_block']/ul/li"));
		
		System.out.println("total Autosggestions are "+autosuggests.size());
		
		for(WebElement suggestions:autosuggests)
		{
			if(suggestions.getText().equals("bookmyshow bangalore"))
			{
				suggestions.click();
				Thread.sleep(2000);
			}
		}

	}

}
