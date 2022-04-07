package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untb;
	private WebElement pwtb;
	private WebElement loginBtn; // declaration

	public LoginPage(WebDriver driver) {
		untb = driver.findElement(By.id("username"));
		pwtb = driver.findElement(By.name("pwd"));
		loginBtn = driver.findElement(By.xpath("(//div)[13]")); // Initialization
	}

	public void setUsername(String un) {
		untb.sendKeys(un);
	}

	public void setPassword(String pw) {
		pwtb.sendKeys(pw);
	}

	public void clickLogin() {
		loginBtn.click();

	}

}
