package com.ciranet.myworkqueue.testcases;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class internalTasksPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify InternalTaskPage Title", groups = { "Smoke" }, alwaysRun=true)
	public void verifyInternalTasksPageURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Internal Task Page Title");
		internalTasksPage = loginPage.verifyInternalTaskPage(credentials.getUsername(), credentials.getPassword());
		internalTasksPage.internalTaskPageLanding();
		TestBase.setExtentReportSettings("Verifying Internal Task Title", "Smoke Test", "Internal task", "Verify I T");
	}

	@Test(priority = 1, description = "Verify Help Button", groups = { "Smoke" }, alwaysRun=true)
	public void verifyHelpInternalTask() 
	{
		internalTasksPage.helpInternalTask();
	}

	@Test(priority = 2, description = "Verify Toolbar - Column Chooser icon click", groups = { "Smoke" }, alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		assertTrue(internalTasksPage.columnChooserClick(), "Column Chooser is not selected");
	}

	@Test(priority = 3, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		assertTrue(internalTasksPage.toolbarFullScreen(), "Full screen is not working");
	}

	@Test(priority = 4, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifytoolBarNormalScreenOption() 
	{
		
		assertTrue(internalTasksPage.toolBarNormalScreen(), "Normal screen is not working");
	}

	@Test(priority = 5, description = "Verify Email Setting button", groups = { "Smoke" })
	public void verifyEmailSetting() 
	{
		
		internalTasksPage.emailSetting();
	}

	@Test(priority = 6, description = "Verify Toolbar - Expand And Collapse", groups = { "Smoke" }, alwaysRun=true)
	public void verifyExpandCollapseOption() 
	{
		assertTrue(internalTasksPage.expandCollapseClick(), "Expand and Collapse buttons are not working");
	}

	@Test(priority = 7, description = "Verify Active Filter selection", groups = { "Functional" })
	public void verifyActiveFilterSelect() 
	{
		assertTrue(internalTasksPage.activeFilterSelection(), "Drop downs are not selected");
	}

	@Test(priority = 8, description = "Action Delete Record button", groups = { "Smoke" }, alwaysRun=true)
	public void verifyDeleteAction() throws AWTException 
	{
		assertTrue(internalTasksPage.verifyDeleteRecord(), "Escape key is not pressed");
	}

	@Test(priority = 9, description = " Action EditRecord Cancel Function", groups = { "Smoke" }, alwaysRun=true)
	public void verifyEditCancelAction() throws AWTException 
	{
		internalTasksPage.verifyCancelInEditRecord();
	}

	@Test(priority = 10, description = "Action Update Existing Record Save Function", groups = { "Smoke" }, alwaysRun=true)
	public void verifyEditSaveAction() throws Exception 
	{
		internalTasksPage.verifyEditSaveRecord();
	}

	@Test(priority = 11, description = "Verify Add Task Save", groups = { "Smoke" }, alwaysRun=true)
	public void verifyAddTaskSave() 
	{
		internalTasksPage.addTaskSave();
	}

	@Test(priority = 12, description = "Verify Add Task Cancel", groups = { "Smoke" }, alwaysRun=true)
	public void verifyAddTaskCancel() throws AWTException 
	{
		internalTasksPage.addTaskCancel();
	}

	@Test(priority = 13, description = "Open and Closed Tab Switch", groups = { "Smoke" }, alwaysRun=true)
	public void verifySwitchOpenClosedTasks() 
	{
		assertTrue(internalTasksPage.switchBetweenOpenClosedTasks(), "Open and Closed Tasks switch is not possible");
	}

	@Test(priority = 14, description = "Verify Refresh", groups = { "Smoke" }, alwaysRun=true)
	public void verifyRefreshButton() 
	{
		assertTrue(internalTasksPage.refreshClick(), "Refresh button is not clickable");
	}
}