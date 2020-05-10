package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithLoop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		driver.manage().window().maximize();

		String singUpTitle = driver.getTitle();
		System.out.println("Main Page Title is:: " + singUpTitle);
		
		for(int i=1; i<3; i++) {
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);
		}
		
	Set<String> allWindowHandles =	driver.getWindowHandles();
	
	for(String hanle:allWindowHandles) {
		System.out.println("ID of the window " + hanle );
		driver.switchTo().window(hanle);
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);	
		driver.close();
	}
	
	driver.quit();
	}
}
