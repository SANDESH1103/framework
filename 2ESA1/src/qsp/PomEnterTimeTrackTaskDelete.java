package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomEnterTimeTrackTaskDelete {
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
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskName;
	@FindBy(xpath = "(//input[@placeholder='not needed'])[1]")
	private WebElement enterEstimate;
	@FindBy(xpath = "(//button[.='set deadline'])[1]")
	private WebElement clickDeadline;
	@FindBy(xpath = "//button[.='March 2022']")
	private WebElement clickMonthyear;
	@FindBy(xpath = "//a[.='Sep']")
	private WebElement clickMonth;
	@FindBy(xpath = "//button[@class='x-date-mp-ok']")
	private WebElement clicOkButton;
	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement clicOkButton1;
	@FindBy(xpath = "//div[.='Create Tasks']")
	private WebElement clickCreateTask;
	@FindBy(xpath = "(//input[@value='Save Changes'])[1]")
	private WebElement clickSavechanges;
	@FindBy(xpath = "//div[.='sa']")
	private WebElement clickOnTask;
	@FindBy(xpath = "//div[.='ACTIONS']")
	private WebElement clickOnActions;
	@FindBy(xpath = "//div[.='Delete']")
	private WebElement clickOnDelete;
	@FindBy(xpath = "//span[contains(.,'Delete permanently')]")
	private WebElement clickOnDeletePermanantley;

	public PomEnterTimeTrackTaskDelete(WebDriver driver) {
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

	public void enterTaskName(String task) {
		enterTaskName.sendKeys(task);
	}

	public void enterEstimate(String est) {
		enterEstimate.sendKeys(est);
	}

	public void clickDeadline() {
		clickDeadline.click();
	}

	public void clickMonthyear() {
		clickMonthyear.click();
	}

	public void clickMonth() {
		clickMonth.click();
	}

	public void clicOkButton() {
		clicOkButton.click();
	}

	public void clicOkButton1() {
		clicOkButton1.click();

	}

	public void clickCreateTask() {
		clickCreateTask.click();

	}

	public void clickSavechanges() {
		clickSavechanges.click();

	}

	public void clickOnTask() {
		clickOnTask.click();

	}

	public void clickOnActions() {
		clickOnActions.click();

	}

	public void clickOnDelete() {
		clickOnDelete.click();

	}

	public void clickOnDeletePermanantley() {
		clickOnDeletePermanantley.click();

	}
}
