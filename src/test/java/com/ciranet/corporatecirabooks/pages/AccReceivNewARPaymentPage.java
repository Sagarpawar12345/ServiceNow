package com.ciranet.corporatecirabooks.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ciranet.utilities.LoggerManager;

public class AccReceivNewARPaymentPage 
{

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	public WebDriver driver;


	public AccReceivNewARPaymentPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing New AR Payment  ======== ");
	}

	String NewARPaymentPageURL = "https://sandbox.ciranet.com/v2/managementportal/ccb/ar/createarpayment";

	@FindBy(xpath = "//input[@role='combobox']")
	public WebElement Company_Dropdown;
	
	@FindBy(xpath = "//div[contains(text(),'RealManage')]")
	public WebElement realmanage;
	
	@FindBy(xpath = "")
	public WebElement customer_selection;
	
	
	
	
	

	public void NewARPaymentPageLanding() throws InterruptedException 
	{
		//Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		driver.navigate().to(NewARPaymentPageURL);

		// statement which prints
		System.out.println("======== Navigating to New AR Payment Page ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints
		System.out.println("Current Page is : " + driver.getTitle());
		
		Company_Dropdown.click();
		
		// statement which prints
		System.out.println("Management Company Dropdown is clicked");

		
		realmanage.click();
		
//		// statement which prints
//		System.out.println("realmanage Dropdown is clicked");
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Save']")));
//		
//		System.out.println("New AR Payment mould is displayed");
//		
//		customer_selection.click();
//		
//		// statement which prints
//		System.out.println("Customer selection Dropdown is clicked");
		
		driver.close();

		

	}

}
