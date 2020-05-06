package com.syntax.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWMercuryTourXPath {
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
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(prop.getProperty("firsName"));
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(prop.getProperty("lastame"));
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(prop.getProperty("phone"));
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(prop.getProperty("userName"));
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(prop.getProperty("address1"));
			driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(prop.getProperty("address2"));
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(prop.getProperty("city"));
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(prop.getProperty("state"));
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(prop.getProperty("postalCode"));
			driver.findElement(By.xpath("//select[@name='country']")).sendKeys(prop.getProperty("country"));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("email"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(prop.getProperty("confirmPassword"));
			
			driver.findElement(By.xpath("//input[@name='register']")).click();
			

			Thread.sleep(3000);
			
			
			driver.quit();
		
			

	}

}
