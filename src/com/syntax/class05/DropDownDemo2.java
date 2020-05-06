package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement continent = driver.findElement(By.id("continents"));

		Select select = new Select(continent);

		List<WebElement> options = select.getOptions(); // it will return list of all options in the DD

		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);

			if (text.equals("Africa")) {
				option.click();
				String ddText=option.getText();
				if(ddText.equals("Africa")) {
					System.out.println("Africa is selected:: ");
				}else {
					System.err.println("Africa is NOT selected:: ");
				}

				Thread.sleep(3000);
			//	select.selectByVisibleText("Antarctica");  //you can select by visible text
			}
			
		}
		
		boolean isMultiple = select.isMultiple();
		System.out.println("The continents dd is multiple " + isMultiple);

		Thread.sleep(3000);
		tearDown();

	}
}
