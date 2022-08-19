package com.nextweb.qa.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nextweb.qa.Base.TestBase;
import com.nextweb.qa.Pages.HomePage;
import com.nextweb.qa.Utility.Utils;


public class HomePageTest extends TestBase {
	
	@BeforeClass
	public void setupBrowser() {
		CrossBrowser("chrome");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void NextHomePageTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage hp =new HomePage(driver);
		
		hp.HomePagePopupHandle();
		
	}
	
	
	@AfterMethod
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
			Utils.getscreenshot(driver, "NextFailed");
		}
	}
	
	
	
	

}
