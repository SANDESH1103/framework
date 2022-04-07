package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSettingsAddManager {
	@FindBy(id = "username")
	private WebElement username; // decleration
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement task;
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement BigBang;
	@FindBy(xpath = "(//span[@class='highlightToken'])[1]")
	private WebElement clickBigBang;
	/*
	 * @FindBy(xpath = "(//div[@class='editButton'])[1]") private WebElement
	 * clickSetting;
	 */
	@FindBy(xpath = "(//span[@class='tabText'])[3]")
	private WebElement clickOnMangers;
//	@FindBy(xpath = "(//div[.='Add Managers'])[1]")      element is hidden we have to click manually
//	private WebElement clickAddManager;
	@FindBy(xpath = "//span[@title='Nowak, Peter']")
	private WebElement selectManager;
	@FindBy(xpath = "//span[.='Close']")
	private WebElement clickCancel;

	public PomSettingsAddManager(WebDriver driver) {
		PageFactory.initElements(driver, this); // Initialization
	}

	public void setUsername(String st) {

		username.sendKeys(st); // utilization
	}

	public void setPassword(String st) {

		password.sendKeys(st); // utilization
	}

	public void clickLogin() {

		login.click(); // utilization
	}

	public void clickTask() {

		task.click();// utilization
	}

	public void typeBigbang(String st) {

		BigBang.sendKeys(st); // utilization
	}

	public void clickBig() {

		clickBigBang.click();// utilization
	}

	/*
	 * public void clickSetting() {                 element is hidden we have to click manually
	 * 
	 * clickSetting.click();// utilization }
	 */
	/*
	 * public void clickAddManager() {              element is hidden we have to click manually
	 * 
	 * clickAddManager.click();// utilization }
	 *
	 */
	public void clickOnManagers() {

		 clickOnMangers.click();// utilization
	}
	public void selectManager() {

		 selectManager.click();// utilization
	}
	public void clickCancel() {

		clickCancel.click();// utilization
	}
	
}