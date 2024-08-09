package com.ciranet.myworkqueue.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ciranet.utilities.LoggerManager;

public class DiscloProcessingClosingRequestsPage 
{
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public DiscloProcessingClosingRequestsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Closing Requests Page Objects ======== ");
	}

	String closingRequestsURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/closing-requests";
	
	//String pageLoader = "//div[@class='dx-loadpanel-indicator dx-loadindicator dx-widget']//div[@class='dx-loadindicator-content'])[2]";
	String pageLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";
	//xpath for FulfillCompactOn
	@FindBy(xpath = "(//div[@class='dx-button-content']//span[text()='Fulfill'])[3]")
	public WebElement fulfillButton;

	@FindBy(xpath = "(//div[@class='dx-switch-on'])[3]")
	public WebElement compactOn;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement closeButton;

	@FindBy(xpath = "(//div[@class='dx-switch-off'])[3]")
	public WebElement compactOff;

	@FindBy(xpath = "//div[@class='cc-wizard-horizontal-content dx-template-wrapper dx-item-content dx-box-item-content']")
	public WebElement wizard;

	@FindBy(xpath = "(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[3]")
	public WebElement actionButton;

	@FindBy(xpath = " (//div[@ng-reflect-klass='menu-text'])[2]")
	public WebElement transferTo;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[9]")
	public WebElement collection;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[11]")
	public WebElement processing;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[12]")
	public WebElement transition;

	@FindBy(xpath = " (//div[@ng-reflect-klass='menu-text'])[4]")
	public WebElement assignProperty;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[22]")
	public WebElement dropdown;

	@FindBy(xpath = "(//div//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")//(//td[@aria-describedby='dx-col-772'])[2]
	public WebElement dropdownValue;

	@FindBy(xpath ="(//input[@role='textbox'])[20]")
	public WebElement SearchText;

	@FindBy(xpath = "(//i[@class='dx-icon dx-icon-search'])[2]")
	public WebElement SearchButton;

	@FindBy(xpath = "(//div[@class='dx-checkbox-container'])[2]")
	public WebElement checkBox;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-save']")
	public WebElement saveButton;

	@FindBy(xpath="(//div[@class='dx-item dx-menu-item']//i[@class='fas fa-key'])[3]")
	public WebElement cancelRequest;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
	public WebElement cancelReason;

	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[2]")
	public WebElement searchTab;

	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[1]")
	public WebElement openRequest;

	@FindBy(xpath="(//input[@autocomplete='off' and @role='textbox'])[2]")
	public WebElement propertyAddress;

	@FindBy(xpath="(//input[@autocomplete='off'])[6]")
	public WebElement toDate;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[2]")
	public WebElement fromDate;

	@FindBy(xpath="//a[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text dx-calendar-caption-button']")
	public WebElement currentYear;

	@FindBy(xpath="//i[@class='dx-icon dx-icon-chevronleft']")
	public WebElement lastYear;

	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-contoured-date']")
	public WebElement month;

	@FindBy(xpath="//td[@class='dx-calendar-cell dx-calendar-contoured-date']")
	public WebElement date;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-search']")
	public WebElement searchButton;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[1]")
	public WebElement actionCheck;

	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-text-content-alignment-right'])[1]")
	public WebElement rush;

	@FindBy(xpath="(//div//span[@class='dx-header-filter dx-header-filter-empty'])[9]")
	public WebElement requestType;

	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[6]")
	public WebElement community;

	@FindBy(xpath="(//div[@class='dx-column-indicators'])[10]")
	public WebElement Questionnaire;

	@FindBy(xpath="(//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text'])[1]")
	public WebElement QuestionnaireOk;

	@FindBy(xpath="(//i[@class='cc-1-5x fas fa-envelope'])[1]")
	public WebElement emailLabel;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/dx-box[1]/div[1]/dxi-item[1]/app-side-nav-outer-toolbar[1]/div[1]/dx-drawer[1]/div[1]/div[2]/div[2]/div[1]/app-closing-requests-home[1]/dx-box[1]/div[2]/div[1]/app-closing-requests[1]/dx-box[1]/div[2]/div[1]/dx-box[1]/div[3]/div[1]/cc-data-grid-features[1]/dx-box[1]/div[1]/dxi-item[1]/dx-data-grid[1]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/i[1]")
	public WebElement searchIcon;

	@FindBy(xpath="//input[@aria-label='Search in the data grid']")
	public WebElement searchField;

	@FindBy(xpath="(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[7]")
	public WebElement propertyReasonLabel;

	@FindBy(xpath="(//div[@class='dx-template-wrapper'])[2]")
	public WebElement communityvalue;
	
	// Initializing the Page Objects
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	public WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	public WebElement normalScreenIcon;

	@FindBy(xpath="//*[@id='dx-col-1656']")
	public WebElement communityColumn;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-columnchooser fa-stack-2x']")
	public WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement columnChooserClose;

	public void ClosingRequestspageLanding() 
	{
		driver.navigate().to(closingRequestsURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("======== Navigating Closing Requests Management Page ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, closingRequestsURL);
	}

	public void verifyFulfillCompactOn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(110));
		
		try 
		{
			Thread.sleep(64000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Before fulfill button clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		wait.until(ExpectedConditions.elementToBeClickable(fulfillButton));

		fulfillButton.click();
		System.out.println("After fulfill button is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		if(compactOn.isDisplayed())
		{
			System.out.println("Compact Mode is ON ");
		}
		else
		{
			System.out.println("Compact Mode is OFF");
		}

		closeButton.click();
	}

	public void verifyFulfillCompactOff()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(110));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		try 
		{
			Thread.sleep(9000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fulfillButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		compactOff.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));


		if(wizard.isDisplayed())
		{
			System.out.println("Compact Mode is OFF ");
		}
		else
		{
			System.out.println("Compact Mode is ON");
		}

		closeButton.click();
	}

	public void verifyActionTransfertoCollections()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		actionButton.click();
		System.out.println("Action Button Clicked For Collections");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		Actions action = new Actions(driver);
		action.moveToElement(transferTo).build().perform();
		System.out.println("Mouse Hover On Transfer to ");
		action.moveToElement(collection).click().perform();
		System.out.println("Clicked on Collections");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-icon']")));
	}

	public void verifyActionTransfertoProcessing()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		actionButton.click();
		System.out.println("Action Button Clicked For Processing");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		Actions action = new Actions(driver);
		action.moveToElement(transferTo).build().perform();
		
		System.out.println("Mouse Hover On Transfer to ");

		action.moveToElement(processing).click().perform();
		System.out.println("Clicked on Processing");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-icon']")));
	}

	public void verifyActionTransfertoTransition()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		actionButton.click();
		System.out.println("Action Button Clicked For Transition");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		Actions action = new Actions(driver);
		action.moveToElement(transferTo).build().perform();
		System.out.println("Mouse Hover On Transfer to ");

		action.moveToElement(transition).click().perform();
		System.out.println("Clicked on Transition");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment1']")));
	}

	public void verifyActionAssignProperty()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		
		js.executeScript("arguments[0].click();", actionButton);
		//actionButton.click();
		
		System.out.println("Action Button Clicked For Assign Property");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		js.executeScript("arguments[0].click();", assignProperty);
		//assignProperty.click();
		
		System.out.println("Clicked Assign Property");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		js.executeScript("arguments[0].click();", dropdown);
		dropdown.click();
		
		System.out.println("Clicked For DropDown");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].click();", dropdownValue);
		//dropdownValue.click();
		
		System.out.println(" Selected DropDown value");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		js.executeScript("arguments[0].click();", SearchText);
		SearchText.click();

		//js.executeScript("arguments[0].click();", dropdownValue);
		SearchText.clear();
		
		//SearchText.sendKeys("Mills");
		SearchText.sendKeys("1100 Trinity Mills");
		
		System.out.println("Value Entered For Community Search");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		//js.executeScript("arguments[0].click();", SearchButton);
		js.executeScript("arguments[0].click();", SearchButton);
		//SearchButton.click();
		System.out.println("Clicked Search Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		js.executeScript("arguments[0].click();", checkBox);
		//checkBox.click();
		System.out.println("Clicked Check Box");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));

		js.executeScript("arguments[0].click();", saveButton);
		saveButton.click();
		System.out.println("Clicked SaveButton");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	}
	public void ActionCancleRequest() 
	{
		String label="Cancel Reason:";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", actionButton);
		System.out.println("Action Button Clicked For CancleRequest");

		Robot robot;
		try 
		{
			//creating a constructor of the Robot class  
			robot = new Robot();
			
			//pressing key by invoking the keyPress() method 
			robot.keyPress(KeyEvent.VK_ESCAPE);
			
			//delay 4ms 
			robot.delay(300);
			
			//keyRelease() method
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			
			//delay 4ms 
			robot.delay(300);
		}
		
		catch (java.awt.AWTException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", cancelRequest);
		if(label.equals("Cancel Reason:")) {
			System.out.println("Cancel Request Pop Up id display");
		}
		else {
			System.out.println("Cancel Request Pop Up failed to load");
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", cancelReason);
	}

	public void SwitchingTabs() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", searchTab);
		System.out.println("Switch to Search Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", openRequest);
		System.out.println("Switch to Open Request Tab");
	}
	
	public void SearchTab() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		
		js.executeScript("arguments[0].click();", searchTab);
		System.out.println("Switch to Search Tab");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", propertyAddress);
		propertyAddress.sendKeys("1100");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", fromDate);
	
		fromDate.clear();
		fromDate.sendKeys("09/01/2019");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
				
		js.executeScript("arguments[0].click();", searchButton);
		
		System.out.println("Search Button is Working____________");
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void RequestTypeFilter() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", openRequest);
		System.out.println("Switch to Open Request Tab");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", rush);
		js.executeScript("arguments[0].scrollIntoView(true);", community);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", requestType);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", Questionnaire);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		js.executeScript("arguments[0].click();", QuestionnaireOk);
		
		if(emailLabel.isDisplayed()) 
		{
			System.out.println("Request Type Page is loaded");
		}
		else 
		{
			System.out.println("Request Type Page is failed to load");
		}
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

		//Quit browser
		driver.quit();
	}

	public void searchButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		//js.executeAsyncScript("arguments[0].click();", searchIcon);
		js.executeAsyncScript("arguments[0].click();", searchIcon);
		//searchIcon.click();
		
		System.out.println("Search icon is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		js.executeAsyncScript("arguments[0].click();", searchField);
		//searchField.click();
		
		//js.executeAsyncScript("arguments[0].click();", searchField);
		System.out.println("Search Text Box is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		searchField.sendKeys("1100");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		searchField.click();
	}

}
