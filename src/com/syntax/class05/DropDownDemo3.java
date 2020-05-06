package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		WebElement continents = driver.findElement(By.id("continents"));

		Select select = new Select(continents);
		
		select.selectByValue("AUS");
		
		List<WebElement> options = select.getOptions();
		
		 for(WebElement option: options)  { 
			 String text = option.getText();
		  System.out.println(text);
		  }
		 
//		Iterator <WebElement> it = select.getOptions();
//		while(it.hasNext()) {
//			String text = it.next().getText();
//			System.out.println(text);
//		}

		Thread.sleep(3000);
		tearDown();
		

	}
}
