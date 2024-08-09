package com.ciranet.corporatecirabooks.testcases;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class AccReceivNewARPaymentPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider", description = "Verify New AR Payment", groups = { "Smoke" })
	public void verifyNewARPaymentPageURL(XMLCredentialsReader.userCredentials credentials)throws InterruptedException
	{

		LoggerManager.info("Verifying New AR Payment Page Title");
		newARPaymentPage = loginPage.verifyNewARPaymentPageURL(credentials.getUsername(), credentials.getPassword());
		newARPaymentPage.NewARPaymentPageLanding();
		TestBase.setExtentReportSettings("Verifying New AR Payment Title", "Smoke Test", "AR Payment", "Verify AR Payment");
		
	} 
}


