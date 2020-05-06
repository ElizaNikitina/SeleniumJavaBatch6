package com.syntax.hw;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazonHW {
	public static String url = "https://www.amazon.com/";
	
	public static void main(String[] args) throws IOException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "\\ExcellData\\Amazon_test.xlsx";
		System.out.println(filePath);

		FileInputStream fileIS = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(filePath);

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Sheet sheet = book.getSheet("sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		Row row0 = sheet.getRow(0);
		int cells = row0.getLastCellNum();

		driver.get(url);
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']"));
		
		
		

	}
}
