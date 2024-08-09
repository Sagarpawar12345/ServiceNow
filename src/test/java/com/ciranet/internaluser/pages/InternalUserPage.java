package com.ciranet.internaluser.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

//Every line of code that runs in Java must be inside a class
public class InternalUserPage extends BasePage
{
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	public InternalUserPage(WebDriver driver) 
	{
		super(driver);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	//loading Spinner xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

	public static String actualURL;

	public static String actual_title;

	// Initializing the Page Objects	
	@FindBy(xpath = "//dx-button[@title='Hide Menu']//i[@class='dx-icon dx-icon-menu']")
	public static WebElement ham_menu;

	@FindBy(xpath = "//dx-text-box[@placeholder='Search Navigation']")
	public static WebElement search_navigation;

	@FindBy(xpath = "//span[normalize-space()='My Portfolio']")
	WebElement myPortfolioMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Account Management']")
	WebElement accountManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement accountManagementheader;
	
	@FindBy(xpath = "//span[normalize-space()='Achievements']")
	WebElement achievementsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public WebElement achievementsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Cloud Drive']")
	WebElement cloudDriveMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement cloudDrivesheader;
	
	@FindBy(xpath = "//input[@id='loginUsername']")
	WebElement cloudDriveusername;

	@FindBy(xpath = "//button[@class='btn btn-primary set-username-btn']")
	WebElement cloudDriveContinueBtn;

	@FindBy(xpath = "//input[@id='j_password']")
	WebElement cloudDrivePwd;
	
	@FindBy(xpath = "//button[@id='loginBtn']")
	WebElement cloudDriveLoginBtn;

	@FindBy(xpath = "//span[normalize-space()='Map of My Communities']")
	WebElement mapofMyCommunitiesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement mapofMyCommunitiesheader;
	
	@FindBy(xpath = "//span[normalize-space()='My Communities']")
	WebElement my_CommunitiesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement myCommunitiesheader;
	
	@FindBy(xpath = "//span[normalize-space()='My Tests']")
	WebElement myTestsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement myTestsheader;

	@FindBy(xpath = "//span[normalize-space()='My Tests']")
	WebElement my_TextMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement my_TextMenuheader;
	
	@FindBy(xpath = "//span[normalize-space()='Revenue Management']")
	public static WebElement revenueManagementMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Billing Item Management']")
	public static WebElement billingItemManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement billingItemManagementheader;
	
	@FindBy(xpath = "//span[normalize-space()='Billing Queue Management']")
	public static WebElement billingQueueManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement billingQueueManagementheader;

	@FindBy(xpath = "//span[normalize-space()='My Customer Charges']")
	public static WebElement myCustomerChargesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement myCustomerChargesheader;
	
	@FindBy(xpath = "//span[normalize-space()='** Test Plan Configuration **']")
	WebElement testPlanConfigurationMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement testPlanConfigurationheader;

	@FindBy(xpath = "//span[normalize-space()='** Testing Configuration **']")
	WebElement testingConfigurationMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement testingConfigurationheader;
	
	@FindBy(xpath = "//span[normalize-space()='Time & Expense']")
	WebElement timeExpenseMenu;
	
	@FindBy(xpath = "//span[normalize-space()='Time & Expense Management']")
	WebElement timeExpenseManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement timeExpenseManagementheader;
	
	@FindBy(xpath = "//span[normalize-space()='Time & Expense Submission']")
	WebElement timeExpenseSubmissionMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement timeExpenseSubmissionheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor Management']")
	WebElement vendorManagementMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement vendorManagementheader;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks']")
	WebElement ciraBooksMenu;

	@FindBy(xpath = "//span[normalize-space()='CiraBooks Workspace']")
	WebElement ciraBooksWorkspaceMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement ciraBooksWorkspaceheader;
	
	@FindBy(xpath = "//span[normalize-space()='Accounts Payable']")
	WebElement accountsPayableMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement accountsPayableheader;
	
	@FindBy(xpath = "//span[normalize-space()='Accounts Receivable']")
	WebElement accountsReceivableMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement accountsReceivableheader;
	
	@FindBy(xpath = "//span[normalize-space()='AP Batches']")
	WebElement apBatchesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement APBatchesheader;
	
	@FindBy(xpath = "//span[normalize-space()='AP Bill Analysis']")
	WebElement apBillAnalysisMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement apBillAnalysisheader;
	
	@FindBy(xpath = "//span[normalize-space()='AP Ledger']")
	WebElement apLedgerMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement apLedgerheader;
	
	@FindBy(xpath = "//span[normalize-space()='AP Unapplied Payments']")
	WebElement apUnappliedPaymentsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement apUnappliedPaymentsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Check Printing Management']")
	WebElement checkPrintingManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement checkPrintingManagementheader;

	@FindBy(xpath = "//span[normalize-space()='EFT Payment Management']")
	WebElement eftPaymentManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement eftPaymentManagementheader;
	
	@FindBy(xpath = "//span[normalize-space()='Local Office Only Check Printing']")
	WebElement localOfficeOnlyCheckPrintingMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement localOfficeOnlyCheckPrintingheader;

	@FindBy(xpath = "//span[normalize-space()='Manage AAP Workflow Vendor Edit']")
	WebElement manageAAPWorkflowVendorEditMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement manageAAPWorkflowVendorEditheader;

	@FindBy(xpath = "//span[normalize-space()='My Submitted Invoices']")
	WebElement mySubmittedInvoicesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement mySubmittedInvoicesheader;
	
	@FindBy(xpath = "//span[normalize-space()='Reimbursement Request']")
	WebElement reimbursementRequestMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement reimbursementRequestheader;
	
	@FindBy(xpath = "//span[normalize-space()='Search Invoices']")
	WebElement searchInvoicesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement searchInvoicesheader;
	
	@FindBy(xpath = "//span[normalize-space()='Submit Invoice']")
	WebElement submitInvoiceMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement submitInvoiceheader;

	@FindBy(xpath = "//span[normalize-space()='Vendor 1099']")
	WebElement vendor1099Menu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement vendor1099header;
	
	@FindBy(xpath = "//span[normalize-space()='Vendor Aging']")
	WebElement vendorAgingMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement vendorAgingheader;
	
	@FindBy(xpath = "//span[normalize-space()='Vendor Missing Bills']")
	WebElement vendorMissingBillsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement vendorMissingBillsheader;
	
	@FindBy(xpath = "//span[normalize-space()='AR Batches']")
	WebElement arBatchesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement arBatchesheader;

	@FindBy(xpath = "//span[normalize-space()='AR Collections']")
	WebElement arCollectionMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement arCollectionheader;
	
	@FindBy(xpath = "//span[normalize-space()='AR Invoice Analysis']")
	WebElement arInvoiceAnalysisMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement arInvoiceAnalysisheader;
	
	@FindBy(xpath = "//span[normalize-space()='AR Ledger']")
	WebElement arLedgerMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement arLedgereheader;

	@FindBy(xpath = "//span[normalize-space()='Add Payments']")
	WebElement addPaymentsMenu;	
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement addPaymentsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Customer Aging']")
	WebElement customerAgingMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement customerAgingheader;
	
	@FindBy(xpath = "//span[normalize-space()='Generate Builder Statements']")
	WebElement generateBuilderStatementsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement generateBuilderStatementsheader;

	@FindBy(xpath = "//span[normalize-space()='Lot Payment Allocation']")
	WebElement lotPaymentAllocationMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement lotPaymentAllocationheader;
	
	@FindBy(xpath = "//span[normalize-space()='Cash Management']")
	WebElement cashManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement cashManagementheader;
	
	@FindBy(xpath = "//span[normalize-space()='Bank Accounts']")
	WebElement bankAccountsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement bankAccountsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Bank Reconciliation']")
	WebElement bankReconciliationMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement bankReconciliationheader;
	
	@FindBy(xpath = "//span[normalize-space()='CM Batches']")
	WebElement cmBatchesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement cmBatchesheader;
	
	@FindBy(xpath = "//span[normalize-space()='Cash Receipts']")
	WebElement cashReceiptsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement cashReceiptsheader;

	@FindBy(xpath = "//span[normalize-space()='Cash Receipts']")
	WebElement createCashReceiptsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement createCashReceiptsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Deposits']")
	WebElement depositsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement depositsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Funds Transfer']")
	WebElement fundsTransferMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement fundsTransferheader;

	@FindBy(xpath = "//span[normalize-space()='Lockbox Payment File']")
	WebElement lockboxPaymentFileMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement lockboxPaymentFileheader;
	
	@FindBy(xpath = "//span[normalize-space()='Manage Bank Statements']")
	WebElement manageBankStatementsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement manageBankStatementsheader;

	@FindBy(xpath = "//span[normalize-space()='Unmatched Transactions']")
	WebElement unmatchedTransactionsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement unmatchedTransactionsheader;
	
	@FindBy(xpath = "//span[normalize-space()='CiraBooks Entity']")
	WebElement ciraBooksEntityMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement ciraBooksEntityheader;

	@FindBy(xpath = "//span[normalize-space()='Audit Log']")
	WebElement auditLogMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement auditLogheader;
	
	@FindBy(xpath = "//span[normalize-space()='Configuration']")
	WebElement configurationMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement configurationheader;

	@FindBy(xpath = "//span[normalize-space()='Financial Reports']")
	WebElement financialReportsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement financialReportsheader;
	
	@FindBy(xpath = "//span[normalize-space()='Actual vs Budget']")
	WebElement actualBudgetMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement actualBudgetheader;
	
	@FindBy(xpath = "//span[normalize-space()='Benchmark Report']")
	WebElement benchmarkReportMenu; 
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement benchmarkReportheader;
	
	@FindBy(xpath = "//span[normalize-space()='Financial Summary']")
	WebElement financialSummaryMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement financialSummaryheader;
	
	@FindBy(xpath = "//span[normalize-space()='General Ledger']")
	WebElement generalLedgerMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement generalLedgerheader;
	
	@FindBy(xpath = "//span[normalize-space()='Budget']")
	WebElement budgetMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement budgetheader;
	
	@FindBy(xpath = "//span[normalize-space()='General Ledger Report']")
	WebElement generalLedgerReportMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement generalLedgerReportheader;

	@FindBy(xpath = "//span[normalize-space()='Journal Entries']")
	WebElement journalEntriesMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement journalEntriesheader;
	
	@FindBy(xpath = "//div[@title='Journal Entry Templates']")
	WebElement journalEntryTemplatesMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement journalEntryTemplatesheader;
	
	@FindBy(xpath = "//span[normalize-space()='Open / Close Books']")
	WebElement openCloseBooksMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement openCloseBooksheader;
	
	@FindBy(xpath = "//span[normalize-space()='Trial Balance']")
	WebElement trialBalanceMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement trialBalanceheader;

	@FindBy(xpath = "//span[normalize-space()='Upload Budgets']")
	WebElement uploadBudgetsMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement uploadBudgetsheader;

	@FindBy(xpath = "//span[normalize-space()='Upload JEs']")
	WebElement uploadJEsMenu;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement uploadJEsheader;
	
	@FindBy(xpath = "//span[normalize-space()='User Setup']")
	WebElement usetupMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement usetupheader;
	
	@FindBy(xpath = "//span[normalize-space()='AR Load']")
	WebElement arloadMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement arloadheader;
	
	@FindBy(xpath = "//div[@title='My Portfolio']//i[@class='fas fa-chevron-right header-icon-button-right']")
	WebElement my_Portfolio_Click;
	
	@FindBy(xpath = "//span[normalize-space()='** Report Templates **']")
	WebElement ReportTemplates;
	
	@FindBy(xpath = "//span[normalize-space()='Owner ACH Setup']")
	WebElement achImportMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement achImportheader;
	
	@FindBy(xpath = "//span[normalize-space()='Portal User Management']")
	WebElement userManagementMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement userManagementheader;
	
	@FindBy(xpath = "//span[normalize-space()='Corp Invoice']")
	WebElement corpInvoiceUploadToolMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement corpInvoiceUploadToolheader;
	
	@FindBy(xpath = "//div[@title='Lot Load']")
	WebElement lotLoadMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement lotLoadheader;
	
	@FindBy(xpath = "//span[normalize-space()='AR Load']")
	WebElement arLoadMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement arLoadheader;
	
	@FindBy(xpath = "//i[@class='dx-icon fas fa-mail-bulk']")
	WebElement ciramailicon;
	
	@FindBy(xpath = "//i[@class='fas fa-bars fa-stack-1x fa-inverse']")
	WebElement logCallCreateCaseMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement logCallCreateCaseMenuheader;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-question']")
	WebElement helpiconMenu;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement helpiconheader;

	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement batchJobEmailsConfigurationsheader;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement closingPortalConfigurationsheader;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement communityConfigurationsheader;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement communityAccountingConfigurationsheader;
	
	@FindBy(xpath = "//h2[@class='page-header']")
	public static WebElement enforcementConfigurationsheader;
	
	@FindBy(xpath = "dx-loadindicator-icon")
	private WebElement loaderIcon;

	// Method to press Escape key
	public void pressEscapeKey() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	// method declaration
	public void checkAllModulesLinkPageLanding() throws AWTException, InterruptedException 
	{
		waitForInvisibility(loaderIcon);
		clickElement(myPortfolioMenu);
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(accountManagementMenu);
		clickElementJS(accountManagementMenu);
		
		waitForInvisibility(loaderIcon);
	}
	
	public void AchievementsPageLanding() 
	{
		scrollToElement(achievementsMenu);
		
		waitForElementToBeClickable(achievementsMenu);
		clickElementJS(achievementsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void CloudDrivePageLanding() 
	{
		
		waitForElementToBeClickable(cloudDriveMenu);
		clickElementJS(cloudDriveMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void MapofMyCommunitiesPageLanding() 
	{
		waitForElementToBeClickable(mapofMyCommunitiesMenu);
		clickElementJS(mapofMyCommunitiesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void myCommunitiesPageLanding() throws AWTException 
	{
		waitForElementToBeClickable(my_CommunitiesMenu);
		clickElementJS(my_CommunitiesMenu);
		waitForInvisibility(loaderIcon);
		
		//Caling Esc key function
		pressEscapeKey();
	}
	
	public void myTestsPageLanding() throws AWTException, InterruptedException 
	{
		waitForElementToBeClickable(myTestsMenu);
		clickElementJS(myTestsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void myTextPageLanding() 
	{
		waitForElementToBeClickable(my_TextMenu);
		clickElementJS(my_TextMenu);
		waitForInvisibility(loaderIcon);
				
		@SuppressWarnings({ "unchecked", "rawtypes" })
		
		ArrayList ownertabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownertabs.get(1));
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		
		ArrayList ownertabs1 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownertabs1.get(0));
	}
	
	public void navigatetorevenueManagement() 
	{
		scrollToElement(revenueManagementMenu);
		waitForElementToBeClickable(revenueManagementMenu);
		clickElementJS(revenueManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void billingItemManagementPageLanding() 
	{
		waitForElementToBeClickable(billingItemManagementMenu);
		clickElementJS(billingItemManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void billingQueueManagementPageLanding() 
	{
		waitForElementToBeClickable(billingQueueManagementMenu);
		clickElementJS(billingQueueManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void myCustomerChargesPageLanding() 
	{
		scrollToElement(myCustomerChargesMenu);
		waitForElementToBeClickable(myCustomerChargesMenu);
		clickElementJS(myCustomerChargesMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(revenueManagementMenu);
		waitForElementToBeClickable(revenueManagementMenu);
	}

	public void testPlanConfigurationPageLanding() 
	{
		scrollToElement(testPlanConfigurationMenu);
		waitForElementToBeClickable(testPlanConfigurationMenu);
		clickElementJS(testPlanConfigurationMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void testingConfigurationPageLanding() 
	{
		scrollToElement(testingConfigurationMenu);
		waitForElementToBeClickable(testingConfigurationMenu);
		clickElementJS(testingConfigurationMenu);
		waitForInvisibility(loaderIcon);
		
		ham_menu.click();
	}
	
	public void timeExpenseManagementPageLanding() throws InterruptedException 
	{
		scrollToElement(timeExpenseMenu);
		waitForElementToBeClickable(timeExpenseMenu);
		clickElementJS(timeExpenseMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(timeExpenseManagementMenu);
		waitForElementToBeClickable(timeExpenseManagementMenu);
		clickElementJS(timeExpenseManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void timeandExpenseSubmissionPageLanding() throws InterruptedException 
	{
		scrollToElement(timeExpenseSubmissionMenu);
		waitForElementToBeClickable(timeExpenseSubmissionMenu);
		clickElementJS(timeExpenseSubmissionMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(timeExpenseMenu);
		waitForElementToBeClickable(timeExpenseMenu);
		clickElementJS(timeExpenseMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void vendorManagementPageLanding() throws InterruptedException 
	{
		scrollToElement(vendorManagementMenu);
		waitForElementToBeClickable(vendorManagementMenu);
		clickElementJS(vendorManagementMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(myPortfolioMenu);
		waitForElementToBeClickable(myPortfolioMenu);
		clickElementJS(myPortfolioMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void ciraBooksModule() throws AWTException, InterruptedException 
	{
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(ciraBooksWorkspaceMenu);
		waitForElementToBeClickable(ciraBooksWorkspaceMenu);
		clickElementJS(ciraBooksWorkspaceMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void accountsPayablePageLanding() throws AWTException, InterruptedException 
	{
		scrollToElement(accountsPayableMenu);
		waitForElementToBeClickable(accountsPayableMenu);
		clickElementJS(accountsPayableMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(apBatchesMenu);
		waitForElementToBeClickable(apBatchesMenu);
		clickElementJS(apBatchesMenu);
		waitForInvisibility(loaderIcon);
		
	}
	public void apBillAnalysisPageLanding() throws AWTException, InterruptedException 
	{
		
		scrollToElement(apBillAnalysisMenu);
		waitForElementToBeClickable(apBillAnalysisMenu);
		clickElementJS(apBillAnalysisMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void apLedgerPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void apUnappliedPaymentsPageLanding() 
	{
		
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(apUnappliedPaymentsMenu);
		waitForElementToBeClickable(apUnappliedPaymentsMenu);
		clickElementJS(apUnappliedPaymentsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void checkPrintingManagementPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(checkPrintingManagementMenu);
		waitForElementToBeClickable(checkPrintingManagementMenu);
		clickElementJS(checkPrintingManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void eftPaymentManagementPageLanding() 
	{
		scrollToElement(apLedgerMenu);
		waitForElementToBeClickable(apLedgerMenu);
		clickElementJS(apLedgerMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(eftPaymentManagementMenu);
		waitForElementToBeClickable(eftPaymentManagementMenu);
		clickElementJS(eftPaymentManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void localOfficeOnlyCheckPrintingPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void manageAAPWorkflowVendorEditLanding() 
	{	
		scrollToElement(manageAAPWorkflowVendorEditMenu);
		waitForElementToBeClickable(manageAAPWorkflowVendorEditMenu);
		clickElementJS(manageAAPWorkflowVendorEditMenu);
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(manageAAPWorkflowVendorEditMenu);
		clickElementJS(manageAAPWorkflowVendorEditMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void mySubmittedInvoicesPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);
		
		waitForElementToBeClickable(mySubmittedInvoicesMenu);
		clickElementJS(mySubmittedInvoicesMenu);
		waitForInvisibility(loaderIcon);
		
	}
	
	public void reimbursementRequestPageLanding() 
	{	
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(reimbursementRequestMenu);
		waitForElementToBeClickable(reimbursementRequestMenu);
		clickElementJS(reimbursementRequestMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void searchInvoicesPageLanding() 
	{
		scrollToElement(localOfficeOnlyCheckPrintingMenu);
		waitForElementToBeClickable(localOfficeOnlyCheckPrintingMenu);
		clickElementJS(localOfficeOnlyCheckPrintingMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void submitInvoicePageLanding() 
	{	
		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(searchInvoicesMenu);
		waitForElementToBeClickable(searchInvoicesMenu);
		clickElementJS(searchInvoicesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void vendor1099PageLanding() 
	{
		scrollToElement(vendor1099Menu);
		waitForElementToBeClickable(vendor1099Menu);
		clickElementJS(vendor1099Menu);
		waitForInvisibility(loaderIcon);
	}
	
	public void vendorAgingPageLanding() 
	{
		scrollToElement(vendorAgingMenu);
		waitForElementToBeClickable(vendorAgingMenu);
		clickElementJS(vendorAgingMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void vendorMissingBillsPageLanding() 
	{
		scrollToElement(vendorMissingBillsMenu);
		waitForElementToBeClickable(vendorMissingBillsMenu);
		clickElementJS(vendorMissingBillsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void accountsReceivablePageLanding() 
	{
		scrollToElement(accountsPayableMenu);
		waitForElementToBeClickable(accountsPayableMenu);
		clickElementJS(accountsPayableMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(accountsReceivableMenu);
		waitForElementToBeClickable(accountsReceivableMenu);
		clickElementJS(accountsReceivableMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(arBatchesMenu);
		waitForElementToBeClickable(arBatchesMenu);
		clickElementJS(arBatchesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void arCollectionPageLanding() throws InterruptedException 
	{
		scrollToElement(arCollectionMenu);
		waitForElementToBeClickable(arCollectionMenu);
		clickElementJS(arCollectionMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void arInvoiceAnalysisPageLanding()
	{
		scrollToElement(arInvoiceAnalysisMenu);
		waitForElementToBeClickable(arInvoiceAnalysisMenu);
		clickElementJS(arInvoiceAnalysisMenu);
		waitForInvisibility(loaderIcon);
		
	}
	
	public void arLedgerPageLanding()
	{
		scrollToElement(arLedgerMenu);
		waitForElementToBeClickable(arLedgerMenu);
		clickElementJS(arLedgerMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void addPaymentsPageLanding()
	{
		scrollToElement(addPaymentsMenu);
		waitForElementToBeClickable(addPaymentsMenu);
		clickElementJS(addPaymentsMenu);
		waitForInvisibility(loaderIcon);
		
	}
	
	public void customerAgingPageLanding()
	{
		scrollToElement(customerAgingMenu);
		waitForElementToBeClickable(customerAgingMenu);
		clickElementJS(customerAgingMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void generateBuilderStatementsPageLanding()
	{
		scrollToElement(generateBuilderStatementsMenu);
		waitForElementToBeClickable(generateBuilderStatementsMenu);
		clickElementJS(generateBuilderStatementsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void lotPaymentAllocationPageLanding()
	{
		scrollToElement(lotPaymentAllocationMenu);
		waitForElementToBeClickable(lotPaymentAllocationMenu);
		clickElementJS(lotPaymentAllocationMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(accountsReceivableMenu);
		waitForElementToBeClickable(accountsReceivableMenu);
		clickElementJS(accountsReceivableMenu);
		waitForInvisibility(loaderIcon);
	}

//=============================== Cash_Management page code starts here ===========================
	public void cashManagementPageLanding() 
	{
		scrollToElement(cashManagementMenu);
		waitForElementToBeClickable(cashManagementMenu);
		clickElementJS(cashManagementMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(bankAccountsMenu);
		waitForElementToBeClickable(bankAccountsMenu);
		clickElementJS(bankAccountsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void bankReconciliationPageLanding() 
	{
		scrollToElement(bankReconciliationMenu);
		waitForElementToBeClickable(bankReconciliationMenu);
		clickElementJS(bankReconciliationMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void cmBatchesPageLanding() 
	{	
		scrollToElement(cmBatchesMenu);
		waitForElementToBeClickable(cmBatchesMenu);
		clickElementJS(cmBatchesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void cashReceiptsPageLanding() 
	{
		scrollToElement(cashReceiptsMenu);
		waitForElementToBeClickable(cashReceiptsMenu);
		clickElementJS(cashReceiptsMenu);
		waitForInvisibility(loaderIcon);
		
	}
	
	public void createCashReceiptsPageLanding() 
	{	
		scrollToElement(createCashReceiptsMenu);
		waitForElementToBeClickable(createCashReceiptsMenu);
		clickElementJS(createCashReceiptsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void depositsPageLanding() 
	{
		scrollToElement(depositsMenu);
		waitForElementToBeClickable(depositsMenu);
		clickElementJS(depositsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void fundsTransferPageLanding() 
	{
		scrollToElement(fundsTransferMenu);
		waitForElementToBeClickable(fundsTransferMenu);
		clickElementJS(fundsTransferMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void lockboxPaymentFilePageLanding() 
	{	
		scrollToElement(lockboxPaymentFileMenu);
		waitForElementToBeClickable(lockboxPaymentFileMenu);
		clickElementJS(lockboxPaymentFileMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void manageBankStatementsPageLanding() 
	{
		scrollToElement(manageBankStatementsMenu);
		waitForElementToBeClickable(manageBankStatementsMenu);
		clickElementJS(manageBankStatementsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void unmatchedTransactionsPageLanding() 
	{	
		scrollToElement(unmatchedTransactionsMenu);
		waitForElementToBeClickable(unmatchedTransactionsMenu);
		clickElementJS(unmatchedTransactionsMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(cashManagementMenu);
		waitForElementToBeClickable(cashManagementMenu);
		clickElementJS(cashManagementMenu);
		waitForInvisibility(loaderIcon);
	}
	
//=============================== CiraBooks Entity page code starts here ===========================
	public void ciraBooksEntityPageLanding() 
	{	
		scrollToElement(ciraBooksEntityMenu);
		waitForElementToBeClickable(ciraBooksEntityMenu);
		clickElementJS(ciraBooksEntityMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(auditLogMenu);
		waitForElementToBeClickable(auditLogMenu);
		clickElementJS(auditLogMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void configurationPageLanding() 
	{
		scrollToElement(configurationMenu);
		waitForElementToBeClickable(configurationMenu);
		clickElementJS(configurationMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(ciraBooksEntityMenu);
		waitForElementToBeClickable(ciraBooksEntityMenu);
		clickElementJS(ciraBooksEntityMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void financialReportsPageLanding() throws InterruptedException 
	{
		scrollToElement(financialReportsMenu);
		waitForElementToBeClickable(financialReportsMenu);
		clickElementJS(financialReportsMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(actualBudgetMenu);
		waitForElementToBeClickable(actualBudgetMenu);
		clickElementJS(actualBudgetMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void benchmarkReportPageLanding() 
	{
		scrollToElement(benchmarkReportMenu);
		waitForElementToBeClickable(benchmarkReportMenu);
		clickElementJS(benchmarkReportMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void financialSummaryPageLanding() 
	{
		scrollToElement(financialSummaryMenu);
		waitForElementToBeClickable(financialSummaryMenu);
		clickElementJS(financialSummaryMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(financialReportsMenu);
		waitForElementToBeClickable(financialReportsMenu);
		clickElementJS(financialReportsMenu);
		waitForInvisibility(loaderIcon);
	}
	
//=============================== General Ledger page code starts here ===========================
	public void generalLedgerPageLanding()
	{
		scrollToElement(generalLedgerMenu);
		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(budgetMenu);
		waitForElementToBeClickable(budgetMenu);
		clickElementJS(budgetMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void generalLedgerReportPageLanding()
	{
		scrollToElement(generalLedgerReportMenu);
		waitForElementToBeClickable(generalLedgerReportMenu);
		clickElementJS(generalLedgerReportMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void journalEntriesPageLanding()
	{	
		scrollToElement(journalEntriesMenu);
		waitForElementToBeClickable(journalEntriesMenu);
		clickElementJS(journalEntriesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void journalEntryTemplatesPageLanding()
	{	
		scrollToElement(journalEntryTemplatesMenu);
		waitForElementToBeClickable(journalEntryTemplatesMenu);
		clickElementJS(journalEntryTemplatesMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void openCloseBooksPageLanding()
	{
		scrollToElement(openCloseBooksMenu);
		waitForElementToBeClickable(openCloseBooksMenu);
		clickElementJS(openCloseBooksMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void trialBalancePageLanding()
	{
		scrollToElement(trialBalanceMenu);
		waitForElementToBeClickable(trialBalanceMenu);
		clickElementJS(trialBalanceMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void uploadBudgetsPageLanding()
	{	
		scrollToElement(uploadBudgetsMenu);
		waitForElementToBeClickable(uploadBudgetsMenu);
		clickElementJS(uploadBudgetsMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void uploadJEsPageLanding(WebElement elementMenu) 
	{
		
		scrollToElement(uploadJEsMenu);
		waitForElementToBeClickable(uploadJEsMenu);
		clickElementJS(uploadJEsMenu);
		waitForInvisibility(loaderIcon);
		
		scrollToElement(generalLedgerMenu);
		waitForElementToBeClickable(generalLedgerMenu);
		clickElementJS(generalLedgerMenu);
		waitForInvisibility(loaderIcon);
	}
	
	public void moduleClicked(WebElement elementMenu) throws Exception
	{
		scrollToElement(ciraBooksMenu);
		waitForElementToBeClickable(ciraBooksMenu);
		clickElementJS(ciraBooksMenu);
		waitForInvisibility(loaderIcon);
	}

	public void ciramailMenu(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList ownertabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownertabs.get(0));
	}
	
	public void logcallcreatecasePagelanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList ownertabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownertabs.get(0));
	}
	
	public void timeandexpensemanagementPageLanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList ownertabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownertabs.get(0));
	}
	
	public void helpIcon(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList ownertabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) ownertabs.get(0));
	}
	
//=================================== Configurations =====================================
	public void configurationMenu(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ReportTemplates);
	}
	
	public void batchJobEmailPageLanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
	}
	
	public void closingPortalPageLanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
	}
	
	public void communityPageLanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
	}
	
	public void communityAccountingPageLanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
	}
	
	public void enforcementPageLanding(WebElement elementMenu) throws Exception
	{
		elementMenu.click();
		waitForInvisibility(loaderIcon);
	}
}
