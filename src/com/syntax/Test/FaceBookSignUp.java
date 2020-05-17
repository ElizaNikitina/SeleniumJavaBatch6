package com.syntax.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class FaceBookSignUp extends CommonMethods {
/*
 * Using functions Only sign up to Facebook
 */
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement monthDD = driver.findElement(By.id("day"));
		Select obj = new Select (monthDD);
		obj.selectByVisibleText("June");
		
		Thread.sleep(2000);
		
	}
	
	
}