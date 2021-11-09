package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.TestCase3UI;

public class TestCase3PageObjects {
	WebDriver driver;
	
	public TestCase3PageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Learmore() {
		return driver.findElement(TestCase3UI.Learmore);
	}
	
	public WebElement Laundry() {
		return driver.findElement(TestCase3UI.laundry);
	}

}
