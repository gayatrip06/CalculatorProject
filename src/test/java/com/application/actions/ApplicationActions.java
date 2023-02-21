package com.application.actions;

import java.util.Properties;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.application.elements.ApplicationElements;
import com.framework.utilities.ReadProp;
import com.framework.webdriver.WebDriverClass;

public class ApplicationActions extends ApplicationElements {
Properties prop = ReadProp.readData("Config.properties");
	
	public void launchapplication() {
		driver.get(prop.getProperty("url"));	
	}
		
	public void covStrToNu(String stn){    
		stn=stn.trim();
	  for (int i = 0; i < stn.length(); i++) {		
         char c = stn.charAt(i);  
        WebElement num = driver.findElement((By.xpath("//span[text()='"+c+"']")));
       num.click();
	  }	 
	  
	}	    
	
	public void checkAddAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox), expAns);
	}
	
	public void checkSubAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox), expAns);
	}
	public void checkMulAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox),expAns);
	}
	public void checkDivAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox), expAns);
	}
	
	public static ApplicationActions getApplicationPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), ApplicationActions.class);
	}
	
}
