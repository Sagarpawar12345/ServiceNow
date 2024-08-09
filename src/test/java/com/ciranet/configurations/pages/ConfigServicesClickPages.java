package com.ciranet.configurations.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class ConfigServicesClickPages extends BasePage {
	WebDriverWait wait;
	
		@SuppressWarnings("unused")
		private static final Exception AWTException = null;

		JavascriptExecutor js;
		private WebDriver driver;
		
		public ConfigServicesClickPages(WebDriver driver) 
		{
			super(driver);
			js = (JavascriptExecutor) driver;
			LoggerManager.debug("======== Initializing the Login Page Objects ======== ");	
		}
      
		@FindBy(xpath="//span[text()=' Configurations ']")
		private WebElement configurations;
		
		@FindBy(xpath="//span[text()=' Services ']") 
		private WebElement services;
		
		@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[2]")
		private WebElement configurationDropDown;
		
		@FindBy(xpath="//span[contains(text(),'Board Portal')]")
		private WebElement boardPortal;
		
		@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[4]")
		private WebElement contextDropDown;
		
		@FindBy(xpath="//div[contains(text(),'Global')]")
		WebElement contextValue;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Branding Configuration')]")
		WebElement brandingConfiguration;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Business Hours')]")
		WebElement businessHour;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Calendar Configuration')]")
		WebElement calendarConfiguration;
		
        @FindBy(css="div[class='config-tree-menu-item cc-dev-release-menu'] span")
		WebElement massCommunicationSystemTemplateConfiguration;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Resident Portal')]")
		WebElement residentPortal;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Service Groups')]")
		WebElement serviceGroup;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Service Roles')]")
		WebElement serviceRole;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Services')]")
		WebElement servicesConfig;
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Board Portal - Global')]")
		public WebElement llbBoardApproval;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Branding Configuration - Global')]")
        public WebElement llbBrandingConfiguration;	
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Business Hours - Global')]")
		public WebElement llbBussinessHour;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Calendar Configuration - Global')]")
		public WebElement llbCalendarConfiguration;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Mass Communication System Template Configuration - Global')]")
		public WebElement llbMassCommunicationSysterConfiguration;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Resident Portal - Global')]")
		public WebElement llbResidentPortal;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Service Groups - Global')]")
		public WebElement llbServiceGroup;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Service Roles - Global')]")
		public WebElement llbServiceRole;
		
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Services - Global')]")
		public WebElement llbServices;
		
		@FindBy(xpath="dx-loadindicator-icon")
		WebElement loaderIcon; 
		
		
			public void boardPortal() {
				
				//Configuration
				waitForInvisibility(loaderIcon);
				scrollToElement(configurations);
				clickElementJS(configurations);
				System.out.println("Configurations Label is Open");
				
				//Services
				waitForInvisibility(loaderIcon);
				scrollToElement(services);
				clickElementJS(services);
				System.out.println("Configuration Label is clicked and page open successfully");
				
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
				
				
				//Board Portal
				clickElement(boardPortal);
				System.out.println("Board Portal label is clicked");

				//Context
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");

				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
			}
			
			public void brandingConfiguration() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Branding Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(brandingConfiguration);
				System.out.println("Branding Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
				
			}
			
			public void bussinessHour() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//BusinessHour Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(businessHour);
				System.out.println("BusinessHour Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
							
			}

			public void calendarConfiguration() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Calendar Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(calendarConfiguration);
				System.out.println("Calendar Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
				
				
			}
             
			public void massComminicationSystemTemplateConfiguration() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Mass Communication System Template Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(massCommunicationSystemTemplateConfiguration);
				System.out.println("Mass Communication System Template Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
			
		
			}
			public void residentPortal() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Resident Portal Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(residentPortal);
				System.out.println("Resident Portal Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
		
			}
            
			public void serviceGroup() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Service Group Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(serviceGroup);
				System.out.println("Service Group Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
				
			}

			public void serviceRole() {
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Service Role Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(serviceRole);
				System.out.println("Service Role Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
				
				
			}
            
			public void services() {
				
				
				//Configuration Dropddown
				waitForInvisibility(loaderIcon);
				clickElement(configurationDropDown);
				System.out.println("Configuration Dropdown Clicked");
			
				//Service Configuration
				waitForInvisibility(loaderIcon);
				clickElementJS(servicesConfig);
				System.out.println("Service Configuration label is clicked");
				
				//Context Dropdown
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				System.out.println("Context Dropdown label is clicked");
				
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				System.out.println("Context value as Global is clicked and page loaded successfully");
			
			}
}
