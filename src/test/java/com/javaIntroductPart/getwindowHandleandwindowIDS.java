package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowHandleandwindowIDS {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> winids=driver.getWindowHandles();
		List<String> winidsList=new ArrayList(winids);
		
		String ParentWinID=winidsList.get(0);
		String ChildWinID=winidsList.get(1);
		
		System.out.println("the parent windowid "+ParentWinID);
		System.out.println("the child winid  "+ChildWinID);
		
		for(String winidstext:winidsList)
		{
			String winidstitle=driver.switchTo().window(winidstext).getTitle();
			System.out.println("the windows titles are "+winidstitle);
			if(winidstitle.equals("Human Resources Management Software | OrangeHRM HR Software"))
			{
				driver.close();
			}
		}

	}

}
