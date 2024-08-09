package com.ciranet.testbase;

import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

// for Extent Reports
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ciranet.boardmembers.pages.BoardMemberPage;
import com.ciranet.configurations.pages.BatchJobEmailsConfigPage;
import com.ciranet.configurations.pages.ClosingPortalConfigPage;
import com.ciranet.configurations.pages.CommunityConfigPage;
import com.ciranet.configurations.pages.ConfigCommunityAccountingClickPages;
import com.ciranet.configurations.pages.ConfigEnforcementClickPages;
import com.ciranet.configurations.pages.ConfigModulesClickPages;
import com.ciranet.configurations.pages.ConfigProcessTrackerClickPages;
import com.ciranet.configurations.pages.ConfigReportTemplatesClickPages;
import com.ciranet.configurations.pages.ConfigResponseTemplatesClickPages;
import com.ciranet.configurations.pages.ConfigServicesClickPages;
import com.ciranet.corporatecirabooks.pages.AccReceivNewARPaymentPage;
import com.ciranet.corporatecirabooks.pages.GLUploadBudgetsPage;
import com.ciranet.homepage.pages.HomePage;
import com.ciranet.internaluser.pages.InternalUserPage;
import com.ciranet.loginpage.pages.LoginPage;
import com.ciranet.myportfolio.pages.RevMgmtBillingItemManagementPage;
import com.ciranet.myworkqueue.pages.ComMgmtBoardApprovalsPage;
import com.ciranet.myworkqueue.pages.ComMgmtCommonLotsAppraisalPage;
import com.ciranet.myworkqueue.pages.ComMgmtFulfillmentQueuePage;
import com.ciranet.myworkqueue.pages.ComMgmtMaintenanceWorkOrdersPage;
import com.ciranet.myworkqueue.pages.ComMgmtViolationReviewPage;
import com.ciranet.myworkqueue.pages.DiscloProcessingClosingRequestsPage;
import com.ciranet.myworkqueue.pages.DiscloProcessingCommunityBlocksPage;
import com.ciranet.myworkqueue.pages.DiscloProcessingPropertyConveyancePage;
import com.ciranet.myworkqueue.pages.InternalTasksPage;
import com.ciranet.myworkqueue.pages.ProjectsTasksPage;
import com.ciranet.myworkqueue.pages.ReceiLockStatementApprovalQueuePage;
import com.ciranet.utilities.CommonUtilities;
import com.ciranet.utilities.EnvironmentConfig;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestBase {
	public static WebDriver driver;
	// For Extent Report
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test; 

	String browserName = EnvironmentConfig.environmentSetup().get("BROWSERTYPE");

	public static String applicationURL = EnvironmentConfig.environmentSetup().get("APPLICATIONURL");

	public static String HomePageURL = applicationURL + "/home";
	
	public static int PAGE_LOAD_TIMEOUT = Integer
			.parseInt(EnvironmentConfig.environmentSetup().get("PAGE_LOAD_TIMEOUT"));

	public static int IMPLICIT_WAIT = Integer.parseInt(EnvironmentConfig.environmentSetup().get("IMPLICIT_WAIT"));

	public static final String AUTOMATE_USERNAME = EnvironmentConfig.environmentSetup()
			.get("BROWSER_STACK_AUTOMATE_USERNAME");

	public static final String AUTOMATE_ACCESS_KEY = EnvironmentConfig.environmentSetup()
			.get("BROWSER_STACK_AUTOMATE_ACCESS_KEY");
	
	public LoginPage loginPage = new LoginPage(driver);
	public HomePage homePage = new HomePage(driver);
	public InternalTasksPage internalTasksPage = new InternalTasksPage(driver);
	public ComMgmtBoardApprovalsPage boardApprovalsPage = new ComMgmtBoardApprovalsPage(driver);
	public ComMgmtCommonLotsAppraisalPage commonLotsAppraisalPage = new ComMgmtCommonLotsAppraisalPage(driver);
	public ComMgmtFulfillmentQueuePage fulfillmentQueuePage = new ComMgmtFulfillmentQueuePage(driver);
	public ComMgmtMaintenanceWorkOrdersPage WorkOrdersPage = new ComMgmtMaintenanceWorkOrdersPage(driver);
	public DiscloProcessingClosingRequestsPage closingRequestsPage = new DiscloProcessingClosingRequestsPage(driver);
	public ProjectsTasksPage projectsTasksPage = new ProjectsTasksPage(driver);
	public DiscloProcessingPropertyConveyancePage propertyConveyanceWorkQueuePage = new DiscloProcessingPropertyConveyancePage(driver);
	public AccReceivNewARPaymentPage newARPaymentPage = new AccReceivNewARPaymentPage(driver);
	public GLUploadBudgetsPage UploadBudgets = new GLUploadBudgetsPage(driver);
	public ReceiLockStatementApprovalQueuePage receiLockStatementApprovalQueuePage = new ReceiLockStatementApprovalQueuePage(driver);
	public ComMgmtViolationReviewPage violationReviewPage = new ComMgmtViolationReviewPage(driver);
	public InternalUserPage internalUserPage = new InternalUserPage(driver);
	public RevMgmtBillingItemManagementPage billingItemManagementPage = new RevMgmtBillingItemManagementPage(driver);
	public DiscloProcessingCommunityBlocksPage communityBlocksPage = new DiscloProcessingCommunityBlocksPage(driver);

	public BatchJobEmailsConfigPage configurationsPage = new BatchJobEmailsConfigPage(driver);
	
	public ConfigModulesClickPages configModulesClickPages = new ConfigModulesClickPages(driver);
    
    public ConfigResponseTemplatesClickPages configResponseTemplatesClickPages = new ConfigResponseTemplatesClickPages(driver);
    
    public ClosingPortalConfigPage ClosingPortalconfigurationsPage = new ClosingPortalConfigPage(driver);
    
    public CommunityConfigPage CommunityconfigurationsPage = new CommunityConfigPage(driver);
    	
	public ConfigEnforcementClickPages configEnforcementClickPages = new ConfigEnforcementClickPages(driver);
	
	public ConfigProcessTrackerClickPages configProcessTrackerClickPages =new ConfigProcessTrackerClickPages(driver);

	public ConfigReportTemplatesClickPages configReportTemplatesClickPages = new ConfigReportTemplatesClickPages(driver);
	
	public ConfigServicesClickPages configServicesClickPages = new ConfigServicesClickPages(driver);
	
	public ConfigCommunityAccountingClickPages configCommunityAccountingClickPages = new ConfigCommunityAccountingClickPages(driver);
   
	
	public BoardMemberPage boardMemberHomePage = new BoardMemberPage(driver);

	// For Storing Extent Report location in String
	public static String extentReportLocation;

	DesiredCapabilities dc = new DesiredCapabilities();

	// Initializing pages here
	@BeforeMethod(alwaysRun = true)
	public void pageSetup() {

		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		internalTasksPage = new InternalTasksPage(driver);
		commonLotsAppraisalPage = new ComMgmtCommonLotsAppraisalPage(driver);
		boardApprovalsPage = new ComMgmtBoardApprovalsPage(driver);
		fulfillmentQueuePage = new ComMgmtFulfillmentQueuePage(driver);
		WorkOrdersPage = new ComMgmtMaintenanceWorkOrdersPage(driver);
		closingRequestsPage = new DiscloProcessingClosingRequestsPage(driver);
		projectsTasksPage = new ProjectsTasksPage(driver);
		propertyConveyanceWorkQueuePage = new DiscloProcessingPropertyConveyancePage(driver);
		newARPaymentPage = new AccReceivNewARPaymentPage(driver);
		UploadBudgets = new GLUploadBudgetsPage(driver);
		receiLockStatementApprovalQueuePage = new com.ciranet.myworkqueue.pages.ReceiLockStatementApprovalQueuePage(driver);
		violationReviewPage = new ComMgmtViolationReviewPage(driver); 
		internalUserPage = new InternalUserPage(driver);
		billingItemManagementPage = new RevMgmtBillingItemManagementPage(driver);
		communityBlocksPage = new DiscloProcessingCommunityBlocksPage(driver);

		configurationsPage = new BatchJobEmailsConfigPage(driver);
		configModulesClickPages = new ConfigModulesClickPages(driver);
		configResponseTemplatesClickPages = new ConfigResponseTemplatesClickPages(driver);
		
		CommunityconfigurationsPage = new CommunityConfigPage(driver);
		configProcessTrackerClickPages= new ConfigProcessTrackerClickPages(driver);
		configReportTemplatesClickPages = new ConfigReportTemplatesClickPages(driver);
		ClosingPortalconfigurationsPage = new ClosingPortalConfigPage(driver);
		configEnforcementClickPages = new ConfigEnforcementClickPages(driver);
		configServicesClickPages = new ConfigServicesClickPages(driver);
		configCommunityAccountingClickPages = new ConfigCommunityAccountingClickPages(driver);
		boardMemberHomePage = new BoardMemberPage(driver);
	}

	@BeforeSuite(alwaysRun=true)
	public WebDriver setup() throws MalformedURLException, UnknownHostException {
		// Code For the Extent Reports
		htmlReporter = new ExtentSparkReporter(EnvironmentConfig.environmentSetup().get("REPORT_LOCATION")	+ "AutomationExtentReport_" + CommonUtilities.getCurrentDateTime() + ".html");

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName : ", InetAddress.getLocalHost().getHostName());

		extent.setSystemInfo("ProjectName : ", "Cira Automation Test Automation");

		extent.setSystemInfo("Test Environment: ", System.getProperty("env").toUpperCase());

		extent.setSystemInfo("Operating System : ", System.getProperty("os.name"));

		extent.setSystemInfo("QA Name : ", System.getProperty("user.name"));

		//htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("Cira Test Automation Report");
		htmlReporter.config().setReportName("Cira Automation Test Execution Report ");
		htmlReporter.config().setEncoding("utf-8");
		//htmlReporter.config().setChartVisibilityOnOpen(true);

		String strExtentReport = ""; 
		strExtentReport = EnvironmentConfig.environmentSetup().get("REPORT_LOCATION");

		strExtentReport = strExtentReport.substring(1, strExtentReport.length()); // EnvironmentConfig.environmentSetup().get("REPORT_LOCATION");

		strExtentReport = strExtentReport.replaceAll("\\/", "//");

		extentReportLocation = System.getProperty("user.dir") + strExtentReport + 
				"AutomationExtentReport_" + CommonUtilities.getCurrentDateTime() + ".html";

		extentReportLocation=extentReportLocation.replaceAll("\\//", "\\\\");

		extentReportLocation=extentReportLocation.replaceAll("\\\\", "\\\\\\\\");

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			LoggerManager.debug("------- Chrome browser loaded -------");

		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();

			LoggerManager.debug("------- FireFox browser loaded -------");

		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

			LoggerManager.debug("------- Edge browser loaded -------");

		} else if (browserName.equalsIgnoreCase("Safari")) {

			driver = new SafariDriver();

			LoggerManager.debug("------- Safari browser loaded -------");

		}  else {

			// Default browser set to Chrome driver Instance.
			driver = new ChromeDriver();

			LoggerManager.debug("------- Chrome browser loaded as default browser -------");

		}

		if (driver != null) {

			driver.manage().deleteAllCookies();

			driver.manage().window().maximize();

			driver.get(applicationURL);

			LoggerManager.debug("------- Application URL set to: " + applicationURL);

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));

			LoggerManager.debug("------- Page load timeout is set to: " + PAGE_LOAD_TIMEOUT);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));

			LoggerManager.debug("------- Implicit Wait time is set to: " + IMPLICIT_WAIT);

		} else {

			driver.close();

			LoggerManager.debug("------- Browser closed");

			// Null browser Instance when close.

			driver = null;

			LoggerManager.debug("------- Browser set as NULL");
		}

		return driver;

	}

	// This is a Common Method to set the Extent Report for Each Test Case.
	public static void setExtentReportSettings(String strCreateTest, String strAssignCategory, String strCreateNode, String statusInfo) 
	{
		TestBase.test = TestBase.extent.createTest(strCreateTest);//"Home Page Test"
		TestBase.test.assignCategory(strAssignCategory); //"Test Type" 
		TestBase.test = TestBase.test.createNode(strCreateNode); //
		TestBase.test.log(Status.INFO, statusInfo); //"Verifying Home Page"
	}

	public static String captureScreenshot(WebDriver driver, String screenShotName) throws Exception {

		Screenshot screenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);

		String destinationPath =  System.getProperty("user.dir") + EnvironmentConfig.environmentSetup().get("SCREEN_SHOT_PATH")  
				+ screenShotName + System.currentTimeMillis() + ".png";

		System.out.println("Screenshot captured at location before : " + destinationPath);

		ImageIO.write(screenShot.getImage(), "PNG", new File(destinationPath));

		return destinationPath;
	}

	@DataProvider(name = "boardMemberProvider")
    public Object[][] credentialsProvider() {
        String boardmemberUserPath = System.getProperty("user.dir") + "\\src\\test\\java\\com\\ciranet\\testdata\\boardmembers.xml";
        List<XMLCredentialsReader.userCredentials> credentialsList = XMLCredentialsReader.readCredentials(boardmemberUserPath);

        Object[][] data = new Object[credentialsList.size()][1];
        for (int i = 0; i < credentialsList.size(); i++) {
            data[i][0] = credentialsList.get(i);
        }
        return data;
    }

    @DataProvider(name = "internalUserProvider")
    public Object[][] credentialsInternalUserProvider() {
        String internalUserPath = System.getProperty("user.dir") + "\\src\\test\\java\\com\\ciranet\\testdata\\internalusers.xml";
        List<XMLCredentialsReader.userCredentials> credentialsList = XMLCredentialsReader.readCredentials(internalUserPath);

        Object[][] data = new Object[credentialsList.size()][1];
        for (int i = 0; i < credentialsList.size(); i++) {
            data[i][0] = credentialsList.get(i);
        }
        return data;
    }
    
	
	@AfterSuite(alwaysRun=true)
	public void tearDown() {
		LoggerManager.info("----- Quitting browser -----");

		// loginPage.userlogout();
		//comment below section for fetch xhr functionality
		if (!(driver==null)) {
		driver.quit();}
		LoggerManager.debug("------- Browser quit successfully -------");
		//driver.close();

		extent.flush();
	}
}
