package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver drive = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
		String actualurl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebookj.com";
		
		if(actualurl.equalsIgnoreCase(expectedUrl)) {
			String title = driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong Url is returned");
		}
		
//		Thread.sleep(2000);
//		driver.close();
		
	}
}
