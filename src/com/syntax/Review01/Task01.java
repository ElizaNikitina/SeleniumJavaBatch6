package com.syntax.Review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task01 extends BaseClass{

	/*
	 * Go to amazon.com
	 * select books from the search dropdown
	 * type Harry potter
	 * and click on Search
	 * check Unofficial CookBook checkbox on the left under Book Series
	 */
	
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement department = driver.findElement(By.id("searchDropdownBox"));

		Select select = new Select(department);

		List<WebElement> departments = select.getOptions();
		for (WebElement dep : departments) {
			String depts = dep.getText();
		
			select.selectByVisibleText("Books");
			//if (depts.contentEquals("Books")) {
			//	dep.click();
				
			WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox")); //sendKeys("Harry Potter");
			searchTextBox.sendKeys("Harry Potter");
			
			WebElement seachButton = driver.findElement(By.xpath("//input[@type='submit'] [@class='nav-input']"));
			seachButton.click();
			
			
			List<WebElement> bookSeriesCheckboxes = driver.findElements(By.className("a-spacing-micro"));
			for(WebElement bookSeriesCheckbox:bookSeriesCheckboxes) {
				String checkboxText = bookSeriesCheckbox.getText();
				if(!bookSeriesCheckbox.isSelected() && checkboxText.equals("Unofficial Cookbook")) {
					
					Thread.sleep(2000);
					bookSeriesCheckbox.click();
					break;
				}
			}
			
//			WebElement check=	driver.findElement(By.xpath("//*[text()='Unofficial Cookbook']"));
//			check.click();	
//			
		
			List<WebElement> bookUnofficialpages = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
			System.out.println("Amaunt of Unofficial cook books id " + bookUnofficialpages.size());
			for(WebElement bookUnofficialpag :bookUnofficialpages) {
				
				String nameOfBook = bookUnofficialpag.getText();
				System.out.println(nameOfBook);
			}
		
		Thread.sleep(3000);

		//tearDown();
	}
}
}
