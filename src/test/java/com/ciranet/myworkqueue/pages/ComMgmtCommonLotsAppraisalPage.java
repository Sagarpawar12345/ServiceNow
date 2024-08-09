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

//Every line of code that runs in Java must be inside a class
public class ComMgmtCommonLotsAppraisalPage {
	JavascriptExecutor js;
	private static WebDriver driver;

	// Initializing the Page Objects:
	public ComMgmtCommonLotsAppraisalPage(WebDriver driver) 
	{
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// URL of the sandbox
	String CommonLotsAppraisalURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/common-lots/appraisal";

	// Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

	// Initializing the Page Objects
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-excel']")
	WebElement excel;
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-csv']")
	WebElement csv;
	
	

    
  	public String expectedCommunityURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/common-lots/appraisal";

	// method declaration
	public void CommonLotsAppraisalPageLanding() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(CommonLotsAppraisalURL);

		// Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to CommonLots Appraisal ========");

		driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

		// method used to compare the actual and expected results
		 //Assert.assertEquals(actualURL, CommonLotsAppraisalURL);
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
	
	public void columnChooserClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", columnChooser);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked Column Chooser");

		List<WebElement> workOrdersColumnChooser = driver.findElements(By.cssSelector("div[class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable'] ul[role='group'] li"));
		System.out.println("List size is: " + workOrdersColumnChooser.size());
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));
		js.executeScript("arguments[0].click();", closeColChooser);
				
		//statement which prints the argument passed to it
		System.out.println("Column Chooser closed");
		
		//Quit current browser window
		//driver.quit();
	}
	
	public void excelClick() 
	{
		new WebDriverWait(driver, Duration.ofSeconds(60));
		
		excel.click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//statement which prints the argument passed to it
		System.out.println("excel button clicked");

		//Quit current browser window
		//driver.quit();
	}

	

	public void csvClick() 
	{
		new WebDriverWait(driver, Duration.ofSeconds(60));
		
		csv.click();
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//statement which prints the argument passed to it
		System.out.println("csv button clicked");

		//Quit current browser window
		driver.quit();
	}

	

	
	
	
	
	
	

	

	
	
}
