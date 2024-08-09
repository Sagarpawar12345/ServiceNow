package com.ciranet.configurations.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class ConfigModulesClickPages extends BasePage{
	// only click the module and open the page
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;
	
	public ConfigModulesClickPages(WebDriver driver) 
	{
		super(driver);
		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

		@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Configurations')]")
		WebElement configurations;
		
		@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Modules')]")
		WebElement modulesMenu;
		
		@FindBy(xpath="//div[@class='dx-dropdowneditor-icon']")
		WebElement configurationDropdown;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Customer Defined Info')]")
		WebElement customerDefinedInfo;
		
		@FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
		WebElement Context;
		
		@FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
		WebElement Contextvalue;
		
		@FindBy(xpath="//div[@title='Expand All']")
		WebElement expandAllIcon;
		
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Egnyte Configuration')]")
		WebElement egnyteConfiguration;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Help')]")
		WebElement help;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Recommendations and Assumptions')]")
		WebElement recomendationsandAssumptions;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Supplemental Information')]")
		WebElement supplimentalInformation;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Transition Document')]")
		WebElement transitionDocument;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Transition Task Templates')]")
		WebElement transitionTaskTemplates;
		
		@FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Work Order Work Areas')]")
		WebElement workOrderWorkArea;
		
		@FindBy(xpath="dx-loadindicator-icon")
		WebElement loaderIcon;
		
		
		WebDriverWait wait;
		
		@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Customer Defined Info')]")
		public WebElement llbModuleConfigurations;
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Egnyte Configuration - Global')]")
		public WebElement llbEgnyteConfiguration;
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Help - Global')]")
		public WebElement llbHelp;
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Recommendations and Assumptions - Global')]")
		public WebElement llbRecommendationandAssumption;
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Supplemental Information - Global')]")
		public WebElement llbSuplimentalInformation;
		@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Transition Document - Global')]")
		public WebElement llbTransitionDocuments;
		@FindBy(xpath="//div[@class='dx-toolbar-center']//strong[contains(text(),'Work Order Work Areas - 1920 E. Maryland Place Townhomes, Inc.')]")
		public WebElement llbWorkAreaWorkOrder;

			public void waitLoader (int waitTime) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		}
		public void configurationsModules() {
			
			waitForInvisibility(loaderIcon);
			
			
			scrollToElement(configurations);
			clickElement(configurations);
			


			System.out.println("Configurations Label is Open");

			
			waitForInvisibility(loaderIcon);
			
		
			
			scrollToElement(modulesMenu);
			clickElement(modulesMenu);
			waitForInvisibility(loaderIcon);
			


			System.out.println("Modules Label is clicked and page open successfully");
	
			clickElement(configurationDropdown);
		
			System.out.println("Configuration drop down is clicked");
			
			waitForElementToBeClickable(customerDefinedInfo);
			clickElement(customerDefinedInfo);
			

			System.out.println("Customer Defined Info label is clicked");
			
			waitForElementToBeClickable(Context);
			clickElement(Context);
			clickElementJS(Contextvalue);
			waitForInvisibility(loaderIcon);

			
			
		}
		
		public void egnyteConfiguration() {
			
			waitForInvisibility(loaderIcon);
				
			clickElement(configurationDropdown);
				
				System.out.println("Configuration drop down is clicked");
			
				clickElementJS(egnyteConfiguration);
				System.out.println("Egnyte Confuguration label is clicked");
				
				
				clickElement(Context);
				waitForInvisibility(loaderIcon);
				
				System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
				
				clickElementJS(Contextvalue);
				waitForInvisibility(loaderIcon);
			
				System.out.println("Context value as Global is clicked and page loaded successfully");	
			}
			   
			public void help() {
				
				waitForInvisibility(loaderIcon);
				
				
				clickElement(configurationDropdown);
					
					System.out.println("Configuration drop down is clicked");
				
					clickElementJS(help);
					
					System.out.println("Help Configuration label is clicked");
					
					
					clickElement(Context);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
					
					
					clickElementJS(Contextvalue);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Context value as Global is clicked and page loaded successfully");	
				}
				   
			public void recommendationsandAssumptions() {
				
				waitForInvisibility(loaderIcon);
					
				clickElement(configurationDropdown);
					System.out.println("Configuration drop down is clicked");
					
					
					clickElementJS(recomendationsandAssumptions);
					
					System.out.println("Recommendations and Assumptions Configuration label is clicked");
					
					
					clickElement(Context);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
					
					
					clickElementJS(Contextvalue);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Context value as Global is clicked and page loaded successfully");	
				}
			
			public void supplimentalInformation() {
				 
				waitForInvisibility(loaderIcon);
					
				clickElement(configurationDropdown);
					
					System.out.println("Configuration drop down is clicked");
					
					clickElementJS(supplimentalInformation);
					System.out.println("Supplimental Information Configuration label is clicked");
					
					
					clickElement(Context);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
					
					
					clickElementJS(Contextvalue);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Context value as Global is clicked and page loaded successfully");	
				}
			
			public void transitionDocuments() {
				
				waitForInvisibility(loaderIcon);
					
				clickElement(configurationDropdown);
					
					System.out.println("Configuration drop down is clicked");
					
					clickElementJS(transitionDocument);
					
					System.out.println("Transition Document Configuration label is clicked");
					
					
					clickElement(Context);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
					
					
					clickElementJS(Contextvalue);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Context value as Global is clicked and page loaded successfully");	
				}
			public void transitionTaskTemplates() {
				  
				waitForInvisibility(loaderIcon);
					
				clickElement(configurationDropdown);
					
					System.out.println("Configuration drop down is clicked");
					
					clickElementJS(transitionTaskTemplates);
					System.out.println("transition Task Templates Configuration label is clicked");
					
					
				}
			public void workOrderWorkArea() {
				  
				waitForInvisibility(loaderIcon);
					
				clickElement(configurationDropdown);
					
					System.out.println("Configuration drop down is clicked");
					
					clickElementJS(workOrderWorkArea);
					System.out.println("work Order Work Area Configuration label is clicked");
					
					
					clickElement(Context);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
					
					
					clickElementJS(expandAllIcon);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Expand All icon is clicked");
					
					
					
					clickElementJS(Contextvalue);
					waitForInvisibility(loaderIcon);
					
					System.out.println("Context value as Global is clicked and page loaded successfully");
					
				   
				}
			
}
