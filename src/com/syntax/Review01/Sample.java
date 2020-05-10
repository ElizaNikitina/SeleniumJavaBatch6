package com.syntax.Review01;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class Sample extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe")).click();
		driver.switchTo().frame("FrameOne");
	}
}
