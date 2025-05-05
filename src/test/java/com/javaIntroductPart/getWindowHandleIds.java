package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleIds {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> winidstot=driver.getWindowHandles();
		
		List<String> winidslist=new ArrayList(winidstot);
		
		for(String winids:winidslist)
		{
			String winidstitle=driver.switchTo().window(winids).getTitle();
			System.out.println("the titles of winids are "+winidstitle);
			if(winidstitle.equals("OrangeHRM"))
			{
				driver.close();
			}
		}

	}

}
