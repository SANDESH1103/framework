package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTag {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/iframe.HTML");
		driver.findElement(By.id("t1")).sendKeys("ABCD");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("1234");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys(" EFGH");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys(" 5678");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys(" DINGA");
		WebElement page2 = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(page2);
		driver.findElement(By.id("t2")).sendKeys(" dingi");
		
		
		
		

	}

}
