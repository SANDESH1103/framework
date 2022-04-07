package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
static {
	System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("sang ho tere");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		
//		driver.switchTo().activeElement().sendKeys("Dinga");
//		Thread.sleep(2000);
//		driver.close();
		
		

	}

}
