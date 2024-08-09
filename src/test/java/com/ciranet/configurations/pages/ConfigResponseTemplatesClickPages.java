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

public class ConfigResponseTemplatesClickPages extends BasePage{
	WebDriverWait wait;
	
		@SuppressWarnings("unused")
		private static final Exception AWTException = null;

		JavascriptExecutor js;
		private WebDriver driver;
		
		public ConfigResponseTemplatesClickPages(WebDriver driver) 
		{
			super(driver);
			js = (JavascriptExecutor) driver;
			LoggerManager.debug("======== Initializing the Login Page Objects ======== ");		
			}
      
		@FindBy(xpath="//span[normalize-space()='Configurations']") //div[@class='header-text']//span[contains(text(),'Configurations')]")
		WebElement configurations;
		
		@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Response Templates')]")
		WebElement responseTemplate;
		
		@FindBy(xpath="//div[@class='dx-dropdowneditor-icon']")
		WebElement contextDropDown;
		
		@FindBy(xpath="//div[normalize-space()='RealManage']")
		WebElement contextValue;
		
		@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[4]")
		WebElement templateDropDown;
		
		@FindBy(xpath="(//div[@class='config-tree-menu-item'])[1]")
		WebElement templateDropDownValue;
		
		@FindBy(xpath="//div[@class='dx-item dx-box-item']//h2[contains(text(),'Response Templates Configurations')]")
		public WebElement llbResponseTemplateConfiguration;
		
		@FindBy(xpath="dx-loadindicator-icon")
		WebElement loaderIcon; 
		
		
		
			public void letterTemplate() {
				//Configurations			
				waitForInvisibility(loaderIcon);
				scrollToElement(configurations);
				waitForElementToBeClickable(configurations);
				clickElement(configurations);
				System.out.println("Configurations Label is Open");
				
				//Response Template
				waitForInvisibility(loaderIcon);	
				scrollToElement(responseTemplate);
				clickElement(responseTemplate);
				waitForInvisibility(loaderIcon);
				System.out.println("Response Template Label is Open");
				
				//Context
				waitForInvisibility(loaderIcon);
				clickElement(contextDropDown);
				waitForElementToBeClickable(contextDropDown);
				System.out.println("Context drop down is clicked and page open successfully");
				
				//ContextValue
				waitForInvisibility(loaderIcon);
				clickElement(contextValue);
				waitForElementToBeClickable(contextValue);
				System.out.println("Context value is clicked");
				
				
				//Template
				waitForInvisibility(loaderIcon);
				clickElement(templateDropDown);
				waitForElementToBeClickable(templateDropDown);
				System.out.println("Template Drop Down is clicked");
				
				//Temmplate Value
				waitForInvisibility(loaderIcon);
				clickElement(templateDropDownValue);
				waitForElementToBeClickable(templateDropDownValue);
				System.out.println("Template value is clicked and page loaded successfully");
				
			}

}
