package com.ciranet.myworkqueue.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class DiscloProcessingPropertyConveyancePageTest extends TestBase{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Property Coveyance Work Queue Page Title", groups = { "Smoke" })
	public void verifyPropertyConveyanceWorkQueuePageURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Property Conveyance Work Queue Page Title");
		propertyConveyanceWorkQueuePage = loginPage.verifyPropertyConveyanceWorkQueuePage(credentials.getUsername(), credentials.getPassword());
		propertyConveyanceWorkQueuePage.propertyConveyancePageLanding();
	}

	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		propertyConveyanceWorkQueuePage.toolBarFullScreen();
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		propertyConveyanceWorkQueuePage.toolBarNormalScreen();
	}

	@Test(priority = 3, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" },alwaysRun=true)
	public void verifyColumnChooserOption() 
	{
		propertyConveyanceWorkQueuePage.columnChooserClick();
	}

	@Test(priority = 4, description = "Verify Toolbar - Expand icon click", groups = { "Functional" })
	public void verifyExpandOption() 
	{
		propertyConveyanceWorkQueuePage.expandOptionClick();
	}

	@Test(priority = 5, description = "Verify Edit Community Cancel Button", groups = { "Functional" })
	public void VerifyactionEditCommunityCancel() 
	{
		propertyConveyanceWorkQueuePage.actionEditCommunityCancel();
	}

	@Test(priority = 6, description = "Verify Edit Community Update Button", groups = { "Functional" })
	public void VerifyactionEditCommunityUpdate() 
	{
		propertyConveyanceWorkQueuePage.actionEditCommunityUpdate();
	}

	@Test(priority = 7, description = "Verify clear Community  Button", groups = { "Functional" })
	public void VerifyactionClearCommunity() 
	{
		propertyConveyanceWorkQueuePage.actionClearCommunity();
	}

	@Test(priority = 8 , description = "Verify Delete Community  Button", alwaysRun=true, groups = { "Functional" })
	public void VerifyactionDeleteCommunity() throws AWTException 
	{
		propertyConveyanceWorkQueuePage.verifyActionDelete();
	}

	@Test(priority = 9 , description = "Verify Refresh  Button", groups = { "Functional" })
	public void Verifyrefresh() 
	{
		propertyConveyanceWorkQueuePage.verifyRefreshButton();
	}

	@Test(priority = 10, description = "Verify Process Property Conveyance Menu and Toggle Compact Mode", alwaysRun=true, groups = { "Functional" })
	public void verifyCompactModeOnPropertyConveyancePopup() throws AWTException 
	{
		propertyConveyanceWorkQueuePage.compactModeToggleOnPropertyConveyancePopup();
	}

	@Test(priority = 11, description = "Verify Toggle Completed and Open Tabs", alwaysRun=true, groups = { "Functional" })
	public void verifyToggleCompletedTabOpenTabs() 
	{
		propertyConveyanceWorkQueuePage.toggleCompletedOpenTabClick();
	}

	@Test(priority = 12, description = "Verify Search Work Queue button click", alwaysRun=true, groups = { "Functional" })
	public void verifySearchWorkQueueButton() 
	{
		propertyConveyanceWorkQueuePage.searchWorkQueueButtonClick();
	}

	@Test(priority = 13 , description = "Verify Process Property conveynance", alwaysRun=true, groups = { "Functional" })
	public void verifyActionProcessPropertyConveyanceCommunity() throws InterruptedException, AWTException 
	{
		propertyConveyanceWorkQueuePage.verifyActionProcessPropertyConveyance();
	}
}
