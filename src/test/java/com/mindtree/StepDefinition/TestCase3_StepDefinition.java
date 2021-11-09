package com.mindtree.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mindree.reusableComponent.Base;
import com.mindtree.PageObject.TestCase3PageObjects;

import io.cucumber.java.en.*;

public class TestCase3_StepDefinition extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	 @Given("^User goes to the Tide website$")
	    public void user_goes_to_the_tide_website() throws Throwable {
		 driver = Initialize();
			String url = prop.getProperty("url"); 
		    driver.get(url);
		    log.info("Successfully entered correct url");
	    }

	    @When("^User cicks on Lear More$")
	    public void user_cicks_on_lear_more() throws Throwable {
	    	TestCase3PageObjects tc3 = new TestCase3PageObjects(driver);
	    	tc3.Learmore().click();
	    	log.info("Successfully clicked on Lear More");
	       
	    }

	    @Then("^User clicks on How to do laundry under How to wash clothes$")
	    public void user_clicks_on_how_to_do_laundry_under_how_to_wash_clothes() throws Throwable {
	    	TestCase3PageObjects tc3 = new TestCase3PageObjects(driver);
	    	tc3.Laundry().click();
	    	log.info("Successfully clicked on How to do Laundry");
	        
	    }

	    @And("^Validate if How to read laundry text is present or not$")
	    public void validate_if_how_to_read_laundry_text_is_present_or_not() throws Throwable {
	    	
	    	String value = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/div[2]/div[2]/div/div/div/div[7]/div/div[2]/div/a[1]/p")).getText();
	    	Assert.assertEquals(value, "How to Read Laundry Symbols");
	    	log.info("Successfully validated How to Read Laundry Symbols ");
	    	driver.close();
	    }

}
