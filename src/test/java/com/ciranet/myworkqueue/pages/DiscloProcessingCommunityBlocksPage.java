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

public class DiscloProcessingCommunityBlocksPage 
{
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	   public DiscloProcessingCommunityBlocksPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Community Blocks Page Objects ======== ");

	}

	String CommunityBlocksURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/community-blocks";

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


	//xpath for Expandandcollapse	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
	public WebElement iSquare;


	@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
	public WebElement iSquarePlus;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
	public WebElement reset;


	//xpath for Switching tabs
	//span[normalize-space()='Expired']
	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content']//span[@class='dx-tab-text'])[2]")
	public WebElement expired;


	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content']//span[@class='dx-tab-text'])[1]")
	public WebElement active;


	//xpath for Add Block

	@FindBy(xpath = "//span[normalize-space()='Add Block']") //  "//div[@class='cc-text-left dx-template-wrapper dx-button-content']")
	public WebElement addBlockButton;
	
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[9]") //div[@class='dx-dropdowneditor-icon'])[3]
	public WebElement dropdown;


	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	public WebElement dropdownValue;

	@FindBy(xpath = "(//div[@class='dx-field-item-content dx-field-item-content-location-bottom']//input[@class='dx-texteditor-input'])[8]")
	public WebElement inputText;



	@FindBy(xpath = "//div[@class='dx-field-item-content dx-field-item-content-location-bottom']//textarea[@class='dx-texteditor-input']")
	public WebElement blockText;

	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon']")
	public WebElement cancel;

	@FindBy(xpath = "//div[@class='tox-edit-area']//iframe[@class='tox-edit-area__iframe']")  //div[@class='tox-edit-area']//iframe[@class='tox-edit-area__iframe']
	public WebElement fulfillNotes;


	@FindBy(xpath = "//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon']")
	public WebElement saveButton;


	//xpath for Edit Option
	@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon']//div[@class='dx-button-content'])[1]")
	public WebElement editButton;

	@FindBy(xpath = "(//div[@class='dx-texteditor-input-container']//input[@class='dx-texteditor-input'])[5]")
	public WebElement communityFilter;


	@FindBy(xpath = "//div[@class='dx-datagrid-filter-panel-clear-filter']")
	public WebElement clearButton;


	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-right']")
	WebElement collapseIcon;
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-angle-double-left']")
	WebElement expandIcon;

	public void CommunityBlocksPageLanding()
	{
		
		driver.navigate().to(CommunityBlocksURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
//		try {
//			Thread.sleep(64000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("======== Navigating Community Blocks Page ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, CommunityBlocksURL);
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
		//try {
		//	Thread.sleep(3000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Export to Excel Clicked ");

	}


	public void expandOptionClick() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		WebElement id = driver.findElement(By.xpath("(//div[@class='dx-datagrid-text-content dx-text-content-alignment-left dx-header-filter-indicator'])[1]")); 
		WebElement toGroupPanel = driver.findElement(By.xpath("//div[@class='dx-group-panel-message']"));

		Actions act=new Actions(driver);

		act.dragAndDrop(id, toGroupPanel).build().perform();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		System.out.println("Performed Drag an Drop Operation");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		//try {
		//	Thread.sleep(5000);
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}

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

	public void SwitchingTabs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", expired);
		System.out.println("Switch to Expired Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", active);
		System.out.println("Switch to Active Tab");

	}


	public void AddBlock()

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		addBlockButton.click();
		System.out.println("Add Button Clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='dx-loadpanel-content-wrapper'])[2]")));

		js.executeScript("arguments[0].click();", dropdown);
		//	dropdown.click();
		System.out.println("Dropdown Button Clicked");

		dropdownValue.click();
		System.out.println("DropdownValue is Selected");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		inputText.click();
		inputText.sendKeys("New Community Added");
		System.out.println("Community added sucessfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		blockText.sendKeys("Testing Purpose");
		System.out.println("Block Text added sucessfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", cancel);
		//js.executeScript("window.scrollBy(0,250)", "cancel");
		System.out.println("scrolled sucessfully");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));



		//WebElement iframe=driver.findElement(By.tagName("iframe"));
		//	driver.switchTo().frame(iframe);

		//fulfillNotes.sendKeys("Testing");
		//	System.out.println("Switch to iframe sucessfully");

		fulfillNotes.click();
		System.out.println("Fulfill notes textbox clicked");

		Actions act = new Actions(driver);
		act.sendKeys(fulfillNotes,"Testing").build().perform();

		// fulfillNotes.sendKeys("testing");
		System.out.println("Notes Added in Fulfill Textbox");

		saveButton.click();
		System.out.println("community saved sucessfully");


	}


	public void verifyActiveEditButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		editButton.click();
		System.out.println("Edit Button Clicked Sucessfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", cancel);
		//js.executeScript("window.scrollBy(0,250)", "cancel");
		System.out.println("scrolled sucessfully");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		saveButton.click();
		System.out.println("Saved Button Clicked for Edit Community");
	}

	public void verifyExpiredEditButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", expired);
		
		//expired.click();
		System.out.println("Clicked On Expired Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		editButton.click();
		System.out.println("Clicked On Expired  Edit Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", saveButton);
		//js.executeScript("window.scrollBy(0,250)", "cancel");
		System.out.println("scrolled sucessfully");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		saveButton.click();
		System.out.println("Community Edited sucessfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		active.click();
		System.out.println("Switched To Active Tab sucessfully");

	}


	public void verifyCommunityFilter()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		communityFilter.click();
		communityFilter.sendKeys("1100");
		System.out.println("Community Filter Selected");

		clearButton.click();
		System.out.println("Cleared Community Filter");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	}






}




