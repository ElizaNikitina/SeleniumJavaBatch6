package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class FrameRecap {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.setUp();  //http://166.62.36.207/syntaxpractice/bootstrap-iframe.html

		driver.manage().window().maximize();
		Thread.sleep(1000);

//		driver.switchTo().frame("FrameOne");
//		boolean logoIsDis = driver.findElement(By.id("hide")).isDisplayed();
		
		boolean isHomeDis=driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		System.out.println("Is Home link Displayed? " + isHomeDis);
		Thread.sleep(1000);

		driver.switchTo().frame("FrameOne");
		Thread.sleep(1000);

		String welcomeMsge = driver.findElement(By.xpath("//h3[text()='Welcome to Selenium Easy ']")).getText();
		System.out.println(welcomeMsge);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		Thread.sleep(1000);

		boolean buttonEnabled = driver.findElement(By.xpath("//a[@class='enroll-btn']")).isEnabled();
		System.out.println("Is enrol Btn enabled? " + buttonEnabled);
		Thread.sleep(1000);

		
	}

}
