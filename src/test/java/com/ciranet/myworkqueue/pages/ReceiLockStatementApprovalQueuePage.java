package com.ciranet.myworkqueue.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

import org.openqa.selenium.support.ui.Select;

//Every line of code that runs in Java must be inside a class
public class ReceiLockStatementApprovalQueuePage {
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	// Initializing the Page Objects:
	public ReceiLockStatementApprovalQueuePage(WebDriver driver) 
	{
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// URL of the sandbox
	String StatementApprovalQueueURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/statement-approval-queue";

	// Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

	// Initializing the Page Objects
	@FindBy(xpath = "(//div[@class=\"dx-button-content\"])[22]")
	WebElement fullScreenIcon;

	@FindBy(xpath = "(//div[@title=\"Normal View\"])[1]")
	WebElement normalScreenIcon;

	@FindBy(xpath="(//div[@class=\"dx-item dx-tab\"])[1]")
	WebElement searchApproval;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[9]")
	WebElement dateTypeDropdown;
	
	@FindBy(xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[10]")
	WebElement beginDateDropdown;
	
	@FindBy(xpath="//a[@aria-label='February 2024']//div[@class='dx-button-content']")
	WebElement beginDate;
	
	/*@FindBy(xpath="//span[normalize-space()='2024']")
	WebElement year; //"//a[@aria-label='February 2024']//div[@class='dx-button-content']"
	
	@FindBy(xpath="//td[@class='dx-calendar-cell dx-state-hover']//span[contains(text(),'2024')]")
	WebElement selectYear;*/
	
	@FindBy(xpath="//td[@aria-label='January 2024']//span[contains(text(),'Jan')]")
	WebElement selectMonth;
	
	@FindBy(xpath=("(//td[@data-value=\"2024/01/02\"])[2]"))
	WebElement selectDate;
	
	@FindBy(xpath="(//i[@ng-reflect-ng-class=\"fas fa-history\"])[51]")
	WebElement logs;
	
	@FindBy(xpath="(//div[@class=\"dx-button-content\"])[157]")
	WebElement close;
	
	@FindBy(xpath="(//i[@ng-reflect-ng-class=\"far fa-file-pdf\"])[52]")
	WebElement statementcolumn;
	
	@FindBy(xpath="(//div[@class=\"dx-button-content\"])[129]")
	WebElement errorclose;
	
	@FindBy(xpath="(//input[@class='dx-texteditor-input'])[23]")
	WebElement locationSearch;
	
//	@FindBy(xpath="(//input[@class='dx-texteditor-input'])[34]")
//	WebElement runIDClick;

	@FindBy(xpath="//div[@class=\"dx-datagrid-filter-panel-clear-filter\"]")
	WebElement clearButton;
	
	@FindBy(xpath="(//div[@class=\"dx-item dx-tab\"])[2]")
	WebElement statementRuns;

	public String expectedCommunityURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/statement-approval-queue";
	
	// method declaration
	public <communitytabs> void StatementApprovalQueuePageLanding() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(StatementApprovalQueueURL);

		// Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to Statement Approval Queue ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

		// method used to compare the actual and expected results
		 Assert.assertEquals(actualURL, StatementApprovalQueueURL);
	}
	
	
	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		//allows to execute JavaScript code
		js.executeScript("arguments[0].click();", fullScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		//if statement to specify a block of Java code to be executed if a condition is true
		if (normalScreenIcon.isDisplayed()) 
		{
			System.out.println("FullScreen Menu button clicked");
		}
		//block of code to be executed if the condition is false
		else 
		{
			System.out.println("FullScreen Menu button not clicked");
		}
	}
     
	public void ToolBarNormalScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));
		js.executeScript("arguments[0].click();", normalScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		if (fullScreenIcon.isDisplayed()) 
		{
			System.out.println("NormalScreen Menu button clicked");
		} 
		else 
		{
			System.out.println("NormalScreen Menu button not clicked");
		}
		
	}
	
		
	public void SearchApprovalTabClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", searchApproval);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked Search Approval Tab");

	}
	
	public void DateTypeDropdown1()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,dateTypeDropdown );
		
		System.out.println("Clicked Date Type Dropdown");
		
		driver.findElement(By.xpath("//div[contains(text(),'Statement Date')]")).click();
		
	WebElement datetype	=driver.findElement(By.xpath("(//div[@class='dx-dropdowneditor-icon'])[9]"));
	Select dtype= new Select (datetype);
	dtype.selectByVisibleText("Statement Date");
		
	}
	
	public void BeginDateDropdown()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,beginDateDropdown );
		js.executeScript("arguments[0].click();" ,beginDate);
		/*js.executeScript("arguments[0].click();" ,year);
		js.executeScript("arguments[0].click();" ,selectYear);*/
		js.executeScript("arguments[0].click();" ,selectMonth);
		js.executeScript("arguments[0].click();" ,selectDate);
		
		System.out.println("Clicked Begin Date Dropdown");	
	}
	
	
	public void LogsClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,logs);
		
		System.out.println("Clicked Logs Column");
	}
	
	
	public void CloseButtonClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,close);
		
		System.out.println("Clicked Close Button");
	}
	
	public void StatementColumnPDFClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,statementcolumn);
		
		System.out.println("Clicked Statement PDF Column");
	}
	
	public void ErrorCloseClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,errorclose);
		
		System.out.println("Clicked ErrorClose Button");
	}
	
	public void LocationColumnClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,locationSearch);
		
		locationSearch.sendKeys("Illinois");
		System.out.println("Clicked Location Search");
		
	}
	
	/*public void RunIDClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,runIDClick);
		
		runIDClick.sendKeys("145854");
		System.out.println("Clicked Run ID Search");
		
	}*/
	
	public void ClearButtonClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();" ,clearButton);
		
		System.out.println("Clicked Clear Button");
	
	}

	public void StatementRunsTabClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", statementRuns);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked Statement Runs Tab");

	}
	
	
	
}	


	
	

