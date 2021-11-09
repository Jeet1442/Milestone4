package com.mindtree.Runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.TestCase1PageObjects;


public class TestCase1  extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = Initialize();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Url working fine");
		
	}
	
	@Test
	public void Case1() {
		TestCase1PageObjects tc1 = new TestCase1PageObjects(driver);
		WebElement move = tc1.searchbar();
		
		Actions a = new Actions(driver); 
		a.moveToElement(move).build().perform();
		a.moveToElement(tc1.powder()).click().build().perform();
		
		driver.findElement(By.xpath("//img[contains(@alt,'Tide Free and Gentle Powder')]")).click();
		log.info("Verified the product as it clicked on the product name hence the product is present");
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}
