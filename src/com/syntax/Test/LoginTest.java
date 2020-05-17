package com.syntax.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{
	/*
	 * User should be able to login to the application with valid credential
	 */
	
	public static void main(String[] args) {
		
		setUp();
		
		//sending userName
		WebElement userName = driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		//sending password
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
			
		//click on login
		
		//close browser
		tearDown();
	}
}
