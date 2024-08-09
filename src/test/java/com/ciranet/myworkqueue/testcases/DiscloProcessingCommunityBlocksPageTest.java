package com.ciranet.myworkqueue.testcases;

import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.testdata.RoleBasedDataProviders;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class DiscloProcessingCommunityBlocksPageTest  extends TestBase


{
	@Test(priority = 0, dataProvider = "internaluser", description = "Verify Closing Requests Page Title", groups = { "Smoke" })
	public void VerifyclosingRequeststURL(XMLCredentialsReader.userCredentials credentials) {

		LoggerManager.info("Verifying Closing Request Page Title");

		TestBase.setExtentReportSettings("Closing Requests Page Title Test", "Smoke Test", "Verify Closing Requests Title", "Verifying Closing Requests Page Title");
		
		communityBlocksPage = loginPage.verifyCommunityBlocksPage(credentials.getUsername(), credentials.getPassword());
		communityBlocksPage.CommunityBlocksPageLanding();
	}


	@Test(priority = 1, description = "Verify Closing Requests Page Column Chooser", groups = { "functional" })
	public void VerifycolumnChooserClick() {

		LoggerManager.info("Verifying Column chooser");
		TestBase.setExtentReportSettings("Closing Requests Page Column Chooser", "Smoke Test", "Verify Closing Requests Column Chooser", "Verifying Closing Requests Page Column Chooser");

		communityBlocksPage.columnChooserClick();
	}

	@Test(priority = 2, description = "Verify Toolbar and Full Screen Option", groups = { "functional" })
	public void VerifyToolBarFullScreen()
	{
		TestBase.setExtentReportSettings("Closing Requests Toolbar and Full Screen Option", "Smoke Test", "Verify Closing Requests Toolbar and Full Screen Option", "Verifying Closing Requests Toolbar and Full Screen Option");
		communityBlocksPage.ToolBarFullScreen();
	}

	@Test(priority = 3, description = "Verify Export To Excel Option", groups = { "functional" })
	public void verifyExportToExcelDownload()
	{
		TestBase.setExtentReportSettings("Closing Requests Export to Excel", "Smoke Test", "Verify Closing Requests Export to Excel", "Verifying Closing Requests Export to Excel");
		communityBlocksPage.verifyExportToExcel();
	}

	@Test(priority = 4, description = "Verify Expand and Click Option", groups = { "functional" })
	public void verifyExpandOptionClick()
	{
		TestBase.setExtentReportSettings("Closing Requests Expand and Click Option", "Smoke Test", "Verify Closing Requests -Expand and Click Option", "Verifying Expand and Click Option");
		communityBlocksPage.expandOptionClick();
	}


	@Test(priority = 5, description = "Verify Switching Tabs", groups = { "functional" })
	public void VerifySwitchingTabs()
	{
		TestBase.setExtentReportSettings("Closing Requests Switching Tabs", "Smoke Test", "Verify Closing Requests -Switching Tabs", "Verifying Switching Tabs");
		communityBlocksPage.SwitchingTabs();
	}

	@Test(priority = 6, description = "Verify Add Block Button", groups = { "functional" })
	public void verifyAddBlock()
	{
		TestBase.setExtentReportSettings("Closing Requests Add Block Button", "Smoke Test", "Verify Closing Requests - Add Block Button", "Verifying Add Block Button");
		communityBlocksPage.AddBlock();
	}

	@Test(priority = 7, description = "Verify Edit Button", groups = { "functional" })
	public void verifyActiveEditButtonoption()
	{
		TestBase.setExtentReportSettings("Closing Requests Edit Button", "Smoke Test", "Verify Closing Requests - Edit Button", "Verifying Edit Button");
		communityBlocksPage.verifyActiveEditButton();
	}

	@Test(priority = 8, description = "Verify Expire Edit Button", groups = { "functional" })
	public void verifyExpiredEditButtonoption()
	{
		TestBase.setExtentReportSettings("Closing Requests Expire Edit Button", "Smoke Test", "Verify Closing Requests - Expired Edit Button ", "Verifying Expire Edit Button");
		communityBlocksPage.verifyExpiredEditButton();
	}


	@Test(priority = 9, description = "Verify Community Filter", groups = { "functional" })
	public void verifyCommunityFilteroption()
	{
		TestBase.setExtentReportSettings("Closing Requests Community Filter", "Smoke Test", "Verify Closing Requests - Community Filter", "Verifying Community Filter");
		communityBlocksPage.verifyCommunityFilter();
	}





}
