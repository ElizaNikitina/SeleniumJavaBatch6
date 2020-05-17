package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Task01 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// sending userName
		WebElement userName = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendText(userName, ConfigsReader.getProperty("username"));

		// sending password
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		sendText(lastname, ConfigsReader.getProperty("lastname"));

		WebElement phone = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		sendText(phone, ConfigsReader.getProperty("email"));

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		sendText(email, ConfigsReader.getProperty("email"));
		
		WebElement password = 	driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		

		WebElement days=driver.findElement(By.id("day"));
		selectDdValue(days, "30");
		
		WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month, 11);
		
		WebElement year=driver.findElement(By.id("year"));
		selectDdValue(year, "198h2");
		
		List<WebElement> sex=driver.findElements(By.name("sex"));
		clickRadioOrCheckbox(sex, "1");
		



		
		// click on login

		// close browser
		//tearDown();

	}

}
