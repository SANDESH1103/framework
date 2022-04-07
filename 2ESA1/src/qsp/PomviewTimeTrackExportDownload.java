package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomviewTimeTrackExportDownload {
	@FindBy(id = "username")
	private WebElement username; // decleration
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	@FindBy(xpath = "//a[contains(.,'View Time-Track')]")
	private WebElement clickViewTimeTrack;
	@FindBy(xpath = "//td[contains(.,'                Export to PDF            ')]")
	private WebElement clickExoprt;
	@FindBy(xpath = "//span[contains(.,'Download PDF')]")
	private WebElement clickDownload;

	public PomviewTimeTrackExportDownload(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String ur) {
		username.sendKeys(ur);
	}

	public void setPassword(String pw) {
		password.sendKeys(pw);
	}

	public void clickLogin() {
		login.click();
	}

	public void clickViewTimeTrack() {
		clickViewTimeTrack.click();
	}
	
	public void clickExoprt() {
		clickExoprt.click();
	}

	public void clickDownload() {
		clickDownload.click();
	}

}
