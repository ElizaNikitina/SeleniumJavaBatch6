package com.syntax.class08;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TableDemo {
	public static void main(String[] args) {
		
		System.getProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		
		System.out.println("Number of rows: " + rows.size());
		
		Iterator<WebElement> it = rows.iterator();
		while(it.hasNext()) {
			String text = it.next().getText();
			System.out.println(text);
		}
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		
		System.out.println("Number of columns: " + cols.size());
		
		for(WebElement col: cols) {
			String colText=col.getText();
			System.out.println(colText);
		}
		
		driver.close();
	}
}
