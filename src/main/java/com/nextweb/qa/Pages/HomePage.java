package com.nextweb.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.nextweb.qa.Base.TestBase;

public class HomePage extends TestBase{

	
	//=================Declaraton=======================
	//================Repository=============
	@FindBy(xpath="//button[@aria-label='Close']") private WebElement popup;
	@FindBy(xpath="//input[contains(@id,'header-big-screen-search-box')]") private WebElement searchBox;
	@FindBy(xpath="//button[contains(@class,'SubmitButton')]") private WebElement searchBtn;
	@FindBy(xpath="//div[@class='header9']/div/a") private WebElement myAccLink;
//	@FindBy(xpath="") private WebElement element;
//	@FindBy(xpath="") private WebElement element;
//	@FindBy(xpath="") private WebElement element;
//	@FindBy(xpath="") private WebElement element;
	@FindBy(xpath="//a[text()='View mobile site']") private WebElement mobsite;
	@FindBy(xpath="//h3[text()='© 2022 Next Retail Ltd. All rights reserved.']") private WebElement AllritsResv;
	
	@FindBys({@FindBy(xpath="//div[contains(@class,'footer153')]//ul/li")}) private  List<WebElement> footerlinks;
	@FindBys({@FindBy(xpath="//ul[@id='snail-trail-container']//li")}) private List<WebElement> prodtlist;
	//14
	
	
	
	//========== Intitialize Using constructor=================
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//=======================Validation assertions==============
	
	public void HomePagePopupHandle() {
		popup.click();
		
	}
	
	public void VerifyNextHomepageMyaccountLink() {
		Assert.assertTrue(false, null);
	}

	
}
