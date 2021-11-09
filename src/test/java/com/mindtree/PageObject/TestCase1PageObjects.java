package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.TestCase1UI;

public class TestCase1PageObjects {
	
	WebDriver driver;
	public TestCase1PageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement searchbar() {
		return driver.findElement(TestCase1UI.searchbar);
	}
	
	public WebElement powder() {
		return driver.findElement(TestCase1UI.powder);
	}
	
	

}
