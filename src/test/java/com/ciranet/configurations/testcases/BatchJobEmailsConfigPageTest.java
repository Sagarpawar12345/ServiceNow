package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class BatchJobEmailsConfigPageTest extends TestBase 
{
	//@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Configurations Page Title", groups = { "Smoke" })
	public void verifyConfigurationsMenu(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Configurations Page Title");
		configurationsPage = loginPage.verifyBatchJobEmailConfigurations(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Configuration Test", "Smoke Test", "Verify Configuration Page", "Verifying Configuration Page");
		try {
			if (!configurationsPage.isMenuVisible())
			{
				throw new SkipException("Skipping test as menu is not available");
			}
			
			assertEquals("Configurations", configurationsPage.navigateToConfigurationsPage());
		
		} catch (SkipException e) {
			System.out.println("Test is skipped " + e.getMessage());
			throw e;
			
		} catch (Exception e) {
			
			System.out.println("Exception occured " + e.getMessage());
			Assert.fail("Test failed due to exception " + e.getMessage());
		} 
		
	}

	@Test(priority = 1, description = "Verify Configurations Page >> Batch job Emails", groups = { "Smoke" })
	public void verifyBatchJobEmails() 
	{	// LoggerManager.info
		System.out.println("Verifying Batch Job Emails Title");
		TestBase.setExtentReportSettings("Configuration Page BatchJob", "Smoke Test", "Verify Configuration Page Batch Job", "Verifying Configuration Page Batch Job");
		try {
			if (!configurationsPage.isMenuVisible())
			{
				throw new SkipException("Skipping test as menu is not available");
			}
			configurationsPage.navigateToBatchJobEmails();	
		} catch (SkipException e) {
			System.out.println("Test is skipped " + e.getMessage());
			throw e;
			
		} catch (Exception e) {
			System.out.println("Exception occured " + e.getMessage());
			Assert.fail("Test failed due to exception " + e.getMessage());
		} 
		
	}

	//@Test(priority = 2, description = "Verify Configurations Page >> Batch job Emails", groups = { "Smoke" })
	public void verifyNavigateToBatchJobEmails() {
		LoggerManager.info("Verifying Batch Job Emails Title");
		if (!configurationsPage.isMenuVisible())
		{
			throw new SkipException("Skipping test as menu is not available");
		}
		configurationsPage.navigateToBatchJobEmails();
		assertTrue(driver.getCurrentUrl().contains("batch-job-emails-configurations"), "Batch Job Emails URL is incorrect");
	}

	//@Test(priority = 3, description = "Verify Configurations Page >> Batch job Emails dropdown1", groups = { "Smoke" })
	public void verifyFirstDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Batch Job Emails first dropdown selection");
		if (!configurationsPage.isMenuVisible())
		{
			throw new SkipException("Skipping test as menu is not available");
		}
		configurationsPage.selectBatchJobEmailConfigDropdowns("ACH & Fee Notification Email");
	}

	//@Test(priority = 4, description = "Verify Configurations Page >> Batch job Emails dropdown2", groups = { "Smoke" })
	public void verifySelectSecondDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Batch Job Emails second dropdown selection");
		if (!configurationsPage.isMenuVisible())
		{
			throw new SkipException("Skipping test as menu is not available");
		}
		configurationsPage.selectBatchJobEmailConfigDropdowns("ACH Notification Email");
	}

	//@Test(priority = 5, description = "Verify Configurations Page >> Batch job Emails dropdown3", groups = { "Smoke" })
	public void verifySelectThirdDropdown() throws AWTException 
	{
		LoggerManager.info("Verifying Batch Job Emails third dropdown selection");
		if (!configurationsPage.isMenuVisible())
		{
			throw new SkipException("Skipping test as menu is not available");
		}
		configurationsPage.selectBatchJobEmailConfigDropdowns("Annual Budget Preparation Kickoff");
	}

	//@Test(priority = 6, description = "Verify Configurations Page >> Batch job Emails dropdown4", groups = { "Smoke" })
	public void verifySelectFourthDropdown() throws AWTException 
	{
		if (!configurationsPage.isMenuVisible())
		{
			throw new SkipException("Skipping test as menu is not available");
		}
		LoggerManager.info("Verifying Batch Job Emails fourth dropdown selection");
		configurationsPage.selectBatchJobEmailConfigDropdowns("Annual Budget Submission to CAM");
	}

	//@Test(priority = 7, description = "Verify Configurations Page >> Batch job Emails dropdown5", groups = { "Smoke" })
	public void verifySelectFifthDropdown() throws AWTException 
	{	if (!configurationsPage.isMenuVisible())
		{
		throw new SkipException("Skipping test as menu is not available");
		}
		LoggerManager.info("Verifying Batch Job Emails fifth dropdown selection");
		configurationsPage.selectBatchJobEmailConfigDropdowns("Annual Budget Submission to Client");
	}
}

