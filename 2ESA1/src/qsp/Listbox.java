package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\ChromeDriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///D:/WEB%20TECH/Project/Listbox.HTML");
    WebElement  tagLB=driver.findElement(By.id("tag"));
    Select s1= new Select(tagLB);
    s1.selectByIndex(0);
    Thread.sleep(2000);
    s1.selectByValue("vp");
    Thread.sleep(2000);
    s1.selectByVisibleText("HALWA");
    s1.deselectAll();
   Thread.sleep(2000);
    driver.close();
      
	}

}
