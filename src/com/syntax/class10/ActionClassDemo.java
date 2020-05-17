package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionClassDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.setUp();
		
		WebElement account = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account).perform();
		
		WebElement element= driver.findElement(By.xpath(""));
		if(element.getText().contains("Start")) {
			System.out.println("Menue displayed");
		}else {
			System.out.println("Menue did NOT displayed");
		}
		
		action.contextClick(element).perform();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'"));
		
		
		Thread.sleep(2000);
		BaseClass.tearDown();
		
		
		
	}

}
