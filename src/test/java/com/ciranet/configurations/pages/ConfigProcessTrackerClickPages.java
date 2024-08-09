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

public class ConfigProcessTrackerClickPages extends BasePage {
	WebDriverWait wait;
	// only click the module and open the page
		@SuppressWarnings("unused")
		private static final Exception AWTException = null;
		

		JavascriptExecutor js;
		private WebDriver driver;
		
		public ConfigProcessTrackerClickPages(WebDriver driver) 
		{
			super(driver);
			js = (JavascriptExecutor) driver;
			LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

		}
      
	  private void Super(WebDriver driver2) {
			// TODO Auto-generated method stub
			
		}

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),' Configurations ')]")
	  WebElement configurations;
		
      @FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Process Tracker')]")
      WebElement processTrackerLabel;
      
      @FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[2]")
	  WebElement configurationDropdown;
      
      @FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Community Auto Close & Report Generation')]")
      WebElement communityAutoCloseReportGeneration;
      
      @FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Financial Package Configuration')]")
      WebElement financialPackageConfiguration;
      
      @FindBy(xpath="//div[@class='dx-item dx-menu-item']//span[contains(text(),'Process Tracker Configuration')]")
      WebElement processTrackerConfiguration;
      
      @FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	  WebElement Context;
		
	  @FindBy(xpath="(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	  WebElement Contextvalue;
	  
	  @FindBy(xpath="//div[@class='dx-item-content dx-toolbar-item-content']//span[contains(text(),'Yes')]")
	  WebElement confirmationNo;
	  
	  @FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Community Auto Close & Report Generation - Global')]")
	  public WebElement llbCommunityAutoCloseReportGeneration;
	  
	  @FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Financial Package Configuration - Global')]")
      public WebElement llbFinancialPackageConfiguration;
	  
	  @FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),'Process Tracker Configuration - Global')]")
      public WebElement llbProcessTrackerConfiguration;
	  
	  @FindBy(xpath="dx-loadindicator-icon")
		WebElement loaderIcon;
		
	  
	
	  
		public void communityAutoCloseReportGeneration() {
			waitForInvisibility(loaderIcon);
			clickElementJS(configurations);
			waitForInvisibility(loaderIcon);
			clickElementJS(processTrackerLabel);
			waitForInvisibility(loaderIcon);
			System.out.println("Process Tracker Label is Open");
			clickElement(configurationDropdown);
			waitForInvisibility(loaderIcon);
			System.out.println("Configuration Label is clicked and page open successfully");
			clickElementJS(communityAutoCloseReportGeneration);
			waitForInvisibility(loaderIcon);
			System.out.println("community Auto Close Report Generation label is clicked");
			clickElement(Context);
			waitForInvisibility(loaderIcon);
			System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
			clickElementJS(Contextvalue);
			waitForInvisibility(loaderIcon);
			System.out.println("Context value as Global is clicked and page loaded successfully");
			waitForInvisibility(loaderIcon);

			
		}
		
		public void financialPackageConfiguration() {
			waitForInvisibility(loaderIcon);
			clickElementJS(configurations);
            waitForInvisibility(loaderIcon);
			clickElement(configurationDropdown);
            waitForInvisibility(loaderIcon);	
			System.out.println("Configuration Label is clicked and page open successfully");
			clickElementJS(financialPackageConfiguration);
			waitForInvisibility(loaderIcon);
			System.out.println("Financial Package Configuration label is clicked");
			clickElementJS(confirmationNo);
			waitForInvisibility(loaderIcon);
			System.out.println("Confirmation yes is clicked");
			clickElement(Context);
			waitForInvisibility(loaderIcon);
			System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
			clickElementJS(Contextvalue);
			waitForInvisibility(loaderIcon);
			System.out.println("Context value as Global is clicked and page loaded successfully");

			
		}
		public void processTrackerConfiguration() {
			waitForInvisibility(loaderIcon);
			clickElementJS(configurations);
			waitForInvisibility(loaderIcon);
			clickElement(configurationDropdown);
			waitForInvisibility(loaderIcon);
			System.out.println("Configuration Label is clicked and page open successfully");
			clickElementJS(processTrackerConfiguration);
			waitForInvisibility(loaderIcon);
			System.out.println("Financial Package Configuration label is clicked");
			clickElement(Context);
			waitForInvisibility(loaderIcon);
			System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
			clickElementJS(Contextvalue);
			waitForInvisibility(loaderIcon);
			System.out.println("Context value as Global is clicked and page loaded successfully");

			
		}




}
