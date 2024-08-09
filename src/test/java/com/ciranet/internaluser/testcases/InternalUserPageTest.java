package com.ciranet.internaluser.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;
@SuppressWarnings("unused")
public class InternalUserPageTest extends TestBase
{
	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify All Modules Link Page", groups = { "Smoke" },alwaysRun = true)
	public void verifycheckAllModulesLinkPageLanding(XMLCredentialsReader.userCredentials credentials) throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Account Management Link");
		internalUserPage = loginPage.verifyInternalUserPage(credentials.getUsername(), credentials.getPassword());
		internalUserPage.checkAllModulesLinkPageLanding();
		TestBase.setExtentReportSettings("Account Management test", "Smoke Test", "Verify Account Management Title", "Verifying Account Management Title");
		assertEquals("Account Management", internalUserPage.accountManagementheader.getText());
	}

	@Test(priority = 1, description = "Verify Achievements Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyAchievementsURL() 
	{
		LoggerManager.info("Verifying Achievements Link Page");
		internalUserPage.AchievementsPageLanding();
		TestBase.setExtentReportSettings("achievements test", "Smoke Test", "Verify achievements Title", "Verifying achievements Title");
		assertEquals("Achievements", internalUserPage.achievementsheader.getText());
	}

	@Test(priority = 2, description = "Verify Cloud Drive Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyCloudDriveURL() 
	{
		LoggerManager.info("Verifying Cloud Drive Link Page");
		internalUserPage.CloudDrivePageLanding();
		TestBase.setExtentReportSettings("cloud Drives", "Smoke Test", "Verify cloud Drives Title", "Verifying cloud Drives Title");
		assertTrue(internalUserPage.cloudDrivesheader.isDisplayed());
	}
	
	@Test(priority = 3, description = "Verify Map of My Communities Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyMapofMyCommunitiesURL() 
	{
		LoggerManager.info("Verifying Map of My Communities Link Page");
		internalUserPage.MapofMyCommunitiesPageLanding();
		TestBase.setExtentReportSettings("map of My Communities", "Smoke Test", "Verify map of My Communities Title", "Verifying map of My Communities Title");
		assertEquals("map of My Communities", internalUserPage.mapofMyCommunitiesheader.getText());
	}

	@Test(priority = 4, description = "Verify My Communities page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyMyCommunitiesURL() throws AWTException 
	{
		LoggerManager.info("Verifying My Communities Link Page");
		internalUserPage.myCommunitiesPageLanding();
		TestBase.setExtentReportSettings("my Communities", "Smoke Test", "Verify my Communities  Title", "Verifying my Communities Title");
		assertEquals("my Communities", internalUserPage.myCommunitiesheader.getText());
	}

	@Test(priority = 5, description = "Verify My_Tests page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifymyTestsURL() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying My Tests Link Page");
		internalUserPage.myTestsPageLanding();
		TestBase.setExtentReportSettings("my Tests;", "Smoke Test", "Verify my Tests Title", "Verifying my Tests Title");
		assertEquals("my Tests;", internalUserPage.myTestsheader.getText());
	}

	@Test(priority = 6, description = "Verify My_Text page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifymyTextURL() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying My_Text Link Page");
		internalUserPage.myTextPageLanding();
		TestBase.setExtentReportSettings("my Text", "Smoke Test", "Verify my Text Title", "Verifying my Text Title");
		assertEquals("my Text", internalUserPage.my_TextMenuheader.getText());
	}
	
	@Test(priority = 7, description = "Verify Revenue Management page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifynavigatetorevenueManagement() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Revenue Management Page");
		internalUserPage.navigatetorevenueManagement();
	}

	@Test(priority = 8, description = "Verify  page Link", groups = { "Smoke" },alwaysRun = true)
	public void verify() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying  Page");
		internalUserPage.billingItemManagementPageLanding();
		TestBase.setExtentReportSettings("Billing Item Management", "Smoke Test", "Verify Billing Item Management Title", "Verifying Billing Item Management Title");
		assertEquals("Billing Item Management", internalUserPage.billingItemManagementheader.getText());
	}
	
	@Test(priority = 9, description = "Verify Billing Queue Management page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifybillingQueueManagementPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Billing Queue Management Page");
		internalUserPage.billingQueueManagementPageLanding();
		TestBase.setExtentReportSettings("Billing Queue Management", "Smoke Test", "Verify Billing Queue Management Title", "Verifying Billing Queue Management Title");
		assertEquals("Billing Queue Management", internalUserPage.billingQueueManagementheader.getText());
	}
	
	@Test(priority = 10, description = "Verify My Customer Charges page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifymyCustomerChargesPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying My Customer Charges Page");
		internalUserPage.myCustomerChargesPageLanding();
		TestBase.setExtentReportSettings("My Customer Charges", "Smoke Test", "Verify My Customer Charges Title", "Verifying My Customer Charges Title");
		assertEquals("My Customer Charges", internalUserPage.myCustomerChargesheader.getText());
	}
	
	@Test(priority = 11, description = "Verify Test Plan Configuration page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifytestPlanConfigurationPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Test Plan Configuration Link Page");
		internalUserPage.testPlanConfigurationPageLanding();
		TestBase.setExtentReportSettings("test Plan Configuration", "Smoke Test", "Verify  Title", "Verifying test Plan Configuration Title");
		assertEquals("test Plan Configuration", internalUserPage.testPlanConfigurationheader.getText());
	}

	@Test(priority = 12, description = "Verify Testing Configuration page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifytestingConfigurationPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Testing Configuration Link Page");
		internalUserPage.testingConfigurationPageLanding();
		TestBase.setExtentReportSettings("testing Configuration", "Smoke Test", "Verify testing Configuration Title", "Verifying testing Configuration Title");
		assertEquals("testing Configuration", internalUserPage.testingConfigurationheader.getText());
	}

	@Test(priority = 13, description = "Verify Time Expense Management page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifytimeExpenseManagementPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Time Expense Management Link Page");
		internalUserPage.timeExpenseManagementPageLanding();
		TestBase.setExtentReportSettings("time Expense Management", "Smoke Test", "Verify time Expense Management Title", "Verifying time Expense Management Title");
		assertEquals("time Expense Management", internalUserPage.timeExpenseManagementheader.getText());
	}

	@Test(priority = 14, description = "Verify Time and Expense Submission page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifytimeandExpenseSubmissionPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Time and Expense Submission Link Page");
		internalUserPage.timeandExpenseSubmissionPageLanding();
		TestBase.setExtentReportSettings("time Expense Submission", "Smoke Test", "Verify time Expense Submission Title", "Verifying time Expense Submission Title");
		assertEquals("time Expense Submission", internalUserPage.timeExpenseSubmissionheader.getText());
	}

	@Test(priority = 15, description = "Verify Vendor Management page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyvendorManagementPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Vendor Management Link Page");
		internalUserPage.vendorManagementPageLanding();
		TestBase.setExtentReportSettings("vendor Management", "Smoke Test", "Verify vendor Management Title", "Verifying vendor Management Title");
		assertEquals("vendor Management", internalUserPage.vendorManagementheader.getText());
	}

	@Test(priority = 16, description = "Verify CiraBooks Workspace page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyciraBooksModule() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying CiraBooks Workspace Link Page");
		internalUserPage.ciraBooksModule();
	}

	@Test(priority = 17, description = "Verify  Accounts Payable  Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyaccountsPayablePageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying Accounts_Payable Link Page");
		internalUserPage.accountsPayablePageLanding();
		TestBase.setExtentReportSettings("accounts Payable", "Smoke Test", "Verify accounts Payable Title", "Verifying accounts Payable Title");
		assertEquals("accounts Payable", internalUserPage.accountsPayableheader.getText());
	}

	@Test(priority = 18, description = "Verify AP Bill Analysis Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyapBillAnalysisPageLanding() throws AWTException, InterruptedException 
	{
		LoggerManager.info("Verifying AP Bill Analysis Page");
		internalUserPage.apBillAnalysisPageLanding();
		TestBase.setExtentReportSettings("ap Bill Analysis", "Smoke Test", "Verify ap Bill Analysis Title", "Verifying ap Bill Analysis Title");
		assertEquals("AP Bill Analysis", internalUserPage.apBillAnalysisheader.getText());
	}

	@Test(priority = 19, description = "Verify AP Ledger Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyapLedgerPageLanding() 
	{
		LoggerManager.info("Verifying AP_Ledger Page");
		internalUserPage.apLedgerPageLanding();
		TestBase.setExtentReportSettings("ap Ledger", "Smoke Test", "Verify ap Ledger Title", "Verifying ap Ledger Title");
		assertEquals("AP Ledger", internalUserPage.apLedgerheader.getText());
	}

	@Test(priority = 20, description = "Verify AP Unapplied Payments Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyapUnappliedPaymentsPageLanding() 
	{
		LoggerManager.info("Verifying AP Unapplied Payments Page");
		internalUserPage.apUnappliedPaymentsPageLanding();
		TestBase.setExtentReportSettings("AP Unapplied Payments", "Smoke Test", "Verify AP Unapplied Payments Title", "Verifying AP Unapplied Payments Title");
		assertEquals("AP Unapplied Payments", internalUserPage.apUnappliedPaymentsheader.getText());
	}

	@Test(priority = 21, description = "Verify CheckPrinting Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifycheckPrintingManagementPageLanding() 
	{
		LoggerManager.info("Verifying Check Printing Management Page");
		internalUserPage.checkPrintingManagementPageLanding();
		TestBase.setExtentReportSettings("check Printing Management", "Smoke Test", "Verify check Printing Management Title", "Verifying check Printing Management Title");
		assertEquals("check Printing Management", internalUserPage.checkPrintingManagementheader.getText());
	}

	@Test(priority = 22, description = "Verify EFTPaymentManagement Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyeftPaymentManagementPageLanding() 
	{
		LoggerManager.info("Verifying Check EFT Payment Management Page");
		internalUserPage.eftPaymentManagementPageLanding();
		TestBase.setExtentReportSettings("EFT Payment Management", "Smoke Test", "Verify EFT Payment Management Title", "Verifying EFT Payment Management Title");
		assertEquals("EFT Payment Management", internalUserPage.eftPaymentManagementheader.getText());
	}

	@Test(priority = 23, description = "Verify Local Office Only Check Printing Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifylocalOfficeOnlyCheckPrintingPageLanding() 
	{
		LoggerManager.info("Verifying Check Local Office Only Check Printing Page");
		internalUserPage.localOfficeOnlyCheckPrintingPageLanding();
		TestBase.setExtentReportSettings("Local Office Only Check Printing", "Smoke Test", "Verify Local Office Only Check Printing Title", "Verifying Local Office Only Check Printing Title");
		assertEquals("Local Office Only Check Printing", internalUserPage.localOfficeOnlyCheckPrintingheader.getText());
	}

	@Test(priority = 24, description = "Verify Manage AAP Workflow Vendor Edit Landing Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifymanageAAPWorkflowVendorEditLanding() 
	{
		LoggerManager.info("Verifying Manage AAP Workflow Vendor Edit Landing Page");
		internalUserPage.manageAAPWorkflowVendorEditLanding();
		TestBase.setExtentReportSettings("manage AAP Work flow Vendor Edit", "Smoke Test", "Verify Manage AAP Work flow Vendor Edit Title", "Verifying Manage AAP Work flow Vendor Edit Title");
		assertEquals("Manage AAP Work flow Vendor Edit", internalUserPage.manageAAPWorkflowVendorEditheader.getText());
	}

	@Test(priority = 25, description = "Verify My Submitted Invoices Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifymySubmittedInvoicesPageLanding() 
	{
		LoggerManager.info("Verifying My Submitted Invoices Landing Page");
		internalUserPage.mySubmittedInvoicesPageLanding();
		TestBase.setExtentReportSettings("My Submitted Invoices", "Smoke Test", "Verify My Submitted Invoices Title", "Verifying My Submitted Invoices Title");
		assertEquals("My Submitted Invoices", internalUserPage.mySubmittedInvoicesheader.getText());
	}

	@Test(priority = 26, description = "Verify Reimbursement Request Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyreimbursementRequestPageLanding() 
	{
		LoggerManager.info("Verifying Reimbursement Request Page");
		internalUserPage.reimbursementRequestPageLanding();
		TestBase.setExtentReportSettings("Reimbursement Request", "Smoke Test", "Verify Reimbursement Request Title", "Verifying Reimbursement Request Title");
		assertEquals("Reimbursement Request", internalUserPage.reimbursementRequestheader.getText());
	}

	@Test(priority = 27, description = "Verify Search Invoices Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifysearchInvoicesPageLanding() 
	{
		LoggerManager.info("Verifying Search Invoices Page");
		internalUserPage.searchInvoicesPageLanding();
		TestBase.setExtentReportSettings("search Invoices", "Smoke Test", "Verify search Invoices Title", "Verifying search Invoices Title");
		assertEquals("search Invoices", internalUserPage.searchInvoicesheader.getText());
	}

	@Test(priority = 28, description = "Verify Submit Invoice Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifysubmitInvoicePageLanding() 
	{
		LoggerManager.info("Verifying Submit Invoice Page");
		internalUserPage.submitInvoicePageLanding();
		TestBase.setExtentReportSettings("submit Invoice", "Smoke Test", "Verify submit Invoice Title", "Verifying submit Invoice Title");
		assertEquals("Submit Invoice", internalUserPage.submitInvoiceheader.getText());
	}

	@Test(priority = 29, description = "Verify Vendor 1099 Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyvendor1099PageLanding() 
	{
		LoggerManager.info("Verifying Vendor 1099 Page");
		internalUserPage.vendor1099PageLanding();
		TestBase.setExtentReportSettings("vendor1099", "Smoke Test", "Verify vendor1099 Title", "Verifying vendor1099 Title");
		assertEquals("vendor1099", internalUserPage.vendor1099header.getText());
	}

	@Test(priority = 30, description = "Verify Vendor Aging Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyvendorAgingPageLanding() 
	{
		LoggerManager.info("Verifying Vendor Aging Page");
		internalUserPage.vendorAgingPageLanding();
		TestBase.setExtentReportSettings("vendor Aging", "Smoke Test", "Verify vendor Aging Title", "Verifying vendor Aging Title");
		assertEquals("vendor Aging", internalUserPage.vendorAgingheader.getText());
	}

	@Test(priority = 31, description = "Verify Vendor Missing Bills Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyvendorMissingBillsPageLanding() 
	{
		LoggerManager.info("Verifying Vendor Missing Bills Page");
		internalUserPage.vendorMissingBillsPageLanding();
		TestBase.setExtentReportSettings("Vendor Missing Bills", "Smoke Test", "Verify Vendor Missing Bills Title", "Verifying Vendor Missing Bills Title");
		assertEquals("Vendor Missing Bills", internalUserPage.vendorMissingBillsheader.getText());
	}

	@Test(priority = 32, description = "Verify Accounts Receivable Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyaccountsReceivablePageLanding() 
	{
		LoggerManager.info("Verifying Accounts Receivable Page");
		internalUserPage.accountsReceivablePageLanding();
		TestBase.setExtentReportSettings("Accounts Receivable", "Smoke Test", "Verify Accounts Receivable Title", "Verifying Accounts Receivable Title");
		assertEquals("Accounts Receivable", internalUserPage.accountsReceivableheader.getText());
	}

	@Test(priority = 33, description = "Verify AR Collection Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyarCollectionPageLanding() throws InterruptedException 
	{
		LoggerManager.info("Verifying AR Collection Page");
		internalUserPage.arCollectionPageLanding();
		TestBase.setExtentReportSettings("ARCollection", "Smoke Test", "Verify ARCollection Title", "Verifying ARCollection Title");
		assertEquals("ARCollection", internalUserPage.arCollectionheader.getText());
	}

	@Test(priority = 30, description = "Verify AR Invoice Analysis Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyarInvoiceAnalysisPageLanding() 
	{
		LoggerManager.info("Verifying AR Invoice Analysis Page");
		internalUserPage.arInvoiceAnalysisPageLanding();
		TestBase.setExtentReportSettings("AR Invoice Analysis", "Smoke Test", "Verify AR Invoice Analysis Title", "Verifying AR Invoice Analysis Title");
		assertEquals("AR Invoice Analysis", internalUserPage.arInvoiceAnalysisheader.getText());
	}

	@Test(priority = 34, description = "Verify AR Ledger Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyarLedgerPageLanding() 
	{
		LoggerManager.info("Verifying AR Ledger Page");
		internalUserPage.arLedgerPageLanding();
		TestBase.setExtentReportSettings("AR Ledgere", "Smoke Test", "Verify AR Ledgere Title", "Verifying AR Ledgere Title");
		assertEquals("AR Ledgere", internalUserPage.arLedgereheader.getText());
	}

	@Test(priority = 35, description = "Verify Add Payments Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyaddPaymentsPageLanding() 
	{
		LoggerManager.info("Verifying Add Payments Page");
		internalUserPage.addPaymentsPageLanding();
		TestBase.setExtentReportSettings("Add Payments", "Smoke Test", "Verify Add Payments Title", "Verifying Add Payments Title");
		assertEquals("Add Payments", internalUserPage.addPaymentsheader.getText());
	}

	@Test(priority = 36, description = "Verify Customer Aging Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifycustomerAgingPageLanding() 
	{
		LoggerManager.info("Verifying Add Payments Page");
		internalUserPage.customerAgingPageLanding();
		TestBase.setExtentReportSettings("Customer Aging", "Smoke Test", "Verify Customer Aging Title", "Verifying Customer Aging Title");
		assertEquals("Customer Aging", internalUserPage.customerAgingheader.getText());
	}

	@Test(priority = 37, description = "Verify Generate Builder Statements Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifygenerateBuilderStatementsPageLanding() 
	{
		LoggerManager.info("Verifying Generate Builder Statements Page");
		internalUserPage.generateBuilderStatementsPageLanding();
		TestBase.setExtentReportSettings("", "Smoke Test", "Verify Generate Builder Statements Title", "Verifying Generate Builder Statements Title");
		assertEquals("Generate Builder Statements", internalUserPage.generateBuilderStatementsheader.getText());
	}

	@Test(priority = 38, description = "Verify Lot Payment Allocation Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifylotPaymentAllocationPageLanding() 
	{
		LoggerManager.info("Verifying Lot_Payment Allocation Page");
		internalUserPage.lotPaymentAllocationPageLanding();
		TestBase.setExtentReportSettings("Lot Payment Allocation", "Smoke Test", "Verify Lot Payment Allocation Title", "Verifying Lot Payment Allocation Title");
		assertEquals("Lot Payment Allocation", internalUserPage.lotPaymentAllocationheader.getText());
	}
//=============================== Cash_Management page code starts here ===========================

	@Test(priority = 39, description = "Verify CiraBooks>> Cash_Management>> Bank_Accounts Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifycashManagementPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Bank_Accounts Page");
		TestBase.setExtentReportSettings("", "Smoke Test", "Verify Cash Management Title", "Verifying Cash Management Title");
		assertEquals("Cash Management", internalUserPage.cashManagementheader.getText());
	}	

	@Test(priority = 40, description = "Verify CiraBooks>> Cash_Management>> Bank_Reconciliation Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifybankReconciliationPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Bank_Reconciliation Page");
		internalUserPage.bankReconciliationPageLanding();
		TestBase.setExtentReportSettings("Bank Reconciliation", "Smoke Test", "Verify Bank Reconciliation Title", "Verifying Bank Reconciliation Title");
		assertEquals("Bank Reconciliation", internalUserPage.bankReconciliationheader.getText());
	}	

	@Test(priority = 41, description = "Verify CiraBooks>> Cash_Management>> CM_Batches Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifycmBatchesPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> CM_Batches");
		internalUserPage.cmBatchesPageLanding();
		TestBase.setExtentReportSettings("CM Batches", "Smoke Test", "Verify CM Batches Title", "Verifying CM Batches Title");
		assertEquals("CM Batches", internalUserPage.cmBatchesheader.getText());
	}	

	@Test(priority = 42, description = "Verify CiraBooks>> Cash_Management>> Cash_Receipts Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifycashReceiptsPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Cash_Receipts");
		internalUserPage.cashReceiptsPageLanding();
		TestBase.setExtentReportSettings("cash Receipts", "Smoke Test", "Verify cash Receipts Title", "Verifying cash Receipts Title");
		assertEquals("cash Receipts", internalUserPage.cashReceiptsheader.getText());
	}	

	@Test(priority = 43, description = "Verify CiraBooks>> Cash_Management>> Cash_Receipts Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifycreateCashReceiptsPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Create_Cash_ReceiptsPageLanding");
		internalUserPage.createCashReceiptsPageLanding();
		TestBase.setExtentReportSettings("Create Cash Receipts", "Smoke Test", "Verify Create Cash Receipts Title", "Verifying Create Cash Receipts Title");
		assertEquals("Create Cash Receipts", internalUserPage.createCashReceiptsheader.getText());
	}	

	@Test(priority = 44, description = "Verify CiraBooks>> Cash_Management>> Deposits Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifydepositsPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Deposits");
		internalUserPage.depositsPageLanding();
		TestBase.setExtentReportSettings("Deposits", "Smoke Test", "Verify Deposits Title", "Verifying Deposits Title");
		assertEquals("Deposits", internalUserPage.depositsheader.getText());
	}	

	@Test(priority = 45, description = "Verify CiraBooks>> Cash_Management>> Funds_Transfer Page Link", groups = { "Smoke" },alwaysRun = true)
	public void veriffundsTransferPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Funds_Transfer");
		internalUserPage.fundsTransferPageLanding();
		TestBase.setExtentReportSettings("Funds Transfer", "Smoke Test", "Verify Funds Transfer Title", "Verifying Funds Transfer Title");
		assertEquals("Funds Transfer", internalUserPage.fundsTransferheader.getText());
	}	

	@Test(priority = 46, description = "Verify CiraBooks>> Cash_Management>> Lockbox_Payment_File Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifylockboxPaymentFilePageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Lockbox_Payment_File");
		internalUserPage.lockboxPaymentFilePageLanding();
		TestBase.setExtentReportSettings("Lockbox Payment File", "Smoke Test", "Verify Lockbox Payment File Title", "Verifying Lockbox Payment File Title");
		assertEquals("Lockbox Payment File", internalUserPage.lockboxPaymentFileheader.getText());
	}

	@Test(priority = 47, description = "Verify CiraBooks>> Cash_Management>> Manage_Bank_Statements Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifymanageBankStatementsPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Manage_Bank_Statements");
		internalUserPage.manageBankStatementsPageLanding();
		TestBase.setExtentReportSettings("Manage Bank Statements", "Smoke Test", "Verify Manage Bank Statements Title", "Verifying Manage Bank Statements Title");
		assertEquals("Manage Bank Statements", internalUserPage.manageBankStatementsheader.getText());
	}

	@Test(priority = 48, description = "Verify CiraBooks>> Cash_Management>> Unmatched_Transactions Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyunmatchedTransactionsPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Cash_Management>> Unmatched_Transactions");
		internalUserPage.unmatchedTransactionsPageLanding();
		TestBase.setExtentReportSettings("Unmatched Transactions", "Smoke Test", "Verify Unmatched Transactions Title", "Verifying Unmatched Transactions Title");
		assertEquals("Unmatched Transactions", internalUserPage.unmatchedTransactionsheader.getText());
	}

	@Test(priority = 49, description = "Verify CiraBooks>> CiraBooks_Entity>> Audit_Log Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyciraBooksEntityPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> CiraBooks_Entity>> Audit_Log");
		internalUserPage.ciraBooksEntityPageLanding();
		TestBase.setExtentReportSettings("CiraBooks Entity", "Smoke Test", "Verify CiraBooks Entity Title", "Verifying CiraBooks Entity Title");
		assertEquals("CiraBooks Entity", internalUserPage.ciraBooksEntityheader.getText());
	}

	@Test(priority = 50, description = "Verify CiraBooks>> CiraBooks_Entity>> Configuration Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyconfigurationPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> CiraBooks_Entity>> Configuration");
		internalUserPage.configurationPageLanding();
		TestBase.setExtentReportSettings("Configuration", "Smoke Test", "Verify Configuration Title", "Verifying Configuration Title");
		assertEquals("Configuration", internalUserPage.configurationheader.getText());
	}

	@Test(priority = 51, description = "Verify CiraBooks>> Financial_Reports>> Actual_Budget Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyfinancialReportsPageLanding() throws InterruptedException 
	{
		LoggerManager.info("Verifying CiraBooks>> Financial_Reports>> Actual_Budget Page");
		internalUserPage.financialReportsPageLanding();
		TestBase.setExtentReportSettings("Financial Reports", "Smoke Test", "Verify Financial Reports Title", "Verifying Financial Reports Title");
		assertEquals("Financial Reports", internalUserPage.financialReportsheader.getText());
	}

	@Test(priority = 52, description = "Verify CiraBooks>> Financial_Reports>> Benchmark_Report Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifybenchmarkReportPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Financial_Reports>> Benchmark_Report page");
		internalUserPage.benchmarkReportPageLanding();
		TestBase.setExtentReportSettings("Benchmark Report", "Smoke Test", "Verify Benchmark Report Title", "Verifying Benchmark Report Title");
		assertEquals("Benchmark Report", internalUserPage.benchmarkReportheader.getText());
	}

	@Test(priority = 53, description = "Verify CiraBooks>> Financial_Reports>> Financial_Summary Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyfinancialSummaryPageLanding() 
	{
		LoggerManager.info("Verifying CiraBooks>> Financial_Reports>> Financial_Summary page");
		internalUserPage.financialSummaryPageLanding();
		TestBase.setExtentReportSettings("Financial Summary", "Smoke Test", "Verify Financial Summary Title", "Verifying Financial Summary Title");
		assertEquals("Financial Summary", internalUserPage.financialSummaryheader.getText());
	}

	@Test(priority = 54, description = "Verify General_Ledger>> Budget Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifygeneralLedgerPageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> Budget page");
		internalUserPage.generalLedgerPageLanding();
		TestBase.setExtentReportSettings("General Ledger", "Smoke Test", "Verify General Ledger Title", "Verifying General Ledger Title");
		assertEquals("General Ledger", internalUserPage.generalLedgerheader.getText());
	}

	@Test(priority = 55, description = "Verify General_Ledger>> General_Ledger_Report Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifygeneralLedgerReportPageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> General_Ledger_Report page");
		internalUserPage.generalLedgerReportPageLanding();
		TestBase.setExtentReportSettings("General Ledger Report", "Smoke Test", "Verify General Ledger Report Title", "Verifying General Ledger Report Title");
		assertEquals("General Ledger Report", internalUserPage.generalLedgerReportheader.getText());
	}

	@Test(priority = 56, description = "Verify General_Ledger>> Journal_Entries Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyjournalEntriesPageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> Journal_Entries page");
		internalUserPage.journalEntriesPageLanding();
		TestBase.setExtentReportSettings("Journal Entries", "Smoke Test", "Verify Journal Entries Title", "Verifying Journal Entries Title");
		assertEquals("Journal Entries", internalUserPage.journalEntriesheader.getText());
	}

	@Test(priority = 57, description = "Verify General_Ledger>> Journal_Entry_Templates Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyjournalEntryTemplatesPageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> Journal_Entry_Templates page");
		internalUserPage.journalEntryTemplatesPageLanding();
		TestBase.setExtentReportSettings("Journal Entry Templates", "Smoke Test", "Verify Journal Entry Templates Title", "Verifying Journal Entry Templates Title");
		assertEquals("Journal Entry Templates", internalUserPage.journalEntryTemplatesheader.getText());
	}

	@Test(priority = 58, description = "Verify General_Ledger>> Open Close Books Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyopenCloseBooksPageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> Open Close Books page");
		internalUserPage.openCloseBooksPageLanding();
		TestBase.setExtentReportSettings("Open Close Books", "Smoke Test", "Verify Open Close Books Title", "Verifying Open Close Books Title");
		assertEquals("Open Close Books", internalUserPage.openCloseBooksheader.getText());
	}

	@Test(priority = 59, description = "Verify General_Ledger>> Trial Balance Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifytrialBalancePageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> Trial Balance page");
		internalUserPage.trialBalancePageLanding();
		TestBase.setExtentReportSettings("Trial Balance", "Smoke Test", "Verify Trial Balance Title", "Verifying Trial Balance Title");
		assertEquals("Trial Balance", internalUserPage.trialBalanceheader.getText());
	}

	@Test(priority = 60, description = "Verify General_Ledger>> Upload Budgets Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyuploadBudgetsPageLanding() 
	{
		LoggerManager.info("Verifying General_Ledger>> Upload Budgets page");
		internalUserPage.uploadBudgetsPageLanding();
		TestBase.setExtentReportSettings("Upload Budgets", "Smoke Test", "Verify Upload Budgets Title", "Verifying Upload Budgets Title");
		assertEquals("Upload Budgets", internalUserPage.uploadBudgetsheader.getText());
	}

	@Test(priority = 61, description = "Verify General_Ledger>> Upload_JEs Page Link", groups = { "Smoke" },alwaysRun = true)
	public void verifyuploadJEsPageLanding() throws Exception 
	{
		LoggerManager.info("Verifying General_Ledger>> Upload_JEs page");
		internalUserPage.uploadJEsPageLanding(driver.findElement(By.xpath ("//span[normalize-space()='Upload JEs']")));
		TestBase.setExtentReportSettings("Upload JEs", "Smoke Test", "Verify Upload JEs Title", "Verifying Upload JEs Title");
		assertEquals("Upload JEs", internalUserPage.uploadJEsheader.getText());
	}
//======================================= Footer toolbar ====================================================

	@Test(priority = 62, description = "Verify ciramail footer toolbar ", groups = { "Smoke" },alwaysRun = true)
	public void verifyciramailMenu() throws Exception
	{
		LoggerManager.info("Verifying ciramail footer toolbar");
		internalUserPage.ciramailMenu(driver.findElement(By.xpath ("//i[@class='dx-icon fas fa-mail-bulk']")));
	}

	@Test(priority = 63, description = "Verify logcallcreatecase footer toolbar ", groups = { "Smoke" },alwaysRun = true)
	public void verifylogcallcreatecasePagelanding() throws Exception
	{
		LoggerManager.info("Verifying logcallcreatecase footer toolbar");
		internalUserPage.logcallcreatecasePagelanding(driver.findElement(By.xpath ("//i[@class='fas fa-bars fa-stack-1x fa-inverse']")));
	}

	@Test(priority = 64, description = "Verify time and expense management footer toolbar ", groups = { "Smoke" },alwaysRun = true)
	public void verifytimeandexpensemanagementPageLanding() throws Exception
	{
		LoggerManager.info("Verifying time and expense managementfooter toolbar");
		internalUserPage.timeandexpensemanagementPageLanding(driver.findElement(By.xpath ("//i[@class='dx-icon fas fa-hand-holding-usd']")));
	}

	@Test(priority = 65, description = "Verify help footer toolbar icon", groups = { "Smoke" },alwaysRun = true)
	public void verifyhelpIcon() throws Exception
	{
		LoggerManager.info("Verifying help footer toolbar menu");
		internalUserPage.helpIcon(driver.findElement(By.xpath ("//i[@class='dx-icon fas fa-question']")));
	}
//=================================== Configurations =====================================

	@Test(priority = 66, description = "Verify Configuration>> Batch Job Email", groups = { "Smoke" },alwaysRun = true)
	public void verifyconfigurationMenu() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		LoggerManager.info("Verifying Configuration>> Batch Job Email");
		internalUserPage.configurationMenu(driver.findElement(By.xpath ("//span[normalize-space()='My Portfolio']")));
		internalUserPage.configurationMenu(driver.findElement(By.xpath ("//span[normalize-space()='Configurations']")));
	}

	@Test(priority = 67, description = "Verify Configuration>> Batch Job Email", groups = { "Smoke" },alwaysRun = true)
	public void verifybatchJobEmailPageLanding() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		LoggerManager.info("Verifying Configuration>> Batch Job Email");
		internalUserPage.batchJobEmailPageLanding(driver.findElement(By.xpath ("//span[normalize-space()='** Batch Job Emails **']")));
		TestBase.setExtentReportSettings("Batch Job Emails Configurations", "Smoke Test", "Verify Batch Job Emails Configurations Title", "Verifying Batch Job Emails Configurations Title");
		assertEquals("Batch Job Emails Configurations", internalUserPage.batchJobEmailsConfigurationsheader.getText());
	}

	@Test(priority = 68, description = "Verify Configuration>> ClosingPortal", groups = { "Smoke" },alwaysRun = true)
	public void verifyclosingPortalPageLanding() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		LoggerManager.info("Verifying Configuration>> ClosingPortal");
		internalUserPage.closingPortalPageLanding(driver.findElement(By.xpath ("//span[normalize-space()='Closing Portal']")));
		TestBase.setExtentReportSettings("Closing Portal Configurations", "Smoke Test", "Verify Closing Portal Configurations Title", "Verifying Closing Portal Configurations Title");
		assertEquals("Closing Portal Configurations", internalUserPage.closingPortalConfigurationsheader.getText());
	}
//=================================================================================================================================================

	@Test(priority = 69, description = "Verify Configuration>> ClosingPortal", groups = { "Smoke" },alwaysRun = true)
	public void verifycommunityPageLanding() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		LoggerManager.info("Verifying Configuration>> Community");
		internalUserPage.communityPageLanding(driver.findElement(By.xpath ("//span[normalize-space()='Community']")));
		TestBase.setExtentReportSettings("", "Smoke Test", "Verify  Title", "Verifying  Title");
		assertEquals("Community Configurations", internalUserPage.communityConfigurationsheader.getText());
	}

	@Test(priority = 70, description = "Verify Configuration>> CommunityAccounting", groups = { "Smoke" },alwaysRun = true)
	public void verifycommunityAccountingPageLanding() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		LoggerManager.info("Verifying Configuration>> CommunityAccounting");
		internalUserPage.communityAccountingPageLanding(driver.findElement(By.xpath ("//span[normalize-space()='** Community Accounting **']")));
		TestBase.setExtentReportSettings("communityAccountingConfigurationsheader", "Smoke Test", "Verify communityAccountingConfigurationsheader Title", "Verifying communityAccountingConfigurationsheader Title");
		assertEquals("Community Accounting Configurations", internalUserPage.communityAccountingConfigurationsheader.getText());
	}

	@Test(priority = 71, description = "Verify Configuration>> Enforcement", groups = { "Smoke" },alwaysRun = true)
	public void verifyenforcementPageLanding() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		LoggerManager.info("Verifying Configuration>> Enforcement");
		internalUserPage.enforcementPageLanding(driver.findElement(By.xpath ("//span[normalize-space()='Enforcement']")));
		TestBase.setExtentReportSettings("Enforcement Configurations", "Smoke Test", "Verify Enforcement Configurations Title", "Verifying Enforcement Configurations Title");
		assertEquals("Enforcement Configurations", internalUserPage.enforcementConfigurationsheader.getText());
	}
	

}









