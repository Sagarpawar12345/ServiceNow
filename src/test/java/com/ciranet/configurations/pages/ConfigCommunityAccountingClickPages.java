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

public class ConfigCommunityAccountingClickPages extends BasePage {
	WebDriverWait wait;

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	public ConfigCommunityAccountingClickPages(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Configurations')]") 
	private WebElement configurations;

	@FindBy(xpath = "//div[@class='header-text']//span[contains(text(),'Community Accounting')]")
	private WebElement communityAccounting;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[2]")
	private WebElement configurationDropDown;

	@FindBy(xpath = "//div[@class='config-tree-menu-item cc-qa-release-menu']//span[contains(text(),'AAP Cross Entity Bill')]")
	private WebElement aapCrossEntityBill;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAP Work Flow Auto Action')]")
	private WebElement aapWorkFlowAutoAction;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAP Work Flow CheckList')]")
	private WebElement aapWorkFlowCheckList;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Billing Types')]")
	private WebElement aarBillingTypes;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Builder Statements')]")
	private WebElement aarBuilderStatements;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Misc Invoice Types')]")
	private WebElement aarMiscInvoiceTypes;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Payment Application Order')]")
	private WebElement aarPaymentApplicationOrder;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'AAR Statements')]")
	private WebElement aarStatements;

	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-item-content dx-menu-item-content']//span[contains(text(),'Collections Configuration')]")
	private WebElement collectionsConfiguration;

	@FindBy(xpath = "(//div[@class='dx-texteditor-buttons-container'])[4]")
	private WebElement contextDropDown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement contextValue;

	@FindBy(xpath = "//div[@title='Expand All']")
	WebElement expandAllIcon;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	WebElement loaderIcon;

	public void aapCrossEntityBill() {

		// Configuration
		waitForInvisibility(loaderIcon);
		scrollToElement(configurations);
		clickElement(configurations);
		System.out.println("Configuration label is clicked");

		clickElementJS(communityAccounting);
		waitForInvisibility(loaderIcon);

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aapCrossEntityBill);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElement(expandAllIcon);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aapWorkFlowAutoAction() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aapWorkFlowAutoAction);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aapWorkFlowCheckList() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aapWorkFlowCheckList);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aarBillingTypes() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarBillingTypes);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aarBuilderStatements() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarBuilderStatements);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aarMiscInvoiceTypes() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarMiscInvoiceTypes);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aarPaymentApplicationOrder() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarPaymentApplicationOrder);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void aarStatements() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(aarStatements);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

	public void collectionsConfiguration() {

		clickElement(configurationDropDown);
		waitForInvisibility(loaderIcon);
		clickElementJS(collectionsConfiguration);

		waitForInvisibility(loaderIcon);
		System.out.println("aapCross Entity Bill menu is clicked");

		waitForInvisibility(loaderIcon);
		clickElementJS(contextDropDown);

		waitForInvisibility(loaderIcon);
		clickElementJS(contextValue);
		System.out.println("Context value is clicked");
		waitForInvisibility(loaderIcon);
	}

}
