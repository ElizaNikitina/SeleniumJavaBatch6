package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.setUp();
		WebElement multSelectDD = driver.findElement(By.id("continentsmultiple"));
		
		Select select = new Select(multSelectDD);
		
		boolean isMultiple = select.isMultiple();
		System.out.println("The DropDown is multi Select? " + isMultiple);
		
		if(isMultiple) {
			select.selectByIndex(1);
			select.selectByIndex(2);
			select.selectByIndex(3);
			select.selectByVisibleText("North America");
			Thread.sleep(2000);
			
			//select.deselectByIndex(1);
			select.deselectAll();
			
		}

		Thread.sleep(3000);
		tearDown();
		
		
	}

}
