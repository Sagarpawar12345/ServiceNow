package com.ciranet.cirabooks.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ciranet.utilities.LoggerManager;

public class CMDepositsPage {
	private WebDriver driver;

	// Initializing the Page Objects:
		public CMDepositsPage(WebDriver driver) {
			// to refer current class instance variable
			this.driver = driver;
			PageFactory.initElements(driver, this);

			//js = (JavascriptExecutor) driver;
			LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
		}

		
		// URL of the sandbox
		String UploadBudgetsURL = "https://sandbox.ciranet.com/v2/managementportal/ccb/gl/uploadbudgets";

		// URL of the sandbox
		String Upload = "There is already a primary A budget plan in year 2023. You cannot add a new primary A budget plan in year 2023.";

		// Loading progress xpath
		String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

		@FindBy(xpath = "//input[@role='combobox']")
		public WebElement mgnt_dropdown;

		@FindBy(xpath = "//div[contains(text(),'RealManage')]")
		public WebElement RealManage;

		@FindBy(xpath = "//div[@class='button-content']")
		public WebElement btnAddDeposit;
		
		
		// Click()
		// Displayed()

}
