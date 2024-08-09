package com.ciranet.configurations.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class CommunityConfigPage extends BasePage
{

    // Initializing the Page Objects
    public CommunityConfigPage(WebDriver driver) {
        super(driver);
        LoggerManager.debug("======== Initializing the Configurations Page Objects ======== ");
    }

    // Page elements
    @FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
    private WebElement configurationsMenu;

    @FindBy(xpath = "//span[normalize-space()='Community']")
    private WebElement communityMenu;

    @FindBy(xpath = "//div[@class='dx-dropdowneditor-icon']")
    private WebElement configurationDropdown;

    @FindBy(xpath = "//span[normalize-space()='** Amenity **']")
    private WebElement configurationValueAmenity;

    @FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[2]")
    private WebElement contextDropdown;

    @FindBy(xpath = "//div[normalize-space()='Global']")
    private WebElement contextDropdownValue;

    @FindBy(xpath = "//span[normalize-space()='Refresh']")
    private WebElement refreshButton;

     @FindBy(xpath = "//span[normalize-space()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//span[normalize-space()='Board Approval']")
    private WebElement configDropdownBoardApproval;

    @FindBy(xpath = "//span[normalize-space()='Collection Letter Fees']")
    private WebElement configDropdownCollectionLetterFees;

    @FindBy(xpath = "//span[normalize-space()='Community Configuration']")
    private WebElement configDropdownCommunityConfiguration;
        
    @FindBy(xpath = "//span[contains(text(),'** Fulfillment Job Special Pricing Configuration *')]")
    private WebElement configDropdownFulfillmentJobSpecialPricingConfiguration;
    
    @FindBy(xpath = "//span[normalize-space()='Holidays']")
    private WebElement configDropdownHolidays;
    
    
    @FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;
    
	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement communityConfigurationsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Board Approval Notifications']")
	public WebElement boardApprovalNotificationsTab;
	
	@FindBy(xpath = "//span[normalize-space()='Board Approval Actions']")
	public WebElement boardApprovalActionsTab;
	
	@FindBy(xpath = "//span[normalize-space()='Board Approvals']")
	public WebElement boardApprovalsTab;
	
	@FindBy(xpath = "//span[@class='dx-button-text'][normalize-space()='Action']")
	public WebElement actionButton;
	
	
	
    
    // Method to press Escape key
    public void pressEscapeKey() throws AWTException 
    {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
    
    private void communityConfigActions() throws AWTException 
    {
        refreshButton.click();
        LoggerManager.debug("Performed Community Configurations actions");
    }
    
    public String navigateToConfigurationsPage() 
    {
    	waitForInvisibility(loaderIcon);	
		scrollToElement(configurationsMenu);
		clickElement(configurationsMenu);
		
        LoggerManager.debug("Clicked on Configurations");
        return configurationsMenu.getText();
    }
    
    public void navigateToCommunityConfigurations() 
    {
    	waitForInvisibility(loaderIcon);
    	
    	waitForInvisibility(loaderIcon);	
		scrollToElement(communityMenu);
		clickElement(communityMenu);
		waitForInvisibility(loaderIcon);
    	
    	LoggerManager.debug("Navigated to Community Configurations page");
    }

    public void selectCommunityConfigDropdowns(String strDropdownValue) throws AWTException 
    {
    	waitForInvisibility(loaderIcon);
    	clickElement(configurationDropdown);
    	switch (strDropdownValue) 
    	{
        case "Amenity":
        	configurationValueAmenity.click();
            waitForInvisibility(loaderIcon);
            break;
            
        case "Collection Letter Fees":
        	configDropdownCollectionLetterFees.click();
            waitForInvisibility(loaderIcon);
            break;
            
        case "Community Configuration":
        	configDropdownCommunityConfiguration.click();
            waitForInvisibility(loaderIcon);
            break;
            
            
        case "Fulfillment Job Special Pricing Configuration":
        	configDropdownFulfillmentJobSpecialPricingConfiguration.click();
            waitForInvisibility(loaderIcon);
            break;
            
        case "Holidays":
        	configDropdownHolidays.click();
            waitForInvisibility(loaderIcon);
            break;
            
         case "Board Approval":
            configDropdownBoardApproval.click();
            waitForInvisibility(loaderIcon);

        default:
            // Code block if no case matches
    	} 
    	LoggerManager.debug("Dropdown selection on Community Configurations page"); 
		
    	contextDropdown.click();
        
        contextDropdownValue.click();
        waitForInvisibility(loaderIcon);
        communityConfigActions();
        waitForInvisibility(loaderIcon);
        pressEscapeKey();
    }
}