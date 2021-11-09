package com.mindtree.utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener {
	Screenshot ss = new Screenshot();
	public void onTestFailure(ITestResult result) {
		try {
			ss.getScreenshot(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	

}
