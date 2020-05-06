package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static String url = "https://www.amazon.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
		System.out.println("Size of all linkes on amazon " + allLinks.size());
		
		int count = 0;
		
		for(WebElement link :allLinks) {
			String text = link.getText();
			if(!text.isEmpty()) {
				//System.out.println(text);
				count++;
			}
		}
	System.out.println("total number of links with text is: " + count);
	driver.quit();
		
		
		
	}
}
