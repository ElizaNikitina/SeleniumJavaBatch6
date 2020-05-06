package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		

		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select = new Select(weekDD);
		
		/*
		 * Selenium provides three different way to select a value from a DD
		 * 1.byIndex();
		 * 2.byVisibleText(String str);
		 * 3.byValue
		 */
		List<WebElement> options = select.getOptions();
		System.out.println("Number of Options in the DD:: " + options.size());
		
		select.selectByIndex(3);
		
		for(int a=0; a>options.size(); a++) {
			select.selectByIndex(a);
			Thread.sleep(1000);
			
			
		
		}
		
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
	}

}
