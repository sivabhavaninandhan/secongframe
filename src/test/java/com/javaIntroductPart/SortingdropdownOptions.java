package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingdropdownOptions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement drpele=driver.findElement(By.xpath("asdfg"));
		Select selopt=new Select(drpele);
		
		List<WebElement> sellist=selopt.getOptions();
		
		ArrayList OriginalList=new ArrayList();
		ArrayList ChildList=new ArrayList();
		
		for(WebElement websel:sellist)
		{
			OriginalList.add(websel.getText());
			ChildList.add(websel.getText());
		}
       Collections.sort(OriginalList);
       if(OriginalList.contains(ChildList))
       {
    	   System.out.println("both lists are sorted");
       }
       else
       {
    	   System.out.println("both lists sre unsorted");
       }
	}
  
}
