package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ConfigServicesClickPagesTest extends TestBase{
	
	@Test(priority = 0,  dataProvider = "internalUserProvider" , description = "Verify Service Configuration", groups = { "Smoke" }, alwaysRun=true)
	public void VerifyConfigReportTemplatesClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Service Configuration");
		configServicesClickPages =loginPage.verifyConfigServicesClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Service Configuration", "Smoke Test","System Configurations", "Verify  System Configurations");
		
		}


	@Test(priority = 1, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyBoardPortal() 

	{
		configServicesClickPages.boardPortal();
		assertEquals("Board Portal - Global",( configServicesClickPages.llbBoardApproval).getText());
		System.out.println("Page Title is:" + "Board Portal - Global");
		TestBase.setExtentReportSettings("Verifying Board Approval Title", "Smoke Test", "System Configurations", "Verify  System Configurations");	
	}

	@Test(priority = 2, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyBrandingConfiguration() 

	{
		configServicesClickPages.brandingConfiguration();
		assertEquals("Branding Configuration - Global",( configServicesClickPages.llbBrandingConfiguration).getText());
		System.out.println("Page Title is:" + "Branding Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}
    
	@Test(priority = 3, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyBussinessHour() 

	{
		configServicesClickPages.bussinessHour();
		assertEquals("Business Hours - Global",( configServicesClickPages.llbBussinessHour).getText());
		System.out.println("Page Title is:" + "Business Hours - Global");
		TestBase.setExtentReportSettings("Verifying Business Hours - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 4, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifycalendarConfiguration() 

	{
		configServicesClickPages.calendarConfiguration();
		assertEquals("Calendar Configuration - Global",( configServicesClickPages.llbCalendarConfiguration).getText());
		System.out.println("Page Title is:" + "Calendar Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 5, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifymassComminicationSystemTemplateConfiguration() 

	{
		configServicesClickPages.massComminicationSystemTemplateConfiguration();
		assertEquals("Mass Communication System Template Configuration - Global",( configServicesClickPages.llbMassCommunicationSysterConfiguration).getText());
		System.out.println("Page Title is:" + "Branding Configuration - Global");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}
    
	@Test(priority = 6, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyresidentPortal() 

	{
		configServicesClickPages.residentPortal();
		assertEquals("Resident Portal - Global",( configServicesClickPages.llbResidentPortal).getText());
		System.out.println("Page Title is:" + "Resident Portal - Global");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}
    
	@Test(priority = 7, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyserviceGroup() 

	{
		configServicesClickPages.serviceGroup();
		assertEquals("Service Groups - Global",( configServicesClickPages.llbServiceGroup).getText());
		System.out.println("Page Title is:" + "Service Groups - Global");
		TestBase.setExtentReportSettings("Verifying Branding Configuration - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}
    
	@Test(priority = 8, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyserviceRole() 

	{
		configServicesClickPages.serviceRole();
		assertEquals("Service Roles - Global",( configServicesClickPages.llbServiceRole).getText());
		System.out.println("Page Title is:" + "Service Roles - Global");
		TestBase.setExtentReportSettings("Verifying Service Roles - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}
    
	@Test(priority = 9, description = "Verify Service Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyServices() 

	{
		configServicesClickPages.services();
		assertEquals("Services - Global",( configServicesClickPages.llbServices).getText());
		System.out.println("Page Title is:" + "Services - Global");
		TestBase.setExtentReportSettings("Verifying Services - Global Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

}
