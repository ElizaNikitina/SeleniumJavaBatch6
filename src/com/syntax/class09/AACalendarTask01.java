package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AACalendarTask01 {
	/*
	 * Open chrome browser 
	 * Go to “https://www.aa.com/homePage.do” 
	 * Enter From and To
	 * Select departure as July 14 of 2020 
	 * Select arrival as November 8 of 2020
	 * Close browser
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();

		
		driver.findElement(By.id("aa-leavingOn")).click();

		String departDay = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		
		while (!departDay.equals("July 2020")) {
			driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]")).click();
			Thread.sleep(2000);
			departDay = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		
		List<WebElement> departCells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
		// loop through td of depart calendar and grab the text and validate
		for (WebElement departCell : departCells) {
			String departText=departCell.getText();
			if(departText.equals("14")) {
				departCell.click();
				break;
			}
		}
		
		driver.findElement(By.id("aa-returningFrom")).click();
		
		String returnDay = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while (!returnDay.equals("November 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			departDay = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		
		List<WebElement> returnCells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		// loop through td of depart calendar and grab the text and validate
		for (WebElement returnCell : returnCells) {
			String departText=returnCell.getText();
			if(departText.equals("8")) {
				returnCell.click();
				break;
			}

	}
	}

}
