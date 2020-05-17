package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class HWTask01DynamicTable extends CommonMethods{
	/*
	 * Open chrome browser 
	 * Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx” 
	 * Login to the application
	 * Verify customer “Susan McLaren” is present in the table 
	 * Click on customer details 
	 * Update customers last name and credit card info
	 * Verify updated customers name and credit card number is displayed in table 
	 * Close browser
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectValue="Susan McLaren";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for(WebElement row: rows) {
			if(row.getText().contains(expectValue)) {
				System.out.println(expectValue + " is present in the table");
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();
		
			String updateValue = "Susan Smith";
			String updateCardValue = "999777888666";
			
			WebElement newName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
			sendText(newName, updateValue);
			
			WebElement newCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
			sendText(newCard, updateCardValue);
			
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
			
			List<WebElement> newRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
			
			for(WebElement newRow: newRows) {
				String newInfo = newRow.getText();
				if(newInfo.contains(updateCardValue) && newInfo.contains(updateValue)) {
					System.out.println("Info Last name and Card Number was update");
				}else {
					System.out.println("Test case failed");
				}
			}
		
			tearDown();
	}
}

