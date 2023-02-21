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

import io.cucumber.core.exception.CucumberException;

public class ApplicationActions extends ApplicationElements {
Properties prop = ReadProp.readData("Config.properties");
	
	public void launchapplication() {
		driver.get(prop.getProperty("url"));	
	}
		
	public void covStrToNu(String stn) throws CucumberException {    
		stn=stn.trim();
	  for (int i = 0; i < stn.length(); i++) {		
         char c = stn.charAt(i);  
 //instead of using "-" (ASCII 45) symbol in xpath dev has used "–"(ASCII 8211) which is directly unavailable in keyboard, so unable to catch xpath in automation. If that is changed in website then we can use negative inegers as well
         if(c == '–'){
        	  WebElement num1 = driver.findElement((By.xpath("//span[text()='–']")));
        	  num1.click();
         }
        WebElement num = driver.findElement((By.xpath("//span[text()='"+c+"']")));
       num.click();
	  }	 	  
	}	    
	
	public void checkMulAns(int expAns) {		
		Assert.assertEquals(getElementText(AnsTextBox),expAns);
	}
	public void checkDivAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox), expAns);
	}	
	
	public void checkAddAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox), expAns);
		
	}	
	public void checkSubAns(int expAns) {
		Assert.assertEquals(getElementText(AnsTextBox), expAns);
	}
	
	public static ApplicationActions getApplicationPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), ApplicationActions.class);
	}
	
}
