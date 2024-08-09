package com.ciranet.configurations.testcases;		
		
import static org.testng.Assert.assertEquals;		
import static org.testng.Assert.assertTrue;		
		
import java.awt.AWTException;		
		
import org.testng.annotations.Test;		
		
import com.ciranet.testbase.TestBase;		
import com.ciranet.utilities.LoggerManager;		
import com.ciranet.utilities.XMLCredentialsReader;		
		
public class ClosingPortalConfigPageTest extends TestBase 		
{		
	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Configurations Page Title", groups = { "Smoke" })	
	public void verifyConfigurationsMenu(XMLCredentialsReader.userCredentials credentials) 	
	{	
		LoggerManager.info("Verifying Configurations Page Title");
		ClosingPortalconfigurationsPage = loginPage.verifyClosingPortalConfigClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Configuration Test", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		//assertEquals("Configurations", ClosingPortalconfigurationsPage.navigateToclosingPortal());
	}	


	@Test(priority = 1, description = "Verify Configurations Page >> Batch job Emails", groups = { "Smoke" })	
	public void verifyNavigateToclosingPortal() 
	{	
		LoggerManager.info("Verifying Closing Portal Configurations Title");
		ClosingPortalconfigurationsPage.navigateToclosingPortal();
		assertTrue(driver.getCurrentUrl().contains("Closing Portal Configurations"), "Closing Portal Configurations URL is incorrect");
	}	
		
	@Test(priority = 2, description = "Verify Configurations Page >> Closing Portal Configurations dropdown1", groups = { "Smoke" })	
	public void verifyFirstDropdown() throws AWTException 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations first dropdown selection");
		ClosingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("Account Inquiry Fulfillment");
	}	
		
	@Test(priority = 3, description = "Verify Configurations Page >> Closing Portal Configurations dropdown2", groups = { "Smoke" })	
	public void verifySelectSecondDropdown() throws AWTException 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations second dropdown selection");
		ClosingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("CiraConnect Fee");
	}	
		
	@Test(priority = 4, description = "Verify Configurations Page >> Closing Portal Configurations dropdown3", groups = { "Smoke" })	
	public void verifySelectThirdDropdown() throws AWTException 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations dropdown3 selection");
		ClosingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("Closing Portal Delivery Tiers");
	}	
		
	@Test(priority = 5, description = "Verify Configurations Page >> Closing Portal Configurations dropdown4", groups = { "Smoke" })	
	public void verifySelectFourthDropdown() throws AWTException 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations fourth dropdown selection");
		ClosingPortalconfigurationsPage.selectclosingPortalConfigDropdowns("Portal Configuration Fees & Charges");
	}	
	
	@Test(priority = 6, description = "Verify Configurations Page >> Closing Portal Configurations New tier button", groups = { "Smoke" })	
	public void verifynewtierbutton() throws AWTException 	
	{	
		LoggerManager.info("Verifying Closing Portal Configurations fourth dropdown selection");
		ClosingPortalconfigurationsPage.newtierbutton("New tier");
	}
		
}		
