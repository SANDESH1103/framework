package com.crm.qa.testcases;


import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilitis.XlUtilities;

public class LoginPage {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://classic.freecrm.com/login.cfm");
    }
    @DataProvider
     public Object[][] loginData() {
	Object data[][] = XlUtilities.data("Invalid");
	return data;
    }
    @Test(dataProvider = "loginData")
    public void logintest(String username, String password) {
	
	driver.findElement(By.xpath("//input[@placeholder='Login']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @AfterMethod
    public void tearDown() {
	driver.quit();
    }
}
