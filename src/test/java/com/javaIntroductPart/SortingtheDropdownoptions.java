package com.javaIntroductPart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingtheDropdownoptions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.findElement(By.id("adfggt")).click();
        
        WebElement options=driver.findElement(By.xpath("asxzcv"));
        
        Select drpoptns=new Select(options);
        
        List<WebElement> opts=drpoptns.getOptions();
        
        ArrayList originallist=new ArrayList();
        ArrayList temprorylist=new ArrayList();
        
        for(WebElement seloptns:opts)
        {
        	originallist.add(seloptns.getText());
        	temprorylist.add(seloptns.getText());
        }
        System.out.println("the originallist"+originallist);
        System.out.println("the temprorylist"+temprorylist);
        
        Collections.sort(temprorylist);
        
        System.out.println("the originallist"+originallist);
        System.out.println("the temprorylist"+temprorylist);
        
        if(originallist.equals(temprorylist))
        {
        	System.out.println("drop down  lists are sorted");
        }
        else
        {
        	System.out.println("drop down lists are unsorted");
        }
	}

}
