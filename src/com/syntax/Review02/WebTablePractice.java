package com.syntax.Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://testingpool.com/data-types-in-java/");
			
			
			
			List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class, 'su-table')]//table/tbody/tr"));
			int rowNums = rows.size();
			System.out.println("Total number of rows is " + rowNums);
			
			List<WebElement> cols = driver.findElements(By.xpath("//div[contains(@class, 'su-table')]//table/tbody/tr[1]/td"));
			int colNums = cols.size();
			System.out.println("Total number of columns is " + colNums);
			
			for(int i=1; i<rows.size(); i++) {
				for(int j=1; j<cols.size();j++) {
					WebElement cellData = driver.findElement(By.xpath("//div[contains(@class, 'su-table')]//table/tbody/tr["+i+"]/td["+j+"]"));
					String cellDataText = cellData.getText();
				//	System.out.println(cellDataText);
					if(j==2) {
						System.out.println(cellDataText);
					}
				}
			}
			
			
	}

}
