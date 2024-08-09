package com.ciranet.myworkqueue.pages;

import java.text.SimpleDateFormat;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

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

public class ProjectsTasksPage 
{
	private WebDriver driver;

	public ProjectsTasksPage(WebDriver driver) 
	{
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}
	String projectTaskURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/projects-tasks";


	public void ProjectTaskPageLanding() {
		driver.navigate().to(projectTaskURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.println("======== Navigating to Project Task ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, projectTaskURL);
	}
	// Initializing the Page Objects:
	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
	public WebElement ownersearchBox;

	// Initializing the Page Objects:
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement toolbarMenu;

	// Initializing the Page Objects:
	@FindBy(xpath = "//ul[contains(@class,'dx-treeview-node-container dx-treeview-node-container-opened')]//li//div//span[contains(text(),'My Work Queue')]")
	public WebElement menuMyWorkQueue;

	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Open Tasks']")
	public WebElement opentasks;
	@FindBy(xpath = "(//div[@id='dx-d24991e9-3d1a-1189-1d38-cb2e46db23cc'])[1]")
	public WebElement openTabStatus;
	// Initializing the Page Objects:
	@FindBy(xpath = "//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Tasks']")
	public WebElement closedtasks;
	@FindBy (xpath = "(//div[@class='dx-item dx-tab dx-tab-selected dx-state-hover'])[1]")
	public WebElement closeTabStatus;
	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Projects / Tasks']")
	public WebElement menuProjectTasks;

	// Initializing the Page Objects:
	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[1]")
	public WebElement activeFilterDropdown;
	//@FindBy(xpath = "(//div[@class='dx-button-content'][contains(.,'Action')])[1]")
	@FindBy(xpath = "//div[@class='dx-button-content']//span[normalize-space()='Action']")
	public WebElement actionButton;
	@FindBy(xpath = "//div[@class='menu-text'][normalize-space()='View / Edit']")
	public WebElement vieweditOption;
	@FindBy(xpath = "//div[@class='dx-template-wrapper']//textarea[@role='textbox']")
	public WebElement updateShortDesc;
	@FindBy(xpath = "//div//span[normalize-space()='Save']")
	public WebElement saveAction;
	// Initializing the Page Objects:
	@FindBy(xpath = "//div[contains(text(),'All Tasks')]")
	public WebElement AllTaskFiltervalue;

	// Initializing the Page Objects:
	@FindBy(xpath = "//div[contains(text(),'My Tasks')]")
	public WebElement myTaskFiltervalue;
	@FindBy(xpath = "//body/app-root[1]/dx-box[1]/div[1]/dxi-item[1]/app-side-nav-outer-toolbar[1]/div[1]/dx-drawer[1]/div[1]/div[2]/div[2]/div[1]/app-project-task-main[1]/dx-box[1]/div[2]/dxi-item[1]/app-project-task[1]/dx-box[1]/div[1]/dxi-item[1]/dx-toolbar[1]/div[1]/div[1]/div[2]/div[1]/dx-select-box[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement activeFilterValue;
	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	public WebElement refreshbuttonclick;
	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Add New Project / Task']")
	public WebElement AddNewProjectTaskbuttton;

	// Initializing the Page Objects:
	@FindBy(xpath = "//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title dx-has-close-button']//div[@class='dx-toolbar-items-container']")
	public WebElement popupAddTask;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-button[@title='Cancel']//div[@class='dx-button-content']")
	public WebElement btnCancel;

	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Notification Settings']")
	public WebElement notificationbutton;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-switch[@aria-label='No']//div[@class='dx-switch-off'][normalize-space()='No']")
	public WebElement disableEmailnotification;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-switch[@aria-label='Yes']//div[@class='dx-switch-on'][normalize-space()='Yes']")
	public WebElement EnableEmailnotification;

	// Initializing the Page Objects:
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/dx-box[1]/div[1]/dxi-item[1]/dx-form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/dx-switch[1]/div[1]/div[1]/div[1]/div[3]")
	public WebElement NotifyMyselfNo;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-switch[@aria-label='Yes']//div[@class='dx-switch-on'][normalize-space()='Yes']")
	public WebElement NotifyMyselfYes;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-button[@aria-label='Close']//div[@class='dx-button-content']")
	public WebElement notificationClosebutton;

	// Initializing the Page Objects:
	@FindBy(xpath = "//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title dx-has-close-button']//div[@class='dx-toolbar-items-container']")
	public String NotificationSettingsPopUp;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-left']")
	WebElement expandIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	WebElement collapseIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;
	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-text dx-button-danger dx-button-has-icon']//i[@class='dx-icon cc-icon fas fa-times-circle']")
	WebElement fullscreenClose;
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-columnchooser fa-stack-2x']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement columnChooserClose;

	// Initializing the Page Objects:
	@FindBy(xpath = "//sup[@class='page-help-icon']")
	public WebElement helpProjectTask;

	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Add New Project / Task']")
	public WebElement AddNewProjectTaskButton;

	// Initializing the Page Objects:
	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement AddNewTaskCommunity;

	// Initializing the Page Objects:
	@FindBy(xpath = "//div//td[normalize-space()='1100 Trinity Mills Condominium Owners Association']")
	public WebElement AddNewTaskCommunityfilter;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-text-box[@class='dx-show-invalid-badge dx-textbox dx-texteditor dx-editor-outlined dx-texteditor-empty dx-widget dx-state-hover dx-state-focused']//input[@role='textbox']")
	public WebElement AddNewTaskItem;

	// Initializing the Page Objects:
	@FindBy(xpath = "//textarea[@role='textbox']")
	public WebElement AddNewTaskShortDescription;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-text-box[@class='dx-show-invalid-badge dx-textbox dx-texteditor dx-editor-outlined dx-texteditor-empty dx-widget dx-state-hover dx-state-focused']//input[@role='combobox']")
	public WebElement AddNewTaskResponsible;

	// Initializing the Page Objects:
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
	public WebElement AddNewTaskResponsiblefilter;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-date-box[@type='date']//input[@role='combobox']")
	public WebElement AddNewTaskDueDate;

	// Initializing the Page Objects:
	@FindBy(xpath = "//dx-select-box[@class='dx-show-invalid-badge dx-selectbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-outlined dx-texteditor-empty dx-widget dx-dropdowneditor dx-dropdowneditor-field-clickable dx-state-focused dx-dropdowneditor-active dx-state-hover dx-skip-gesture-event']//div[@class='dx-dropdowneditor-icon']")
	public WebElement AddNewTaskStatus;

	// Initializing the Page Objects:
	@FindBy(xpath = "//div[contains(text(),'In Progress')]")
	public WebElement AddNewTaskStatusfilter;
	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	public WebElement AddNewTaskCancelButton;
	// Initializing the Page Objects:
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement AddNewTaskShortSaveButton;

	// Initializing the Page Objects:
	@FindBy (xpath="(//span[@class='dx-tab-text'])[2]")
	public WebElement CloseTab;

	// Initializing the Page Objects:
	@FindBy (xpath="//input[@max='3650']")
	public WebElement DaysText;
	@FindBy(xpath = "//div//td[normalize-space()='Austin']")
	public WebElement daysValidRecord;
	// Initializing the Page Objects:
	@FindBy (xpath="//span[@class='dx-button-text']")
	public WebElement Refresh;

	@FindBy (xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	public WebElement expandandcollapse;

	@FindBy (xpath="//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	public WebElement rightArrow;

	@FindBy (xpath="//i[@class='dx-icon cc-icon fas fa-angle-double-left']")
	public WebElement leftArrow;




	@FindBy (xpath="//i[@class='fas fa-user-circle']")
	public WebElement userprofile;


	@FindBy (xpath="//span[normalize-space()='Logout']")
	public WebElement logoutclick;


	public boolean helpProjectTask() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(helpProjectTask));
		helpProjectTask.click();
		System.out.println("Help Clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		System.out.println("current URL : "+driver.getCurrentUrl());
		System.out.println("Clicked and Navigated to Help");
		driver.switchTo().window(tabs2.get(0));
		return true;
	}

	public void Activefilterselection() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		opentasks.click();
		System.out.println("Open Task Tab Selected");		
		wait.until(ExpectedConditions.elementToBeClickable(activeFilterDropdown));
		activeFilterDropdown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(myTaskFiltervalue));
		myTaskFiltervalue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("My Task Filter Selected");
		
		wait.until(ExpectedConditions.elementToBeClickable(activeFilterDropdown));
		activeFilterDropdown.click();
		System.out.print("Active Filter is clicked\n");
		wait.until(ExpectedConditions.elementToBeClickable(AllTaskFiltervalue));
		AllTaskFiltervalue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("All Task Filter selected");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

	}

	public void Switchtab() 
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(closedtasks));

		closedtasks.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.println("Closed Task Tab Selected");
		if (closedtasks.isEnabled()==true) 
		{
			System.out.println("Closed Task Status : True");
		}
		else
		{
			System.out.println("Closed Task Status : False");
		}
		//click() element method
		wait.until(ExpectedConditions.elementToBeClickable(opentasks));
		opentasks.click();
		System.out.println("Open Task Tab Selected");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		if (opentasks.isEnabled()==true) 
		{
			System.out.println("Open Task Status : True");
		}

		else
		{
			System.out.println("Open Task Status : False");

		}



	}

	public void RefreshButtonClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(refreshbuttonclick));
		refreshbuttonclick.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Verify Refresh");
		wait.until(ExpectedConditions.elementToBeClickable(opentasks));

		if (opentasks.isDisplayed()==true) 
		{
			System.out.println("Refresh button clicked");
		}

		else
		{
			System.out.println("Refresh button not clicked");

		}
	}

	public void NotificationSetting() 
	{

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(notificationbutton));
		notificationbutton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.println("Notification Setting Button Clicked \n Status : "+notificationbutton.isSelected());
		String NotificaionSettingPopup = driver.getWindowHandle();
		driver.switchTo().window(NotificaionSettingPopup);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Inside Notification Setting popup");

		String Notificationsettings_popup = driver.getWindowHandle();
		driver.switchTo().window(Notificationsettings_popup);

		wait.until(ExpectedConditions.elementToBeClickable(disableEmailnotification));
		disableEmailnotification.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(EnableEmailnotification));
		EnableEmailnotification.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(notificationClosebutton));
		notificationClosebutton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(opentasks));

		if (opentasks.isDisplayed()) 
		{
			System.out.println("Notification settings button clicked");

		}

		else
		{
			System.out.println("Notification settings button not clicked");

		}
	}

	public void expandCollapseClick ()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(rightArrow));
		rightArrow.click();
		System.out.println("Clicked to Hide Menu");
		if(rightArrow.isDisplayed()==true)
		{
			System.out.println("Status : Menu Hidden");
		}
		else
		{
			System.out.println("Status : Menu Display");
		}

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(leftArrow));
		leftArrow.click();
		System.out.println("Clicked to Display Menu");

		if(leftArrow.isDisplayed()==true)
		{
			System.out.println("Status : Menu Diplayed");
		}
		else
		{
			System.out.println("Status : Menu Hidden");
		}
	}

	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));
		fullScreenIcon.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fullscreen Selected");
		wait.until(ExpectedConditions.elementToBeClickable(fullscreenClose));

		if(fullscreenClose.isDisplayed()==true)
		{
			System.out.println("Status : FullScreen");
		}
		else
		{
			System.out.println("FullScreen not clicked");
		}

	}

	public void ToolBarNormalScreen() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));
		normalScreenIcon.click();
		System.out.println("Normal Screen Selected");
		wait.until(ExpectedConditions.elementToBeClickable(fullscreenClose));

		if(refreshbuttonclick.isDisplayed()==true)
		{
			System.out.println("Status : Normal Screen");
		}
		else
		{
			System.out.println("Normal Screen not clicked");
		}

	}

	public void columnChooserClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		columnChooser.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String columnChooserPopUp = driver.getWindowHandle();
		driver.switchTo().window(columnChooserPopUp);

		wait.until(ExpectedConditions.elementToBeClickable(columnChooserClose));
		columnChooserClose.click();

	}


	public void AddNewProjectTaskButtonClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		opentasks.click();
		System.out.println("Open Task Tab Selected");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(AddNewProjectTaskButton));
		AddNewProjectTaskButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.println("Add New Project Task Button Clicked");
		String AddNewTaskPopup = driver.getWindowHandle();
		driver.switchTo().window(AddNewTaskPopup);
		System.out.println("Inside Add Task PopUp");
		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskCommunity));
		AddNewTaskCommunity.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskCommunityfilter));
		AddNewTaskCommunityfilter.click();

		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskItem));
		AddNewTaskItem.click();
		AddNewTaskItem.sendKeys("Test Item Description");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskShortDescription));
		AddNewTaskShortDescription.click();
		AddNewTaskShortDescription.sendKeys("Test Short description");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AddNewTaskDueDate);
		//This will scroll the page till the element is found		
		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskDueDate));
		AddNewTaskDueDate.sendKeys("10/01/2022"); // date format mm/dd/yyyy

		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskStatus));
		AddNewTaskStatus.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskStatusfilter));
		AddNewTaskStatusfilter.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.elementToBeClickable(AddNewTaskCancelButton));
		AddNewTaskCancelButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Data Added and Clicked on Cancel");

		//To Add Project Task and display date of adding
		//AddNewTaskShortSaveButton.click();
		//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		//		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		//		Date date = new Date();
		//		System.out.println("Task Added on Date : " + formatter.format(date));
	}

	public void DaysTextbox()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		activeFilterDropdown.click();

		//Include only if Days in All task to be Verify
		//		System.out.print("Active Filter is clicked\n");
		//		AllTaskFiltervalue.click();
		//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		//		System.out.print("All Task Filter selected\n");
		//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		//		activeFilterDropdown.click();

		myTaskFiltervalue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.print("My Task Filter selected\n");

		//Days Verify
		CloseTab.click();
		System.out.println("Clicked on Closed Tasks");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		DaysText.clear();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		DaysText.sendKeys("400");
		System.out.println("Entered 400 Days Filter");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		Refresh.click();
		System.out.println("Clicked on Refresh");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Record Displayed with input 400 Days:"+daysValidRecord.getText());
	}

	public void verifyActionButton() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//expandIcon.click();
		Refresh.click();
		System.out.println("Clicked on Refresh");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(vieweditOption));
		vieweditOption.click();
		String editRecordPopup = driver.getWindowHandle();
		driver.switchTo().window(editRecordPopup);
		updateShortDesc.click();
		updateShortDesc.clear();
		updateShortDesc.sendKeys("Updated Short Description");
		wait.until(ExpectedConditions.elementToBeClickable(saveAction));
		saveAction.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println("Task Updated on Date : " + formatter.format(date));


	}

	public void userlogout() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(userprofile));
		userprofile.click();

		wait.until(ExpectedConditions.elementToBeClickable(userprofile));
		logoutclick.click();



	}



}