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
import org.openqa.selenium.interactions.Actions;

//Every line of code that runs in Java must be inside a class
public class ComMgmtViolationReviewPage {
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	// Initializing the Page Objects:
	public ComMgmtViolationReviewPage(WebDriver driver) 
	{
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// URL of the sandbox
	String ViolationReviewURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/violation-review";

	// Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";
	// Initializing the Page Objects
	@FindBy(xpath = "(//div[@class=\"dx-button-content\"])[21]")
	WebElement fullScreenIcon;

	@FindBy(xpath = "(//div[@title=\"Normal View\"])[1]")
	WebElement normalScreenIcon;
	
	
	@FindBy(xpath="(//div[@class=\"dx-button-content\"])[31]")
	WebElement actionsButton;
	
	@FindBy(xpath="//div[text()=\"Violation Inspection History\"]")
	WebElement popupTitle;
	
	@FindBy(xpath="//span[text()=\"Approve\"]")
	WebElement approveButton;
	
	@FindBy(xpath="//div[@aria-label=\"No\"]")
	WebElement noButton;
	
	@FindBy(xpath="(//textarea[@class=\"dx-texteditor-input\"])[1]")
	WebElement violationNotesTextArea;
	
	@FindBy(xpath="(//i[@title=\"Images\"])[2]")
	WebElement imagesColumn;
	
	@FindBy(xpath="(//dx-button[@aria-label=\"Close\"])[2]")
	WebElement closeButton;
	
	
	@FindBy(xpath="(//i[@title=\"Logs\"])[2]")
	WebElement logsColumn;
	
	@FindBy(xpath="(//dx-button[@aria-label=\"Close\"])[2]")
	WebElement logsCloseButton;
	
	public String expectedCommunityURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/violation-review";
	
	// method declaration
	public <communitytabs> void ViolationReviewPageLanding() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(ViolationReviewURL);

		// Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to Open Violation Requiring Review ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

		// method used to compare the actual and expected results
		 Assert.assertEquals(actualURL, ViolationReviewURL);
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
	
	public void ViolationInspectionHistoryPopup()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", actionsButton);
		
		//statement which prints the argument passed to it
		//System.out.println("Violation Inspection History Popup");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		System.out.println(driver.getTitle());
//		String popupTitle= driver.getTitle();
		//statement which prints the argument passed to it
		System.out.println(popupTitle);
		
	}
	
	
	public void ApproveButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", approveButton);
		
		//statement which prints the argument passed to it
		System.out.println("On the Popup Approve Button is Clicked");
		
	}
	
	public void NoButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", noButton);
		
		//statement which prints the argument passed to it
		System.out.println("On the Popup No Button is Clicked");
		
	}
	
	public void ViolationNotesTextArea()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", violationNotesTextArea);
		
		//statement which prints the argument passed to it
		System.out.println("Violation Notes Text Area is Editable");
		
		violationNotesTextArea.sendKeys("Violation Notes Requiring Review");
	}//horizontalScrollbar
	
	
	public void ImagesColumn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", imagesColumn);	
		
		//statement which prints the argument passed to it
		System.out.println("On the Popup Image is Clicked");
	}
	
	public void CloseButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", closeButton);	
		
		//statement which prints the argument passed to it
		System.out.println("On the Image Popup Close Button is Clicked");
	}
	
	public void LogsColumn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", logsColumn);	
		
		//statement which prints the argument passed to it
		System.out.println("On the Popup Logs icon is Clicked");
	}
	
	public void LogsCloseButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", logsCloseButton);	
		
		//statement which prints the argument passed to it
		System.out.println("On the Logs Popup Close Button is Clicked");
	}
	
	
}	



	
	

