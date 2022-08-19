package com.nextweb.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	
	public void CrossBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}else {
			System.out.println("User selected wrong browser");
		}

		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
	}

	
	
}
