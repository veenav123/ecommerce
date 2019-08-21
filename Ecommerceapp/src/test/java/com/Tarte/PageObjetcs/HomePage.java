package com.Tarte.PageObjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestUtil.TestUtil;

public class HomePage {
	
	WebDriver driver;
	TestUtil util=new TestUtil();
	
	@FindBy(xpath="//*[@class='logo']//*[@id='header']")
	public WebElement pageTitle;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
}
