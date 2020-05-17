package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass { //inheritance functionality

	/**
	 * Method that clears and sends keys
	 * 
	 * @param element
	 * @param text
	 */

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Method check if radio/checkboxes are enabled and click it
	 * 
	 * @param radioOrCheckBox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox, String value) {

		String actualValue;

		for (WebElement el : radioOrcheckbox) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}

	/**
	 * Method that checks if text is there and then select it
	 * 
	 * @param element
	 * @param text
	 */
	public static void selectDdValue(WebElement element, String text) {

		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(text)) {
					select.selectByVisibleText(text);
					break;
				}
			}
		} catch (UnexpectedTagNameException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Method that selects value by index
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDdValue(WebElement element, int index) {
		try {
			Select select = new Select(element);

			int size = select.getOptions().size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Method that dismiss and catches exception if alert is not present
	 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method that gets text of alert and catches exception if alert is not present
	 * 
	 * @return
	 */

	public static String getAlertText() {
		String alertText = null;
		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertText;

	}

	/**
	 * Method that sends text of alert and catches exception if alert is not present
	 * 
	 * @return
	 */

	public static void sendAlertText(String text) {

		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(String nameOrId) { //polimorfism

		try {
			driver.switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(int index) {

		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}

	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
	
	
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js;
	}
	
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click()", element);
	}
	
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	/**
	 * Method that will scroll the page down based on the passed pixel parameters
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		getJSObject().executeScript("window.scrollBy(0,"+pixel+")");
	}
	
	/**
	 * Method that will scroll the page up based on the passed pixel parameters
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");
	}

}
