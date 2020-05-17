package com.syntax.Review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class HanglingAlerts extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement alertButton = driver.findElement(By.id("alert"));
		alertButton.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement timingAlertButton = driver.findElement(By.xpath("//button[text()='Timing Alert']"));
		timingAlertButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(2000);
		alert.accept();
	}

}
