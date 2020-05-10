package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		
		System.out.println(text);
		
		/*
		 * We can switch to a frame using three different methods
		 * 1.ByIndex
		 * 2.By NameOrID
		 * 3.By WebElement
		 */
		
		//By index
		driver.switchTo().frame(0);
		WebElement name= driver.findElement(By.id("name"));
		name.sendKeys("Eliza");
		
		driver.switchTo().defaultContent(); //return in main menu
		Thread.sleep(3000);
		
		//By Name or ID
		driver.switchTo().frame("iframe_a");
		name.clear();
		name.sendKeys("Artem");
		
		driver.switchTo().defaultContent(); //return in main menu
		Thread.sleep(3000);
		
		//By WebElement
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		tearDown();
	}

}
