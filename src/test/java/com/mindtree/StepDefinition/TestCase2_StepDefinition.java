package com.mindtree.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.TestCase1PageObjects;

import io.cucumber.java.en.*;



public class TestCase2_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Given("^User on Tide home page$")
    public void user_on_tide_home_page() throws Throwable {
		driver = Initialize();
		String url = prop.getProperty("url"); 
	    driver.get(url);
	    log.info("Successfully entered correct url");
        
    }

    @When("^User enter \"([^\"]*)\" to be searched in search field and presses search button$")
    public void user_enter_something_to_be_searched_in_search_field_and_presses_search_button(String strArg1) throws Throwable {
    	
    	driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys(strArg1);
    	driver.findElement(By.xpath("//*[@type='submit']")).click();
       
    }

    @Then("^Validate if any product named with Antibacterial is present or not$")
    public void validate_if_any_product_named_with_antibacterial_is_present_or_not() throws Throwable {
    	WebElement body = driver.findElement(By.tagName("strong"));
    	String bodyText = body.getText();
    	int count = 0;
    	while(bodyText.contains("Antibacterial")) {
    		count ++;
    		 bodyText = bodyText.substring(bodyText.indexOf("Antibacterial") + "Antibacterial".length());
    	}
    	System.out.println(count);
    	
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
        
    }

}
