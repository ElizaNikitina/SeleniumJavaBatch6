package com.syntax.class04Asel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationComands {
	
	//navigate to facebook
	//click on "forget password
	
	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.navigate().to("http://facebook.com");
		Thread.sleep(1000);
		//navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		driver.quit();

		
	}
}
