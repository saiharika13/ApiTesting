package com.selenium;

import org.testng.annotations.Test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class activity2 {
	private static WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://webapps.tekstac.com/Shopify/");
	  driver.findElement(By.id("firstname")).sendKeys("rahul");
	  driver.findElement(By.id("lastname")).sendKeys("dravid");
	  driver.findElement(By.id("username")).sendKeys("rahul dravid");
	  Select dropdown= new Select(driver.findElement(By.xpath("//select[@id='selectcity']")));
	  dropdown.selectByValue("mas");
	  driver.findElement(By.id("pass")).sendKeys("dravid");
	  driver.findElement(By.id("reg")).submit();
  }
	 
      
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SJOKKOJU\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() { 
	  driver.close();
  }
}