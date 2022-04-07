package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTaskCanManageProjectMove {
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
	/*@FindBy(xpath = "(//div[.='Enter hours'])[1]")
	private WebElement sendEstimate;*/
	@FindBy(xpath = "//div[@class='moveTo button']")
	private WebElement clickMove;
	
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement clickMoveDrop;
	@FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[1]")
	private WebElement clickToMove;
	@FindBy(xpath="(//div[@class='emptySelection'])[1]")
	private WebElement clickMoveDrop1;
	/*@FindBy(xpath="(//div[@class='itemRow cpItemRow '])[4]")
	private WebElement clickToMove1;*/
	@FindBy(xpath = "(//div[@class='ok button'])[4]")
	private WebElement move ;
	
	

	public PomTaskCanManageProjectMove(WebDriver driver) {
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

	/*public void click() {

		check.click();; // utilization
	}*/

	public void clickStatus() {

		status.click(); // utilization
	}

	public void clickEstimate() {

		clickestimate.click(); // utilization
	}
	public void clickMove() {

		clickMove.click(); // utilization
	}
	
	
	public void clickMoveDrop() {

		clickMoveDrop.click(); // utilization
	}
	public void clickToMove() {

		clickToMove.click(); // utilization
	}
	public void clickMoveDrop1() {

		clickMoveDrop1.click(); // utilization
	}
	
	/*public void clickTOMove1() {

		clickToMove1.click(); // utilization
	}*/
	public void move() {

		move.click(); // utilization
	}
}
