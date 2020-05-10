package com.syntax.Review01;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task01HW extends BaseClass{
	/*
	 * Go to facebook.com 
	 * Verify “Create a new account” is Displayed 
	 * Fill out First name, lastname, email, new password 
	 * Select your birthday from given dropdowns
	 * Select gender 
	 * Click sign up
	 */

	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	boolean logoIsDesplayed = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")).isDisplayed();	
		if(logoIsDesplayed) {
			System.out.println("Create a new account is displayed");
		}else {
			System.out.println("Create a new account is NOT displayed");
		}
		
		
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Eliza");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nikitina");	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("eliza@gmail.com");	
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("eliza@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("qwerty");
	
	Thread.sleep(1000);
	

	
	WebElement days=driver.findElement(By.id("day"));
	Select select = new Select(days);
	List<WebElement> day = select.getOptions();
	select.selectByIndex(30);
	
	
	WebElement monthes=driver.findElement(By.id("month"));
	 select = new Select(monthes);
	List<WebElement> month = select.getOptions();
	select.selectByVisibleText("íîÿ");
	
	WebElement years=driver.findElement(By.id("year"));
	 select = new Select(years);
	List<WebElement> year = select.getOptions();
	select.selectByValue("1982");
	
	WebElement sex = driver.findElement(By.xpath("//input[@type='radio'][@value='1']"));
	sex.click();
	
	driver.findElement(By.id("u_0_13")).click();
	
	Thread.sleep(5000);
	
	
	boolean errorReg = driver.findElement(By.id("reg_error_inner")).isEnabled();
	if(errorReg) {
		driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("VeryLongAndSafePassword");
	}
	
	driver.findElement(By.id("u_0_13")).click();
	}
	
	
}
