package com.ciranet.myworkqueue.testcases;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class DiscloProcessingClosingRequestsPageTest  extends TestBase{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Closing Requests Page Title", groups = { "Smoke" })
	public void VerifyclosingRequeststURL(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Closing Request Page Title");

		closingRequestsPage = loginPage.verifyDiscloProcessingClosingRequestsPage(credentials.getUsername(), credentials.getPassword());
		closingRequestsPage.ClosingRequestspageLanding();
		TestBase.setExtentReportSettings("Verifying Closing Request Title", "Smoke Test", "Closing Request", "Verify Closing Request");
	}

//	@Test(priority = 1, description = "Verify Fulfill Compact On Option", groups = { "Functional" })
//	public void verifyFulfillCompactOnOption() 
//	{
//
//		closingRequestsPage.verifyFulfillCompactOn();
//		TestBase.setExtentReportSettings("Verifying Closing Request Title", "Smoke Test", "Closing Request", "Verify Closing Request");
//		
//	}

//	@Test(priority = 2, description = "Verify Fulfill Compact Off Option", groups = { "Functional" })
//	public void verifyFulfillCompactOffOption() 
//	{
//
//		closingRequestsPage.verifyFulfillCompactOff();
//	}
//
//	@Test(priority = 3, description = "Verify Action Transfer to Collection", groups = { "Functional" })
//	public void verifyActionTransfertoCollectionsOption() 
//	{
//
//		closingRequestsPage.verifyActionTransfertoCollections();
//	}
//
//	@Test(priority = 4, description = "Verify Action Transfer to Processing", groups = { "Functional" })
//	public void verifyActionTransfertoProcessingOption() 
//	{
//
//		closingRequestsPage.verifyActionTransfertoProcessing();
//	}
//
//	@Test(priority = 5, description = "Verify Action Transfer to Transition", groups = { "Functional" })
//	public void verifyActionTransfertoTransitionOption() 
//	{
//
//		closingRequestsPage.verifyActionTransfertoTransition();
//	}
//
//	@Test(priority = 6, description = "Verify Assign Property", groups = { "Functional" })
//	public void verifyActionAssignPropertyOption() 
//	{
//
//		closingRequestsPage.verifyActionAssignProperty();
//	}
//
//	@Test(priority = 7, description = "Verify Action cancle request", groups = { "Functional" })
//	public void ActionCancleRequestOption() 
//	{
//
//		closingRequestsPage.ActionCancleRequest();
//	}
//
//
//	@Test(priority = 8, description = "Verify Assign Property", groups = { "Functional" })
//	public void VerifySwitchingTabs() 
//	{
//
//		closingRequestsPage.SwitchingTabs();
//	}
//
//
//	@Test(priority = 9, description = "Verify Search tab", groups = { "Functional" })
//	public void VerifySearchTab() 
//	{
//
//		closingRequestsPage.SearchTab();
//	}
//
//	@Test(priority = 10, description = "Verify Search Button", groups = { "Functional" })
//	public void verifySearchButton() 
//	{
//
//		closingRequestsPage.searchButton();
//	}
//
//
//	  @Test(priority = 11, description = "Verify Request Type", groups = {
//	  "Functional" }) public void VerifyRequestTypeFilter() {
//	  
//	  closingRequestsPage.RequestTypeFilter(); }
//	  
//	  
//	  @Test(priority = 12, description = "Verify Toolbar and Full Screen", groups =
//	  { "Functional" }) public void VerifyToolBarFullScreen() {
//	  
//	  closingRequestsPage.ToolBarFullScreen(); }
//	  
//	 


}
