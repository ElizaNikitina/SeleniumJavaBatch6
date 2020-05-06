package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	public static String url = "https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		System.out.println(maleRadio.getAttribute("class"));
		
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println("Radio button is selecyed " + maleRadio.isSelected());
		
		
		System.out.println("=====");
		//first way to click on a Radio button
		maleRadio.click();
		System.out.println("Radio button is selecyed " + maleRadio.isSelected());
		
		//second way to click on a Radio button
		List <WebElement> proList = driver.findElements(By.xpath("//input[@name='profession']"));
		System.out.println(proList.size());
		
		//
		String valueToBeSelected = "Manual Tester";
		for(WebElement profession : proList){
			if(profession.isEnabled()) {  //cheking is the chek-box is enabled
				String value = profession.getAttribute("value");   //get value of value attribute
				System.out.println(value);
				if(value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
			}
		}
		
		
	}
}
