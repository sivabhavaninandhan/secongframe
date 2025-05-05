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

public class SortingtheDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/java/dropdown-select-class-in-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        WebElement dropoptns=driver.findElement(By.xpath("//input[@id='qwert']"));
        
        Select seloptns=new Select(dropoptns);
        
        List<WebElement> listsel=seloptns.getOptions();
        
        ArrayList OriginalList=new ArrayList();
        ArrayList TemproryList=new ArrayList();
        
        for(WebElement listvalues:listsel)
        {
        	OriginalList.add(listvalues.getText());
        	TemproryList.add(listvalues.getText());
        }
        Collections.sort(TemproryList);
        if(OriginalList.equals(TemproryList))
        {
        	System.out.println("both lists are sorted");
        	System.out.println("both lists are unsorted");
        }
	}
 
}
