package com.syntax.class07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass {


    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
        driver.manage().window().maximize();
		Thread.sleep(1000);
		
        driver.findElement(By.linkText("Alerts & Modals")).click();
        
        driver.findElement(By.linkText("Javascript Alerts")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();        
        Alert a1=driver.switchTo().alert();     
        String txt1=a1.getText();
        System.out.println(txt1);
        Thread.sleep(1000);
        a1.accept();
        
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
        Alert a2=driver.switchTo().alert();
        String txt2=a2.getText();
        System.out.println(txt2);
        Thread.sleep(2000);
        a2.accept();
        
        String name="Vlad";
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        
        Alert a3=driver.switchTo().alert(); 
        a3.sendKeys(name);
        a3.accept();
        Thread.sleep(2000);
       // driver.findElement.click();
        String text = driver.findElement(By.id("prompt-demo")).getText();
		System.out.println("Text added to alert box:: "+text); 

		if (text.contains(name)) {
			System.out.println("Text "+name+" was successfully added");
		}else{
			System.err.println("Text "+name+" was not entered");
		}
  
        Thread.sleep(3000);
        driver.quit();
        
        
      
        Thread.sleep(3000);
       // driver.quit();
        
        
                
        
    }


}
