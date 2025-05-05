package com.javaIntroductPart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingMultipleFilesInJavaEnv {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String file1="C:\\Users\\ASUS\\OneDrive\\ganga.xlsx";
		String file2="C:\\Users\\ASUS\\OneDrive\\gangafive.xlsx";
		String file3="C:\\Users\\ASUS\\OneDrive\\gangas.xlsx";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2+"\n"+file3);
		
		int totalfiles=driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		System.out.println("the total files aer "+totalfiles);
		
		if(totalfiles==3)
		{
			System.out.println("file uploaded successfully");
		}
		else
		{
			System.out.println("file are not uploaded");
		}

	}

}
