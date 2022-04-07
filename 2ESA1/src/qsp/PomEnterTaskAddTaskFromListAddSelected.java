package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomEnterTaskAddTaskFromListAddSelected {
	@FindBy(id = "username")
	private WebElement username; // decleration
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	@FindBy(xpath = "//span[contains(.,'Add Tasks from the List')]")
	private WebElement AddTaskFromList ;
	@FindBy(xpath = "//td[@class='dropdownButton']")
	private WebElement clickDropdown ;
	@FindBy(xpath = "(//td[contains(.,'Big Bang Company')])[4]")
	private WebElement selectProject;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement selectTask;
	@FindBy(xpath = "//button[contains(.,'Add Selected')]")
	private WebElement clickAddSelected;
	
	
	
	
	public PomEnterTaskAddTaskFromListAddSelected(WebDriver driver) {
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
	public void AddTaskFromList() {
		AddTaskFromList.click();
	}
	public void clickDropdown() {
		clickDropdown.click();
	}
	public void selectProject() {
		selectProject.click();
	}
	public void selectTask() {
		selectTask.click();
	}
	public void clickAddSelected() {
		clickAddSelected.click();
	}
}
