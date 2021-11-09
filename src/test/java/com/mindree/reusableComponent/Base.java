package com.mindree.reusableComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver; // so that we can use driver anywhere by creating driver object only once.
	public Properties prop; //so that prop can be used in other class also to access properties files.
	
	public WebDriver Initialize() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Debjeet\\eclipse-workspace\\Cucumber_Practice\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		//String driver_path = prop.getProperty("driver");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Debjeet\\eclipse-workspace\\Cucumber_Practice\\Driver\\chromedriver.exe" );
	    driver = new ChromeDriver();
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	

}
