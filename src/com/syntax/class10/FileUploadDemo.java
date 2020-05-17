package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {

		String filePath="/Users/syntax/Desktop/myFile.png";
		String url = "https://the-internet.herokuapp.com/";

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//click on File Upload link
		driver.findElement(By.linkText("File Upload")).click();
		
		
		//driver.findElement(By.id("file-upload")).click();//instead of click use sendKeys();
		//We simply use sendkeys() method to upload the file
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		
		driver.quit();
		//Break till 1:40
		
	}


}
