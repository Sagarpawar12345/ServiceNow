package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import org.testng.annotations.Test;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class CommunityConfigPageTest extends TestBase 
{
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Configurations Page Title", groups = { "Smoke" })
	public void verifyConfigurationsMenu(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Configurations Page Title");
		CommunityconfigurationsPage = loginPage.verifyCommunityConfigClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Configuration Test", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		assertEquals("Configurations", CommunityconfigurationsPage.navigateToConfigurationsPage());
	}
	
	@Test(priority = 1, description = "Verify Configurations Page >> Community Configurations", groups = { "Smoke" })
	public void verifyNavigateToCommunityConfigurations() {
		LoggerManager.info("Verifying Community Configurations Title");
		CommunityconfigurationsPage.navigateToCommunityConfigurations();
		assertEquals("Community Configurations", CommunityconfigurationsPage.communityConfigurationsheader.getText());
	}

	@Test(priority = 2, description = "Verify Configurations Page >> Community Configurations dropdown1", groups = { "Smoke" })
	public void verifyFirstDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations first dropdown selection");
		CommunityconfigurationsPage.selectCommunityConfigDropdowns("Amenity");
	}

	@Test(priority = 3, description = "Verify Configurations Page >> Community Configurations dropdown2", groups = { "Smoke" })
	public void verifySelectSecondDropdowns() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations second dropdown selection");
		CommunityconfigurationsPage.selectCommunityConfigDropdowns("Board Approval");
	}
	
	@Test(priority = 4, description = "Verify Configurations Page >> Community Configurations dropdown3", groups = { "Smoke" })
	public void verifySelectSecondDropdownt() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		CommunityconfigurationsPage.selectCommunityConfigDropdowns("Collection Letter Fees");
	}
	
	@Test(priority = 5, description = "Verify Configurations Page >> Community Configurations dropdown4", groups = { "Smoke" })
	public void verifySelectSecondDropdownf() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		CommunityconfigurationsPage.selectCommunityConfigDropdowns("Community Configuration");
	}
	
	@Test(priority = 6, description = "Verify Configurations Page >> Community Configurations dropdown5", groups = { "Smoke" })
	public void verifySelectSecondDropdownff() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		CommunityconfigurationsPage.selectCommunityConfigDropdowns("Fulfillment Job Special Pricing Configuration");
	}
	
	@Test(priority = 7, description = "Verify Configurations Page >> Community Configurations dropdown6", groups = { "Smoke" })
	public void verifySelectSecondDropdownse() throws AWTException 
	{
		LoggerManager.info("Verifying Community Configurations dropdown selection");
		CommunityconfigurationsPage.selectCommunityConfigDropdowns("Holidays");
	}
	

}



