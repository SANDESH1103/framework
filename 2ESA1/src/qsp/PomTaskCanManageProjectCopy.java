package qsp;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTaskCanManageProjectCopy {
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
	@FindBy(xpath = "//div[@class='moveTo button']")
	private WebElement clickCopyTo;
	@FindBy(xpath = "(//div[.='- Select Customer -'])[2]")
	private WebElement clickProject;
	@FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[2]")
	private WebElement selectProject;
	@FindBy(xpath = "(//div[.='- Select Project -'])[2]")
	private WebElement clickActivity;
	/*
	 * @FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[6]") private WebElement
	 * selectActivity;
	 * 
	 * @FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[6]") private WebElement
	 * clickOnCopy;
	 */

	public PomTaskCanManageProjectCopy(WebDriver driver) {
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

	public void clickToCopy() {

		clickCopyTo.click(); // utilization
	}

	public void clickProject() {

		clickProject.click(); // utilization
	}

	public void selectProject() {

		selectProject.click(); // utilization
	}

	public void clickActivity() {

		clickActivity.click(); // utilization
	}

	/*
	 * public void selectActivity() {
	 * 
	 * selectActivity.click(); // utilization }
	 */
	/*
	 * public void clickOnCopy() {
	 * 
	 * clickOnCopy.click(); // utilization }
	 */

}
