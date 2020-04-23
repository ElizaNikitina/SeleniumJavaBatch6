package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com"); 
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys("Eliza");
		driver.findElement(By.name("lastName")).sendKeys("Nikitina");
		driver.findElement(By.name("phone")).sendKeys("9684422767");
		driver.findElement(By.id("userName")).sendKeys("elizaa@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("1366 New York av");
		driver.findElement(By.name("address2")).sendKeys("");
		driver.findElement(By.name("city")).sendKeys("New York");
		driver.findElement(By.name("state")).sendKeys("New York");
		driver.findElement(By.name("postalCode")).sendKeys("11210");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES ");
		driver.findElement(By.id("email")).sendKeys("elizaa@yahoo.com ");
		driver.findElement(By.name("password")).sendKeys("qwerty");
		driver.findElement(By.name("confirmPassword")).sendKeys("qwerty");
		driver.findElement(By.name("register")).click();
		
		
		
		
		
	}

}
