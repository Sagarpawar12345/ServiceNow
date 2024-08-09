package com.ciranet.corporatecirabooks.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class GLUploadBudgetsPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify Upload Budgets Page Title", groups = { "Smoke" })
	public void verifyUploadBudgetsPageURL(XMLCredentialsReader.userCredentials credentials) throws InterruptedException 
	{
		LoggerManager.info("Verifying Upload Budgets Page Title");

		UploadBudgets = loginPage.verifyGLUploadBudgetsPage(credentials.getUsername(), credentials.getPassword());
		UploadBudgets.UploadBudgetsPageLanding();
	}

	@Test(priority = 1, description = "Verify Upload_Budgets Page fields", groups = { "functional" })
	public void verifyUpload_BudgetsPage() throws InterruptedException, AWTException, IOException 
	{

		LoggerManager.info("Verifying Upload_Budgets Page");
		UploadBudgets.verifyUploadBudgetsPage();

	} 



}
