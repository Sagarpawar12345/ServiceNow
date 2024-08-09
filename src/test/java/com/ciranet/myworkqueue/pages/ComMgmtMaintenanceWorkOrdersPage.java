package com.ciranet.myworkqueue.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ciranet.utilities.LoggerManager;

public class ComMgmtMaintenanceWorkOrdersPage {

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public ComMgmtMaintenanceWorkOrdersPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

	}

	String workOrdersURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/workorder";


	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	WebElement resetLayout;

	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;
	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy (xpath = "//span[normalize-space()='Closed Work Orders']")
	public WebElement closedWorkOrder;

	@FindBy (xpath = "//span[normalize-space()='Open Work Orders']")
	public WebElement openWorkOrder;

	@FindBy (xpath="//input[@role='spinbutton']")
	public WebElement DaysText;

	@FindBy (xpath = "//span[@class='dx-button-text']")
	public WebElement refreshButton;

	@FindBy (xpath = "//td[normalize-space()='Community: Plantation Oaks (Count = 1)']")
	public WebElement daysValidRecord;

	@FindBy (xpath = "(//span[@class='dx-button-text'][contains(.,'Action')])[1]")
	WebElement actionButton;

	@FindBy (xpath = "//span[normalize-space()='Manage Work Authorization']")
	WebElement manageWorkAuthorization;
	

	//@FindBy (xpath="(//div[@class=\"menu-text\"])[5]")
	@FindBy(xpath = "//div[contains(text(),'Manage Task References')]")
	public WebElement ManageTaskRef;

	@FindBy (xpath="//dx-button[@aria-label=\"Save\"]")
	public WebElement SaveButton;

	@FindBy (xpath="//dx-button[@aria-label=\"Close\"]")
	public WebElement CloseButton;

	@FindBy(xpath="//span[normalize-space()='Manage Proposals']")
	public WebElement ManageProposal;

	@FindBy(xpath="//span[text()='Close']")
	public WebElement ClosePopUp;

	@FindBy(xpath="//div[text()=' View/Edit ']")
	public WebElement ViewEdit;

	@FindBy(xpath="//span[text()='Save & Close']")
	public WebElement SaveClosePopUp;
	@FindBy(xpath = "//dx-button[@type='success']//span[@class='dx-button-text'][normalize-space()='Close']")
	public WebElement SaveClosePopUpError;
	
	@FindBy(xpath ="//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement responsibleIDDD;
	@FindBy(xpath ="//div[@class=\"dx-datagrid-content\"]//td[contains(text(),'Abhay Ranade')]")
	public WebElement responsibleIDValue;
	
	@FindBy(xpath="//span[text()='Close']")
	public WebElement PopupClose;
	
	@FindBy(xpath="//span[text()='Save']")
	public WebElement PopupSave;

	// for Add New Work Order
	
	    @FindBy (xpath ="//div[@class=\"button-multiple-icon-container\"]")
		public WebElement AddWorkOrder;

		@FindBy (xpath ="//i[@class=\"dx-icon fas fa-times\"]")
		public WebElement AddWorkOrderClose;

		@FindBy (xpath ="//dx-drop-down-box[@class='dx-show-invalid-badge dx-dropdownbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-outlined dx-widget drop-down-box dx-texteditor-empty dx-dropdowneditor dx-state-hover']//div[@class='dx-dropdowneditor-icon']")
		public WebElement AddWorkCommDrop;

		@FindBy (xpath = "(//input[@autocomplete='off'])[33]")
		public WebElement JobType;

		@FindBy (xpath = "(//div[@role='option'])[1]")
		public WebElement JobTypeValue;

		@FindBy (xpath="//div[@class='dx-datagrid-content']//td[normalize-space()='1100 Trinity Mills Condos']")
		public WebElement DropDownValue;

		@FindBy (xpath="(//input[@autocomplete=\"off\"])[35]")
		public WebElement ReferenceTypeText;

		@FindBy (xpath="(//div[@class=\"dx-dropdowneditor-icon\"])[9]")
		public WebElement ReferenceTypeDrop;

		@FindBy (xpath="//div[contains(text(),'Property')]")
		public WebElement ReferenceTypeDropValue;

		@FindBy (xpath="(//div[@class='dx-field-item-content dx-field-item-content-location-bottom'])[16]")
		public WebElement Reference;

		@FindBy (xpath="//i[@class=\"dx-icon dx-icon-more\"]")
		public WebElement Referencedrp;

		@FindBy (xpath="(//dx-button[@text=\"Select\"])[2]")
		public WebElement Select;

		@FindBy(xpath="//span[text()='Save & Close']")
		public WebElement SaveandClose;

		@FindBy (xpath="//div[text()='Adding the work order.']")
		public WebElement Closebtn;
		
		@FindBy(xpath="(//span[text()='Close'])[2]")
		public WebElement ClosePop;
		
		@FindBy(xpath="//span[text()='Save']") 
		public WebElement Save;
        
		@FindBy(xpath="(//span[text()='Close'])[1]")
		public WebElement Close;
		
		@FindBy(xpath="//div[contains(text(),'Change Status')]")
		public WebElement ChangeStatus;
		
		@FindBy(xpath="//div[contains(text(),'Initial Request')]")
		public WebElement InitialReq;
		
		@FindBy(xpath = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment4']")
		public WebElement loaderSeg4;

		
		
	public void WorkOrdersPageLanding() {
		System.out.println("======== Navigating to Work Orders ========");
		driver.navigate().to(workOrdersURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, workOrdersURL);
	}


	public boolean columnChooserClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(resetLayout));
		System.out.println("++++++In select Coloumn Chooser+++++++");
		wait.until(ExpectedConditions.elementToBeClickable(columnChooser));
		js.executeScript("arguments[0].click();", columnChooser);

		System.out.println("Clicked Column Chooser");

		List<WebElement> workOrdersColumnChooser = driver.findElements(By.cssSelector("div[class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable'] ul[role='group'] li"));
		System.out.println("List size is: " + workOrdersColumnChooser.size());

		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));

		closeColChooser.click();

		System.out.println("Column Chooser closed");
		return true;
	}

	public boolean expandOptionClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(expandIcon));
		js.executeScript("arguments[0].click();", expandIcon);
		System.out.println("Clicked on Expand icon");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean collapseOptionClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(collapseIcon));
		js.executeScript("arguments[0].click();", collapseIcon);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Clicked on Collapse icon");
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

	}

	public void ToolBarNormalScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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

	public void Switchtab() 
	{ 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		js.executeScript("arguments[0].click();", closedWorkOrder);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment7']")));

		System.out.println("Closed work order Tab Selected");
		if (closedWorkOrder.isEnabled()==true) 
		{
			System.out.println("Closed work order : True");
		}
		else
		{
			System.out.println("Closed work order : False");
		}

		js.executeScript("arguments[0].click();", openWorkOrder);

		System.out.println("Open work order Tab Selected");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-message'][normalize-space()='Loading...']")));

		if (openWorkOrder.isEnabled()==true) 
		{
			System.out.println("Open work order : True");
		}

		else
		{
			System.out.println("Open work order : False");
		}
	}


	public void ClosedDaysTextbox()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(closedWorkOrder));
		js.executeScript("arguments[0].click();", closedWorkOrder);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.println("Closed work order Tab Selected");
		if (closedWorkOrder.isEnabled()) 
		{
			System.out.println("Closed work order : True");
		}
		else
		{
			System.out.println("Closed work order : False");
		}


		DaysText.clear();

		DaysText.sendKeys("300");

		System.out.println("Entered 300 Days Filter");

		refreshButton.click();
		System.out.println("Clicked on Refresh");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(expandIcon));
		expandIcon.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Record Displayed with input 300 Days");
	
		collapseIcon.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void verifyManageWorkAuthorization() {

		System.out.println("In the verifyManageWorkAuthorization method");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		viewedit();
		manageWorkAuthorization.click();
		String manageWorkAuthPopup = driver.getWindowHandle();
		driver.switchTo().window(manageWorkAuthPopup);
		System.out.println("Inside manageWorkAuthorization PopUp");
		WebElement closeButton = driver.findElement(By.xpath("//dx-button[@title='Close']//span[@class='dx-button-text'][normalize-space()='Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
		System.out.println("verifyManageWorkAuthorization Pop Up Closed");
	}

	public void manageTaskReferences()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		ManageTaskRef.click();
		System.out.println("Clicked On Manage Task Reference");
		wait.until(ExpectedConditions.elementToBeClickable(PopupSave));
		PopupSave.click();
		System.out.println("Clicked On Save Button");
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		ManageTaskRef.click();
		System.out.println("Clicked On Manage Task Reference");
		wait.until(ExpectedConditions.elementToBeClickable(CloseButton));
		CloseButton.click();
		System.out.println("Clicked On Close Button");

	}

	public void ManageProposal() {

		System.out.println("In the verifyManageProposal method");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		viewedit();
		manageWorkAuthorization.click();
		ManageProposal.click();
		String managePropPopup = driver.getWindowHandle();
		driver.switchTo().window(managePropPopup);
		System.out.println("Inside manageProposalPopUP.Pop Up");
		WebElement closeButton = driver.findElement(By.xpath("//dx-button[@title='Close']//div[@class='dx-button-content']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();
		System.out.println("verifyManageProposal Pop Up Closed");
	}
	
	
	public void addWork() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div")));
	
		AddWorkOrder.click();
		System.err.println("Adding work Order");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		AddWorkCommDrop.click();
		DropDownValue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ReferenceTypeText);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		JobType.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		JobTypeValue.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		ReferenceTypeText.click();
		System.err.println("clicked on Reference Type Drop Down");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ReferenceTypeDropValue.click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		Referencedrp.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		Select.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
	}

	public void AddNewWorkOrderClick()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		addWork();
		SaveandClose.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Save and Close Button Clicked ");
		System.err.println("New Work Order Added");
	}

	public void ViewEditWorkOrder()
	{   		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		viewedit();
		//ResponsibleID
		SaveClosePopUp.click();	
//		SaveClosePopUpError.click(); //Error message Reported resolved
//		PopupClose.click();
		
		System.out.println("Clicked on Save and Close");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}
	

	
	public void closeAddWorkOrder()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		openWorkOrder.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Switched to Open Work Orders");
		wait.until(ExpectedConditions.elementToBeClickable(AddWorkOrder));
		AddWorkOrder.click();
		System.err.println("clicked on Add work Order");
		wait.until(ExpectedConditions.elementToBeClickable(Close));
		Close.click();
		System.err.println("Add work Order PopUp Closed");
	}
	

	
	public void ViewEditCloseWorkOrderClick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(expandIcon));
		expandIcon.click();
		viewedit();
		PopupClose.click();
		System.out.println("Clicked on Close");
	}
    
	private void viewedit() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		ViewEdit.click(); 
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}


	public void ViewEditSaveWorkOrderClick()
	{
		viewedit();
		//ResponsibleID
		PopupSave.click();
		System.out.println("Clicked on Save");
		//PopupClose.click(); //Defect Reported solved Cannot save Record
		PopupClose.click();
	}
	
	public void changeStatus() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		actionButton.click();
        Actions action = new Actions(driver);
		action.moveToElement(ChangeStatus).build().perform();
		System.out.println("Mouse Hover On Change Status");
		action.moveToElement(InitialReq).click().perform();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Mouse clicked On Initial Request");
	}
	
	
}
