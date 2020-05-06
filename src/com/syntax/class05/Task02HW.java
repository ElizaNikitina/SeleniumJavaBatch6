package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task02HW extends BaseClass{
	/*
	 * TC 2: Select and Deselect values 
	 * Open chrome browser 
	 * Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” 
	 * Click on “Input Forms” links 
	 * Click on “Select Dropdown List” links 
	 * Select value from “Select List Demo” section
	 * Verify value has been selected 
	 * Select 4 options from “Multi Select List Demo” 
	 * Deselect 1 of the option from the dd 
	 * Quit browser
	 */
	
public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Select Dropdown List']")).click();
		
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select = new Select(weekDD);
		
		List<WebElement> options = select.getOptions();
		for(WebElement opt: options) {
			String a = opt.getText();
			

			if (a.equals("Tuesday")) {
				opt.click();
				String ddText=opt.getText();
				if(ddText.equals("Tuesday")) {
					System.out.println("Tuesday is selected");
				}else {
					System.err.println("Tuesday is NOT selected");
				}

				Thread.sleep(3000);
				
			}
				
			}
		
		WebElement multiSel=driver.findElement(By.id("multi-select"));
		
		Select selectMul = new Select(multiSel);
		boolean isMultiple = selectMul.isMultiple();
		System.out.println("The DropDown is multi Select? " + isMultiple);
		
		
		if(isMultiple) {
			selectMul.selectByValue("California");
			selectMul.selectByValue("Washington");
			selectMul.selectByValue("Texas");
			selectMul.selectByValue("Pennsylvania");
			
			Thread.sleep(2000);
			
			selectMul.deselectAll();
			
		}
		
		Thread.sleep(3000);
		tearDown();
			
		}
		
}


