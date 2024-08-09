package com.ciranet.myworkqueue.pages;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class DiscloProcessingPropertyConveyancePage extends BasePage
{
	private static final Exception AWTException = null;
	private WebDriver driver;

	public DiscloProcessingPropertyConveyancePage(WebDriver driver) 
	{
		super(driver);
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//span[normalize-space()='Disclosure Processing']")
	WebElement disclosureProcessingMenu;

	@FindBy(xpath = "//span[normalize-space()='Property Conveyances']")
	WebElement PropertyConveyanceMenu;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//*[@id='dx-col-1656']")
	WebElement communityColumn;

	//xpath for Edit Community Cancel
	@FindBy(xpath="(//div[@aria-label='Action'])[1]")
	WebElement actionButtonOfFirstRow;

	@FindBy(xpath = "(//span[text()='Action'])[3]") //"(//span[@class='dx-button-text'])[4]")
	WebElement actionButton;

	@FindBy(xpath ="(//div[@ng-reflect-klass='menu-text'])[2]")
	WebElement editCommunity;

	@FindBy(xpath ="(//div//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[3]")
	WebElement editCommunityCancelButton;

	@FindBy(xpath ="(//input[@type='text'])[16]")
	WebElement communityDrpDown;

	@FindBy(xpath ="//td[text()=\"1100 Trinity Mills Condos\"]")
	WebElement communityValueDrpDown;

	@FindBy(xpath ="(//span[@class='dx-button-text'])[54]")
	WebElement editCoummunityUpdate;

	@FindBy(xpath ="(//div[@aria-label='Action'])[3]")
	WebElement actionClearCoummunity;

	@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Clear Community')]")
	WebElement clearCoummunity;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
	WebElement processPropertyConveyanceMenu;

	@FindBy(xpath = "//div[@class='dx-switch-off']")
	WebElement compactModeOff;

	@FindBy(xpath = "//div[@class='dx-switch-on']")
	WebElement compactModeOn;

	@FindBy(xpath = "(//div[@role='tab'])[2]")
	WebElement completedTab;

	@FindBy(xpath ="(//div[@role='tab'])[1]")
	WebElement openTab;

	@FindBy(xpath="(//input[contains(@class,'dx-texteditor-input')])[2]")
	WebElement fromDate;

	@FindBy(xpath="(//input[contains(@class,'dx-texteditor-input')])[3]")
	WebElement toDate;

	@FindBy(xpath ="(//div[@class='menu-text'])[3]")
	WebElement deleteCoummunity;

	@FindBy(xpath = "//dx-button[@hint='Refresh'][contains(.,'Refresh')]") // "(//div[contains(@class,'dx-button-content')])[16]")
	public WebElement refreshButton;

	@FindBy(xpath = "(//div[@class=\"dx-button-content\"])[13]")
	public WebElement showSearch;

	@FindBy(xpath = "(//div[@aria-label='Action'])[1]")
	public WebElement actionProcess;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
	public WebElement processProperty;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement selectCommunity;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[22]")
	public WebElement propertyAdress;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	public WebElement search;

	@FindBy(xpath = "//td[normalize-space()='161 Gilbert Street']")
	public WebElement communityDropdown;

	@FindBy(xpath = "(//td[normalize-space()='161 Gilbert Street'])[2]")
	public WebElement communityValue;

	@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//span//span[1]")
	public WebElement nextbutton;	

	@FindBy(xpath = "//div[@title='Next']//span//span[1]")
	public WebElement nextbutton2;

	@FindBy(xpath = "(//input[contains(@class,'dx-texteditor-input')])[29]")
	public WebElement owner;

	@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[4]")
	public WebElement ownerSearch;

	@FindBy(xpath = "(//td[text()=\"Romich\"])[1]")
	public WebElement ownerValue;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	public WebElement close;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	public WebElement iSquare;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	public WebElement iSquarePlus;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement resetButton;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderIcon;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderofPropertyOwnershipConveyance;

	@FindBy(xpath = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderOfPage;

	@FindBy(xpath = "(//div//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[2]")
	private WebElement searchWorkQueue;

	public void propertyConveyancePageLanding() 
	{
		clickElement(myWorkQueueMenu);
		clickElement(disclosureProcessingMenu);
		waitForInvisibility(loaderofPropertyOwnershipConveyance);
		clickElement(PropertyConveyanceMenu);
	}

	public void toolBarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);
		if(normalScreenIcon.isDisplayed())
		{
			System.out.println("FullScreen icon button clicked");
		}
		else
		{
			System.out.println("FullScreen icon button not clicked");
		}
	}

	public void toolBarNormalScreen() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(normalScreenIcon);
		clickElementJS(normalScreenIcon);
		if(fullScreenIcon.isDisplayed())
		{
			System.out.println("NormalScreen icon button clicked");
		}
		else
		{
			System.out.println("NormalScreen icon button not clicked");
		}
	}

	public void actionEditCommunityCancel() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(editCommunity);
		waitForInvisibility(loaderIcon);
		clickElement(editCommunityCancelButton);
	}

	public void actionEditCommunityUpdate() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(editCommunity);
		waitForInvisibility(loaderIcon);
		clickElement(communityDrpDown);
		waitForInvisibility(loaderIcon);
		clickElement(communityValueDrpDown);
		waitForInvisibility(loaderIcon);
		clickElement(editCoummunityUpdate);
		System.out.println("Clicked on Update Button");
	}

	public void actionClearCommunity() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		waitForInvisibility(loaderIcon);
		clickElement(clearCoummunity);
		System.out.println("Community cleared successfully.");
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

	public void compactModeToggleOnPropertyConveyancePopup() throws AWTException 
	{
		waitForInvisibility(loaderOfPage);
		clickElementJS(actionProcess);
		clickElement(processProperty);
		String managePopup = driver.getWindowHandle();
		driver.switchTo().window(managePopup);
		System.out.println("Inside Create Property Coveyance PopUp");
		waitForInvisibility(loaderOfPage);
		clickElementJS(compactModeOff);
		System.out.println("Compact Mode Off clicked");
		waitForElementToBeClickable(compactModeOn);
		clickElementJS(compactModeOn);
		pressEscapeKey();
	}
	public void searchWorkQueueButtonClick() 
	{
		waitForInvisibility(loaderIcon);
		completedTab();
		fromDate.clear();
		fromDate.sendKeys("01/01/2020");
		waitForInvisibility(loaderIcon);
		driver.findElement(By.xpath("(//input[contains(@class,'dx-texteditor-input')])[4]")).sendKeys("1100");
		waitForInvisibility(loaderIcon);
		clickElementJS(searchWorkQueue);
		clickElementJS(openTab);
		System.out.println("Clicked on Open Tab");
		waitForInvisibility(loaderIcon);
	}

	public void toggleCompletedOpenTabClick() 
	{
		waitForInvisibility(loaderIcon);
		completedTab();
		if (fromDate.isDisplayed()) {
			assertTrue(fromDate.isDisplayed(),"Completed Tab is not clicked");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(openTab);
		waitForInvisibility(loaderIcon);
	}

	public void completedTab() 
	{
		clickElementJS(completedTab);
		waitForInvisibility(loaderIcon);
	}

	public void verifyActionDelete() throws AWTException
	{
		waitForInvisibility(loaderIcon);
		clickElement(actionButton);
		clickElement(deleteCoummunity);
		System.out.println("Clicked on delete Button");
		waitForInvisibility(loaderIcon);
		
		pressEscapeKey();
		System.out.println("Escaped the Confirmation Popup");
	}

	public void escapeCode() 
	{
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.delay(300);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			robot.delay(300);

			System.out.println("Esc button pressed");
		} 
		catch (java.awt.AWTException e) 
		{
			e.printStackTrace();
		}
	}

	public void verifyRefreshButton() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(refreshButton);
		waitForInvisibility(loaderIcon);
	}

	public void expandOptionClick() 
	{
		waitForInvisibility(loaderIcon);
		WebElement communityColumn = driver.findElement(By.xpath("//td[@aria-label='Column Community']")); 
		WebElement toGroupPanel = driver.findElement(By.xpath("//div[@class='dx-group-panel-message']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(communityColumn, toGroupPanel).build().perform();
		waitForInvisibility(loaderIcon);
		clickElement(iSquare);
		waitForInvisibility(loaderIcon);
		clickElement(iSquarePlus);
		waitForInvisibility(loaderIcon);
		clickElement(resetButton);
	}

	public void verifyActionProcessPropertyConveyance() throws AWTException 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(actionProcess);
		System.err.println("Clicked on Process Property Action Button");
		processProperty.click();
		pressEscapeKey();
		
		System.out.println("Clicked on Process Property  Button");
		waitForInvisibility(loaderIcon);
		pressEscapeKey();
		selectCommunity.click();
		System.out.println("Clicked on select community Button");
		waitForInvisibility(loaderIcon);
		clickElement(communityDropdown);
		waitForInvisibility(loaderIcon);
		clickElement(propertyAdress);
		waitForInvisibility(loaderIcon);
		clickElement(search);
		waitForInvisibility(loaderIcon);
		clickElement(communityValue);
		System.out.println("Clicked on Community Value Button");
		waitForInvisibility(loaderIcon);
		clickElement(nextbutton);
		waitForInvisibility(loaderIcon);
		clickElement(nextbutton2);
		System.out.println("Clicked on second Next Button");
		waitForInvisibility(loaderIcon);
		clickElementJS(owner);
		clickElement(owner);
		owner.sendKeys("romich");
		System.out.println("Clicked on owner Button");
		waitForInvisibility(loaderIcon);
		clickElement(ownerSearch);
		waitForInvisibility(loaderIcon);
		clickElement(ownerValue);
		clickElement(nextbutton2);
		clickElement(nextbutton2);
		clickElement(nextbutton2);

		System.out.println("Clicked on Final Next Button");
		waitForInvisibility(loaderIcon);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.delay(200);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			robot.delay(200);
		} 
		catch (java.awt.AWTException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();
	}
}
