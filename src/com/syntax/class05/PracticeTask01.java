package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class PracticeTask01 extends BaseClass {
	/*
	 * Open chrome browser 
	 * Go to “https://www.facebook.com” 
	 * Verify: month dd has 12
	 * month options day dd has 31 day 
	 * options year dd has 115 year options 
	 * Select your date of birth
	 * Quit browser
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.setUp();

		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByValue("30");

		WebElement month = driver.findElement(By.id("month"));
		select = new Select(month);
		select.selectByValue("11");

		WebElement year = driver.findElement(By.id("year"));
		select = new Select(year);
		select.selectByValue("1982");

		Thread.sleep(3000);
		tearDown();

	}
}
