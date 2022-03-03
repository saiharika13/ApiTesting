package com.selenium;

import org.testng.annotations.Test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class activity1 {
	private static WebDriver driver;
	
  @Test
  public void f(String name,String num) {
	  driver.get("https://webapps.tekstac.com/InvoiceUpdates/");
	  driver.findElement(By.id("name")).sendKeys(name);
	  driver.findElement(By.id("number")).sendKeys(num);
	  driver.findElement(By.id("newUser")).click();
	  Select dropdown= new Select(driver.findElement(By.xpath("//tbody//tr//td//select")));
	  dropdown.selectByValue("utility invoice");
	 
      driver.findElement(By.name("amount")).sendKeys("1000");
      driver.findElement(By.name("num")).sendKeys("9876543210");
      driver.findElement(By.name("comments")).sendKeys("New user invoice");
      driver.findElement(By.id("submit")).submit();
      String text= driver.findElement(By.id("result")).getText();
      System.out.println(text);
  }
 @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\JOKKOJU\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() { 
	  driver.close();
  }

}