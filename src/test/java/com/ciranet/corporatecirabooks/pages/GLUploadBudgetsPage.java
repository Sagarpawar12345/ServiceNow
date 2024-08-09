package com.ciranet.corporatecirabooks.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ciranet.utilities.LoggerManager;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.firefox.FirefoxDriver;




//Every line of code that runs in Java must be inside a class
public class GLUploadBudgetsPage {
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	// Initializing the Page Objects:
	public GLUploadBudgetsPage(WebDriver driver) {
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// URL of the sandbox
	String UploadBudgetsURL = "https://sandbox.ciranet.com/v2/managementportal/ccb/gl/uploadbudgets";

	// URL of the sandbox
	String Upload = "There is already a primary A budget plan in year 2023. You cannot add a new primary A budget plan in year 2023.";

	// Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

	@FindBy(xpath = "//input[@role='combobox']")
	public WebElement mgnt_dropdown;

	@FindBy(xpath = "//div[contains(text(),'RealManage')]")
	public WebElement RealManage;

	@FindBy(xpath = "//span[normalize-space()='Get Template']")
	public WebElement Get_Template_btn;

	@FindBy(name = "budgetName")
	public WebElement Budget_Name_txtbox;

	@FindBy(xpath = "//div[@class='dx-switch-off']")
	public WebElement Is_Primary_toggle;

	@FindBy(xpath = "//span[normalize-space()='Browse']")
	public WebElement browse_btn;

	@FindBy(xpath = "//span[normalize-space()='Upload']")
	public WebElement upload_btn;




	// method declaration
	public void UploadBudgetsPageLanding() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(UploadBudgetsURL);

		// Webdriver wait to check if the element is Present or visible or enabled or
		// disabled or Clickable
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to Upload Budgets  ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

		// method used to compare the actual and expected results
		Assert.assertEquals(actualURL, UploadBudgetsURL);

	}

	public void verifyUploadBudgetsPage() throws InterruptedException, AWTException, IOException
	{
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		mgnt_dropdown.click();

		Robot robot = new Robot();  // Robot class throws AWT Exception

		// statement which prints the argument passed to it
		System.out.println("Management Company dropdown is clicked");

		RealManage.click();

		// statement which prints the argument passed to it
		System.out.println("RealManage dropdown is clicked");

		Get_Template_btn.click();

		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-loadpanel-content-wrapper']")));

		// statement which prints the argument passed to it
		System.out.println("Get Template button is clicked");

		// This will press Escape key on keyboard.
		robot.keyPress(KeyEvent.VK_ESCAPE);

		// This will press Escape key on keyboard.
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		Budget_Name_txtbox.sendKeys("Test_Budget_Name");

		Is_Primary_toggle.click();

		browse_btn.click();

		StringSelection s = new StringSelection("C:\\Users\\Admin\\git\\CiraConnect CiraNet Tests\\CiraAutomation\\src\\Community_Association_Management_Professionals_Template.xlsx");

		// Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);

		//pressing ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);

		//releasing ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);

		//pressing enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		//releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		// statement which prints the argument passed to it
		System.out.println("Community_Association_Management_Professionals_Template.xlsx file name is displayed");

		upload_btn.click();

		// statement which prints the argument passed to it
		System.out.println("Upload button clicked");


		Thread.sleep(3000);
		
		// URL of the sandbox
		String expectedMessage = "There is already a primary A budget plan in year 2023. You cannot add a new primary A budget plan in year 2023.";

		String message = driver.findElement(By.xpath("//div[@class='dx-overlay-content dx-toast-error dx-toast-content dx-resizable']")).getText();

		Assert.assertTrue(message.contains(expectedMessage));
		
		System.out.println(message);

		Thread.sleep(1000);

		driver.quit();

	}

}


