package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomviewTimeTrackFilterReadyForApproval {
	@FindBy(id = "username")
	private WebElement username; // decleration
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	@FindBy(xpath = "//a[contains(.,'View Time-Track')]")
	private WebElement clickViewTimeTrack;
	@FindBy(xpath = "(//div[@class='downIcon'])[1]")
	private WebElement clickOnFilter;
	
	@FindBy(xpath = "//td[@class='middle-right-cell']")
	private WebElement clickOncustomer;
	@FindBy(xpath = "(//div[@class='x-form-radio-wrap-inner '])[2]")
	private WebElement selectCustomer ;
	@FindBy(xpath = "//a[@id='ext-gen205']")
	private WebElement resetFilter ;
	@FindBy(xpath = "//span[contains(.,'Close')]")
	private WebElement clickCancel ;
	@FindBy(xpath = "//input[@id='viewTTStatusCheckboxId_0']")
	private WebElement clickOnapprove ;
	@FindBy(xpath = "//input[@id='viewTTStatusCheckboxId_1']")
	private WebElement clickOnReadyForApproval ;
	@FindBy(xpath = "//input[@id='viewTTStatusCheckboxId_2']")
	private WebElement clickOnNotReadyAndRejected ;
	@FindBy(xpath = "//input[@id='applyFilterEdit']")
	private WebElement clickOnApproveBtn ;
	public PomviewTimeTrackFilterReadyForApproval(WebDriver driver) {
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
	public void clickOnFilter() {
		clickOnFilter.click();
	}
	public void clickOncustomer() {
		clickOncustomer.click();
	}
	public void selectCustomer() {
		selectCustomer.click();
	}
	public void resetFilter() {
		resetFilter.click();
	}
	public void clickCancel() {
		clickCancel.click();
	}
	public void clickOnapprove() {
		clickOnapprove.click();
	}
	public void clickOnReadyForApproval() {
		clickOnReadyForApproval.click();
	}
	public void clickOnNotReadyAndRejected() {
		clickOnNotReadyAndRejected.click();
	}
	public void clickOnApproveBtn() {
		clickOnApproveBtn.click();
	}
}
