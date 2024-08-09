package com.ciranet.myworkqueue.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class InternalTasksPage extends BasePage
{
	public InternalTasksPage(WebDriver driver) 
	{
		super(driver);
		LoggerManager.debug("======== Initializing the Configurations Page Objects ======== ");
	}
	
	// Initialising of object
	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//span[normalize-space()='Internal Tasks']")
	WebElement internalTaskmenu;
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='fas fa-star fa-stack-1x dx-theme-accent-as-text-color']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy (xpath="(//span[@class='dx-tab-text'])[2]")
	WebElement closeTab;

	@FindBy (xpath="(//div[@role='tab'])[1]")
	WebElement openTab;

	@FindBy (xpath="//div[@class='dx-datagrid-content']")
	WebElement gridData;

	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
	WebElement ownerSearchBox;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	WebElement toolbarMenu;

	@FindBy(xpath = "//ul[contains(@class,'dx-treeview-node-container dx-treeview-node-container-opened')]//li//div//span[contains(text(),'My Work Queue')]")
	WebElement menuMyWorkQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[normalize-space()='Internal Tasks']")
	WebElement menuInternalTasks;

	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[2]")
	WebElement departmentDropDown;

	@FindBy(xpath = "//div[contains(text(),'Accounting Services Group')]")
	WebElement departmentValue;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	WebElement selectCommunityDropdown;

	@FindBy(xpath = "//span[normalize-space()='1100 Trinity Mills Condos']")
	WebElement selectCommunityValue;

	@FindBy(xpath = "//div//input[@name='internalTask.shortDescription']")
	WebElement shortDescription;

	@FindBy(xpath = "//div//textarea[@name='internalTask.description']")
	WebElement description;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[15]")
	WebElement priority;

	@FindBy(xpath = "//div[contains(text(),'High')]")
	WebElement priorityValue;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/dx-box[1]/div[1]/dxi-item[1]/dx-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement calendar;

	@FindBy(xpath = "//div//textarea[@name='internalTask.statusCode']")
	WebElement status;

	@FindBy(xpath = "//div//span[normalize-space()='Add Task']")
	WebElement btnAddTask;

	@FindBy(xpath = "//input[@id='dx_dx-c73a5fe1-2a45-c7c4-820a-bdea20036215_internalTask.priorityId']")
	WebElement dropdownPriority;

	@FindBy(xpath = "//dx-toolbar[@class='button-container dx-toolbar dx-widget dx-visibility-change-handler dx-collection']//div[@class='dx-toolbar-items-container']")
	WebElement popupAddTask;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	WebElement btnCancel;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement btnSave;

	@FindBy(xpath ="//sup[@class='page-help-icon']//a[@class='fas fa-question-circle']")
	WebElement helpInternalTask;

	@FindBy(xpath = "//span[normalize-space()='Email Settings']")
	WebElement emailButton;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	WebElement emailCancel;

	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[1]")
	WebElement activeFilterDropdown;

	@FindBy(xpath = "//dx-select-box[@displayexpr='text']//input[@role='combobox']")
	WebElement activeFilterValue;

	@FindBy(xpath = "//div[contains(text(),'All Tasks')]")
	WebElement allTasks;

	@FindBy(xpath = "(//div[@class='dx-button-content'][contains(.,'Action')])[1]")
	WebElement actionButton;

	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	WebElement editRecord;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	WebElement editCancelAction;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement editSaveAction;

	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	WebElement refreshButton;

	@FindBy(xpath = "//div[@class='dx-datagrid-content']//table//tbody//td[@colspan='27']")
	WebElement actionVisibility;

	@FindBy(xpath = "//div[contains(text(),'Delete Task')]")
	WebElement deleteTask;

	@FindBy(xpath = "//div[@class='dx-dropdowneditor-input-wrapper dx-selectbox-container']//span[@class='dx-icon dx-icon-clear']")
	WebElement cleardd;

	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public void internalTaskPageLanding() 
	{
		clickElement(myWorkQueueMenu);
		clickElement(internalTaskmenu);
		waitForInvisibility(loaderIcon);
	}

	public void addTaskSave() 
	{
		clickElement(departmentDropDown);
		waitForInvisibility(loaderIcon);

		clickElement(departmentValue);
		waitForInvisibility(loaderIcon);

		clickElement(btnAddTask);
		waitForInvisibility(loaderIcon);

		String addTaskPopup = driver.getWindowHandle();
		driver.switchTo().window(addTaskPopup);
		System.out.println("Inside Add Task popup");
		new WebDriverWait(driver, Duration.ofSeconds(3));

		clickElement(selectCommunityDropdown);
		waitForInvisibility(loaderIcon);

		clickElement(selectCommunityValue);
		waitForInvisibility(loaderIcon);

		Actions actions = new Actions(driver);
		actions.moveToElement(shortDescription).perform();
		actions.click(shortDescription).perform();
		shortDescription.sendKeys("Test");
		System.out.println("Clicked Short Description");
		actions.moveToElement(description).perform();

		actions.click(description).perform();
		description.sendKeys("Test");
		System.out.println("Clicked Description");

		clickElementJS(priority);
		waitForInvisibility(loaderIcon);

		clickElement(priorityValue);
		waitForInvisibility(loaderIcon);

		System.out.println("Priority Selected : " + priorityValue.getText());
		actions.moveToElement(calendar).perform();
		actions.click(calendar).perform();
		calendar.sendKeys("10/14/2022");

		clickElement(btnSave);
		waitForInvisibility(loaderIcon);

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
	}

	public void addTaskCancel() throws AWTException 
	{

		clickElement(departmentDropDown);
		waitForInvisibility(loaderIcon);

		clickElement(departmentValue);
		waitForInvisibility(loaderIcon);

		clickElement(btnAddTask);
		waitForInvisibility(loaderIcon);

		String addTaskPopup = driver.getWindowHandle();
		driver.switchTo().window(addTaskPopup);
		System.out.println("Inside Add Task popup");
		clickElement(btnCancel);
		waitForInvisibility(loaderIcon);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Cancel click");
	}

	public boolean columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(resetLayout);
		clickElementJS(columnChooser);
		clickElement(closeColChooser);
		System.out.println("Column Chooser closed");
		return true;
	}
	
	public boolean expandCollapseClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(expandIcon);
		System.out.println("Clicked on Expand icon");
		if(closeColChooser.equals(closeColChooser)) 
		{
			System.out.println("Expand icon is working");
		}
		else 
		{
			System.out.println("Expand icon is not working");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(collapseIcon);
		System.out.println("Clicked on Collapse icon");
		return true;
	}

	public boolean toolbarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);
		waitForInvisibility(loaderIcon);
		if(normalScreenIcon.isDisplayed())
		{
			System.out.println("FullScreen icon button clicked");
			return true;
		}
		else
		{
			System.out.println("FullScreen icon button not clicked");
			return false;
		}
		
	}

	public boolean toolBarNormalScreen() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(normalScreenIcon);
		clickElementJS(normalScreenIcon);
		waitForInvisibility(loaderIcon);
		if(fullScreenIcon.isDisplayed())
		{
			System.out.println("NormalScreen icon button clicked");
		}
		else
		{
			System.out.println("NormalScreen icon button not clicked");
		}
		return true;
	}
	
	public void emailSetting() 
	{
		waitForElementToBeVisible(emailButton);
		clickElement(emailButton);
		waitForInvisibility(loaderIcon);
		
		String emailSettingPopup = driver.getWindowHandle();
		driver.switchTo().window(emailSettingPopup);
		
		waitForElementToBeVisible(emailCancel);
		clickElement(emailCancel);
		waitForInvisibility(loaderIcon);
	}
	
	public boolean switchBetweenOpenClosedTasks() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(closeTab);
		clickElement(closeTab);
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeVisible(openTab);
		clickElement(openTab);
		waitForInvisibility(loaderIcon);
		return true;
	}

	public boolean refreshClick() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(refreshButton);
		clickElement(refreshButton);
		waitForInvisibility(loaderIcon);
		return true;
	}

	public boolean activeFilterSelection() 
	{
		waitForElementToBeVisible(activeFilterDropdown);
		clickElement(activeFilterDropdown);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(allTasks);
		clickElement(allTasks);
		waitForInvisibility(loaderIcon);
		return true;
	}

	public void verifyCancelInEditRecord() throws AWTException 
	{
		clickElement(activeFilterDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(allTasks);
		waitForInvisibility(loaderIcon);
		clickElement(expandIcon);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(actionButton);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(editRecord);
		waitForInvisibility(loaderIcon);
		
		String editRecordPopup = driver.getWindowHandle();
		driver.switchTo().window(editRecordPopup);
		wait.until(ExpectedConditions.elementToBeClickable(editCancelAction));
		System.out.println("Cancel Edit Record Functionality Status : " + editCancelAction.isEnabled());
		waitForElementToBeVisible(editCancelAction);
		clickElement(editCancelAction);
	}

	public boolean verifyDeleteRecord() throws AWTException 
	{
		clickElement(expandIcon);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(actionButton);
		clickElement(actionButton);
		clickElement(deleteTask);
		waitForInvisibility(loaderIcon);
		
		pressEscapeKey();
		return true;
	}

	public void verifyEditSaveRecord() throws Exception 
	{
		waitForElementToBeVisible(expandIcon);
		clickElement(expandIcon);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(actionButton);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(editRecord);
		clickElement(editRecord);
		waitForInvisibility(loaderIcon);
		String editRecordPopup = driver.getWindowHandle();
		driver.switchTo().window(editRecordPopup);
		wait.until(ExpectedConditions.elementToBeClickable(editSaveAction));
		System.out.println("Edit Save Record Functionality Status : " + editSaveAction.isEnabled());
		editSaveAction.click();
		System.out.println("Clicked on Save");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void helpInternalTask() 
	{
		waitForElementToBeVisible(helpInternalTask);
		clickElement(helpInternalTask);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(helpInternalTask);
		clickElement(helpInternalTask);
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(helpInternalTask);
		clickElement(helpInternalTask);
		waitForInvisibility(loaderIcon);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.switchTo().window(tabs2.get(0));
	}

}
