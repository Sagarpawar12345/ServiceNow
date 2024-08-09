package com.ciranet.myworkqueue.testcases;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ReceiLockStatementApprovalQueuePageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Statement Approval Queue Page Title", groups = { "Smoke" })
	public void verifyStatementApprovalQueueURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Statement Approval Queue Page Title");

		receiLockStatementApprovalQueuePage = loginPage.verifyReceiLockStatementApprovalQueuePage(credentials.getUsername(), credentials.getPassword());
		receiLockStatementApprovalQueuePage.StatementApprovalQueuePageLanding();
		TestBase.setExtentReportSettings("Verifying Statement Approval Title", "Smoke Test", "Statement Approval", "Verify Statement Approval");
		
	}
	
	
	  @Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups
	  = { "functional" }) public void verifyToolbarFullScreenOption() {
	  receiLockStatementApprovalQueuePage.ToolBarFullScreen(); }
	  
	  @Test(priority = 2, description = "Verify Toolbar Normal Screen option",groups = { "functional" }) 
	  public void verifyToolBarNormalScreenOption() {
	  receiLockStatementApprovalQueuePage.ToolBarNormalScreen(); }
	  
	  
	  @Test(priority = 3, description = "Verify Search Approvals Tab", groups = { "functional" })
	  public void verifySearchApprovalsTab() 
	  {
		  receiLockStatementApprovalQueuePage.SearchApprovalTabClick();
	  }
	  
	  @Test(priority = 4, description = "Verify Select Date Type", groups = { "functional" })
	  public void verifyDateTypeDropdown() 
	  {
		  try 
		  {
			receiLockStatementApprovalQueuePage.DateTypeDropdown1();
		  } 
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
	  }
	  
	  @Test(priority = 5, description = "Verify Select Begin Date", groups = { "functional" })
	  public void verifyBeginDateDropdown() 
	  {
		  try 
		  {
			receiLockStatementApprovalQueuePage.BeginDateDropdown();
		  } 
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
		  
		  
	  }
	  
	  @Test(priority = 6, description = "Verify Logs Tab", groups = { "functional" })
	  public void verifyLogsColumn() 
	  {
		  receiLockStatementApprovalQueuePage.LogsClick();
	  }
	  
	 @Test(priority = 7, description = "Verify Close Button", groups = { "functional" })
	  public void verifyCloseButton() 
	  {
		  receiLockStatementApprovalQueuePage.CloseButtonClick();
	  }
	  
	 @Test(priority = 8, description = "Verify Statement PDF Tab", groups = { "functional" })
	  public void verifyStatementColumn() 
	  {
		  receiLockStatementApprovalQueuePage.StatementColumnPDFClick();
	  }
	  
	 @Test(priority = 9, description = "Verify ErrorClose Button", groups = { "functional" })
	  public void verifyErrorCloseButton() 
	  {
		  receiLockStatementApprovalQueuePage.ErrorCloseClick();
	  }
	  
	 @Test(priority = 10, description = "Verify LocationColumn", groups = { "functional" })
	  public void verifyLocationSearch() 
	  {
		  receiLockStatementApprovalQueuePage.LocationColumnClick();
	  }
	 
	 /*@Test(priority = 11, description = "Verify Run ID Column", groups = { "functional" })
	  public void verifyRunIDClick() 
	  {
		  statementApprovalQueuePage.RunIDClick();
	  }*/
	 
	 
	 @Test(priority = 12, description = "Verify Clear Button", groups = { "functional" })
	  public void verifyClearButton() 
	  {
		  receiLockStatementApprovalQueuePage.ClearButtonClick();
	  }
	 
	 
	  @Test(priority = 13, description = "Verify Statement Runs Tab", groups = { "functional" })
	  public void verifyStatementRunsTab() 
	  {
		  receiLockStatementApprovalQueuePage.StatementRunsTabClick();
	  }
	  
	  
	  
	  
	  
	  
	  
}
