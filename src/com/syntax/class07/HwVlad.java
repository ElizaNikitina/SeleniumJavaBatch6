package com.syntax.class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwVlad {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");

		driver.findElement(By.linkText("Alerts & Modals")).click();

		driver.findElement(By.linkText("Javascript Alerts")).click();

	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();        
	        Alert a1=driver.switchTo().alert();     
	        String txt1=a1.getText();
	        System.out.println(txt1);
	        Thread.sleep(1000);
	        a1.accept();
	        
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
	        Alert a2=driver.switchTo().alert();
	        String txt2=a2.getText();
	        System.out.println(txt2);
	        Thread.sleep(2000);
	        a2.accept();

		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[onclick*='Prompt']")).click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);

		String name = "Vlad";
		alert.sendKeys(name);
		Thread.sleep(1000);

		alert.accept();
		Thread.sleep(5000);

		/*
		 * Alert promptAlert = driver.switchTo().alert(); 
		 * String alertText = promptAlert.getText(); 
		 * System.out.println("Alert text is " + alertText); 
		 * promptAlert .sendKeys("Accepting the alert");
		 * Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		 * promptAlert .accept();
		 */

		Thread.sleep(3000);
		driver.quit();

	}

}
