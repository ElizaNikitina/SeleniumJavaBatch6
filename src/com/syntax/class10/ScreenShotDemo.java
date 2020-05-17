package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.BaseClass;

public class ScreenShotDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {

		setUp();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
		
		tearDown();

	}
}
