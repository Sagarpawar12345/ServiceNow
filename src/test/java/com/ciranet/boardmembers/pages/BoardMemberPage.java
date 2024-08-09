package com.ciranet.boardmembers.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.basepage.BasePage;

public class BoardMemberPage extends BasePage{
	
	// 1. Create a BoardMemberPage boardMemberPage in TestBase
	// 2. Intitialize it
	// 3. Needs to use the HomePage 
	
	JavascriptExecutor jse;
	
	public BoardMemberPage(WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor)driver;
	}
	
	// Here define the Object definition
	@FindBy(xpath = "//h2[@class='page-header']//span[contains(text(),'Community Landing - Board')]")
	private WebElement communityPageHeader;
	
	
	@FindBy(xpath = "//i[@class='fas fa-bell approval-button']")
	private WebElement bellIcon;
	
	@FindBy(xpath = "//sup[@class='page-help-link']//a[@class='fas fa-question-circle']")
	WebElement communityPageHeaderHelpIcon;
	
	@FindBy(xpath = "//span[normalize-space()='Community']")
	WebElement communityMenu;
	
	@FindBy(xpath="//span[normalize-space()='Communications']")
	public WebElement communicationMenu;
	
	@FindBy(xpath="//span[normalize-space()='Announcement Logs']")
	WebElement announcementMenu;
	
	@FindBy(xpath="//div[contains(text(),'Expired')]")
	WebElement annExpriredTab;
	
	@FindBy(xpath="//h2[normalize-space()='Announcements']")
	public WebElement lblAnnoucement;
	
	
	// For Mail merge module
	
	@FindBy(xpath="//span[normalize-space()='Mail Merge']")
	WebElement mailMergeMenu;
	
	@FindBy(xpath="//h2[normalize-space()='Mail Merge']")
	public WebElement lblMailMerge;
	
	@FindBy(xpath="//div[@class='dx-widget dx-checkbox dx-select-checkbox dx-datagrid-checkbox-size dx-state-focused dx-state-hover']//span[@class='dx-checkbox-icon']")
	WebElement chkBoxMailMergeFirstRecord;
	
	@FindBy(xpath="//div[@class='new-mail-merge-btn letter-head dx-template-wrapper dx-item-content dx-toolbar-item-content']")
	WebElement btnCreateLabel;
	
	// Resident Contact Logs controls
	@FindBy(xpath="//span[normalize-space()='Resident Contact Logs']")
	WebElement residentContactLogsMenu;
	
	@FindBy(xpath="//h2[@class='page-header']")
	public WebElement lblResidentContactLogs;
	
	// Compliance module xpaths are defined here
	@FindBy(xpath = "//span[normalize-space()='Compliance']")
	public WebElement complianceMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Certified Tracking']")
	WebElement certifiedTrackingMenu;
	
	@FindBy(xpath="//h2[@class='page-header'][contains(.,'Certified Tracking')]")
	public WebElement lblCertifiedTracking;
	
	@FindBy(xpath="//span[normalize-space()='Detailed Violations Log']")
	WebElement detailedViolationLogsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Detailed Violations Log')]")
	public WebElement lblDetailedVioLog;
	
	@FindBy(xpath="//span[normalize-space()='Open']")
	WebElement openTab;
	
	@FindBy(xpath= "//span[normalize-space()='Closed']")
	WebElement closedTab;
	
	@FindBy(xpath= "//span[normalize-space()='Notices']")
	WebElement noticesTab;
	
	// Last Inspection Log
	@FindBy(xpath="//span[normalize-space()='Last Inspection Log']")
	WebElement lastInspectionLogMenu;
	
	@FindBy(xpath="//h2[@class='page-header'][contains(.,'Last Inspection Log')]")
	public WebElement lblLastInspectionLog;

	// Open Violation log
	@FindBy(xpath="//span[normalize-space()='Open Violations Log']")
	WebElement openViolationsLogMenu;
	
	@FindBy(xpath="//h2[@class='page-header'][contains(.,'Open Violations Log')]")
	public WebElement lblOpenViolationLog;
	
	@FindBy(xpath="//div[@title='Compliance']//i[@class='fas fa-chevron-left header-icon-button-back']")
	WebElement complianceBack;
	
	@FindBy(xpath="//div[@title='Compliance']//i[@class='fas fa-chevron-right header-icon-button-right']")
	WebElement complianceRight;
	// 
	
	
	@FindBy(xpath = "//span[normalize-space()='Report a Violation']")
	WebElement reportAViolationMenu;
	
	@FindBy(xpath =  "//h2[@class='page-header'][contains(.,'Report a Violation')]")
	public WebElement lblReportAViolation;
	
	@FindBy(xpath = "//span[normalize-space()='Restriction Summary']")
	WebElement restrictionSummaryMenu;
	
	@FindBy(xpath =  "//h2[@class='page-header'][contains(.,'Deed Restriction Full Summary')]")
	public WebElement lblRestrictionSummary;
	
	// Compliance module xpath ends here
	
	// Information menu - components
	@FindBy(xpath = "//span[normalize-space()='Information']")
	private WebElement informationMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Additional Info']")
	WebElement additionalInforMenu;
	
	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Additional Information')]")
	public WebElement lblAdditionalInfo;
	
	@FindBy(xpath = "//span[normalize-space()='Amenities and Access Control']")
	WebElement amenitiesAndAccessControlMenu;
	
	@FindBy(xpath = "//h2[@class='page-header'][contains(.,'Amenities and Access Control')]")
	public WebElement lblAmenitiesAndAccessControl;
	
	
	@FindBy(xpath="//i[@class='dx-icon dx-icon-menu']") // "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	public WebElement breadCrumbMenu;
	
	// For Board/Committee Member
	@FindBy(xpath="//span[normalize-space()='Board / Committee Members']")
	WebElement boardCommitteeMemberMenu;
	
	
	@FindBy(xpath="//h2[@class='page-header'][contains(.,'Board / Committee Members')]")
	public WebElement lblBoardCommitteeMember;
	
	
	// Calendar
	@FindBy(xpath= "//span[normalize-space()='Calendar']")
	public WebElement calenderMenu;
	
	@FindBy(xpath="//h2[@class='page-header'][contains(.,'My Calendar')]")
	public WebElement lblMyCalendar;
	
	@FindBy(xpath="//span[normalize-space()='Financial Reports']")
	public WebElement financialReportsMenu;
	
	
	@FindBy(xpath="//span[normalize-space()='Actual vs Budget']")
	public WebElement actualVsBudget;
	
	@FindBy(xpath="//h2[normalize-space()='Actual vs Budget']") 
	public WebElement lblActualVsBudget;
	
	@FindBy(xpath="//span[normalize-space()='Benchmark Report']")
	public WebElement benchmarkReport;
	
	@FindBy(xpath="//h2[normalize-space()='Benchmark Report']") 
	public WebElement lblBenchmarkReport;
	

	@FindBy(xpath="//span[normalize-space()='Financial Summary']")
	public WebElement financialSummaryMenu;
	
	@FindBy(xpath="//h2[normalize-space()='Financial Summary']") 
	public WebElement lblFinancialSummary;

	@FindBy(xpath="//span[normalize-space()='General Ledger']")
	public WebElement generalLedgerMenu;
	
	@FindBy(xpath="//span[normalize-space()='General Ledger Report']")
	public WebElement generalLedgerReportMenu;

	@FindBy(xpath = "//h2[@class='page-header']//span[contains(text(),'General Ledger Report')]")
	public WebElement lblGLReport;
	
	@FindBy(xpath="//span[normalize-space()='Trial Balance']")
	public WebElement trialBalanceMenu;

	@FindBy(xpath = "//h2[@class='page-header']//span[contains(text(),'Trial Balance')]")
	public WebElement lblTrialBalance;
	
	// My Work Queue menus and submenus
	@FindBy(xpath="//span[normalize-space()='My Work Queue']")
	public WebElement myWorkQueueMenu;
	
	@FindBy(xpath="//span[normalize-space()='Community Management']")
	public WebElement communityMgmtSubMenu;
	
	@FindBy(xpath="//span[normalize-space()='Architectural Application']")
	public WebElement architecturalSubMenu;
	
	@FindBy(xpath = "//h2[@class='page-header'][contains(text(),'Architectural Application')]")
	public WebElement lblArchitecturalApplication;
	
	@FindBy(xpath="//span[normalize-space()='Board Approvals']")
	public WebElement boardApprovalSubMenu;
	
	@FindBy(xpath = "//h2[@class='page-header'][contains(text(),'Board Approvals')]")
	public WebElement lblBoardApproval;
	
	@FindBy(xpath="//span[normalize-space()='Maintenance Work Orders']")
	public WebElement maintenanceWorkOrdersSubMenu;
	
	@FindBy(xpath = "//h2[@class='page-header'][contains(text(),'Maintenance Work Orders')]")
	public WebElement lblMaintenanceWorkOrders;
	
	
	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Active')]")
	private WebElement activeTab;
	
	// Information menu items Xpath ends here
	
	// Object definition ends
	public void loadIcon() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
	}
	
	public boolean verifyPageHeaderAndClickHelpIcon() throws Exception {
		waitForInvisibility(loaderIcon);
		waitForElementToBeVisible(bellIcon);
	
		if (bellIcon.isDisplayed()) {
			return true;
		}
		else
			return false;
	}
	
	// ======== Communications menus starts here  ===== // 
	public void verifyCommunicationMenu() throws Exception {
		waitForInvisibility(loaderIcon);
		clickElementJS(communicationMenu);
		
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(announcementMenu);
		clickElementJS(announcementMenu);
		
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(annExpriredTab);
		clickElementJS(annExpriredTab);
		
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(activeTab);
		clickElementJS(activeTab);
	}
	
	public void verifyMailMergeModule() throws Exception {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(mailMergeMenu);
		clickElement(mailMergeMenu);
	}

	public void verifyResidentContactLogsModule() throws Exception {
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(residentContactLogsMenu);
		clickElementJS(residentContactLogsMenu);
		waitForInvisibility(loaderIcon);

		clickElementJS(communicationMenu);
	}
	// ======== Communications menus ends here  ===== // 
	
	// ======== Compliance menus starts here  ===== // 
	public void verifyComplianceCertifiedTrackingModule() throws Exception {
		waitForInvisibility(loaderIcon);
		clickElementJS(complianceMenu);
		waitForInvisibility(loaderIcon);
		clickElementJS(certifiedTrackingMenu);
	}
	
	public void verifyDetailedViolationLogTrackingModule() throws Exception {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(detailedViolationLogsMenu);
		clickElementJS(detailedViolationLogsMenu);
		
		waitForElementToBeClickable(closedTab);
		clickElementJS(closedTab);
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(noticesTab);
		clickElementJS(noticesTab);
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(openTab);
		clickElementJS(openTab);
		waitForInvisibility(loaderIcon);
	}
	
	public void verifyLastInspectionLogModule() throws Exception {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(lastInspectionLogMenu);
		clickElementJS(lastInspectionLogMenu);
		waitForInvisibility(loaderIcon);
	}
	
	
	public void verifyLastOpenViolationsModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(openViolationsLogMenu);
		clickElementJS(openViolationsLogMenu);
		
		waitForInvisibility(loaderIcon);
	}

	
	
	public void verifyReportAViolationModule() {
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(reportAViolationMenu);
		clickElementJS(reportAViolationMenu);
		
		waitForInvisibility(loaderIcon);	
	}
	
	public void verifyRestrictionSummaryModule() {
		waitForInvisibility(loaderIcon);
		scrollToElement(restrictionSummaryMenu);
		waitForElementToBeClickable(restrictionSummaryMenu);
		clickElementJS(restrictionSummaryMenu);
		
		waitForInvisibility(loaderIcon);	
		
		scrollToElement(complianceMenu);		
		clickElementJS(complianceMenu);
	}

	// ========== Compliance menus Ends here ========== // 
	
	// ========================== Information menu click starts here
	
	public void verifyAdditionalInformationModule() {
		waitForInvisibility(loaderIcon);
		scrollToElement(informationMenu);
		waitForElementToBeClickable(informationMenu);
		clickElementJS(informationMenu);
		
		waitForElementToBeClickable(additionalInforMenu);
		clickElementJS(additionalInforMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void verifyAmenitiesAccessControlModule() {
		waitForElementToBeClickable(amenitiesAndAccessControlMenu);
		clickElementJS(amenitiesAndAccessControlMenu);
		waitForInvisibility(loaderIcon);
		
		Actions actions = new Actions(driver);
		// Performs mouse move action onto the element
		actions.moveToElement(breadCrumbMenu).click().build().perform();
	}
	
public void verifyBoardCommitteeMemberModule() {
	waitForInvisibility(loaderIcon);	
	waitForElementToBeClickable(boardCommitteeMemberMenu);
	clickElementJS(boardCommitteeMemberMenu);
	
	}

public void verifyCalendarModule() {
	waitForInvisibility(loaderIcon);
	
	waitForElementToBeClickable(calenderMenu);
	clickElementJS(calenderMenu);
	//jse.executeScript("arguments[0].click();",complianceMenu);
	
	//jse.executeScript("arguments[0].click();",calenderMenu);
	
	waitForInvisibility(loaderIcon);
  }

public void verifyDocumentModulesClick() {
	WebElement eleDocument = driver.findElement(By.xpath("//span[normalize-space()='Documents']"));
	

	
	// waitForInvisibility(loaderIcon);
	scrollToElement(eleDocument);
	waitForElementToBeClickable(eleDocument);

	clickElementJS(eleDocument);
	waitForInvisibility(loaderIcon);
	
	WebElement eleArchive = driver.findElement(By.xpath("//span[normalize-space()='Archive']"));
	
	waitForElementToBeClickable(eleArchive);
	scrollToElement(eleArchive);
	clickElementJS(eleArchive);
	
  }

public void verifyPropertiesMenuClick() {
	WebElement eleProperties = driver.findElement(By.xpath("//span[normalize-space()='Properties']"));
	
	// waitForInvisibility(loaderIcon);
	scrollToElement(eleProperties);
	waitForElementToBeClickable(eleProperties);

	clickElementJS(eleProperties);
	waitForInvisibility(loaderIcon);
	
	WebElement elePropertyDetails = driver.findElement(By.xpath("//span[contains(text(),'Property Details')]"));
	
	waitForElementToBeClickable(elePropertyDetails);
	scrollToElement(elePropertyDetails);
	clickElementJS(elePropertyDetails);
	waitForInvisibility(loaderIcon);
	
  }

public void verifyReportsMenuClick() {
	WebElement eleReports = driver.findElement(By.xpath("//span[normalize-space()='Reports']"));
	
	scrollToElement(eleReports);
	waitForElementToBeClickable(eleReports);

	clickElementJS(eleReports);
	waitForInvisibility(loaderIcon);
	
	WebElement eleMoveInSummary = driver.findElement(By.xpath("//span[normalize-space()='Move-In Summary']"));
	
	waitForElementToBeClickable(eleMoveInSummary);
	scrollToElement(eleMoveInSummary);
	clickElementJS(eleMoveInSummary);
	waitForInvisibility(loaderIcon);
	
  }

public void verifyReportsOnDemandMenuClick() {
	WebElement eleOnDemand = driver.findElement(By.xpath("//span[normalize-space()='On Demand']"));
	
	scrollToElement(eleOnDemand);
	waitForElementToBeClickable(eleOnDemand);

	clickElementJS(eleOnDemand);
	waitForInvisibility(loaderIcon);
  }

public void verifyReportsSummaryPrevMonthClick() {
	WebElement eleReportsPrevMonth = driver.findElement(By.xpath("//span[normalize-space()='Summary - Previous Month']"));
	
	scrollToElement(eleReportsPrevMonth);
	waitForElementToBeClickable(eleReportsPrevMonth);

	clickElementJS(eleReportsPrevMonth);
	waitForInvisibility(loaderIcon);
	
	scrollToElement(communityMenu);
	clickElementJS(communityMenu);
	
  }

public boolean isCiarBooksMenuVisible() {
    return isElementVisible(By.xpath("//span[normalize-space()='CiraBooks']"));  // Check if menu element is visible
}
public boolean isAPMenuVisible() {
    return isElementVisible(By.xpath("//span[normalize-space()='Accounts Payable']"));  // Check if menu element is visible
}


public void verifyCiraBooksMenusClick() {
	WebElement eleCiraBooks = driver.findElement(By.xpath("//span[normalize-space()='CiraBooks']"));
	System.out.println("In Cirabooks");
	scrollToElement(eleCiraBooks);
	waitForElementToBeClickable(eleCiraBooks);

	clickElementJS(eleCiraBooks);
	waitForInvisibility(loaderIcon);
	
	WebElement eleCBWorkspace = driver.findElement(By.xpath("//span[normalize-space()='CiraBooks Workspace']"));
	
	waitForElementToBeClickable(eleCBWorkspace);
	//scrollToElement(eleCBWorkspace);
	clickElementJS(eleCBWorkspace);
	waitForInvisibility(loaderIcon);
	
  }

// For CB - Accounts Payable

public void verifyCBAccountsPayableMenusClick() {
	WebElement eleCBAaaPayable = driver.findElement(By.xpath("//span[normalize-space()='Accounts Payable']"));
	
	scrollToElement(eleCBAaaPayable);
	waitForElementToBeClickable(eleCBAaaPayable);

	clickElementJS(eleCBAaaPayable);
	waitForInvisibility(loaderIcon);
	
	WebElement eleCBAPExpenseDetails = driver.findElement(By.xpath("//span[normalize-space()='AP Expense Detail']"));
	
	waitForElementToBeClickable(eleCBAPExpenseDetails);
	scrollToElement(eleCBAPExpenseDetails);
	clickElementJS(eleCBAPExpenseDetails);
	waitForInvisibility(loaderIcon);
	
  }

public void verifyCBAPLedgerMenuClick() {
	waitForInvisibility(loaderIcon);
	
	WebElement eleCBAaAPLedger = driver.findElement(By.xpath("//span[normalize-space()='AP Ledger']"));
	
	waitForElementToBeClickable(eleCBAaAPLedger);
	scrollToElement(eleCBAaAPLedger);
	clickElementJS(eleCBAaAPLedger);
	waitForInvisibility(loaderIcon);	
  }

public void verifyCBAPMySubmittedInvoiceMenuClick() {
	waitForInvisibility(loaderIcon);
	
	WebElement eleCBAaAPMySubmittedInvoices = driver.findElement(By.xpath("//span[normalize-space()='My Submitted Invoices']"));
	
	waitForElementToBeClickable(eleCBAaAPMySubmittedInvoices);
	scrollToElement(eleCBAaAPMySubmittedInvoices);
	clickElementJS(eleCBAaAPMySubmittedInvoices);
	waitForInvisibility(loaderIcon);	
  }


// This method is a common method used to click on the menu and then Menu gets opened and its submenu 
public void verifyModuleClicked(WebElement elementMenu) throws Exception {

	waitForInvisibility(loaderIcon);
	
	waitForElementToBeClickable(elementMenu);
	scrollToElement(elementMenu);
	clickElementJS(elementMenu);
	waitForInvisibility(loaderIcon);
}


// This is used to select the menu and click on the menuitems

// Helper function to click on a menu item
  public void clickCiraBooksMenuItem( String menuItem) {
      // Expand CiraBooks menu if not already expanded
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//	  WebElement ciraCommunity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Community']")));
//      //if (!ciraCommunity.getAttribute("class").contains("expanded")) {
//    	try {
//			Thread.sleep(1000);
//			ciraCommunity.click();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
	  
    	  //else
    		  
      //}
      
	                                                                                      //span[contains(.,'Configurations')]
      WebElement ciraBooks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CiraBooks']")));
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true);", ciraBooks);
      
      if (!ciraBooks.getAttribute("class").contains("expanded")) {
    	  ciraBooks.click();
      }

          
      // Click on the specified menu item                                                   
      if (menuItem == "CiraBooks Workspace") {
    	  WebElement menuElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'" + menuItem + "')][1]")));
    	  menuElement.click();
      } else {
    	  WebElement menuAP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Accounts Payable']")));
    	  menuAP.click();
    	  
    	
    	  WebElement menuElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'" + menuItem + "')]")));
    	  menuElement.click();
      }
      
  }

  public void verifyFRActualVsBudgetMenu() throws Exception {
		loadIcon();
		jse.executeScript("arguments[0].scrollIntoView(true);", communityMenu); 
		jse.executeScript("arguments[0].click();", communityMenu);
		
		WebElement ciraBooks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CiraBooks']")));
		 
		if (!ciraBooks.getAttribute("class").contains("expanded")) {
	    	  ciraBooks.click();
	      }
		
		jse.executeScript("arguments[0].click();", financialReportsMenu);
		WebDriverWait wait2 =  new WebDriverWait(driver,Duration.ofSeconds(5));// new WebDriverWait(driver,30);
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Actual vs Budget']")));
		
		//jse.executeScript("arguments[0].click();", announcementMenu);
		actualVsBudget.click();
		loadIcon();
		loadIcon();
		jse.executeScript("arguments[0].click();", breadCrumbMenu);
		
		}
  
  public void verifyFRBenchmarkReportMenu() throws Exception {
		loadIcon();
		WebDriverWait wait2 =  new WebDriverWait(driver,Duration.ofSeconds(5));// new WebDriverWait(driver,30);
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Benchmark Report']")));
		benchmarkReport.click();
		loadIcon();
		
		}
  
  public void verifyFRFinancialSummaryMenu() throws Exception {
		loadIcon();
		WebDriverWait wait2 =  new WebDriverWait(driver,Duration.ofSeconds(5));// new WebDriverWait(driver,30);
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Financial Summary']")));
		financialSummaryMenu.click();
		loadIcon();
		jse.executeScript("arguments[0].click();", financialReportsMenu);
		}
  
  public void verifyGLGeneralLedgerReportMenu() throws Exception {
	
			//span[normalize-space()='General Ledger Report']
	  
	  	loadIcon();
		jse.executeScript("arguments[0].scrollIntoView(true);", generalLedgerMenu); 
		jse.executeScript("arguments[0].click();", generalLedgerMenu);
		
		
		WebElement generalLedger = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='General Ledger']")));
		 
		if (!generalLedger.getAttribute("class").contains("expanded")) {
			generalLedger.click();
	      }
		
		jse.executeScript("arguments[0].click();", generalLedgerReportMenu);
		WebDriverWait wait2 =  new WebDriverWait(driver,Duration.ofSeconds(5));// new WebDriverWait(driver,30);
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='General Ledger Report']")));
		
		//jse.executeScript("arguments[0].click();", announcementMenu);
		generalLedgerReportMenu.click();
	}

  public void verifyTrialBalanceMenu() throws Exception {
		
		//span[normalize-space()='General Ledger Report']

	loadIcon();
	
	jse.executeScript("arguments[0].scrollIntoView(true);", trialBalanceMenu); 
	jse.executeScript("arguments[0].click();", trialBalanceMenu);
	WebDriverWait wait2 =  new WebDriverWait(driver,Duration.ofSeconds(5));// new WebDriverWait(driver,30);
	
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Trial Balance']")));
	
	jse.executeScript("arguments[0].click();", announcementMenu);
}

  public void verifyMyWorkQueueCommMgmtArchiApplMenu() throws Exception {
		
		//span[normalize-space()='General Ledger Report']
	loadIcon();
	jse.executeScript("arguments[0].scrollIntoView(true);", myWorkQueueMenu); 
	jse.executeScript("arguments[0].click();", myWorkQueueMenu);
	
		
	WebElement commMgmt = wait.until(ExpectedConditions.elementToBeClickable(communityMgmtSubMenu));
	 
	if (!commMgmt.getAttribute("class").contains("expanded")) {
		commMgmt.click();
    }
	
	loadIcon();
	jse.executeScript("arguments[0].scrollIntoView(true);", architecturalSubMenu); 
	jse.executeScript("arguments[0].click();", architecturalSubMenu);
	
}

  public void verifyMyWorkQueueBoardApprovalMenu() throws Exception {
		
		//span[normalize-space()='General Ledger Report']
	loadIcon();
	jse.executeScript("arguments[0].scrollIntoView(true);", boardApprovalSubMenu); 
	jse.executeScript("arguments[0].click();", boardApprovalSubMenu);
	
}
  
  public void verifyMyWorkQueueMaintenanceWorkOrdersMenu() throws Exception {
		
		//span[normalize-space()='General Ledger Report']
	loadIcon();
	jse.executeScript("arguments[0].scrollIntoView(true);", maintenanceWorkOrdersSubMenu); 
	jse.executeScript("arguments[0].click();", maintenanceWorkOrdersSubMenu);
	
}

  
  
}
