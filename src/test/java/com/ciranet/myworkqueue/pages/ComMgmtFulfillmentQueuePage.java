package com.ciranet.myworkqueue.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ciranet.utilities.LoggerManager;

//Every line of code that runs in Java must be inside a class
public class ComMgmtFulfillmentQueuePage
{
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private static WebDriver driver;

	// Initializing the Page Objects:
	public ComMgmtFulfillmentQueuePage(WebDriver driver) 
	{
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	//URL of the sandbox
	String FulfillmentQueueURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/fulfillment-queue";
	
	//Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

	// Initializing the Page Objects
	// Initializing the Page Objects
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	//@FindBy(xpath="//span[text()='Closed Jobs']")
	//@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[2]")
	//@FindBy(xpath="//div[@class='dx-item dx-tab dx-tab-selected']")
	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Jobs']")
	public WebElement closedjobs;

	@FindBy (xpath = "//span[normalize-space()='Active Jobs']")
	public WebElement activejobs;

	@FindBy(xpath="(//span[text()='Action'])[1]")
	public WebElement actionButton;

	@FindBy(xpath="(//div[text()=' View/Edit '])[1]")
	public WebElement ViewEdit;

	@FindBy(xpath="//span[text()='Save']")
	public WebElement ActionSave;

	@FindBy(xpath="//span[text()='Save & Close']")
	public WebElement ActionSaveClose;

        @FindBy(xpath="(//span[text()='Close'])[2]")
	public WebElement ErrorClose;

	@FindBy(xpath="(//span[text()='Close'])[2]")
	public WebElement Close;

	@FindBy(xpath="//span[text()='Refresh Queue']")
	public WebElement RefreshQueue;

	@FindBy(xpath="//div[@title='Close']//div[@class='dx-button-content']")
	public WebElement PopupClose;	

	@FindBy(xpath="//span[text()='Documents']")
	public WebElement Documents;

	@FindBy(xpath="//i[@class='dx-icon fas fa-times']")
	public WebElement DocumentsClose;

	@FindBy(xpath="//span[text()='Completion Job']")
	public WebElement CompletionJob;

	@FindBy(xpath="//i[@title='Show Notes']")
	public WebElement ShowNotes;

	//@FindBy(xpath="//span[normalize-space()='Close']")
	//@FindBy(xpath="//div[@title='Close']//div[@class='dx-button-content']")
	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @title='Close']")
	public WebElement CompletionJobClose;

	//@FindBy(xpath="//span[normalize-space()='Save']")
	//@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[25]")
	//@FindBy(xpath="(//*[@class='dx-button-content']//*[@class='dx-icon fas fa-save'])[1]")
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/dx-box[1]/div[2]/div[1]/dx-box[1]/div[2]/div[1]/dx-toolbar[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
	//@FindBy(xpath="//*[@class='dx-button-content']//*[text()='Save']")
	//@FindBy(xpath="(//span[contains(text(),'Save')])[1]")
	//@FindBy(xpath="(//span[contains(@class,'dx-button-text')])[60]")
	@FindBy(xpath="(//div[@class='dx-item-content dx-toolbar-item-content'][contains(.,'Save')])[1]")
	public WebElement CompletionJobSave;

	//@FindBy(xpath="//span[normalize-space()='Save & Close']")
	//@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[26]")
	//@FindBy(xpath="(//*[@class='dx-button-content']//*[@class='dx-icon fas fa-save'])[3]")
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/dx-box[1]/div[2]/div[1]/dx-box[1]/div[2]/div[1]/dx-toolbar[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]")
	//@FindBy(xpath="//*[@class='dx-button-content']//*[text()='Save & Close']")
	//@FindBy(xpath="//span[contains(text(),'Save & Close')]")
	//@FindBy(xpath="(//span[contains(@class,'dx-button-text')])[62]")
	@FindBy(xpath="(//div[@class='dx-item-content dx-toolbar-item-content'][contains(.,'Save & Close')])[1]")
	public WebElement CompletionJobSaveandClose;

        @FindBy(xpath="(//textarea[@role='textbox'])[4]")
	public WebElement TextBox;

	@FindBy(xpath="(//span[text()='Save'])[2]")
	public WebElement TextBoxSave;

	//@FindBy(xpath="//div[@class='dx-dropdowneditor-icon'][1]")
	@FindBy(xpath="//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement Communityfilter;

	//@FindBy(xpath="//span[normalize-space()='1100 Trinity Mills Condos']")
	//@FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	@FindBy(xpath="//td[normalize-space()='1100 Trinity Mills Condos']")
	public WebElement Communityfiltervalue;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-icon'])[2]")
	public WebElement searchby;

	@FindBy(xpath="//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Request Date']")
	public WebElement searchbyvalue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[2]")
	public WebElement Begin_Date;

	//@FindBy(xpath="//span[text()='Search']")
	@FindBy(xpath="//div[@title='Search']")
	public WebElement searchbutton;

	@FindBy(xpath="//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']")
	public WebElement closedtab_loader;

	//@FindBy(xpath="//span[normalize-space()='Add Job']")
	//@FindBy(xpath="(//div[@class='dx-button-content'])[5]")
	//@FindBy(xpath="(//dx-button[@_ngcontent-hwh-c26 ])[2]")
	//@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[8]")
	@FindBy(xpath="//dx-button[@aria-label='Add Job']") 
	public WebElement AddJob;

	//@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[18]")
	//@FindBy(xpath="(//div[@class='dx-texteditor-container'])[45]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/dx-box[1]/div[2]/div[1]/dx-box[1]/div[1]/div[1]/app-work-data-editor[1]/dx-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-custom-select-box[1]/dx-select-box[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container'])[49]")
	public WebElement JobType;

	//@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
	//@FindBy(css="div[class='dx-item dx-list-item dx-state-hover'] div[class='dx-item-content dx-list-item-content']")
	public WebElement JobValue;
	
	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[2]")
	public WebElement JobValue_completed_job_button;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[19]")
	public WebElement SendTo;

	@FindBy(xpath="//div[text()='Amberwood']")
	public WebElement SendToValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[20]")
	public WebElement PaperType;

	@FindBy(xpath="//div[text()='Standard Weight']")
	public WebElement PaperTypeValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[21]")
	public WebElement Ink;

	@FindBy(xpath="//div[text()='Black & White']")
	public WebElement InkValue;

        @FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[22]")
	public WebElement PaperColor;

	@FindBy(xpath="//div[text()='White']")
	public WebElement PaperColorValue;

	//@FindBy(xpath="//span[text()='Include Postage Paid:']")
	@FindBy(xpath="(//label[@class='dx-field-item-label dx-field-item-label-location-top'])[11]")
	public WebElement Postage;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[23]")
	public WebElement PostagePaid;

	@FindBy(xpath="(//div[text()='Yes'])[2]")
	public WebElement PostagePaidValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[24]")
	public WebElement Residents;

	@FindBy(xpath="(//div[text()='No'])[2]")
	public WebElement ResidentsValue;

	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[25]")
	public WebElement Outside;

	@FindBy(xpath="//div[text()='None']")
	public WebElement OutsideValue;

	//@FindBy(xpath="//span[text()='Save & Close']")
	//@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[25]")
	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon' and @aria-label='Save & Close']")
	public WebElement SaveClose;

	//@FindBy(xpath="//span[contains(text(),'Completion Job')]")
	//@FindBy(xpath="(//div[@class='dx-item dx-tab dx-tab-selected'])[2]")
	//@FindBy(xpath="(//div[@class='dx-item dx-tab dx-tab-selected' and @role='tab'])[2]")
	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[5]")
	public WebElement AddCompletionJob;

	//@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[31]")
	//@FindBy(xpath="(//input[@autocomplete='off' and @role='combobox'])[31]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/dx-box[1]/div[2]/div[1]/dx-box[1]/div[1]/div[1]/app-completion-jobs[1]/dx-box[1]/div[1]/div[1]/dx-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container'])[68]")
	public WebElement CloseJob;

	//@FindBy(xpath="//div[text()='No keep it open']")
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	//@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[12]")
	@FindBy(xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
	public WebElement CloseJobValue;

	//@FindBy(xpath="//span[text()='Add Item']")
	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @title='Add Item']")
	public WebElement AddItem;

	//@FindBy(xpath="//span[@class='dx-button-text' and text()='Close']")
	//@FindBy(xpath="(//div[@class='dx-button-content'])[92]")
	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @aria-label='Close']")
	public WebElement AddCompletionJobClose;

	//@FindBy(xpath="//span[text()='Add Completed Job']")
	//@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[9]")
	//@FindBy(xpath="(//div[@class='dx-button-content'])[6]")
	@FindBy(xpath="//dx-button[@aria-label='Add Completed Job']")
	public WebElement AddCompletedJob;

	//@FindBy(xpath="//span[text()='Yes' and @class='dx-button-text']")
	//@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-dialog-button' and @aria-label='Yes']")
	//@FindBy(xpath="(//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-dialog-button'])[2]")
	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-dialog-button' and @aria-label='Yes']")
	public WebElement Confirmation;
	
	@FindBy(xpath="//dx-button[@aria-label='Close']//div[@class='dx-button-content']")
	public WebElement Confirmation_ok;
	
	//@FindBy(xpath="//span[text()='Close']")
	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @title='Close']")
	public WebElement CompletedJobClose;

	@FindBy(xpath="//td[@aria-label='Sunday, November 1, 2020' and @class='dx-calendar-cell dx-calendar-contoured-date' ]")
	public WebElement BeginDateValue;
	
	//@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon' and @title='Save & Add Documents' ]")
        @FindBy(xpath="//div[@title='Save & Add Documents']")
	public WebElement SaveDocument;
        
        @FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon' and @aria-label='Close']")
        public WebElement AddJobButtonClose;
        
       @FindBy(xpath="//dx-button[@type='success']")
       public WebElement AddSuccessMsg;

//method declaration	
	public void FulfillmentQueuePageLanding() 
	{
		
		//Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.navigate().to(FulfillmentQueueURL);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		//statement which prints the argument passed to it
		System.out.println("======== Navigating to Fulfillment Queue ========");
		
		//Get current URL
		//String actualURL = driver.getCurrentUrl();
		
		//statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());
		
		//method used to compare the actual and expected results
		//Assert.assertEquals(actualURL, FulfillmentQueueURL);
	}

	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		//allows to execute JavaScript code
		js.executeScript("arguments[0].click();", fullScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		//if statement to specify a block of Java code to be executed if a condition is true
		if (normalScreenIcon.isDisplayed()) {
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

	public boolean expandCollapseOptionClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		wait.until(ExpectedConditions.elementToBeClickable(collapseIcon));
		js.executeScript("arguments[0].click();", collapseIcon);
		
		//block of code to be tested for errors while it is being executed
		try 
		{
			Thread.sleep(2000);
		}
		//block of code to be executed, if an error occurs in the try block.
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		//statement which prints the argument passed to it
		System.out.println("Clicked on Collapse icon");

		wait.until(ExpectedConditions.elementToBeClickable(expandIcon));
		js.executeScript("arguments[0].click();", expandIcon);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked on Expand icon");
		
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		return true;
	}

	public boolean columnChooserClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(resetLayout));
		System.out.println("++++++In select Coloumn Chooser+++++++");
		wait.until(ExpectedConditions.elementToBeClickable(columnChooser));
		js.executeScript("arguments[0].click();", columnChooser);

		System.out.println("Clicked Column Chooser");

		List<WebElement> workOrdersColumnChooser = driver.findElements(By.cssSelector("div[class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable'] ul[role='group'] li"));
		System.out.println("List size is: " + workOrdersColumnChooser.size());
		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		closeColChooser.click();

		//statement which prints the argument passed to it
		System.out.println("Column Chooser closed");
		return true;

	}

	public void Switchtab() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		js.executeScript("arguments[0].click();", closedjobs);

		// click() element method
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment7']")));

		//statement which prints the argument passed to it
		System.out.println("Closed jobs Tab Selected");
		
		if (closedjobs.isEnabled() == true) 
		{
			//statement which prints the argument passed to it
			System.out.println("Closed jobs tab : True");
		} 
		else 
		{
			//statement which prints the argument passed to it
			System.out.println("Closed jobs tab : False");
		}

		js.executeScript("arguments[0].click();", activejobs);

		System.out.println("Active jobs Tab Selected");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-message'][normalize-space()='Loading...']")));

		if (activejobs.isEnabled() == true) 
		{
			System.out.println("Active jobs tab : True");
		}

		else 
		{
			System.out.println("Active jobs tab : False");
		}
	}

	//method is a block of code which only runs when it is called
	public void viewedit() 
	{ 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader))); 
		actionButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader))); 
		ViewEdit.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
	}

	public void actionSaveClick() 
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		//Call a Method in Java
		viewedit();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ActionSave.click();
		System.out.println("Action&Save Button is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ErrorClose.click();
		System.out.println("Clicked on Pop-up");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		Close.click();
		System.out.println("Window in closed");

	}

	public void verifyActionCloseButton() 
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//Call a Method in Java
		viewedit();

		String Fulfillment_Popup = driver.getWindowHandle();
		driver.switchTo().window(Fulfillment_Popup);
		wait.until(ExpectedConditions.elementToBeClickable(PopupClose));
		System.out.println("Fulfillment Job Details Viewing Job Pop-up status : " + PopupClose.isEnabled());
		System.out.println("Fulfillment Job Details Viewing Job Pop-up Close button is clicked");

		PopupClose.click();
	}

	public void actionSaveCloseClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		//Call a Method in Java
		viewedit();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ActionSaveClose.click();
		System.out.println("Action&Save Button is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ErrorClose.click();
		System.out.println("Error Message is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		Close.click();
		
		//statement which prints the argument passed to it
		System.out.println("Window in closed");
	}

	public void refreshQueuebutton() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		RefreshQueue.click();
		
		//statement which prints the argument passed to it	
		System.out.println("Refresh Queue button is clicked");
	}

	public void ActionDocumenttabclick()
	{    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//Call a Method in Java
		viewedit();
		
		Documents.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		DocumentsClose.click();
		
		//statement which prints the argument passed to it
		System.out.println("Document tab window is closed");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}

	public void ActionCompletionttabclick() 
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		
		//Call a Method in Java
		viewedit();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon"))); 
		CompletionJob.click();
		
		//statement which prints the argument passed to it
		System.out.println("Completion Job is Clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon"))); ShowNotes.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon"))); TextBox.sendKeys("Notes of Fulfillment");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon"))); TextBoxSave.click();
		System.out.println("Notes saved successfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon"))); CompletionJobClose.click();
		System.out.println("Completion Job tab window is closed");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		//********************************* Save Button Click *******************************************
		//Call a Method in Java
		viewedit();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		CompletionJob.click();

		//statement which prints the argument passed to it
		System.out.println("Completion Job is Clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ShowNotes.click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		TextBox.sendKeys("Notes of Fulfillment ");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		TextBoxSave.click();

		//statement which prints the argument passed to it
		System.out.println("Notes saved successfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		CompletionJobSave.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		System.out.println("Save Button clicked");

		// To handle "Error sending email pop-up, current window closed

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
		
		String Email_Popup = driver.getWindowHandle();
		driver.switchTo().window(Email_Popup);

		

		//********************************* Save& CLose Button Click *******************************************
		//CompletionJobSaveandClose.click();
		
		 //allows to execute JavaScript code
		js.executeScript("arguments[0].click();", CompletionJobSaveandClose);
		
		System.out.println("Save & Close Button clicked");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		//To handle "Error sending email. There was an error while sending email" pop-up close current window
		try 
		{
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			robot.delay(300);
		} 
		catch (java.awt.AWTException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String Email_Popupwindow = driver.getWindowHandle();
		driver.switchTo().window(Email_Popupwindow);

		 //allows to execute JavaScript code
		js.executeScript("arguments[0].click();", CompletionJobClose);
		
		//CompletionJobClose.click();
		
		//CompletionJobClose.click();
		
		//statement which prints the argument passed to it
		System.out.println("Completion Job window is closed");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void AddJobSaveAndCloseButton() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", AddJob);
		//AddJob.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		String Add_job_Popupwindow = driver.getWindowHandle();
		driver.switchTo().window(Add_job_Popupwindow);

		 //allows to execute JavaScript code
		js.executeScript("arguments[0].click();", JobType);
		
		//statement which prints the argument passed to it
		System.out.println("job type is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", JobValue);
		System.out.println("job type is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", SendTo);
		System.out.println("SendTo is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", SendToValue);
		System.out.println("SendToValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", PaperType);
		System.out.println("Paper Type is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", PaperTypeValue);
		System.out.println("PaperValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", Ink);
		System.out.println("Ink is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", InkValue);
		System.out.println("InkValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", PaperColor);
		System.out.println("Paper Color is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", PaperColorValue);
		System.out.println("PaperColorValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].scrollIntoView();", Postage);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", PostagePaid);
		System.out.println("PostagePaid is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", PostagePaidValue);
		System.out.println("PostagePaidValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", Residents);
		System.out.println("Residents is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", ResidentsValue);
		System.out.println("ResidentsValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", Outside);
		System.out.println("Outside is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", OutsideValue);
		System.out.println("OutsideValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", SaveClose);

		//statement which prints the argument passed to it
		System.out.println("Job record is saved");
		
		String Add_Popup = driver.getWindowHandle();
		driver.switchTo().window(Add_Popup);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(Confirmation_ok));
    	js.executeScript("arguments[0].click();", Confirmation_ok);
    	System.out.println("Ok button clicked");
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		//To handle "Error sending email. There was an error while sending email" pop-up close current window
    	try {
    		Robot robot = new Robot();
    		robot.keyPress(KeyEvent.VK_ESCAPE);
    		robot.delay(300);
    		robot.keyRelease(KeyEvent.VK_ESCAPE);
    		robot.delay(300);

    	} 
    	catch (java.awt.AWTException e) 
    	{
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	

	}
	
	public void AddCompletionJobtab() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		wait.until(ExpectedConditions.elementToBeClickable(AddJob));
		js.executeScript("arguments[0].click();", AddJob);
		//AddJob.click();
		
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		wait.until(ExpectedConditions.elementToBeClickable(AddCompletionJob));
		js.executeScript("arguments[0].click();", AddCompletionJob);
		
		//statement which prints the argument passed to it
		System.out.println("AddCompletionJob is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(CloseJob));
		js.executeScript("arguments[0].click();", CloseJob);
		System.out.println("Close Job is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", CloseJobValue);
		System.out.println("CloseJobValue is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(AddItem));
		js.executeScript("arguments[0].click();", AddItem);
		System.out.println("AddItem is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(AddCompletionJobClose));
		js.executeScript("arguments[0].click();", AddCompletionJobClose);
		
		//statement which prints the argument passed to it
		System.out.println("AddCompletionJobClose is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}

    
    public void AddCompletedJobbuttonSaveandAddDocuments()
    {
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

    	js.executeScript("arguments[0].click();", AddCompletedJob);
    	//AddCompletedJob.click();
    	
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		String AddcompletedJob_Popup = driver.getWindowHandle();
		driver.switchTo().window(AddcompletedJob_Popup);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(Confirmation));
    	js.executeScript("arguments[0].click();", Confirmation);
    	System.out.println("Confirmation is clicked");
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

    	wait.until(ExpectedConditions.elementToBeClickable(SaveDocument));
    	js.executeScript("arguments[0].click();", SaveDocument);
    	System.out.println("SaveDocument is clicked");
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
    	//To handle "Error sending email. There was an error while sending email" pop-up close current window
    	try {
    		Robot robot = new Robot();
    		robot.keyPress(KeyEvent.VK_ESCAPE);
    		robot.delay(300);
    		robot.keyRelease(KeyEvent.VK_ESCAPE);
    		robot.delay(300);

    	} 
    	catch (java.awt.AWTException e) 
    	{
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}

	   }
    
    
    public void AddCompletedJobbuttonclick() 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    	wait.until(ExpectedConditions.elementToBeClickable(CompletedJobClose));
    	js.executeScript("arguments[0].click();", CompletedJobClose);
    	System.out.println("Completed Job Close button  is clicked");
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

    }

    public void ClosedJobsSearchButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.elementToBeClickable(closedjobs));
		js.executeScript("arguments[0].click();", closedjobs);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment7']")));

		//statement which prints the argument passed to it
		System.out.println("Closed jobs Tab Selected");
		
		if (closedjobs.isEnabled() == true) 
		{
			System.out.println("Closed jobs tab : True");
		} else 
		{
			System.out.println("Closed jobs tab : False");
		}

		wait.until(ExpectedConditions.elementToBeClickable(Communityfilter));
		
		// click() element method
		js.executeScript("arguments[0].click();", Communityfilter);
		//Communityfilter.click();

		wait.until(ExpectedConditions.elementToBeClickable(Communityfiltervalue));
		js.executeScript("arguments[0].click();", Communityfiltervalue);
		//Communityfiltervalue.click();  

		js.executeScript("arguments[0].click();", Begin_Date);
		System.out.println("Begin_Date is clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		Begin_Date.clear();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		Begin_Date.sendKeys("09/01/2020");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
		js.executeScript("arguments[0].click();", searchbutton);
		
		//searchbutton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("closedtab_loader")));

		if(actionButton.isDisplayed()==true) 
		{
			System.out.println("Records are found");

		}
		else 
		{
			System.out.println("Record Found");
		}

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("closedtab_loader")));

	}

	

}
