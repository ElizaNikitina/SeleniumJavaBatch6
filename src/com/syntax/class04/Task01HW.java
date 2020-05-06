package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
                                                                               
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01HW {
	/*
	 * TC 1: HRMS Application Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username and password Click on login button Then verify Syntax Logo is
	 * displayed.
	 */

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

		boolean logoIsDesplayed = driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img")).isDisplayed();
		if (logoIsDesplayed) {
			System.out.println("Logo is Displayed, Test Case passed");
		} else {
			System.out.println("Logo is not Displayed, Test Case failed");
		}

		try {
			Thread.sleep(200);

		} catch (InterruptedException e) {
			System.out.println("Cached File");
		}

		driver.quit();
	}
}
