package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04HW {
	/*
	 * TC 4: Radio Buttons Practice Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
	 * Forms” links Click on “Radio Buttons Demo” links Click on any radio button in
	 * “Radio Button Demo” section. Verify correct radio is clicked
	 * 
	 * Click on any radio button in “Group Radio Buttons Demo” section. Verify
	 * correct checkbox is clicked Quit browser
	 */

	public static String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();

		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));

		System.out.println(maleRadio.getAttribute("class"));

		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println("Radio Button Demo is selecyed " + maleRadio.isSelected());

		maleRadio.click();
		System.out.println("Radio Button Demo selecyed " + maleRadio.isSelected());

		maleRadio = driver.findElement(By.xpath("//input[@value='Female' and @name='gender']"));

		System.out.println(maleRadio.getAttribute("class"));

		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println("Group Radio Buttons Demo is selecyed " + maleRadio.isSelected());

		maleRadio.click();
		System.out.println("Group Radio Buttons Demois selecyed " + maleRadio.isSelected());

		maleRadio = driver.findElement(By.xpath("//input[@value='15 - 50' and @name='ageGroup']"));

		System.out.println(maleRadio.getAttribute("class"));

		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println("Group Radio Buttons Demo Age is selecyed " + maleRadio.isSelected());

		maleRadio.click();
		System.out.println("Group Radio Buttons Demo Age is selecyed " + maleRadio.isSelected());

		Thread.sleep(2000);

		driver.quit();

	}
}
