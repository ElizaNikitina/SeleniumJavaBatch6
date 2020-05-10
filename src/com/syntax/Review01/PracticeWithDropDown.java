package com.syntax.Review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticeWithDropDown extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		List<WebElement> allDDs = driver.findElements(By.tagName("a"));
		for(WebElement oneDD: allDDs) {
			String dd = oneDD.getText();
			System.out.println(dd);
			if(dd.equals("Alerts & Modals")) {
				oneDD.click();
				Thread.sleep(3000);	
			}
			if(dd.equals("Javascript Alerts")) {
				oneDD.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		List<WebElement> listOfDD = driver.findElements(By.tagName("li"));
		for(WebElement oneItem: listOfDD) {
			String item = oneItem.getText();
			
			
			if(item.equals("Morbi leo risus")) {
				oneItem.click();
				break;
			}
		}
		
		Thread.sleep(1000);

		tearDown();
	}

}
