package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTimeTrackTaskCopyProperties {
	@FindBy(id = "username")
	private WebElement username; // decleration
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	@FindBy(xpath = "//span[contains(.,'New')]")
	private WebElement clickNew;
	// @FindBy(xpath = "(//div[@class='selectedItem'])[5]")
	/*
	 * private WebElement clickCustomerBox;
	 */
	@FindBy(xpath = "(//div[@class='dropdownButton'])[5]")
	private WebElement clickOnDownArrow;

	@FindBy(xpath = "//div[.='- New Customer -']")
	private WebElement selectCustomer;
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
	private WebElement enterNewCustomer;
	@FindBy(xpath = "//input[@placeholder='Enter Project Name']")
	private WebElement enterNewProject;
	/*
	 * @FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]") private
	 * WebElement enterTaskName;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='not needed'])[1]") private WebElement
	 * enterEstimate;
	 * 
	 * @FindBy(xpath = "(//button[.='set deadline'])[1]") private WebElement
	 * clickDeadline;
	 * 
	 * @FindBy(xpath = "//button[.='March 2022']") private WebElement
	 * clickMonthyear;
	 * 
	 * @FindBy(xpath = "//a[.='Sep']") private WebElement clickMonth;
	 * 
	 * @FindBy(xpath = "//button[@class='x-date-mp-ok']") private WebElement
	 * clicOkButton;
	 * 
	 * @FindBy(xpath = "(//button[@type='button'])[8]") private WebElement
	 * clicOkButton1;
	 * 
	 * @FindBy(xpath = "//div[.='Create Tasks']") private WebElement
	 * clickCreateTask;
	 * 
	 * @FindBy(xpath = "(//input[@value='Save Changes'])[1]") private WebElement
	 * clickSavechanges;
	 */
	@FindBy(xpath = "(//div[contains(.,'Copy properties from existing tasks')])[7]")
	WebElement clickCopyProperties;
	@FindBy(xpath = "(//td[@class='dropdownButton'])[3]")
	WebElement clickDropdown;
	@FindBy(xpath = "(//td[contains(.,'Big Bang Company')])[5]")
	WebElement selectProject;
	@FindBy(xpath = "(//span[contains(.,'Spaceship building')])[2]")
	WebElement selectActivity;
	@FindBy(xpath = "(//span[contains(.,'Assembly')])[2]")
	WebElement selectTask;
	@FindBy(xpath = "//input[@class='importDescriptionsCheckbox']")
	WebElement clickOnCopyCheckbox;
	@FindBy(xpath = "(//span[contains(.,'Copy properties')])[2]")
	WebElement clickCopyPropertiesBtn;

	public PomTimeTrackTaskCopyProperties(WebDriver driver) {
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

	public void clickNew() {
		clickNew.click();
	}

	/*
	 * public void clickCustomerBox() { clickCustomerBox.click(); }
	 */

	public void clickOnDownArrow() {
		clickOnDownArrow.click();

	}

	public void selectCustomer() {

	}

	public void enterNewCustomer(String custo) {
		enterNewCustomer.sendKeys(custo);
	}

	public void enterNewProject(String pro) {
		enterNewProject.sendKeys(pro);
	}

	public void clickCopyProperties() {
		clickCopyProperties.click();
	}

	public void clickDropdown() {
		clickDropdown.click();
	}

	public void selectProject() {
		selectProject.click();
	}

	public void selectActivity() {
		selectActivity.click();
	}

	public void selectTask() {
		selectTask.click();
	}

	public void clickOnCopyCheckbox() {
		clickOnCopyCheckbox.click();
	}

	public void clickCopyPropertiesBtn() {
		clickCopyPropertiesBtn.click();
	}

}
