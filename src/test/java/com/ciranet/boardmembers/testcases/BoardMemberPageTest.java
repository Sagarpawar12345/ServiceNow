package com.ciranet.boardmembers.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class BoardMemberPageTest extends TestBase {
	// boardMemberProvider
	JavascriptExecutor jse;	
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify HomePage of Board Member", groups = { "Functional" },alwaysRun = true)
	public void verifyHomePageSearch(XMLCredentialsReader.userCredentials credentials) throws Exception {
		LoggerManager.info("Verify HomePage of Board Member");
		
		boardMemberHomePage = loginPage.verifyBoardMemberHomePage(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Board Member Page Components Test", "Smoke Test", "Verify Home Page Components", "Verifying Home Page Components");
		assertTrue(boardMemberHomePage.verifyPageHeaderAndClickHelpIcon(),"Failed to get the Page Help");
	}

	// ========== Communications menus starts here ========== // 
	//@Test(priority = 1, description = "Verify Communication Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommunication() throws Exception {
		LoggerManager.info("Verifying Communication-Announcement Page");

		TestBase.setExtentReportSettings("Communication-Announcement Test", "Smoke Test", "Verify Communication-Announcement Page", "Verifying Communication-Announcement Page");
		
		boardMemberHomePage.verifyCommunicationMenu();
		
		assertEquals("Announcements", boardMemberHomePage.lblAnnoucement.getText());
	}

	//@Test(priority = 2, description = "Verify Mail Merge Page", groups = { "Functional" },alwaysRun = true)
	public void verifyMailMerge() throws Exception {
		LoggerManager.info("Verifying Mail Merge Page");
		
		//boardMemberHomePage = loginPage.verifyBoardMemberHomePage(username, password);
		TestBase.setExtentReportSettings("Mail Merge Test", "Smoke Test", "Verify Mail Merge Page", "Verifying Mail Merge Page");
				
		boardMemberHomePage.verifyMailMergeModule();
		
		assertEquals("Mail Merge", boardMemberHomePage.lblMailMerge.getText());
	}

	//@Test(priority = 3, description = "Verify Resident Contact Logs Page", groups = { "Functional" },alwaysRun = true)
	public void verifyResidentContactLogs() throws Exception {
		LoggerManager.info("Verifying Resident Contact Logs Page");
		
		TestBase.setExtentReportSettings("Resident Contact Logs Test", "Smoke Test", "Verify Resident Contact Logs Page", "Verifying Resident Contact Logs Page");
		
		boardMemberHomePage.verifyResidentContactLogsModule();
		
		assertEquals("Resident Contact Logs", boardMemberHomePage.lblResidentContactLogs.getText());
		
	}
	// ========== Communications menus ends here ========== // 
	
	// ========== Compliance menus starts here ========== // 
	
	// @Test(priority = 4, description = "Verify Certified Tracking Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCertiedTracking() throws Exception {
		LoggerManager.info("Verifying Certified Tracking Page");
		
		TestBase.setExtentReportSettings("Certified Tracking Test", "Smoke Test", "Verify Certified Tracking Page", "Verifying Certified Tracking Page");
		
		boardMemberHomePage.verifyComplianceCertifiedTrackingModule();
		
		assertEquals("Certified Tracking", boardMemberHomePage.lblCertifiedTracking.getText());
		
	}
	
	//@Test(priority = 5, description = "Verify Detailed Violation Log Page", groups = { "Functional" },alwaysRun = true)
	public void verifyDetailedViolationLog() throws Exception {
		LoggerManager.info("Verifying Detailed Violation Log Page");
		
		TestBase.setExtentReportSettings("Detailed Violation Log Test", "Smoke Test", "Verify Detailed Violation Log Page", "Verifying Detailed Violation Log Page");
		
		boardMemberHomePage.verifyDetailedViolationLogTrackingModule();
		
		assertEquals("Detailed Violations Log", boardMemberHomePage.lblDetailedVioLog.getText());
		
	}
	
	//@Test(priority = 6, description = "Verify Last Inspection Log Page", groups = { "Functional" },alwaysRun = true)
	public void verifyLastInspectionLog() throws Exception {
		LoggerManager.info("Verifying Last Inspection Log Page");
		TestBase.setExtentReportSettings("Last Inspection Log Test", "Smoke Test", "Verify Last Inspection Log Page", "Verifying Last Inspection Log Page");
				
		boardMemberHomePage.verifyLastInspectionLogModule();
		assertEquals("Last Inspection Log", boardMemberHomePage.lblLastInspectionLog.getText());
	}
	
	//@Test(priority = 7, description = "Verify Open Violations Log Page", groups = { "Functional" },alwaysRun = true)
	public void verifyOpenViolationsLog() throws Exception {
		LoggerManager.info("Verifying Open Violations Log Page");
		TestBase.setExtentReportSettings("Open Violations Log Test", "Smoke Test", "Verify Open Violations Log Page", "Verifying Open Violations Log Page");
		
		boardMemberHomePage.verifyLastOpenViolationsModule();
		
		assertEquals("Open Violations Log", boardMemberHomePage.lblOpenViolationLog.getText());
		
	}
	
	//@Test(priority = 8, description = "Verify Report A Violation Page", groups = { "Functional" },alwaysRun = true)
		public void verifyReportAViolation() throws Exception {
			LoggerManager.info("Verifying Report A Violation Page");
			TestBase.setExtentReportSettings("Report A Violation Test", "Smoke Test", "Verify Report A Violation Page", "Verifying Report A Violation Page");
			
			boardMemberHomePage.verifyReportAViolationModule();
			
			assertEquals("Report a Violation", boardMemberHomePage.lblReportAViolation.getText());
			
		}
	
	//@Test(priority = 9, description = "Verify Restriction Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyRestrictionSummary() throws Exception {
		LoggerManager.info("Verifying Restriction Summary Page");
		
		TestBase.setExtentReportSettings("Restriction Summary Test", "Smoke Test", "Verify Restriction Summary Page", "Verifying Restriction Summary Page");
		
		boardMemberHomePage.verifyRestrictionSummaryModule();
		
		assertEquals("Deed Restriction Full Summary", boardMemberHomePage.lblRestrictionSummary.getText());
	}
	
	// =========== Compliance menu Ends here ========== //
	
	// =========== Information menus start here ========== //
	
	//@Test(priority = 10, description = "Verify Additional Info Page", groups = { "Functional" },alwaysRun = true)
	public void verifyAdditionalInfoMenu() throws Exception {
		LoggerManager.info("Verifying Additional Info Page");
		
		TestBase.setExtentReportSettings("Additional Info", "Smoke Test", "Verify Additional Info page", "Verifying Additional Info");
		
		boardMemberHomePage.verifyAdditionalInformationModule();
		
		assertEquals("Additional Information", boardMemberHomePage.lblAdditionalInfo.getText());
	}
	
	//@Test(priority = 11, description = "Verify Amenities And Access Control Page", groups = { "Functional" },alwaysRun = true)
	public void verifyAmenitiesAccessControlMenu() throws Exception {
		LoggerManager.info("Verifying Amenities and Access Control Page");
		
		TestBase.setExtentReportSettings("Amenities and Access Control", "Smoke Test", "Verify Amenities and Access Control page", "Verifying Amenities and Access Control");
		
		boardMemberHomePage.verifyAmenitiesAccessControlModule();
		
		assertEquals("Amenities and Access Control", boardMemberHomePage.lblAmenitiesAndAccessControl.getText());
	}
	
	
	//@Test(priority = 12, description = "Verify Board / Committee Members Page", groups = { "Functional" },alwaysRun = true)
	public void verifyBoardCommitteeMembersMenu() throws Exception {
		LoggerManager.info("Verifying Board / Committee Members Page");
		
		TestBase.setExtentReportSettings("Board / Committee Members", "Smoke Test", "Verify Board / Committee Members page", "Verifying Board / Committee Members");
		
		boardMemberHomePage.verifyBoardCommitteeMemberModule();
		
		assertEquals("Board / Committee Members", boardMemberHomePage.lblBoardCommitteeMember.getText());
	}
	
	//@Test(priority = 13, description = "Verify Calendar Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCalendarMenu() throws Exception {
		LoggerManager.info("Verifying Calendar Page");
		
		TestBase.setExtentReportSettings("Calendar", "Smoke Test", "Verify Calendar page", "Verifying Calendar Members");
		
		boardMemberHomePage.verifyCalendarModule();
		
		assertEquals("My Calendar", boardMemberHomePage.lblMyCalendar.getText());
	}
	
	//@Test(priority = 14, description = "Verify Common Lots Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommonLotsMenu() throws Exception {
		LoggerManager.info("Verifying Common Lots Page");
		
		TestBase.setExtentReportSettings("Common Lots", "Smoke Test", "Verify Common Lots page", "Verifying Common Lots");
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Common Lots']")));
		
		assertEquals("Common Lots", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Common Lots')]")).getText());
	}
	
	//@Test(priority = 15, description = "Verify Community Assets Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommunityAssetsMenu() throws Exception {
		LoggerManager.info("Verifying Community Assets Menu Page");
		
		TestBase.setExtentReportSettings("Community Assets ", "Smoke Test", "Verify Community Assets  page", "Verifying Community Assets");
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Community Assets']")));
		
		assertEquals("Assets", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Assets')]")).getText());
	}
	
	
	//@Test(priority = 16, description = "Verify Community Notes Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCommunityNotesMenu() throws Exception {
		LoggerManager.info("Verifying Community Notes Menu Page");
		
		TestBase.setExtentReportSettings("Community Notes", "Smoke Test", "Verify Community Notes page", "Verifying Community Notes");
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Community Notes']")));
		
		assertEquals("Community Notes", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Community Notes')]")).getText());
	}
	
	//@Test(priority = 17, description = "Verify Documents Archive Page", groups = { "Functional" },alwaysRun = true)
	public void verifyDocumentsArchiveMenu() throws Exception {
		LoggerManager.info("Verifying Documents Menu Page");
		 boardMemberHomePage.verifyDocumentModulesClick();
		
		TestBase.setExtentReportSettings("Archive", "Smoke Test", "Verify Archive page", "Verifying Archive");
		
		assertEquals("Documents", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Documents')]")).getText());
	}

	//@Test(priority = 18, description = "Verify New Documents Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyNewDocumentSummaryMenu() throws Exception {
		LoggerManager.info("Verifying Documents Menu Page");
				
		TestBase.setExtentReportSettings("New Document Summary", "Smoke Test", "Verify New Document Summary page", "Verifying New Document Summary");
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='New Document Summary']")));
		
		assertEquals("New Document Summary", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'New Document Summary')]")).getText());
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Documents']")));

	}
	
	//@Test(priority = 19, description = "Verify New Documents Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyEnforcementPolicyMenu() throws Exception {
		LoggerManager.info("Verifying Enforcement Policy Page");
		TestBase.setExtentReportSettings("Enforcement Policy", "Smoke Test", "Verify Enforcement Policy page", "Verifying Enforcement Policy");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Enforcement Policy']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Enforcement Policy']")));
		
		assertEquals("Enforcement Policy", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Enforcement Policy')]")).getText());
		
		
	}
	
	//@Test(priority = 20, description = "Verify Graphs & Metrics Page", groups = { "Functional" },alwaysRun = true)
	public void verifyGraphsAndMetricsMenu() throws Exception {
		LoggerManager.info("Verifying Graphs & Metrics Page");
		TestBase.setExtentReportSettings("Enforcement Policy", "Smoke Test", "Verify Graphs & Metrics page", "Verifying Enforcement Policy");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Graphs & Metrics']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Graphs & Metrics']")));
		
		assertEquals("Community Dashboard", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Community Dashboard')]")).getText());
	}
	          
	
	//@Test(priority = 21, description = "Verify Community Information Page", groups = { "Functional" },alwaysRun = true)
	public void verifyInfoSummaryMenu() throws Exception {
		LoggerManager.info("Verifying Community Information Page");
		TestBase.setExtentReportSettings("Community Information", "Smoke Test", "Verify Community Information page", "Verifying Community Information");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Info Summary']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Info Summary']")));
		
		assertEquals("Community Information", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Community Information')]")).getText());
	}
	
		
	//@Test(priority = 22, description = "Verify Insurance Page", groups = { "Functional" },alwaysRun = true)
	public void verifyInsuranceMenu() throws Exception {
		LoggerManager.info("Verifying Insurance Page");
		TestBase.setExtentReportSettings("Insurance", "Smoke Test", "Verify Insurance page", "Verifying Insurance");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Insurance']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Insurance']")));
		
		assertEquals("Insurance", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Insurance')]")).getText());
	}

	//@Test(priority = 23, description = "Verify Legal Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyLegalSummaryMenu() throws Exception {
		LoggerManager.info("Verifying Legal Summary Page");
		TestBase.setExtentReportSettings("Legal Summary", "Smoke Test", "Verify Legal Summary page", "Verifying Legal Summary");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Legal Summary']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Legal Summary']")));
		
		assertEquals("Legal Information", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Legal Information')]")).getText());
	}
	
	//@Test(priority = 24, description = "Verify Map Page", groups = { "Functional" },alwaysRun = true)
	public void verifyMapMenu() throws Exception {
		LoggerManager.info("Verifying Community Map Page");
		TestBase.setExtentReportSettings("Community Map", "Smoke Test", "Verify Community Map page", "Verifying Community Map");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Map']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Map']")));
		
		assertEquals("Community Map", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Community Map')]")).getText());
		
		
		Actions actions = new Actions(driver);
		// Performs mouse move action onto the element
		actions.moveToElement(boardMemberHomePage.breadCrumbMenu).click().build().perform();
		
		//boardMemberHomePage.breadCrumbMenu.click();
	}
	
	
//	//span[normalize-space()='Vendor Management']
//	
	//@Test(priority = 25, description = "Verify Vendor Management Page", groups = { "Functional" },alwaysRun = true)
	public void verifyVendorManagementMenu() throws Exception {
		LoggerManager.info("Verifying Vendor Management Page");
		
		Thread.sleep(3000);
		
		TestBase.setExtentReportSettings("Vendor Management", "Smoke Test", "Verify Vendor Management page", "Verifying Vendor Management");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Vendor Management']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Vendor Management']")));
		
		assertEquals("Vendor Management", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Vendor Management')]")).getText());
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Information']")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Information']")));
	}
	
	
	//@Test(priority = 26, description = "Verify Property Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyPropertiesMenu() throws Exception {
		LoggerManager.info("Verifying Property Details Page");
		
		TestBase.setExtentReportSettings("Property Details", "Smoke Test", "Verify Property Details page", "Verifying Property Details");
		boardMemberHomePage.verifyPropertiesMenuClick();
		
		assertEquals("Property Details", driver.findElement(By.xpath("//h2[normalize-space()='Property Details']")).getText()); 
		
		Actions actions = new Actions(driver);
		// Performs mouse move action onto the element
		actions.moveToElement(boardMemberHomePage.breadCrumbMenu).click().build().perform();
		
	}
	
	//h2[@class='page-header'] Resident Directory
	//@Test(priority = 27, description = "Verify Resident Directory Page", groups = { "Functional" },alwaysRun = true)
	public void verifyResidentDirectoryMenu() throws Exception {
		LoggerManager.info("Verifying Resident Directory Page");
		
		TestBase.setExtentReportSettings("Resident Directory", "Smoke Test", "Verify Resident Directory page", "Verifying Resident Directory");
		
		// Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Resident Directory']")));
		
		boardMemberHomePage.verifyModuleClicked(driver.findElement(By.xpath("//span[normalize-space()='Resident Directory']")));
		
		// To close properties - this needs to 
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Properties']")));
		assertEquals("Resident Directory", driver.findElement(By.xpath("//h2[normalize-space()='Resident Directory']")).getText()); 
	}
	
//	
//		// Move-In Summary
//	
	// @Test(priority = 28, description = "Verify Reports - Move-In-Summary Page", groups = { "Functional" },alwaysRun = true)
	public void verifyMoveInSummaryMenu() throws Exception {
		LoggerManager.info("Verifying Reports Move-In-Summary Page");
		
		TestBase.setExtentReportSettings("Reports-Move-In-Summary", "Smoke Test", "Verify Reports-Move-In-Summary page", "Verifying Reports Move-In-Summary");
	
		boardMemberHomePage.verifyReportsMenuClick();
		assertEquals("Move-In Summary", driver.findElement(By.xpath("//h2[normalize-space()='Move-In Summary']")).getText()); 
	}

	// @Test(priority = 29, description = "Verify Reports - On Demand Page", groups = { "Functional" },alwaysRun = true)
	public void verifyOnDemandMenu() throws Exception {
		LoggerManager.info("Verifying Reports On Demand Page");
		
		TestBase.setExtentReportSettings("Reports-On Demand", "Smoke Test", "Verify Reports-On Demand page", "Verifying Reports On-Demand");
		boardMemberHomePage.verifyReportsOnDemandMenuClick();
		assertEquals("Reports", driver.findElement(By.xpath("//h2[normalize-space()='Reports']")).getText()); 
	}
	
	
	//@Test(priority = 30, description = "Verify Reports - Summary Previous Month Page", groups = { "Functional" },alwaysRun = true)
	public void verifySummaryPreviousMonthMenu() throws Exception {
		LoggerManager.info("Verifying Summary Previous Month Page");
		
		TestBase.setExtentReportSettings("Reports-Summary Previous Month", "Smoke Test", "Verify Reports-Summary Previous Month page", "Verifying Report - Summary Previous Month");
		boardMemberHomePage.verifyReportsSummaryPrevMonthClick();
		assertEquals("Operations Summary - Previous Month", driver.findElement(By.cssSelector("h2.page-header")).getText()); 
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Community']")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Community']")));
		
	}
	
	// ========== Cirabooks Starts here ========== Here need to check whether CiraBooks menu is available or not// 
	
	@Test(priority = 31, description = "Verify Cirabooks Worksspace Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksWorkSpace() throws Exception {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		System.out.println("Verifying Cirabooks Worksspace Page");
		
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		
		boardMemberHomePage.verifyCiraBooksMenusClick();
		assertEquals("CiraBooks Workspace", driver.findElement(By.cssSelector("h2[class='page-header'] span")).getText()); 
	}
	
	@Test(priority = 32, description = "Verify AP Expense Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksMenu() throws Exception {
		LoggerManager.info("Verifying AP Expense Details Page");
		
		TestBase.setExtentReportSettings("AP Expense Details", "Smoke Test", "Verify AP Expense Details page", "Verifying AP Expense Details ");
		
		if (!boardMemberHomePage.isAPMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		boardMemberHomePage.verifyCBAccountsPayableMenusClick();	
		assertEquals("AP Expense Detail", driver.findElement(By.cssSelector(".page-header")).getText()); 
	}	
	
	//@Test(priority = 33, description = "Verify AP Ledger Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksApLedgerMenu() throws Exception {
		LoggerManager.info("Verifying AP Ledger Page");
		
		TestBase.setExtentReportSettings("AP Ledger", "Smoke Test", "Verify AP Ledger page", "Verifying AP Ledger");
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		boardMemberHomePage.verifyCBAPLedgerMenuClick();
		assertEquals("AP Ledger", driver.findElement(By.xpath("//h2[@class='page-header']")).getText()); 
	}

	
	//@Test(priority = 34, description = "Verify My Submitted Invoices Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksMySubmittedInvoicesMenu() throws Exception {
		LoggerManager.info("Verifying My Submitted Invoices Page");
		TestBase.setExtentReportSettings("My Submitted Invoices", "Smoke Test", "Verify My Submitted Invoices page", "Verifying My Submitted Invoices");
		if (boardMemberHomePage.isCiarBooksMenuVisible())
		{
			throw new SkipException("Skipping test as Cirabooks menu is not available");
		}
		boardMemberHomePage.verifyCBAPMySubmittedInvoiceMenuClick();
        assertEquals("Review My Invoices", driver.findElement(By.xpath("//h2[@class='page-header'][contains(.,'Review My Invoices')]")).getText());
	}

	
	
	// @Test(priority = 35, description = "Verify Open AP Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksOpenAPMenu() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		LoggerManager.info("Verifying Open AP Page");
		
		TestBase.setExtentReportSettings("Open AP", "Smoke Test", "Verify Open AP page", "Verifying Open AP");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Open AP']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Open AP']")));
		
		// boardMemberHomePage.clickCiraBooksMenuItem("AP Ledger");
        // Verify the page loaded correctly
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
        Assert.assertNotNull(header, "Open AP page did not load correctly");        
	}
	
	
	//@Test(priority = 36, description = "Verify Search InvoicesPage", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksSearchInvoicesMenu() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		LoggerManager.info("Verifying Search Invoices Page");
		
		Thread.sleep(5000);
		
		TestBase.setExtentReportSettings("Search Invoices", "Smoke Test", "Verify Search Invoices page", "Verifying Search Invoices");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Search Invoices']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Search Invoices']")));
		
		// boardMemberHomePage.clickCiraBooksMenuItem("AP Ledger");
        // Verify the page loaded correctly
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
        Assert.assertNotNull(header, "Search Invoices page did not load correctly");        
	}
	
	// @Test(priority = 37, description = "Verify Search InvoicesPage", groups = { "Functional" }, alwaysRun = true)
	public void verifyCiraBooksSubmitInvoiceMenu() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    LoggerManager.info("Verifying Submit Invoice Page");
	    
	    // Wait for the Submit Invoice button to be clickable and then perform the actions
	    WebElement submitInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Submit Invoice']")));
	    
	    TestBase.setExtentReportSettings("Submit Invoice", "Smoke Test", "Verify Submit Invoice page", "Verifying Submit Invoice");
	    
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitInvoiceButton);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitInvoiceButton);
	    
	    // Verify the page loaded correctly
	    WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
	    Assert.assertNotNull(header, "Search Invoices page did not load correctly");
	}

	
	// @Test(priority = 38, description = "Verify Vendor Aging Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBooksVendorAgingMenu() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		LoggerManager.info("Verifying vendor Aging Page");
		
		Thread.sleep(5000);
		
		TestBase.setExtentReportSettings("Vendor Aging", "Smoke Test", "Verify Vwndor Aging page", "Verifying Vendor Aging");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Vendor Aging']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Vendor Aging']")));
		
		// boardMemberHomePage.clickCiraBooksMenuItem("AP Ledger");
        // Verify the page loaded correctly
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
        Assert.assertNotNull(header, "Vendor Aging page did not load correctly"); 
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@title='Accounts Payable']//div[@class='header-text']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@title='Accounts Payable']//div[@class='header-text']")));
	}
	
	
	// @Test(priority = 39, description = "Verify AR Ledger Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBookARsMenu() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		LoggerManager.info("Verifying AR Ledger Details Page");
		
		Thread.sleep(5000);
		
		TestBase.setExtentReportSettings("AR Ledger Details", "Smoke Test", "Verify AR Ledger Details page", "Verifying AR Ledger Details ");
			
		//boardMemberHomePage.clickCiraBooksMenuItem("AP Expense Detail");
		//boardMemberHomePage.clickCiraBooksMenuItem("AP Expense Detail");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Accounts Receivable']")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Accounts Receivable']")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='AR Ledger']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='AR Ledger']")));
		
        // Verify the page loaded correctly
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='AR Ledger']")));
        Assert.assertNotNull(header, "AR Ledger page did not load correctly");        
	}	

	//span[normalize-space()='Assessment Rules']
	// @Test(priority = 40, description = "Verify AR Ledger Details Page", groups = { "Functional" },alwaysRun = true)
	public void verifyCiraBookARAssessmentRulessMenu() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		LoggerManager.info("Verifying Assessment Rules Page");
		
		Thread.sleep(5000);
		
		TestBase.setExtentReportSettings("Assessment Rules Details", "Smoke Test", "Verify Assessment Rules Page", "Verifying Assessment Rules Details");
			
		//boardMemberHomePage.clickCiraBooksMenuItem("AP Expense Detail");
		//boardMemberHomePage.clickCiraBooksMenuItem("AP Expense Detail");
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Assessment Rules']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Assessment Rules']")));
		
        // Verify the page loaded correctly
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
        Assert.assertNotNull(header, "Assessment Rules page did not load correctly");        
	}
	
	
	
		//  @Test(priority = 41, description = "Verify Customer Aging Page", groups = { "Functional" },alwaysRun = true)
		public void verifyCiraBookARCustomerAgingMenu() throws Exception {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			LoggerManager.info("Verifying Customer Aging Page");
			
			Thread.sleep(5000);
			
			TestBase.setExtentReportSettings("Customer Aging Details", "Smoke Test", "Verify Customer Aging Page", "Verifying Customer Aging Details");
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Customer Aging']")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Customer Aging']")));
			
	        // Verify the page loaded correctly
	        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
	        Assert.assertNotNull(header, "Customer Aging page did not load correctly");        
		}
		
		
	//span[normalize-space()='Delinquency Detail']
		// @Test(priority = 42, description = "Verify Delinquency Detail Page", groups = { "Functional" },alwaysRun = true)
		public void verifyCiraBookARDelinquencyDetailMenu() throws Exception {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			LoggerManager.info("Verifying Delinquency Detail Page");
			
			Thread.sleep(5000);
			
			TestBase.setExtentReportSettings("Customer Delinquency Detail", "Smoke Test", "Verify Delinquency Detail Page", "Verifying Delinquency Detail");
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[normalize-space()='Delinquency Detail']")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[normalize-space()='Delinquency Detail']")));
			
	        // Verify the page loaded correctly
	        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='page-header']")));
	        Assert.assertNotNull(header, "Delinquency Detail page did not load correctly");  
	        
	        Thread.sleep(5000);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",boardMemberHomePage.breadCrumbMenu);
	        
		}
		
		
		
		//@Test(priority = 43, description = "Verify Actual Vs Budget Page", groups = { "Functional" },alwaysRun = true)
		public void verifyFRActualVsBudget() throws Exception {
			LoggerManager.info("Verifying Actual Vs Budget Page");

			TestBase.setExtentReportSettings("ActualVsBudget Test", "Smoke Test", "Verify ActualVsBudget Page", "Verifying ActualVsBudget Page");
			
			boardMemberHomePage.verifyFRActualVsBudgetMenu();
			
			assertEquals("Actual vs Budget", boardMemberHomePage.lblActualVsBudget.getText());
		}	
	
		//@Test(priority = 44, description = "Verify Benchmark Report Page", groups = { "Functional" },alwaysRun = true)
		public void verifyBenchmarkReport() throws Exception {
			LoggerManager.info("Verifying Benchmark Report Page");

			TestBase.setExtentReportSettings("Benchmark Report Test", "Smoke Test", "Verify Benchmark Report Page", "Verifying Benchmark Report Page");
			
			boardMemberHomePage.verifyFRBenchmarkReportMenu();
			
			assertEquals("Benchmark Report", boardMemberHomePage.lblBenchmarkReport.getText());
		}
		
		//span[normalize-space()='Financial Summary']
		//@Test(priority = 45, description = "Verify Financial Summary Page", groups = { "Functional" },alwaysRun = true)
		public void verifyFinancialSummary() throws Exception {
			LoggerManager.info("Verifying Financial Summary Page");

			TestBase.setExtentReportSettings("Financial Summary Test", "Smoke Test", "Verify Financial Summary Page", "Verifying Financial Summary Page");
			
			boardMemberHomePage.verifyFRFinancialSummaryMenu();
			
			assertEquals("Financial Summary", boardMemberHomePage.lblFinancialSummary.getText());
		}
		
		
		//@Test(priority = 46, description = "Verify General Ledger Report Page", groups = { "Functional" },alwaysRun = true)
		public void verifyGLReport() throws Exception {
			LoggerManager.info("Verifying General Ledger Report Page");
			TestBase.setExtentReportSettings("General Ledger Report Test", "Smoke Test", "Verify General Ledger Report Page", "Verifying General Ledger Report Page");
			boardMemberHomePage.verifyGLGeneralLedgerReportMenu();
			assertEquals("General Ledger Report", boardMemberHomePage.lblGLReport.getText());
		}
		
		//@Test(priority = 47, description = "Verify Trial Balance Page", groups = { "Functional" },alwaysRun = true)
		public void verifyGLTrialBalance() throws Exception {
			LoggerManager.info("Verifying Trial Balance Page");
			TestBase.setExtentReportSettings("Trial Balance Test", "Smoke Test", "Verify Trial Balance Page", "Verifying Trial Balance Page");
			boardMemberHomePage.verifyTrialBalanceMenu();
			assertEquals("General Ledger Report", boardMemberHomePage.lblTrialBalance.getText());
		}
		
		// @Test(priority = 48, description = "Verify Architectural Application Page", groups = { "Functional" },alwaysRun = true)
		public void verifymyWQArchitecturalApplication() throws Exception {
			LoggerManager.info("Verifying Architectural Application Page");
			TestBase.setExtentReportSettings("Architectural Application Test", "Smoke Test", "Verify Architectural Application Page", "Verifying Architectural Application Page");
			boardMemberHomePage.verifyMyWorkQueueCommMgmtArchiApplMenu();
			assertEquals("Architectural Application", boardMemberHomePage.lblArchitecturalApplication.getText());
		}
		
		//@Test(priority = 49, description = "Verify Board Approval Page", groups = { "Functional" },alwaysRun = true)
		public void verifymyWQBoardApproval() throws Exception {
			LoggerManager.info("Verifying Board Approval Page");
			TestBase.setExtentReportSettings("Board Approval Test", "Smoke Test", "Verify Board Approval Page", "Verifying Board Approval Page");
			boardMemberHomePage.verifyMyWorkQueueBoardApprovalMenu();
			assertEquals("Board Approvals", boardMemberHomePage.lblBoardApproval.getText());
		}
		
		//@Test(priority = 50, description = "Verify Maintenance Work Orders Page", groups = { "Functional" },alwaysRun = true)
		public void verifymyWQMaintenceWorkOrders() throws Exception {
			LoggerManager.info("Verifying Maintenance Work Orders Page");
			TestBase.setExtentReportSettings("Maintenance Work Orders Test", "Smoke Test", "Verify Maintenance Work Orders Page", "Verifying Maintenance Work Orders Page");
			boardMemberHomePage.verifyMyWorkQueueMaintenanceWorkOrdersMenu();
			assertEquals("Maintenance Work Orders", boardMemberHomePage.lblMaintenanceWorkOrders.getText());
		}
		
}

