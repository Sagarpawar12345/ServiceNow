package com.ciranet.myportfolio.pages;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ciranet.utilities.LoggerManager;

public class RevMgmtBillingItemManagementPage {

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public RevMgmtBillingItemManagementPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Billing Item Management Page Objects ======== ");

	}

	String billingItemManagementURL = "https://sandbox.ciranet.com/v2/managementportal/gcb/rm/billingitem";

	//xpath for GridCount
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[2]")
	WebElement entityDropdown;


	@FindBy(xpath = "//div[@class='dx-item-content dx-list-item-content']")
	WebElement entityDropdownValue;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[5]")
	WebElement itemTypeDropdown;

	@FindBy(xpath = "//div[contains(text(),'1096 Miscellaneous')]")
	WebElement itemTypeDropdownValue;

	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[6]")
	WebElement customerDropdown;

	@FindBy(xpath = "//td[text()='1100 Trinity Mills Condominium Owners Association']")
	WebElement customerDropdownValue;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-refresh']")
	WebElement refresh;


	// xpath For column Chooser
	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	//xpath for fullscreen option

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//*[@id='dx-col-1656']")
	WebElement communityColumn;

	//xapth for ExportToExcel
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-file-excel']")
	WebElement exportExcel;

	//xpath for ActionEdit		
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[6]")
	WebElement transactionDate;

	@FindBy(xpath = "//td[@data-value='2022/11/16']")
	WebElement todaysDate;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-runner']")
	WebElement actionButton;

	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
	WebElement actionEdit;

	@FindBy(xpath = "//i[@class='dx-icon fas fa-2x fa-check']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='dx-overlay-wrapper dx-loadpanel-wrapper dx-overlay-modal dx-overlay-shader']")
	WebElement successMessage;

	@FindBy(xpath = "(//td[@aria-describedby='dx-col-114'])[2]")
	WebElement description;

	//xpath for action delete No	
	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[2]")
	WebElement actionDelete;

	@FindBy(xpath = "//div[@aria-label='No']//div[@class='dx-button-content']")
	WebElement actionDeleteNo;

	//xpath for Expandandcollapse	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	public WebElement iSquare;


	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	public WebElement iSquarePlus;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement reset;


	@FindBy(xpath = "(//div[@class='dx-button-content'])[38]")
	public WebElement deleteAction;


	@FindBy(xpath = "//div[@class='dx-button-content'][contains(.,'Yes')]")
	WebElement actionDeleteYes;


	@FindBy(xpath = "//i[@class='dx-icon dx-icon-plus']")
	WebElement addButton;



	@FindBy(xpath = "(//div[@class='dx-button-content']//span[normalize-space()='Action'])[1]")
	WebElement addButtonNew;


	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[11]")
	WebElement custDropdown;

	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	WebElement custDropdownValue;

	@FindBy(xpath = "(//div[@class='dx-widget dx-button-mode-contained dx-button-normal dx-dropdowneditor-button'])[10]")
	WebElement itemtypeDropDown;

	@FindBy(xpath = "(//div[contains(text(),'1096 Miscellaneous')])[2]")
	WebElement itemTypedropdownValue;

	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[11]")
	WebElement addtransactionDate;

	@FindBy(xpath = "//td[@aria-label='Wednesday, November 16, 2022']")
	WebElement addtransactionDateToday;

	@FindBy(xpath = "//textarea[@autocomplete='off']")
	WebElement addDescription;

	@FindBy(xpath = "(//input[@inputmode='decimal'])[2]")
	WebElement addQuantity;


	@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[2]")
	WebElement importButton;

	@FindBy(xpath = "(//div[@class='dx-button-content'])[47]")
	WebElement browseButton;

	@FindBy(xpath = "(//input[contains(@class,'dx-texteditor-input')])[4]")
	WebElement toDate;

	
	public void BillingItemMangementpageLanding() {
		driver.navigate().to(billingItemManagementURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("======== Navigating Billing Item Management Page ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());

		System.out.println("To date is seen as ===> " + toDate.getAttribute("value"));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();

		//toDate.sendKeys(toDate.getAttribute("value"));
		toDate.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		toDate.sendKeys(formatter.format(date));
		Assert.assertEquals(actualURL, billingItemManagementURL);
	}


	public void verifyCustomerGridCount()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		entityDropdown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked On Entity Dropdown");

		entityDropdownValue.click();
		System.out.println("Clicked On Entity Dropdown Value");

//		itemTypeDropdown.click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
//		System.out.println("Clicked On Item Dropdown ");
//
//		itemTypeDropdownValue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
//		System.out.println("Clicked On Item Dropdown Value ");

		customerDropdown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked On Customer Dropdown ");

		customerDropdownValue.click();
		System.out.println("Clicked On Customer Dropdown Value");

		refresh.click();
		System.out.println("Clicked On Refresh Button");

		//div[@class='dx-scrollable-content']//table[@class='dx-datagrid-table dx-datagrid-table-fixed']//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines']

		WebElement TogetRows = driver.findElement(By.xpath("(//table[@class='dx-datagrid-table dx-datagrid-table-fixed'])[4]"));
		List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());


	}

	public boolean columnChooserClick() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String columnChooserList = "div[class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable'] ul[role='group'] li";

		wait.until(ExpectedConditions.elementToBeClickable(resetLayout));
		System.out.println("++++++In select Coloumn Chooser+++++++");
		wait.until(ExpectedConditions.elementToBeClickable(columnChooser));
		js.executeScript("arguments[0].click();", columnChooser);

		System.out.println("Clicked Column Chooser");

		List<WebElement> workOrdersColumnChooser = driver.findElements(By.cssSelector(columnChooserList));
		System.out.println("List size is: " + workOrdersColumnChooser.size());

		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));

		closeColChooser.click();

		System.out.println("Column Chooser closed");
		return true;
	}

	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		js.executeScript("arguments[0].click();", fullScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		if(normalScreenIcon.isDisplayed())
		{
			System.out.println("FullScreen Menu button clicked");
		}
		else
		{
			System.out.println("FullScreen Menu button not clicked");
		}

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		js.executeScript("arguments[0].click();", normalScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		if(fullScreenIcon.isDisplayed())
		{
			System.out.println("NormalScreen Menu button clicked");
		}
		else
		{
			System.out.println("NormalScreen Menu button not clicked");
		}

	}

	public void verifyExportToExcel()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		exportExcel.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Export to Excel Clicked ");

	}

	public void verifyActionEdit()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//refresh.click();
		//System.out.println("Clicked On Refresh Button");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		WebElement trDate = driver.findElement(By.xpath("//div[@class='dx-dropdowneditor-input-wrapper']//input[@aria-label='Filter cell']"));
		//trDate.click();

		//(//div[@class='dx-dropdowneditor-icon'])[6]
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();

		trDate.clear();
		trDate.sendKeys(formatter.format(date));
		trDate.sendKeys(Keys.ENTER);




		System.out.println("Clicked On Transaction Date for Action Edit");
		//todaysDate.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		//transactionDate.sendKeys("11/16/2022");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addButtonNew.click();	
		System.out.println("Clicked on for Action Button for Edit");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		actionEdit.click();
		System.out.println("Clicked on for Action Edit Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		saveButton.click();
		System.out.println("Clicked on for saved Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		
	}


	public void verifyActionDeleteNo()
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		refresh.click();
		System.out.println("Clicked On Refresh Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		//WebElement trDate = driver.findElement(By.xpath("(//input[contains(@class,'dx-texteditor-input')])[9]"));
		//addtransactionDate.click();
		//	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		//Date date = new Date();

		//trDate.clear();
		//trDate.sendKeys(formatter.format(date));
		//trDate.sendKeys(Keys.ENTER);


		//transactionDate.click();
		//System.out.println("Clicked On Transaction Date for Action Delete");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		//todaysDate.click();
		//	System.out.println("Selected Date for Action Delete");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));



		//transactionDate.sendKeys("11/16/2022");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		addButtonNew.click();	
		System.out.println("Clicked on for Action Button for Delete");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		actionDelete.click();
		System.out.println("Clicked on for Action Delete Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		//Alert alert = driver.switchTo().alert();  
		actionDeleteNo.click();
		System.out.println("Action Not Deleted");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

	}

	public void expandOptionClick() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		WebElement customer = driver.findElement(By.xpath("(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[1]")); 
		WebElement toGroupPanel = driver.findElement(By.xpath("//div[@class='dx-group-panel-message']"));

		Actions act=new Actions(driver);

		act.dragAndDrop(customer, toGroupPanel).build().perform();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		System.out.println("Performed Drag an Drop Operation");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		iSquare.click();
		System.out.println("Performed isquare Click");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		iSquarePlus.click();
		System.out.println("Performed isquarePlus Click");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		reset.click();
		System.out.println("Performed Reset Click");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

	}

	public void verifyActionDeleteYes()

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//  refresh.click();
		//System.out.println("Clicked On Refresh Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		addButtonNew.click();
		System.out.println("Clicked On Action Delete Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		actionDelete.click();
		System.out.println("Clicked on for Action Delete Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		actionDeleteYes.click();
		System.out.println(" Deleted the action Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}

	public void addBillingItem() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		addButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		custDropdown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked On customer Dropdown ");



		custDropdownValue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Selected  customer From Dropdown ");

		itemtypeDropDown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked On Item Dropdown ");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		itemTypedropdownValue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Selected Item Dropdown Value ");


		WebElement trDate = driver.findElement(By.xpath("//input[@autocomplete='off'][contains(@id,'billingItem.transactionDate')]"));
		//addtransactionDate.click();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();

		trDate.clear();
		trDate.sendKeys(formatter.format(date));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		//System.out.println("Clicked On Transaction Date for Action Edit");



		//addtransactionDateToday.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Selected Date for add");

		addQuantity.clear();

		addQuantity.sendKeys("1000");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Added Quantity");

		addDescription.sendKeys("Billing Item Descr. ");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Successfully added text");

		saveButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked on Save Button");
	}

	public void VerifyImport()	
	{
		String importTxt = "Import Billing Item Quantities";
		String strTestDataPath = "/src/test/resources/TestData/test.xlsx";
		WebElement importPopup;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		System.out.println("Clicked on Import button");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		importButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		//browseButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		System.out.println(System.getProperty("user.dir")+strTestDataPath);
		
		importPopup = driver.findElement(By.xpath("(//div[@class='dx-toolbar-items-container'])[9]"));
		System.out.println("Popup Title is : " + importPopup.getText());
		
		String expectedTitle = importPopup.getText();
		
		
		
		driver.findElement(By.xpath("//i[@class='dx-icon fas fa-times']")).click();
		
//		if (expectedTitle.equalsIgnoreCase(importTxt)) 
//			return true;
//		else 
//			return false;
		
	}

}
