package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task01HW extends BaseClass {
	/*
	 * TC 1: Amazon Department List Verification Open chrome browser Go to
	 * “http://amazon.com/” Verify how many department options available. Print each
	 * department Select Computers Quit browser
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp();
		WebElement department = driver.findElement(By.id("searchDropdownBox"));

		Select select = new Select(department);

		List<WebElement> departments = select.getOptions();
		System.out.println("Number of Department in the DD:: " + departments.size());

		for (WebElement dep : departments) {
			String depts = dep.getText();
			System.out.println(depts);

		}
		
		select.selectByValue("search-alias=computers");
		
	
		
			Thread.sleep(3000);
			tearDown();

		
	}
}
