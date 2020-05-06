package com.syntax.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AmazonTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath = "\\Users\\Ёлиза\\eclipse-workspace\\SeleniumJavaBatch6\\config\\Amazon.properties";
	    FileInputStream amazon = new FileInputStream(filePath);
	    
		Properties prop=new Properties();
		prop.load(amazon);
		String browser = prop.getProperty("browser");
		
		WebDriver driver = null;
		
		switch(browser.toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(prop.getProperty("name"));
		
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("ap_password_check")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("continue")).click();
		
		//Thread.sleep(3000);
		
		
	
	}

}
