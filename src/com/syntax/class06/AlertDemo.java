package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws ElementClickInterceptedException, InterruptedException {
		
		WebDriver driver = setUp();   //uitestpractice.com
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("confirm")).click();
		
		//Handling simple alert/PopUps
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		String simpleAText = simpleAlert.getText();
		System.out.println("This is simple alert text " + simpleAText);
		Thread.sleep(1000);
		simpleAlert.accept();
		Thread.sleep(1000);
		//Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmAText = confirmAlert.getText();
		
		System.out.println("This is Confirm alert text " + confirmAText);
		Thread.sleep(1000);
		confirmAlert.dismiss();
		
		
		//Handling Promp alerts/confirmation alert by providing come confirmation message
		
		driver.findElement(By.id("promt")).click();
		Alert promtAlert=driver.switchTo().alert();
		String a = promtAlert.getText();
		System.out.println("This is promt alert text " + a);
		promtAlert.sendKeys("Alex");
		promtAlert.accept();
		
		String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		
		if(text.contains("Alex")) {
			System.out.println("Text was successfuly added");
		}else {
			System.out.println("Text was NOT added");
		}
		
		tearDown();
	}
}
