package com.nextweb.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

	//  1. Utility for screenshot
	
	public static void getscreenshot(WebDriver driver,String websitename) throws IOException {
		//webname  on which website you taking screenshot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d= new Date();  //for naming use date and time Thu Jul 28 12:31:27 IST 2022
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".png";
		
		File destination =new File("F:\\Software Testing\\ScreenshotSelenium\\"+websitename+filename);
		FileUtils.copyFile(source, destination);
	
	}
	
	// 2. Utility for Excel sheet
	
	public static String datafromexcel(String Sheetname, int row, int colm) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\Software Testing\\Excels folder\\my excels.xlsx");
		String value = WorkbookFactory.create(file).getSheet(Sheetname).getRow(row).getCell(colm).getStringCellValue();
		
		return value;
	
	}
	
	// 3. Drawing the border around element by javascript executor
	
	public static void borderbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);

	}
	
	//4. Capture the title of webpage
	
	public static String titlebyJS(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String Title = js.executeScript("return document.title;").toString();
		return Title;
	}
	
	//5. Click on particular element
	public static void clickbyJS(WebDriver driver,WebElement element) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	// 6. To generate an alert
	public static void alertbyJS(WebDriver driver, String message) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	// 7.Refreshing the page
	public static void refreshbyJS(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	//8. Scrolling web page
	public static void scrolldownbyJs(WebDriver driver, int x, int y) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");

	}
	//9. scroll up webpage
	public static void scrollupbyJs(WebDriver driver, int x, int y) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");

	}

	public static void scrollintoviewbyJs(WebDriver driver,WebElement element) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	
}
