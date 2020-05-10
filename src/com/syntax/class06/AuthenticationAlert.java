package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
	public static void main(String[] args) {
		
		/*
		 * Actual url = http://abcdatabase.com/basicauth
		 * userName = test
		 * password = test
		 */

		// making connection to the drivers/chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		// opening the browser by calling the constructor of ChromeDriver class and
		// upcasting
		WebDriver driver = new ChromeDriver();

		driver.get("http://test:test@abcdatabase.com/basicauth");
	}
}