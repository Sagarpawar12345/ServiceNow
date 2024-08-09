package com.ciranet.configurations.testcases;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ConfigEnforcementClickPagesTest extends TestBase
{

	@Test(priority = 0, dataProvider = "internalUserProvider" ,description = "Verify Configuration Module", groups = { "Smoke" }, alwaysRun=true)
	public void verifyConfigEnforcementClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Configuration Module");
		configEnforcementClickPages =loginPage.verifyConfigEnforcementClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Enforcement Configuration Module", "Smoke Test", "AR Payment", "Verify AR Payment");

	}

	@Test(priority = 1, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyArchitecturalCategories() 

	{
		configEnforcementClickPages.architecturalCategories();	
		System.out.println("Page Title is:" + "Architectural Categories");
		TestBase.setExtentReportSettings("Verifying Enforcement Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 2, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyArchitecturalFormsandGuides() 

	{
		configEnforcementClickPages.architecturalFormsandGuides();	
		System.out.println("Page Title is:" + "Architectural Forms and Guides");
		TestBase.setExtentReportSettings("Verifying Enforcement Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 3, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationCategorySubCategoryConfiguration() 

	{
		configEnforcementClickPages.violationCategorySubCategoryConfiguration();	
		System.out.println("Page Title is:" + "Violation Category Sub Category Configuration");
		TestBase.setExtentReportSettings("Verifying Enforcement Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 3, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationEscalationConfiguration() 

	{
		configEnforcementClickPages.violationEscalationConfiguration();	
		System.out.println("Page Title is:" + "Violation Escalation Configuration");
		TestBase.setExtentReportSettings("Verifying Enforcement Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 4, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationNotificationTemplates() 

	{
		configEnforcementClickPages.violationNotificationTemplates();	
		System.out.println("Page Title is:" + "Violation Notification Templates");
		TestBase.setExtentReportSettings("Verifying Enforcement Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

	@Test(priority = 5, description = "Verify Configuration Module", groups = { "Functional" }, alwaysRun=true)

	public void verifyViolationRestrictionDefinition() 

	{
		configEnforcementClickPages.violationRestrictionDefinition();	
		System.out.println("Page Title is:" + "Violation Restriction Definition");
		TestBase.setExtentReportSettings("Verifying Enforcement Configurations Title", "Smoke Test", " Modules Configurations ", "Verify  Modules Configurations ");	
	}

}
