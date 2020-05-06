package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03HW {
	/*
	 * TC 3: Syntax Demo input boxes count: Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
	 * Forms” links Click on “Simple Form Demo” links Get all input boxes from the
	 * page Enter “Hello” to each text box Close browser
	 */

	public static String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Simple Form Demo']")).click();

		List<WebElement> allTextBoxes = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("Amaunt of boxes " + allTextBoxes.size());
		
		for(WebElement a: allTextBoxes) {
			a.sendKeys("Hello");
			
		}
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
