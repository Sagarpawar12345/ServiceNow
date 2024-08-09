package com.ciranet.loginpage.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.ciranet.testbase.TestBase;
import com.ciranet.utilities.LoggerManager;
import com.ciranet.utilities.XMLCredentialsReader;

public class LoginPageTest extends TestBase {

	@Test(priority = 0, description = "Verify LoginPage UI", groups = { "Smoke" })
	public void verifyLoginPageTitle() {
	    LoggerManager.info("Verifying LoginPage Title");
	    
	    // Set the extent report settings with relevant information
	    TestBase.setExtentReportSettings(
	        "Login Page Title", 
	        "Smoke Test", 
	        "Verify Login page Title", 
	        "Verifying Title of Login Page"
	    );

	    // Get the title of the page and check if it contains the expected text
	    String pageTitle = driver.getTitle();
	    LoggerManager.info("Login Page Title: " + pageTitle);
	    
	    // Verify that the page title contains the expected text
	    assertTrue(pageTitle.contains("Management Portal Sandbox"), 
	        "Page title does not contain expected text: 'Management Portal Sandbox'");
	}


	@Test(priority = 1, description = "Verify LoginPage Components", groups = { "Smoke" })
	public void verifyLoginPageComponents() {
	    // Set the extent report settings with relevant information
	    TestBase.setExtentReportSettings(
	        "Login Page Components", 
	        "Smoke Test", 
	        "Verify Login page UI", 
	        "Verifying UI on Login Page"
	    );

	    LoggerManager.info("Verifying LoginPage Components");

	    // Verify that all login page components are visible
	    boolean areComponentsVisible = loginPage.visibilityOfLoginPageComponents();
	    LoggerManager.info("LoginPage Components visibility: " + areComponentsVisible);

	    // Assert that the components are visible
	    assertTrue(areComponentsVisible, "Failed to load login components");
	}

	
	
	@Test(priority = 2, dataProvider = "internalUserProvider" , description = "Verify valid login functionality", groups = { "Functional" })
	public void verifyValidLogin(XMLCredentialsReader.userCredentials credentials) throws Exception {

		LoggerManager.info("----- Verify Valid Login Start -----");

		LoggerManager.info("Verifying LoginPage Title");

		assertTrue(loginPage.verifyLogin(credentials.getUsername(), credentials.getPassword()), "Login functionality failed with valid credentials");

		TestBase.setExtentReportSettings("Login Page success", "Smoke Test", "Verify Login page with valid credentials", "Verifying Login Page with valid credentials");

		LoggerManager.info("----- Verify Valid Login End -----");
		loginPage.userLogout();

	}
	
	@Test(priority = 3, dataProvider = "internalUserProvider" , description = "Verify valid login functionality after Enter key Press", groups = { "Functional" })
	public void verifyValidLoginEnterKeyPress(XMLCredentialsReader.userCredentials credentials) throws Exception {

		LoggerManager.info("----- Verify Valid Login Start  after Enter Key Press -----");

		LoggerManager.info("Verifying LoginPage After Enter Key Press");

		assertTrue(loginPage.verifyLoginWithEnterKeyPress(credentials.getUsername(), credentials.getPassword()), "Login functionality failed with valid credentials and Enter keypress");

		TestBase.setExtentReportSettings("Login Page success with Enter key", "Smoke Test", "Verify Login page valid credentials Enter keypress", "Verifying Login Page with Enterkey press");
		
		LoggerManager.info("----- Verify Valid Login with Enter Key Press End -----");
		
		loginPage.userLogout();
	}
	
	@Test(priority = 4, dataProvider = "internalUserProvider" , description = "Verify Browser back functionality after Login", groups = { "Functional" })
	public void clickBrowserBackTest(XMLCredentialsReader.userCredentials credentials) throws Exception {

		LoggerManager.info("----- Verify Browser Back after user logs in -----");

		LoggerManager.info("Verifying Homepage after Browser back");
		
		assertTrue(loginPage.clickBrowserBack(credentials.getUsername(), credentials.getPassword()), "Login functionality failed with valid credentials");

		TestBase.setExtentReportSettings("Login Page Browser Back", "Smoke Test", "Verify Login page Browser Back", "Verifying Browser Back click");

		LoggerManager.info("----- Verify Browser Back after user logs in End -----");
		
		loginPage.userLogout();
	}
	
	@Test(priority = 5, description = "Verify Invalid Username Valid Password on Login", groups = { "Functional" })
	public void InvalidUserValidPassword() throws Exception {
		Thread.sleep(1000);
		LoggerManager.info("----- Verify Invalid Username Valid Password -----");

		String username = "test.test";
		String password = "YELLO#12";

		LoggerManager.info("Verifying Invalid Username Valid Password on Login");

		assertFalse(loginPage.invalidLogin(username, password), "Login functionality");
		
		TestBase.setExtentReportSettings("Login Page with Invalid username", "Smoke Test", "Verify Login page with invalid credentials", "Verifying Login Page invalid credentials");
		LoggerManager.info("----- Verify Invalid Username Valid Password on Login End -----");
	
	}
	
	@Test(priority = 6, description = "Verify valid Username Invalid Password on Login", groups = { "Functional" })
	public void validUserInvalidPassword() throws Exception {
		LoggerManager.info("----- Verify valid Username Invalid Password -----");

		String username = "test.test" ;
		String password = "WHITE#12" ;

		LoggerManager.info("Verifying valid Username Invalid Password on Login");

		LoggerManager.info("Username: " + username + " Password: " + password);
		
		assertFalse(loginPage.invalidLogin(username, password), "Login functionality");
		
		TestBase.setExtentReportSettings("Login Page with Invalid credentials", "Smoke Test", "Verify Login page with invalid Credentials", "Verifying Login Page invalid Credentials");
		
		LoggerManager.info("----- Verify valid Username Invalid Password on Login End -----");
	}
	
     @Test(priority = 7, description = "Verify Invalid Username Invalid Password on Login", groups = { "Functional" })
	public void InvalidUserInvalidPassword() throws Exception {
		Thread.sleep(1000);
		LoggerManager.info("----- Verify Invalid Username Invalid Password -----");

		String username = "test.user" ;
		String password = "WHITE#12" ;

		LoggerManager.info("Verifying Invalid Username Invalid Password on Login");

		LoggerManager.info("Username: " + username + " Password: " + password);

		assertFalse(loginPage.invalidLogin(username, password), "Login functionality");
		
		LoggerManager.info("----- Verify Invalid Username Invalid Password on Login End -----");
	}
	
	@Test(priority = 8, description = "Verify Show Password functionality on Login", groups = { "Functional" })
	public void showPasswordFunctionality() throws Exception {
		// Thread.sleep(1000);
		LoggerManager.info("----- Verify Show Password functionality -----");

		String username = "" ;
		String password = "WHITE#12" ;

		LoggerManager.info("Verifying Show Password functionality on Login");
		
		TestBase.setExtentReportSettings("Login Page with show password", "Smoke Test", "Verify Login page with Show password", "Verifying Login Page Show Password");

		assertTrue(loginPage.verifyShowPassword(username,password));
		LoggerManager.info("----- Verify Show Password on Login End -----");
		
	}
	
	
	@Test(priority = 9, description = "Verify Empty Username Empty Password on Login", groups = { "Functional" })
	public void emptyUserEmptyPassword() throws Exception {
		LoggerManager.info("----- Verify Empty Username Empty Password on Login -----");

		String username = "" ;
		String password = "" ;

		LoggerManager.info("Verify Empty Username Empty Password on Login");

		LoggerManager.info("Username: " + username + " Password: " + password);
		
		TestBase.setExtentReportSettings("Login Page with Empty values", "Smoke Test", "Verify Login page with Empty Values", "Verifying Login Page with Empty values");
		String usernameBorderColor = loginPage.getUsernameBorderColor();
       
	    assertEquals("rgb(51, 51, 51)", usernameBorderColor);
	    
		LoggerManager.info("----- Verify Invalid Username Invalid Password on Login End -----");
		
	}
	
	@Test(priority = 10, description = "Verify Choose Different Portal Link Click", groups = { "Functional" })
	public void VerifyChooseDifferentPortal() throws Exception {
		
		LoggerManager.info("Verifying Choose Different Portal Link Click");
		
		String expectedURL = loginPage.verifyDifferentPortalLink(); // "https://sandbox.ciranet.com/v2/portalselection";
		
		//getCurrentUrl(): It fetches the URL of the opened application.
		String actualURL = driver.getCurrentUrl();
				
		// Compare between two variable whether both are equal or not
		assertEquals(expectedURL, actualURL);
		
		driver.navigate().back();
	}
	
	
	 @Test(priority = 11, description = "Verify Forgot Password Button Click", groups = { "Functional" })
	public void VerifyForgotPasswordButtonClick() throws  Exception {
		//Thread.sleep(1000);
		LoggerManager.info("----- Verify Forgot Password Password Button Click -----");
		
		
		//Thread.sleep(2000);
		String expectedURL = loginPage.verifyForgotPasswordPage();
		
		//getCurrentUrl(): It fetches the URL of the opened application.
		String actualURL = driver.getCurrentUrl();
				
		// Compare between two variable whether both are equal or not
		assertEquals(expectedURL, actualURL);
		
		driver.navigate().back();
		LoggerManager.info("----- Verify Forgot Password Password Button Click on Login End -----");
		
	}
	
	@Test(priority = 12, description = "Forgot Password Page Components", groups = { "Smoke" })
	public void VerifyForgotPasswordPageComponents() throws Exception {
		
		LoggerManager.info("Verifying Forgot Password Page Components");
	
		//String strFogotPassLink=loginPage.verifyForgotPasswordPage();
		//System.out.println(strFogotPassLink);
		
		assertTrue(loginPage.visibilityOfForgotPasswordPageComponents(), "Fail to load Forgot Password Page components");
		driver.navigate().back();
		LoggerManager.info("----- Verify Forgot Password Components -----");
		
	}
	
	@SuppressWarnings("deprecation")
	//@Test(priority = 13, description = "Simultaneous Login On Same Browser", groups = { "Smoke" }, dataProvider = "internalUserProvider")
	public void verifySimultaneousLoginOnSameBrowser(XMLCredentialsReader.userCredentials credentials) throws Exception 
	{

		//Creating Strings // Configuration implementation that reads the platform specific environment variables
		
		// used to forward logs to all the registered output Handler objects. 
		//INFO message: Info is for the use of administrators or advanced users
		LoggerManager.info("Verifying LoginPage Title");

		// assert that a condition is true, you still have to code such condition for it to be evaluated at runtime
		assertTrue(loginPage.verifyLogin(credentials.getUsername(), credentials.getPassword()), "Login functionality failed with valid credentials");

		// Manages a hierarchical namespace of Logger objects. All named Loggers are stored in this namespace
		LoggerManager.info("----- Verify Simultaneous Login On Same Browser -----");
		//Thread.sleep(5000);
		
		//set the amount of time to wait for a page load to complete before throwing an error
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.TAB);
		
		// Opens LambdaTest homepage in the newly opened tab
		driver.navigate().to(TestBase.applicationURL);

		// Creating Strings 
		String expectedurl1 = TestBase.applicationURL + TestBase.HomePageURL;
		
		//getCurrentUrl(): It fetches the URL of the opened application.
		String actualurl1 = driver.getCurrentUrl();
		
		// Prints the argument passed to it
		System.out.print("actualurl1  " + actualurl1);
				
		// Compare between two variable whether both are equal or not
		assertEquals(expectedurl1, actualurl1);

		// Stop the execution of the current thread
		//Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		loginPage.userLogout();
		
		// Stop the execution of the current thread
		//Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	}
	
	@SuppressWarnings("deprecation")
	//@Test(priority = 14, description = "Verify user is able to login on different browsers with different credentials", groups = { "Functional" }, dataProvider = "internalUserProvider")
	public void verifyLoginDiffUsersOnDifferentBrowsers(XMLCredentialsReader.userCredentials credentials) throws Exception {

		LoggerManager.info("----- Verify user is able to login on different browsers with different credentials -----");

		LoggerManager.info("Verify user is able to login on different browsers with different credentials");

		assertTrue(loginPage.verifyLoginDiffUsersOnDifferentBrowsers(credentials.getUsername(), credentials.getPassword()), "Login functionality failed with different credentials different browser");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		LoggerManager.info("----- Verify verifyLoginDiffUsersOnDifferentBrowsers End -----");
		//Thread.sleep(1000);
		//loginPage.userlogout();

	}
	

}
