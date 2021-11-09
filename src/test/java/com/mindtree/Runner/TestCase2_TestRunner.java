package com.mindtree.Runner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src//test//resources//Features//login.feature",
			glue = "com.mindtree.StepDefinition"
			
			)

public class TestCase2_TestRunner extends AbstractTestNGCucumberTests {
	

}
