package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ConfigReportTemplatesClickPagesTest extends TestBase {
	
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0,dataProvider = "internalUserProvider" , description = "Verify Report Template", groups = { "Smoke" }, alwaysRun=true)
	public void VerifyConfigReportTemplatesClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Report Template");
		configReportTemplatesClickPages =loginPage.verifyConfigReportTemplatesClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying My Work Queue Title", "Smoke Test", "AR Payment", "Verify AR Payment");
		
		}


	@Test(priority = 1, description = "Verify Report Template", groups = { "Functional" }, alwaysRun=true)

	public void verifyLetterTemplate() 

	{
		configReportTemplatesClickPages.letterTemplate();
		
		System.out.println("Page Title is:" + " Letter Templates / Builder Statement Cover Letter - Global ");
		TestBase.setExtentReportSettings("Verifying   Letter Templates / Builder Statement Cover Letter - Global  Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}
    

	@Test(priority = 2, description = "Verify Report Template", groups = { "Functional" }, alwaysRun=true)

	public void verifyLetterHeadTemplate() 

	{
		configReportTemplatesClickPages.letterHeadTemplate();
		
		System.out.println("Page Title is:" + "Letter Template");
		TestBase.setExtentReportSettings("Verifying  Letterhead Template / Page Footer - Global  Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

}
