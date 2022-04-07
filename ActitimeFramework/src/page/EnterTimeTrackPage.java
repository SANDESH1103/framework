
package page;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class EnterTimeTrackPage {
	private final String xp="(//div[contains(text(),'Settings')])[1]";
	//we cannot pass variable inside findby annotation so make it as final	
	@FindBy(xpath=xp)
	private WebElement settings;
	
	@FindBy(linkText="Licenses")
	private WebElement licenses;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickSettings() {
		settings.click();
	}
	
	public void clickLicenses() {
		licenses.click();
	}
	
	public void verifyHomePageIsDisplayed(WebDriver driver,long time,String title) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home page is Displayed",true);
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			File des=new  File("./images");
			FileUtils.copyFile(src, des);
			
		}
		catch (Exception e) {
			Reporter.log("Homepage is not displayed",true);
			Assert.fail();
		}
	}
}