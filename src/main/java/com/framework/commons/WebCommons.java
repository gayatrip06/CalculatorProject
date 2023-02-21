package com.framework.commons;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.webdriver.WebDriverClass;

public class WebCommons {

	public WebDriver driver = new WebDriverClass().getDriver();

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void enterNo(WebElement element, String value) {
		element.sendKeys(value);
	}

	public String getElementText(WebElement element) {
		return element.getText();
	}

}
