package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02HW {
	/*
	 * TC 2: HRMS Application Negative Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username Leave password field empty Verify error message with text
	 * “Password cannot be empty” is displayed.
	 */

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		boolean errorMessage = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).isDisplayed();

		if (errorMessage) {
			System.out.println("Password cannot be empty.  Test Case failed");
		} else {
			System.out.println("Password correct. Test case passed");
		}

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			System.out.println("Cached File");
		}

		driver.quit();
	}

}
