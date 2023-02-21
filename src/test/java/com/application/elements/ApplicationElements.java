package com.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.framework.commons.WebCommons;

public class ApplicationElements  extends WebCommons {
	
	@FindBy(xpath="//div[@id='sciInPut']")
	protected WebElement textbox;
	
	@FindBy(xpath="//div[@id='sciOutPut']")
	protected WebElement AnsTextBox;


}
