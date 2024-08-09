package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

@SuppressWarnings("unused")
public class ConfigModulesClickPagesTest extends TestBase
{

	
	

	@Test(priority = 0, dataProvider = "internalUserProvider" ,description = "Verify Configuration Module", groups = { "Smoke" }, alwaysRun=true)
	public void VerifyconfigModulesClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Configuration Module");
		configModulesClickPages =loginPage.verifyConfigModulesClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying My Work Queue Title", "Smoke Test", "AR Payment", "Verify AR Payment");

	}
	@Test(priority = 1, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyConfigurations() 

	{
		configModulesClickPages.configurationsModules();
		
		System.out.println("Page Title is:" + "Customer Defined Info");
		TestBase.setExtentReportSettings("Verifying  Modules Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}


	@Test(priority = 2, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyEgnyteConfiguration() 

	{
		configModulesClickPages.egnyteConfiguration();
		
		System.out.println("Page Title is:" + "Egnyte Configuration");
		TestBase.setExtentReportSettings("Verifying Egnyte Configuration Title", "Smoke Test", "Egnyte Configuration", "Verify  Modules Configurations ");	
	}


	@Test(priority = 3, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyHelp() 

	{
		configModulesClickPages.help();
		
		System.out.println("Page Title is:" + "Help - Global");
		TestBase.setExtentReportSettings("Verifying Help - Global Title", "Smoke Test", "Help - Global", "Verify  Modules Configurations ");	
	}

	@Test(priority = 2, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyRecommendationsandAssumptions() 

	{
		configModulesClickPages.recommendationsandAssumptions();
		
		System.out.println("Page Title is:" + "Recommendations and Assumptions - Global");
		TestBase.setExtentReportSettings("Verifying Recommendations and Assumptions Title", "Smoke Test", "Recommendations and Assumptions", "Verify  Modules Configurations ");	
	}


	@Test(priority = 3, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifySupplimentalInformation() 

	{
		configModulesClickPages.supplimentalInformation();
		
		System.out.println("Page Title is:" + "Supplemental Information - Global");
		TestBase.setExtentReportSettings("Verifying Supplemental Information - Global Title", "Smoke Test", "Supplemental Information - Global", "Verify  Modules Configurations ");	
	}


	@Test(priority = 4, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyTransitionDocuments() 

	{
		configModulesClickPages.transitionDocuments();
		
		System.out.println("Page Title is:" + "Transition Document - Global");
		TestBase.setExtentReportSettings("Verifying Transition Document - Global Title", "Smoke Test", "Transition Document - Global", "Verify  Modules Configurations ");	
	}
	@Test(priority = 5, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyTransitionTaskTemplates() 

	{
		configModulesClickPages.transitionTaskTemplates();
		
		System.out.println("Page Title is:" + "Transition Task Templates - ");
		TestBase.setExtentReportSettings("Verifying Transition Task Templates -  Title", "Smoke Test", "Transition Task Templates - ", "Verify  Modules Configurations ");	
	}


	@Test(priority = 6, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyWorkOrderWorkArea() 

	{
		configModulesClickPages.workOrderWorkArea();
		
		System.out.println("Page Title is:" + "Work Order Work Areas - Amberwood");
		TestBase.setExtentReportSettings("Verifying Work Order Work Areas Title", "Smoke Test", "Work Order Work Areas", "Verify  Modules Configurations ");	
	}

}









