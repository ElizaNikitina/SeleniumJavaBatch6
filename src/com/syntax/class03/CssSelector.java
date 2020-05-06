package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url); 
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admine");
		//driver.findElement(By.cssSelector("input[id*='Username']")).sendKeys("Admine");     !!!!  "Contains"
		driver.findElement(By.cssSelector("input[name*='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[id^='btn']")).click();      // ^ begins from
		
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector("//a[class$='Trigger']")).click();  // $ ends with
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		//id idendificator #
		//class identificator .
		
	}
}
