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

public class ConfigReportTemplatesClickPages extends BasePage {

	WebDriverWait wait;
	// only click the module and open the page
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	public ConfigReportTemplatesClickPages(WebDriver driver) 
	{
		super(driver);
		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

	}

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),' Configurations ')]")
	WebElement configurations;

	@FindBy(xpath="//div[@class='header-text']//span[contains(text(),'Report Templates')]")
	WebElement reportTemplate;

	@FindBy(xpath="(//div[@class='dx-texteditor-buttons-container'])[2]")
	WebElement configurationDropDown;

	@FindBy(xpath="//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'Letter Templates')]")
	WebElement letterTemplate;

	@FindBy(xpath="//div[@class='config-tree-menu-item']//span[normalize-space()='Builder Statement Cover Letter']")
	WebElement letterheadValue;

	@FindBy(xpath="(//div[@class='config-tree-menu-item cc-qa-release-menu'])[2]//span[contains(text(),'Letterhead Template')]")
	WebElement letterHeadTemplate; 

	@FindBy(xpath="//div[@class='config-tree-menu-item']//span[normalize-space()='Page Footer']")
	WebElement letterHeadTemplatevalue;

	@FindBy(xpath="(//div[@class='dx-dropdowneditor-input-wrapper'])[2]")
	WebElement contextDropDown;

	@FindBy(xpath="(//div[@class='dx-treelist-content']//td[@Class='dx-treelist-cell-expandable'])[1]")
	WebElement contextValue;

	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),' Letter Templates / Builder Statement Cover Letter - Global ')]")
	public WebElement llbLetterTemplate;

	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//strong[contains(text(),' Letterhead Template / Page Footer - Global ')]")
	public WebElement llbLetterHeadTemplate;

	@FindBy(xpath="dx-loadindicator-icon")
	WebElement loaderIcon;
	
		public void letterTemplate() {
		waitForInvisibility(loaderIcon);
		clickElement(configurations);
		waitForInvisibility(loaderIcon);
		clickElementJS(reportTemplate);
		waitForInvisibility(loaderIcon);
		System.out.println("Report Template Label is Open");
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration Label is clicked and page open successfully");
		clickElementJS(letterTemplate);
		waitForInvisibility(loaderIcon);
		System.out.println("community Auto Close Report Generation label is clicked");
		clickElementJS(letterheadValue);
		waitForInvisibility(loaderIcon);
		System.out.println("community Auto Close Report Generation label is clicked");
		clickElement(contextDropDown);
		waitForInvisibility(loaderIcon);
		System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
		clickElementJS(contextValue);
		waitForInvisibility(loaderIcon);
		System.out.println("Context value as Global is clicked and page loaded successfully");
		
		
		}

	public void letterHeadTemplate() {
		waitForInvisibility(loaderIcon);
		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		System.out.println("Configuration Label is clicked and page open successfully");
		clickElementJS(letterHeadTemplate);
		waitForInvisibility(loaderIcon);
		System.out.println("community Auto Close Report Generation label is clicked");
		clickElementJS(letterHeadTemplatevalue);
		waitForInvisibility(loaderIcon);
		System.out.println("community Auto Close Report Generation label is clicked");
		clickElement(contextDropDown);
		waitForInvisibility(loaderIcon);
		System.out.println("Customer Defined Info Context label is clicked and page loaded successfully");
		clickElementJS(contextValue);
		waitForInvisibility(loaderIcon);
		System.out.println("Context value as Global is clicked and page loaded successfully");


	}








}
