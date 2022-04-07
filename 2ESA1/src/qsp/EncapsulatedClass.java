package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapsulatedClass {
	private WebElement googleTb;  //declaration

	public EncapsulatedClass(WebDriver driver) {
		googleTb = driver.findElement(By.name("q")); //Initialization

	}

	public void test(String st) {
		googleTb.sendKeys(st); //utilization

	}
}
