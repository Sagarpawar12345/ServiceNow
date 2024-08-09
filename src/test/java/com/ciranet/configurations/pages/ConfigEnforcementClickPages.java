package com.ciranet.configurations.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class ConfigEnforcementClickPages extends BasePage {
	
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;
	
	public ConfigEnforcementClickPages(WebDriver driver) 
	{
		super(driver);
		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}
    
	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
	WebElement configurations;
	
	@FindBy(xpath="//div[@class='dx-dropdowneditor-icon']")
	WebElement configurationDropdown;
	
	@FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement Context;
	
	@FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement Contextvalue;
	
	@FindBy(xpath="//div[@title='Expand All']")
	WebElement expandAllIcon;
	
	@FindBy(xpath="//div[@class='tree-item-template']//span[contains(text(),'Enforcement')]")
	WebElement enforcementMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Architectural Categories')]")
	WebElement architecturalCategoriesMenu; 
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Architectural Forms and Guides')]")
	WebElement architecturalFormsandGuidesMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),' Violation Category / SubCategory Configuration ')]")
	WebElement violationCategorySubCategoryConfigurationMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Violation Escalation Configuration')]")
	WebElement violationEscalationConfigurationMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),' Violation Notification Templates ')]")
	WebElement violationNotificationTemplatesMenu;
	
	@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Violation Restriction Definition')]")
	WebElement violationRestrictionDefinitionMenu;
	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;
	
	
	public void architecturalCategories() {
		waitForInvisibility(loaderIcon);	
		scrollToElement(configurations);
		clickElement(configurations);
		System.out.println("Configurations Label is Open");
		waitForInvisibility(loaderIcon);
		clickElementJS(enforcementMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Enforcement Menu is Open");	
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration DropDown is clicked");	
		clickElementJS(architecturalCategoriesMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Enforcement Configuration is clicked");
		waitForElementToBeClickable(Context);
		clickElement(Context);
		System.out.println("Context Drop Down is clicked ");
		clickElementJS(Contextvalue);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Value is clicked");
		
	}
	
	public void architecturalFormsandGuides() {		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration DropDown is clicked");	
		clickElementJS(architecturalFormsandGuidesMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Architectural Forms and Guides Configuration is clicked");
		waitForElementToBeClickable(Context);
		clickElement(Context);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Drop Down is clicked ");
		clickElementJS(Contextvalue);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Value is clicked");
	
		
	}
	
	public void violationCategorySubCategoryConfiguration(){
		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration DropDown is clicked");		
		clickElementJS(violationCategorySubCategoryConfigurationMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Violation Category Sub Category Configuration is clicked");
		waitForElementToBeClickable(Context);
		clickElement(Context);
		System.out.println("Context Drop Down is clicked ");
		waitForInvisibility(loaderIcon);
		clickElementJS(Contextvalue);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Value is clicked");
	}
	
	public void violationEscalationConfiguration() {		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration DropDown is clicked");	
		clickElementJS(violationEscalationConfigurationMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Violation Escalation Configuration is clicked");
		waitForElementToBeClickable(Context);
		clickElement(Context);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Drop Down is clicked ");
		clickElementJS(Contextvalue);
		waitForInvisibility(loaderIcon);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Value is clicked");
	}
	
	public void violationNotificationTemplates() {
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration DropDown is clicked");
		clickElementJS(violationNotificationTemplatesMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Violation Notification Templates is clicked");
		waitForElementToBeClickable(Context);
		clickElement(Context);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Drop Down is clicked ");
		clickElementJS(Contextvalue);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Value is clicked");
	
		
	}
	
	public void violationRestrictionDefinition() {
		
		clickElement(configurationDropdown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration DropDown is clicked");
		clickElementJS(violationRestrictionDefinitionMenu);
		waitForInvisibility(loaderIcon);
		System.out.println("Violation Restriction Definition Configuration is clicked");
		waitForElementToBeClickable(Context);
		clickElement(Context);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Drop Down is clicked ");
		clickElementJS(expandAllIcon);
		waitForInvisibility(loaderIcon);
		System.out.println("Expand icon is clicked");
		clickElement(Contextvalue);
		waitForInvisibility(loaderIcon);
		System.out.println("Context Value is clicked");
		waitForInvisibility(loaderIcon);
	}
	

}
