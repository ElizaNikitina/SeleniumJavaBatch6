package com.syntax.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task01HW extends BaseClass {
	/*
	 * TC 1: JavaScript alert text verification 
	 * Open chrome browser 
	 * Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” 
	 * Click on “Alerts & Modals” links 
	 * Click on “Javascript Alerts” links 
	 * Click on button in “Java Script Alert Box” section 
	 * Verify alert box with text “I am an alert box!” is  present
	 * Click on button in “Java Script Confirm Box” section
	 * Verify alert box with text “Press a button!” is present 
	 * Click on button in “Java Script Alert Box” section 
	 * Enter text in the alert box 
	 * Quit browser
	 */
	
		public static void main(String[] args) throws InterruptedException {
			setUp();// http://jiravm.centralus.cloudapp.azure.com:8081/index.html
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			List<WebElement> allDDs = driver.findElements(By.tagName("a"));
			for(WebElement oneDD: allDDs) {
				String dd = oneDD.getText();
				System.out.println(dd);
				if(dd.equals("Alerts & Modals")) {
					oneDD.click();
					Thread.sleep(3000);
				}
				if(dd.equals("Javascript Alerts")) {
					oneDD.click();
					break;
				}
			}
			Thread.sleep(3000);

			tearDown();
		}
	}

