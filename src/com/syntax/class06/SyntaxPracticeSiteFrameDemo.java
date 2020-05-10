package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.setUp();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame("FrameOne");
		boolean logoIsDis = driver.findElement(By.id("hide")).isDisplayed();
		
		System.out.println("Logo inside frame is displayed " +logoIsDis);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("FrameTwo");
		boolean isEnabled = driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Enrol Button inside frame two is Enabled " + isEnabled);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
			 
		
		Thread.sleep(3000);
		BaseClass.tearDown();
		
		
	}

}
