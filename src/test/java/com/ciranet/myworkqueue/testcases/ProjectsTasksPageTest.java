package com.ciranet.myworkqueue.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ProjectsTasksPageTest extends TestBase{
	@Test(priority = 1, dataProvider = "internalUserProvider", description = "Verify HomePage Title", groups = { "Functional" })
	public void verifyHomePage(XMLCredentialsReader.userCredentials credentials) {
		LoggerManager.info("Verifying Project Task Page");

		projectsTasksPage = loginPage.verifyProjectTaskPage(credentials.getUsername(), credentials.getPassword());
		projectsTasksPage.ProjectTaskPageLanding();

	}
	
	
	//@Test(priority = 2, description = "Verify Help Button", groups = { "Functional" })
	public void verifyhelpProjectTask() 
	{

		projectsTasksPage.helpProjectTask();
	}
	
	
	@Test(priority = 3, description = "Verify tab Switching", groups ={"Functional" }) 
	public void VerifySwitchtab() 
	{

		projectsTasksPage.Switchtab();
	}

	@Test(priority = 4, description = "Verify Project Task Page Refresh Button click", groups = { "Functional" })
	public void verifyRefreshButtonClick() 
	{
		
		projectsTasksPage.RefreshButtonClick();
	}
	
	@Test(priority = 5, description = "Verify Notification Settings Button", groups = { "Functional" })
	public void verifyNotificationSetting() 
	{
		
		projectsTasksPage.NotificationSetting();

	}

	@Test(priority = 6, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
		public void verifyToolbarFullScreenOption() 
		{
			
			projectsTasksPage.ToolBarFullScreen();
		}
	@Test(priority = 7, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		
		projectsTasksPage.ToolBarNormalScreen();
	}
	
	@Test(priority = 8, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" })
	public void verifyColumnChooserOption() 
	{
		projectsTasksPage.columnChooserClick();
	}
	


	@Test(priority = 9, description = "Verify Days Textbox", groups = { "Functional" })
	public void verifyDaysTextbox() 
	{
		
		projectsTasksPage.DaysTextbox();

	}
	
	@Test(priority = 10, description = "Verify Toolbar - Expand And Collapse", groups = { "Functional" })
	public void verifyMenuExpandCollapseOption() 
	{
	
		projectsTasksPage.expandCollapseClick();
	}
	
	//Action Button in closed task disabled
	//@Test(priority = 11, description = "Verify Action button Edit functionality", groups = { "Functional" })
	public void verifyActionEditFunctionality() 
	{
		
		projectsTasksPage.verifyActionButton();

	}
	//Currently Forbidden
	//@Test(priority = 12, description = "Verify Add New Project Task Button", groups = { "Functional" })
	public void verifyAddNewProjectTaskButtonClick() 
	{
		
		projectsTasksPage.AddNewProjectTaskButtonClick();

	}
	
	@Test(priority = 13, description = "Verify Active Filter selection", groups = { "Functional" })
		public void verifyActivefilterselection() 
		{
		
			projectsTasksPage.Activefilterselection();
		}
	
	//@Test(priority =14 , description = "Verify user logout", groups = { "Functional" })
		public void verifyuserlogout() 
		{
			
			projectsTasksPage.userlogout();

		}
	
}








