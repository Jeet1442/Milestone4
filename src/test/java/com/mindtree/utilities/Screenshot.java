package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindree.reusableComponent.Base;

public class Screenshot extends Base {
	public void getScreenshot(String result) throws IOException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(scr, new File("C:\\Users\\Debjeet\\eclipse-workspace\\Cucumber_Practice\\ScreenShots\\"+result+System.currentTimeMillis()+"screenshot.png"));
	}

}
