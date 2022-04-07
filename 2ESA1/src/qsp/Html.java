package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {
static {
	 System.setProperty("webdriver.chrome.driver","D:\\Selinium\\2ESA1\\driver\\ChromeDriver.exe");

}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/WEB%20TECH/Project/A.HTML");
		driver.findElement(By.id("a")).sendKeys("SAndesh");
		Thread.sleep(3000);
        driver.findElement(By.id("b")).sendKeys("124wgw");
        Thread.sleep(2000);
       driver.findElement(By.linkText("forget password??")).click();
//        driver.findElement(By.name("c")).click();
	}

}
