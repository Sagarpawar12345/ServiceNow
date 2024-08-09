package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ConfigResponseTemplatesClickPagesTest extends TestBase 
{
	
	@Test(priority = 0,  dataProvider = "internalUserProvider" , description = "Verify Response Template", groups = { "Smoke" }, alwaysRun=true)
	public void VerifyConfigReportTemplatesClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying My Work Queue Menu");
		configResponseTemplatesClickPages =loginPage.verifyConfigResponseTemplatesClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying  Response Templates Title", "Smoke Test", " Response Templates Configurations ", "Verify  Response Templates Configurations");
		
		}


	@Test(priority = 1, description = "Verify Response Template", groups = { "Functional" }, alwaysRun=true)

	public void verifyLetterTemplate() 

	{
		configResponseTemplatesClickPages.letterTemplate();
		assertEquals("Response Templates Configurations",( configResponseTemplatesClickPages.llbResponseTemplateConfiguration).getText());
		System.out.println("Page Title is:" + "Response Template Configurations");
		TestBase.setExtentReportSettings("Verifying  Response Templates Title", "Smoke Test", " Response Templates Configurations ", "Verify  Response Templates Configurations");	
	}



}
