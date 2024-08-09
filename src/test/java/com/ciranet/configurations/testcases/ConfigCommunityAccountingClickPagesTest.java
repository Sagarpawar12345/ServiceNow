package com.ciranet.configurations.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ConfigCommunityAccountingClickPagesTest extends TestBase{
	
	@Test(priority = 0,  dataProvider = "internalUserProvider" , description = "Verify Community Accounting Configuration", groups = { "Smoke" }, alwaysRun=true)
	public void VerifyConfigCommunityAccountingClickPages(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Community Accounting Configuration");
		configCommunityAccountingClickPages =loginPage.verifyConfigCommunityAccountingClickPages(credentials.getUsername(), credentials.getPassword());
		TestBase.setExtentReportSettings("Verifying Community Accounting Configuration", "Smoke Test","Community Accounting Configurations", "Verify  Community Accounting Configurations");
		
		}


	@Test(priority = 1, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaapCrossEntityBill() 

	{
		configCommunityAccountingClickPages.aapCrossEntityBill();
	
		TestBase.setExtentReportSettings("Verifying AAP Cross Entity Bill Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	
	@Test(priority = 2, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaapWorkFlowAutoAction() 

	{
		configCommunityAccountingClickPages.aapWorkFlowAutoAction();
	
		TestBase.setExtentReportSettings("Verifying AAP  Work Flow Auto Action Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}
	
	
	@Test(priority = 3, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaapWorkFlowCheckList() 

	{
		configCommunityAccountingClickPages.aapWorkFlowCheckList();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}
	
	
	


	@Test(priority = 4, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaarBillingTypes() 

	{
		configCommunityAccountingClickPages.aarBillingTypes();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	
	@Test(priority = 5, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaarBuilderStatements() 

	{
		configCommunityAccountingClickPages.aarBuilderStatements();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	
	
	@Test(priority = 6, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaarMiscInvoiceTypes() 

	{
		configCommunityAccountingClickPages.aarMiscInvoiceTypes();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	
	
	@Test(priority = 7, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaarPaymentApplicationOrder() 

	{
		configCommunityAccountingClickPages.aarPaymentApplicationOrder();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	
	@Test(priority = 8, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifyaarStatements() 

	{
		configCommunityAccountingClickPages.aarStatements();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	@Test(priority = 9, description = "Verify Community Accounting Configuration", groups = { "Functional" }, alwaysRun=true)

	public void verifycollectionsConfiguration() 

	{
		configCommunityAccountingClickPages.collectionsConfiguration();
	
		TestBase.setExtentReportSettings("Verifying  Title", "Smoke Test", "Community Accounting Configurations", "Verify  Community Accounting Configurations");	
	}

	

	
	
	
}
