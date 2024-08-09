package com.ciranet.myworkqueue.testcases;

import org.testng.annotations.Test;

import com.ciranet.myworkqueue.pages.ComMgmtBoardApprovalsPage;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ComMgmtBoardApprovalsPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Board Approval Page Title", groups = { "Smoke" })
	public void verifyBoardApprovalsURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Board Approval Page Title");

		boardApprovalsPage = loginPage.verifyComMgmtBoardApprovalsPage(credentials.getUsername(), credentials.getPassword());
		boardApprovalsPage.boardApprovalsPageLanding();
		TestBase.setExtentReportSettings("Verifying Board Approval Title", "Smoke Test", "Board Approval", "Verify Board Approval");
	}

	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups  = { "functional" }) 
	public void verifyToolbarFullScreenOption() 
	{
		boardApprovalsPage.toolBarFullScreen(); 
	}  

	@Test(priority = 2, description = "Verify Toolbar Normal Screen option",  groups = {"functional" }) 
	public void verifyToolBarNormalScreenOption() 
	{ 
		boardApprovalsPage.toolBarNormalScreen(); 
	}   

	@Test(priority = 3, description = "Verify Acion For Multiple Selection", groups = { "functional"})  
	public void verifyAcionForMultipleSelection()  
	{ 
		boardApprovalsPage.acionForMultipleSelection();  
	}  

	@Test(priority = 4, description = "Verify View AR Collections Details", groups = {"functional" })  
	public void verifyViewARCollectionsDetails()  
	{ 
		boardApprovalsPage.viewARCollectionsDetails();  
	}   

	@Test(priority = 5, description = "Verify Architectural View ACC Details", groups = {"functional" })  
	public void verifyArchitecturalViewACCDetails()  
	{ 
		boardApprovalsPage.architecturalViewACCDetails();  
	}   

	@Test(priority =6, description = "Verify Invoice View APWorkflowDetails", groups = {"functional" })  public void verifyInvoiceViewAPWorkflowDetails()  
	{ 
		boardApprovalsPage.invoiceViewAPWorkflowDetails();  
	}   

	@Test(priority = 7, description = "Verify Architectural View AccDetails", groups = {"functional" })  
	public void verifyclosedtabArchitecturalViewACCDetailsbutton()  
	{ 
		boardApprovalsPage.closedtabArchitecturalViewACCDetailsbutton();  
	}

	@Test(priority = 8, description = "Verify Invoice View Details", groups = { "functional" })  public void VerifyclosedtabInvoiceviewDetails()  
	{ 
		boardApprovalsPage.closedtabInvoiceviewDetails();  
	}

	@Test(priority = 9, description = "Verify Switching tabs Open tab and Closed tab", groups = { "functional" })
	public void verifySwitchTab()  
	{  
		boardApprovalsPage.switchTab();  
	}

	@Test(priority = 10, description = "Verify Exapnd All Option", groups = { "functional" })  
	public void verifyExpandOptionClick()  
	{   
		boardApprovalsPage.expandOptionClick();  
	}   

	@Test(priority = 11,description = "Verify Column Chooser Option", groups = { "functional" }) 
	public void verifyColumnChooserOption()  
	{   
		boardApprovalsPage.columnChooserClick();  
	}
}

