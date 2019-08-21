package com.Tarte.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tarte.PageObjetcs.HomePage;
import TestUtil.TestUtil;

public class SmokeTestCases {

	WebDriver driver;
	HomePage objHomePage=new HomePage(driver);
	TestUtil util= new TestUtil(); 
@BeforeTest

public void setup(){
	util.IntialseDriver();
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    driver.get("http://live.guru99.com/index.php/");
 
    }

  @Test
  public void validateHomePageTitle() throws Exception {
	  
	  if (util.CheckImage(objHomePage.pageTitle)){
		  System.out.println("Image is present");
	  }
	  else{
		  System.out.println("Image not present");
	  }
  }
}
