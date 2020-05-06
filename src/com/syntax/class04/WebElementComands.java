package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementComands {
	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static String userName = "Tester";
	public static String password = "test";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		WebElement userNam = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		
		userNam.sendKeys(userName);
		
		Thread.sleep(3000);
		userNam.clear();
		userNam.sendKeys(userName);
		
		WebElement pass = driver.findElement(By.cssSelector("input[name*='$password']"));
		
		//pass.clear();
		Thread.sleep(3000);
		pass.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
		loginBtn.click();
		
		boolean logoIsDesplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		if(logoIsDesplayed) {
			System.out.println("Logo is Displayed, Test Case passed");
		}else {
			System.out.println("Logo is not Displayed, Test Case failed");
		}
		
		WebElement loginInfo = driver.findElement(By.xpath("//div[@class='login_info']"));
		String text = loginInfo.getText();
		if(text.contains(userName)) {
			System.out.println("User Successfully logged in. Tast case passed");
		}else {
			System.out.println("User is not logged in. Tast case failed");
		}
		
		
		
		driver.quit();
		
		

	}
}
