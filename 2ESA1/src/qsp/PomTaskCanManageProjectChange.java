package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTaskCanManageProjectChange {
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
	@FindBy(xpath = "//div[@class='changeStatus button']")
	private WebElement clickChange;
  //  @FindBy(xpath = "(//div[.='New'])[6]")
	/*
	 * private WebElement clickStatus;
	 * 
	 * @FindBy (xpath = "(//div[.='In Progress'])[6]") private WebElement
	 * selectStatus;
	 */
    @FindBy (xpath = "(//span[@class='buttonTitle'])[3]")
    private WebElement clickApply;
	public PomTaskCanManageProjectChange(WebDriver driver) {
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
	public void clickChange() {
		clickChange.click();
	}

	/*
	 * public void clickStatus1() { clickStatus.click();   select manually
	 * 
	 * }
	 */
	/*
	 * public void selectStatus() { selectStatus.click();
	 * 
	 * }
	 */
	public void clickApply() {
		clickApply.click();
	}
}
