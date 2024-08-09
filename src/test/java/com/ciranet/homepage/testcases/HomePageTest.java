package com.ciranet.homepage.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class HomePageTest extends TestBase {
	@Test(priority = 0, description = "Verify HomePage", groups = { "Functional" }, dataProvider = "internalUserProvider")
	public void verifyHomeOwnerSearch(XMLCredentialsReader.userCredentials credentials) {
		LoggerManager.info("Verifying HomePage - Owner Search");
		
		String ownerSearchKeyword = "romich";
        
		homePage = loginPage.verifyHomePage(credentials.getUsername(), credentials.getPassword());

		assertTrue(homePage.searchOwner(ownerSearchKeyword));
		TestBase.setExtentReportSettings("HomePage Owner Search", "Smoke Test", "Verify Home Page Owner Search", "Verifying Owner Search");
	}
	
	@Test(priority = 1, description = "Verify HomePage", groups = { "Functional" })
	public void verifyCommunitySearch() {
		LoggerManager.info("Verifying HomePage - Community Search");
		
		String communitySearchKeyword = "amberwood";
        
		//homePage = loginPage.verifyHomePage(username, password);

		assertTrue(homePage.searchCommunity(communitySearchKeyword));
		TestBase.setExtentReportSettings("HomePage Community Search", "Smoke Test", "Verify Home Page Community Search", "Verifying Community Search");

	}	
}
