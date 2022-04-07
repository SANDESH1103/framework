package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTaskCanManageProjectAssign {
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

	@FindBy(xpath = "(//div[@class='img'])[2]")
	private WebElement check;
	@FindBy(xpath = "(//div[.='Done'])[1]")
	private WebElement status;
	@FindBy(xpath = "(//div[.='Enter hours'])[1]")
	private WebElement clickestimate;
	@FindBy(xpath = "//div[@class='assignTo button']")
	private WebElement clickAssign;
	@FindBy(xpath = "(//div[@class='selectorContainer'])[5]")
	private WebElement clickSelectUser;

	@FindBy(xpath = "/html/body/div[52]/ul/li/div/table/tbody/tr[3]/td/div/div[1]/span")
	private WebElement clickCancel;

	/*
	 * @FindBy(xpath = "(//span[contains(text(),'Alvarez, Daniel')])[2]")
	 * 
	 * private WebElement clickUser1;
	 * 
	 * @FindBy(xpath = "(//span[contains(text(),'Moreno, Andrew')])[2]") private
	 * WebElement clickUser2;
	 */

	@FindBy(xpath = "(//span[@class='buttonTitle'])[2]")
	private WebElement clickOnAssign;

	public PomTaskCanManageProjectAssign(WebDriver driver) {
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
	 * public void click() {
	 * 
	 * check.click();; // utilization }
	 */

	public void clickStatus() {

		status.click(); // utilization
	}

	public void clickEstimate() {
		clickestimate.click();
	}

	public void clickAssign() {

		clickAssign.click(); // utilization
	}

	public void clickSelectUser() {

		clickSelectUser.click(); // utilization
	}

	/*
	 * public void clickUser1() {
	 * 
	 * clickUser1.click(); // utilization }
	 * 
	 * public void clickUser2() {
	 * 
	 * clickUser2.click(); // utilization }
	 * 
	 * public void clickCancel() {
	 * 
	 * clickCancel.click(); // utilization }
	 */

	public void clickOnAssign() {

		clickOnAssign.click(); // utilization
	}

}
