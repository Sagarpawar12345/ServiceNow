
  package com.ciranet.myworkqueue.testcases;
  
  import static org.testng.Assert.assertTrue; import
  org.testng.annotations.Test;
  
  import com.aventstack.extentreports.Status;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;
  
  public class ComMgmtMaintenanceWorkOrdersPageTest extends TestBase{
    
  @Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Work Orders Page Title", groups = { "Smoke" }) 
  
  public void verifyWorkOrdersPageURL(XMLCredentialsReader.userCredentials credentials) {
  
  LoggerManager.info("Verifying Work Orders Page Title");
  
  WorkOrdersPage = loginPage.verifyComMgmtMaintenanceWorkOrdersPage(credentials.getUsername(), credentials.getPassword());
  WorkOrdersPage.WorkOrdersPageLanding();
	TestBase.setExtentReportSettings("Verifying Work Order Title", "Smoke Test", "Work Order", "Verify Work Order");

  }
  
  /// dependsOnMethods = { "verifyWorkOrdersPageURL" } // we can use this also
  
  @Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = {"Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		WorkOrdersPage.ToolBarFullScreen();
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = {"Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		WorkOrdersPage.ToolBarNormalScreen();
	}
	
	@Test(priority = 3, description = "Verify tab Switching", groups = {"Functional" })
	public void verifySwitchtab() 
		{
			WorkOrdersPage.Switchtab();
		}
	
	@Test(priority = 4, description = "Verify Closed Work Orders In Past days textbox", groups = {"Functional" })
	public void verifyClosedDaysTextbox() 
	{
		WorkOrdersPage.ClosedDaysTextbox();
	}
	
	@Test(priority = 5, description = "Verify Toolbar - Expand icon click", groups = {"Functional" })
	public void verifyExpandOption() {
		assertTrue(WorkOrdersPage.expandOptionClick(),"Expand icon is not clicked");
	}
	
	@Test(priority = 6, description = "Verify Toolbar - collapsed icon click", groups = {"Functional" })
	public void verifyCollapseOption() {
		assertTrue(WorkOrdersPage.collapseOptionClick(),"Collapse icon is not clicked");
	}
	
	@Test(priority = 7, description = "Verify Toolbar - Column Chooser icon click", groups = {"Functional" })
	public void verifyColumnChooserOption() {
		assertTrue(WorkOrdersPage.columnChooserClick(),"Column Chooser is not selected");
	}
	
	@Test(priority =8, description = "Verify that View Edit Work Order and close", groups= {" Functional" })
	public void verifyViewEditCloseWorkOrderClick()
	{
		WorkOrdersPage.ViewEditCloseWorkOrderClick(); //Open and Close
	}
	
	@Test(priority =9, description = "Verify that View Edit Work Order", groups= {" Functional" })
	public void verifyViewEditWorkOrder()
	{
		WorkOrdersPage.ViewEditWorkOrder(); //Save and Close
	}
	
	@Test(priority =10, description = "Verify that View Edit Work Order and save", groups= {" Functional" })
	public void verifyViewEditSaveWorkOrderClick()
	{
		WorkOrdersPage.ViewEditSaveWorkOrderClick(); //Save
	}
	

	@Test(priority = 11, description = "Verify Work Authorization", groups = {"Functional" })
	public void verifyManageWorkAuthorization() 
	{
		WorkOrdersPage.verifyManageWorkAuthorization();
	}
	
	@Test(priority =12, description = "Verify that Manage Praposal PopUp", groups= {" Functional" })
	public void VerifyManageProposal() 
	{
		WorkOrdersPage.ManageProposal();
	}
	
	@Test(priority =13, description = "Verify the Chanage Status", groups= {" Functional" })
	public void verifychangeStatus()
	{
		WorkOrdersPage.changeStatus();
	}
	
	
	@Test(priority = 14, description = "Verify Manage Task References Popup", groups = {"Functional" })
	public void VerifyManageTaskReferences() 
	{
		WorkOrdersPage.manageTaskReferences();

	}
	
	@Test(priority =15, description = "Verify that Add Work Oreders and Close", groups= {" Functional" })
	public void verifycloseWorkOrder()
	{
		WorkOrdersPage.closeAddWorkOrder();
	}
	
	//@Test(priority = 16, description = "Verify Add New Work Order button click", groups = {"Functional" })
		public void VerifyAddNewWorkOrderClick() 
		{
			WorkOrdersPage.AddNewWorkOrderClick();
		}
  
  }
 

