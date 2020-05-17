package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class Task01DynamicTable extends CommonMethods {
	/*
	 * Open chrome browser Go to “http://166.62.36.207/syntaxpractice/” Click on
	 * “Table” link Click on “ITable Data Search” link Verify second table consist
	 * of 5 rows and 4 columns Print name of all column headers Print data of all
	 * rows Quit Browser
	 * 
	 */

	public static void main(String[] args) {

		setUp();

		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();

		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));

		System.out.println("Number of columns: " + cols.size());

		for (WebElement col : cols) {
			String colText = col.getText();
			System.out.print(colText + " ");
		}
		System.out.println(" ");
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());

		Iterator<WebElement> it = rows.iterator();
		while (it.hasNext()) {
			String text = it.next().getText();
			System.out.println(text);
		}

		// driver.close();
	}

}
