package com.ciranet.myworkqueue.testcases;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class ComMgmtCommonLotsAppraisalPageTest extends TestBase{

	@Test(priority = 0, dataProvider = "internalUserProvider" , description = "Verify Common Lots Appraisal Title", groups = { "Smoke" })
	public void verifyCommonLotsAppraisalURL(XMLCredentialsReader.userCredentials credentials) 
	{
		LoggerManager.info("Verifying Common Lots Appraisal Title");

		commonLotsAppraisalPage = loginPage.verifyComMgmtCommonLotsAppraisalPage(credentials.getUsername(), credentials.getPassword());
		commonLotsAppraisalPage.CommonLotsAppraisalPageLanding();
		
		TestBase.setExtentReportSettings("Verifying Common Lots Appraisal Title", "Smoke Test", "Common Lots", "Verify C L A");
		//Assert.assertEquals(ComMgmtCommonLotsAppraisalPage.actualURL, "https://sandbox.ciranet.com/v2/managementportal/my-work/common-lots/appraisal");
	}


//	@Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups = { "functional" }) 
//public void verifyToolbarFullScreenOption() {
//
//		commonLotsAppraisalPage.ToolBarFullScreen();
//	}
//
//
//	//@Test(priority = 2, description = "Verify Toolbar Normal Screen option", groups = { "functional" }) 
//	public void verifyToolBarNormalScreenOption() 
//	{
//
//		commonLotsAppraisalPage.ToolBarNormalScreen();
//	}
//
//	//@Test(priority = 3, description = "Verify Column Chooser Option", groups = { "functional" })
//	public void verifyColumnChooserOption() 
//	{
//		commonLotsAppraisalPage.columnChooserClick();
//
//	}
//
//	//@Test(priority = 4, description = "Verify excel Option", groups = { "functional" })
//	public void verifyexcelOption() 
//	{
//		commonLotsAppraisalPage.excelClick();
//	}
//
//	//@Test(priority = 5, description = "Verify csv Option", groups = { "functional" })
//	public void verifycsvOption() 
//	{
//		commonLotsAppraisalPage.csvClick();
//	}





}
