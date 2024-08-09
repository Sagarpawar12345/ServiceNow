package com.ciranet.configurations.testcases;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.configurations.pages.ConfigProcessTrackerClickPages;
import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ConfigProcessTrackerClickPagesTest extends TestBase {
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0,dataProvider = "internalUserProvider" , description = "Verify Process Tracker", groups = { "Smoke" }, alwaysRun=true)
	public void verifyConfigProcessTrackerClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying My Work Queue Menu");
		configProcessTrackerClickPages =loginPage.verifyConfigProcessTrackerClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying My Work Queue Title", "Smoke Test", "AR Payment", "Verify AR Payment");
		
		}

	@Test(priority = 1, description = "Verify Process Tracker", groups = { "Functional" }, alwaysRun=true)

	public void verifyCommunityAutoCloseReportGeneration() 

	{
		configProcessTrackerClickPages.communityAutoCloseReportGeneration();
		
		System.out.println("Page Title is:" + "Community Auto Close & Report Generation - Global");
		TestBase.setExtentReportSettings("Verifying  Community Auto Close & Report Generation - Global Title", "Smoke Test", "Community Auto Close & Report Generation - Global", "Verify Community Auto Close & Report Generation - Global");	
	}

	@Test(priority = 2, description = "Verify Process Tracker", groups = { "Functional" }, alwaysRun=true)

	public void verifyFinancialPackageConfiguration() 

	{
		configProcessTrackerClickPages.financialPackageConfiguration();
		
		System.out.println("Page Title is:" + "Financial Package Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Financial Package Configuration - Global Title", "Smoke Test", "Financial Package Configuration - Global", "Verify Community Auto Close & Report Generation - Global");	
	}
	@Test(priority = 3, description = "Verify Process Tracker", groups = { "Functional" }, alwaysRun=true)

	public void verifyProcessTrackerConfiguration() 

	{
		configProcessTrackerClickPages.processTrackerConfiguration();
		
		System.out.println("Page Title is:" + "Process Tracker Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Process Tracker Configuration - Global Title", "Smoke Test", "Financial Package Configuration - Global", "Verify Community Auto Close & Report Generation - Global");	
	}


}
