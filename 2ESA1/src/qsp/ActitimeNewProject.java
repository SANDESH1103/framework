package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeNewProject {

	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]")).sendKeys("Quetione");
		driver.findElement(By.xpath("//div[@class='emptySelection']")).click();
		driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[4]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Add Project Description']")).sendKeys("A1");
		List<WebElement> Listbx = driver.findElements(By.xpath("//input[@placeholder='Enter task name'][1]"));
		driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("desk");
		driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[2]")).sendKeys("12");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[4]")).click();
		driver.findElement(By.linkText("Mar")).click();
		driver.findElement(By.xpath("//a[@class='x-date-mp-prev']")).click();
		driver.findElement(By.xpath("//a[@class='x-date-mp-prev']")).click();
		driver.findElement(By.linkText("2000")).click();
		driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
		//driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
		driver.findElement(By.xpath("//span[.='11']")).click();
		driver.findElement(By.xpath("//span[.='ASSIGNED USERS (4)']")).click();
		driver.findElement(By.xpath("(//div[.='Assign'])[5]")).click();
		//driver.findElement(By.xpath("(//span[@title='Alvarez, Daniel'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='triState checked selectionEnabled']")).click();
		
		
		//System.out.println(Listbx.size());

}
}