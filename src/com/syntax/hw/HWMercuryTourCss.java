package com.syntax.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWMercuryTourCss {
	/*
	 * Using xPath ONLY TC 2: Mercury Tours Registration: 
	 * Open chrome browser Go to “http://newtours.demoaut.com/” 
	 * Click on Register Link 
	 * Fill out all required info (skip dropdowns) 
	 * Click Submit User successfully registered
	 */
	public static String url = "http://newtours.demoaut.com/";

		public static void main(String[] args) throws InterruptedException, IOException {
			String filePath = "\\Users\\Ýëèçà\\eclipse-workspace\\SeleniumJavaBatch6\\config\\HWMercuryTour.properties";
			FileInputStream fileInput = new FileInputStream(filePath);
			
			Properties prop = new Properties();
			prop.load(fileInput);

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(url);
			
			driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
			driver.findElement(By.cssSelector("input[name*='firstName']")).sendKeys(prop.getProperty("firsName"));
			driver.findElement(By.cssSelector("input[name*='lastName']")).sendKeys(prop.getProperty("lastame"));
			driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys(prop.getProperty("phone"));
			driver.findElement(By.cssSelector("input[id*='userName']")).sendKeys(prop.getProperty("userName"));
			driver.findElement(By.cssSelector("input[name*='address1']")).sendKeys(prop.getProperty("address1"));
			driver.findElement(By.cssSelector("input[name*='address2']")).sendKeys(prop.getProperty("address2"));
			driver.findElement(By.cssSelector("input[name*='city']")).sendKeys(prop.getProperty("city"));
			driver.findElement(By.cssSelector("input[name*='state']")).sendKeys(prop.getProperty("state"));
			driver.findElement(By.cssSelector("input[name*='postalCode']")).sendKeys(prop.getProperty("postalCode"));
			driver.findElement(By.cssSelector("select[name*='country']")).sendKeys(prop.getProperty("country"));
			driver.findElement(By.cssSelector("input[id*='email']")).sendKeys(prop.getProperty("email"));
			driver.findElement(By.cssSelector("input[name*='password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.cssSelector("input[name*='confirmPassword']")).sendKeys(prop.getProperty("confirmPassword"));
			
			driver.findElement(By.xpath("//input[@name='register']")).click();
			

			Thread.sleep(3000);
			
			
			driver.quit();
		
			

	}

}
