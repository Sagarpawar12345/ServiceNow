package com.ciranet.myportfolio.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;

public class RevMgmtBillingItemManagementPageTest extends TestBase{

	String username =  "abhay.ranade" ;
	String password =  "YellowFrame62#"; 

	@Test(priority = 0, description = "Verify Billing Item Management Page Title", groups = { "Smoke" }, alwaysRun = true)
	public void VerifybillingItemManagementURL() {

		LoggerManager.info("Verifying Billing Item Management Page Title");
		TestBase.setExtentReportSettings("Billing Item Management Page Title Test", "Smoke Test", "Verify Billing Item Management Page Title", "Verifying Billing Item Management Page Title");

		billingItemManagementPage = loginPage.verifyBillingItemManagementPage(username, password);
		billingItemManagementPage.BillingItemMangementpageLanding();
	}

	@Test(priority = 1, description = "Verify Customer Grid Count ", groups = { "functional" }, alwaysRun = true)
	public void verifyCustomerGridCountloading()
	{
		TestBase.setExtentReportSettings("Customer Grid Count Test", "Smoke Test", "Verify Customer Grid Count ", "Verifying Customer Grid Count ");
		billingItemManagementPage.verifyCustomerGridCount();

	}

	@Test(priority = 2, description = "Verify Add Button Click", groups = { "functional" }, alwaysRun = true)
	public void verifyaddBillingItem()
	{
		TestBase.setExtentReportSettings("Add Button Click Test", "Smoke Test", "Verify Add Button Click", "Verifying Add Button Click");
		billingItemManagementPage.addBillingItem();
	}

	@Test(priority = 3, description = "Verify Action Edit Option", groups = { "functional" }, alwaysRun = true)
	public void verifyActionEditOption()
	{
		TestBase.setExtentReportSettings("Action Edit Option Test", "Smoke Test", "Verify Action Edit Option", "Verifying Action Edit Option");
		billingItemManagementPage.verifyActionEdit();
	}


	@Test(priority = 4, description = "Verify Action Delete No Option", groups = { "functional" }, alwaysRun = true)
	public void verifyActionDeleteNoOption()
	{
		TestBase.setExtentReportSettings("Action Delete No Option Test", "Smoke Test", "Verify Action Delete No Option", "Verifying Action Delete No Option");
		billingItemManagementPage.verifyActionDeleteNo();
	}


	@Test(priority = 5, description = "Verify Action Delete Yes Option", groups = { "functional" }, alwaysRun = true)
	public void verifyActionDeleteYesOption()
	
	{
		TestBase.setExtentReportSettings("Action Delete Yes Option Test", "Smoke Test", "Verify Action Delete Yes Option", "Verifying Action Delete Yes Option");
		billingItemManagementPage.verifyActionDeleteYes();
	}

	@Test(priority = 6, description = "Verify Expand and Click Option", groups = { "functional" }, alwaysRun = true)
	public void verifyExpandOptionClick()
	{
		TestBase.setExtentReportSettings("Expand and Click Option Test", "Smoke Test", "Verify Expand and Click Option", "Verifying Expand and Click Option");
		billingItemManagementPage.expandOptionClick();
	}


	@Test(priority = 7, description = "Verify Column Chooser Option", groups = { "functional" }, alwaysRun = true)
	public void verifycolumnChooserClick()
	{
		TestBase.setExtentReportSettings("Column Chooser Option Test", "Smoke Test", "Verify Column Chooser Option", "Verifying Column Chooser Option");
		billingItemManagementPage.columnChooserClick();

	}

	@Test(priority = 8, description = "Verify Toolbar and Full Screen Option", groups = { "functional" }, alwaysRun = true)
	public void VerifyToolBarFullScreen()
	{
		TestBase.setExtentReportSettings("Toolbar and Full Screen Option Test", "Smoke Test", "Verify Toolbar and Full Screen Option", "Verifying Toolbar and Full Screen Option");
		billingItemManagementPage.ToolBarFullScreen();
	}

	@Test(priority = 9, description = "Verify Export To Excel Option", groups = { "functional" }, alwaysRun = true)
	public void verifyExportToExcelDownload()
	{
		TestBase.setExtentReportSettings("Export To Excel Option Test", "Smoke Test", "Verify Export To Excel Option", "Verifying Export To Excel Option");
		billingItemManagementPage.verifyExportToExcel();
	}

	@Test(priority = 10, description = "Verify Import Button Click", groups = { "functional" }, alwaysRun = true)
	public void VerifyImportButton()
	{
		TestBase.setExtentReportSettings("Import Button Click Test", "Smoke Test", "Verify Import Button Click", "Verifying Import Button Click");
		billingItemManagementPage.VerifyImport();
	}


}
