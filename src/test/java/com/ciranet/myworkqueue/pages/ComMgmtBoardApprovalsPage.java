package com.ciranet.myworkqueue.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ciranet.basepage.BasePage;
import com.ciranet.utilities.LoggerManager;

public class ComMgmtBoardApprovalsPage extends BasePage
{
	private static final Exception AWTException = null;
	private WebDriver driver;

	public ComMgmtBoardApprovalsPage(WebDriver driver) 
	{
		super(driver);
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// Initializing Page Objects	
	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	WebElement myWorkQueueMenu;

	@FindBy(xpath = "//div[@title='Community Management']")
	WebElement communityManagementMenu;
	
	@FindBy(xpath = "//span[@class='cc-qa-release-menu']")
	WebElement boardApprovalsMenu;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-icon' and @title='Collapse All']")
	WebElement collapseIcon;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-icon' and @title='Expand All']")
	WebElement expandIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Jobs']")
	public WebElement closedjobs;

	@FindBy(xpath = "//span[normalize-space()='Active Jobs']")
	public WebElement activejobs;

	@FindBy(xpath = "//dx-button[@title='Community Search']")
	public WebElement communityIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement toolBarMenu;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	public WebElement communitySearchBox;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement communitySearchButton;

	@FindBy(linkText = "Amberwood")
	public WebElement amberwoodLink;

	@FindBy(xpath = "//div[@class='dx-button-content'] //i[@class='dx-icon fas fa-house-user']")
	public WebElement ownerIcon;

	@FindBy(xpath="(//div[@class='dx-texteditor-container'])[1]")
	public WebElement ownerSearchBox;

	@FindBy(linkText = "10604 Beard Ave")
	public WebElement ownerLink;

	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement ownerSearchButton;

	@FindBy(xpath="(//div[@class='dx-item dx-treeview-item'])[2]")
	public WebElement communityModule;

	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	public WebElement myWorkQueuemodule;

	@FindBy(xpath = "//span[@class='cc-qa-release-menu']")
	public WebElement boardApprovals;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[2]")
	public WebElement collections;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[2]")
	public WebElement collectionsId;

	@FindBy(xpath="(//div[@class='dx-checkbox-container'])[2]")
	public WebElement collectionsAction;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='Action For Multiple Selection']")
	public WebElement actionForMultipleSelection;

	@FindBy(xpath="(//div[@class='label-container'])[4]")
	public WebElement selectionReview;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='Action']")
	public WebElement actionButton;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='View AR Collections Details']") 
	public WebElement actionViewARCollectionsDetails;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[3]")
	public WebElement viewARCollectionsDetailsCancle;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[2]")
	public WebElement viewARCollectionsDetailsCancle1;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
	public WebElement collectionsOpen;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
	public WebElement architectural;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
	public WebElement architecturalId;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-running dx-theme-accent-as-text-color'])[1]")
	public WebElement architecturalAction;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='View ACC Details']")
	public WebElement architecturalViewACCDetails;

	@FindBy(xpath="//div[@class='icon-label-content']")
	public WebElement internalProjectNotes;

	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//textarea[@role='textbox'])[4]")
	public WebElement architecturalNotes;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-save'])[2]")
	public WebElement notesSave;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-save'])")
	public WebElement architecturalProjectSave;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[2]")
	public WebElement architecturalBoardApproval;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])")
	public WebElement architectural1;

	@FindBy(xpath="//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines' and @aria-rowindex='3']")
	public WebElement rowCount;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
	public WebElement invoice;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
	public WebElement invoiceId;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='Action']")
	public WebElement invoiceAction;

	@FindBy(xpath="//div[@class='dx-field-item-content dx-field-item-content-location-right']//span[text()='View AP Workflow Details']")
	public WebElement invoiceWorkflowDetails;

	@FindBy(xpath="//div[@class='dx-item dx-box-item']//i[@title='Invoice']")
	public WebElement invoicePDF;

	@FindBy(xpath="(//div[@class='dx-button-content']//span[text()='Close'])[2]")
	public WebElement invoiceClosePopUp;

	@FindBy(xpath="(//div[@class='dx-button-content']//span[text()='Close'])[1]")
	public WebElement invoiceClose;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='Cancel']")
	public WebElement workFlowCancel;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
	public WebElement invoiceGroupOpen;

	@FindBy(xpath="(//div[@class='dx-item-content dx-menu-item-content'])[23]")
	WebElement resetLayout;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-close']")
	public WebElement columnIcon;

	@FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[text()='Closed']")
	public WebElement closedTab;

	@FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[1]")
	public WebElement openTab;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
	public WebElement closeArchitectural;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
	public WebElement closeArchitecturalId; 

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-eye dx-theme-accent-as-text-color']")
	public WebElement closeViewButton;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='View ACC Details']")
	public WebElement closeAccDetails;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
	public WebElement closeProjectDetailClose;

	@FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[20]")
	public WebElement closeBoardApprovalCancel;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
	public WebElement closeApprovalClose;

	@FindBy(xpath="(//div[@class='dx-group-panel-item dx-datagrid-action dx-datagrid-drag-action'])[1]") 
	public WebElement process;

	@FindBy(xpath="(//div[@class='dx-scrollable-content'])[4]")
	public WebElement drop;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
	public WebElement closeInvoice;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
	public WebElement closeInvoiceId;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-eye dx-theme-accent-as-text-color']")
	public WebElement closeInvoiceView1;

	@FindBy(xpath="//div[@class='dx-button-content']//span[text()='View AP Workflow Details']")
	public WebElement closeAPWork;

	@FindBy(xpath="(//div[@class='dx-button-content'])[20]")
	public WebElement closeWorkFlow;

	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[2]")
	public WebElement closeWorkFlowFinal;

	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
	public WebElement closeBoardCancel;

	@FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
	public WebElement closeInvoiceClose;

	@FindBy(xpath = "//div[@class='dx-loadpanel-content-wrapper']")
	private WebElement loaderIcon;

	// method declaration
	public void boardApprovalsPageLanding()
	{
		clickElement(myWorkQueueMenu);
		clickElement(communityManagementMenu);
		clickElement(boardApprovalsMenu);
		waitForInvisibility(loaderIcon);
	}

	public void acionForMultipleSelection() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(collections);
		waitForInvisibility(loaderIcon);
		clickElementJS(collectionsId);
		waitForInvisibility(loaderIcon);
		clickElementJS(collectionsAction);
		waitForInvisibility(loaderIcon);
		clickElementJS(actionForMultipleSelection);

		if(selectionReview.isEnabled()==true) 
		{
			System.out.println("Action For Multiple Selection is Active");
		}
		else
		{
			System.out.println("Action For Multiple Selection is not Active");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(actionForMultipleSelection);
	}

	public void viewARCollectionsDetails() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(actionButton);
		waitForInvisibility(loaderIcon);
		clickElementJS(actionViewARCollectionsDetails);
		waitForInvisibility(loaderIcon);
		if(selectionReview.isDisplayed()==true) 
		{
			System.out.println("View AR Collection Page is Display");
		}
		else
		{
			System.out.println("View AR Collection Page is not Display");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(viewARCollectionsDetailsCancle);
		waitForInvisibility(loaderIcon);
		clickElementJS(viewARCollectionsDetailsCancle1);
		waitForInvisibility(loaderIcon);
		clickElementJS(collectionsOpen);
	}

	public void architecturalViewACCDetails() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(architectural);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalId);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalAction);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalViewACCDetails);
		waitForInvisibility(loaderIcon);
		clickElementJS(internalProjectNotes);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalNotes);
		architecturalNotes.sendKeys("Testing");
		waitForInvisibility(loaderIcon);
		clickElementJS(notesSave);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalProjectSave);
		waitForInvisibility(loaderIcon);
		clickElementJS(architecturalBoardApproval);
		waitForInvisibility(loaderIcon);
		List<WebElement> xpath = driver.findElements(By.xpath("//td[@class='dx-command-select dx-editor-cell dx-editor-inline-block']"));
		int xpathCount = xpath.size();
		System.out.println("Total Count: " + xpathCount);
		clickElementJS(architectural1);
	}

	public void invoiceViewAPWorkflowDetails() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(invoice);
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceId);
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceAction);
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceWorkflowDetails);
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceClosePopUp);
		if(invoicePDF.isEnabled()==true) 
		{
			System.out.println("Invoice Work flow Details Page is Display");
		}
		else 
		{
			System.out.println("Invoice Work flow Details Page is not Display");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceClose);
		waitForInvisibility(loaderIcon);
		clickElementJS(workFlowCancel);
		waitForInvisibility(loaderIcon);
		clickElementJS(invoiceGroupOpen);
	}

	public void toolBarFullScreen() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(fullScreenIcon);
		if(normalScreenIcon.isDisplayed())
		{
			System.out.println("FullScreen icon button clicked");
		}
		else
		{
			System.out.println("FullScreen icon button not clicked");
		}	
	}

	public void toolBarNormalScreen() 
	{
		waitForInvisibility(loaderIcon);
		waitForElementToBeClickable(normalScreenIcon);
		clickElementJS(normalScreenIcon);
		if(fullScreenIcon.isDisplayed())
		{
			System.out.println("NormalScreen icon button clicked");
		}
		else
		{
			System.out.println("NormalScreen icon button not clicked");
		}
	}

	public boolean expandOptionClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(expandIcon);
		System.out.println("Clicked on Expand icon");
		if(architecturalAction.equals(architecturalAction)) 
		{
			System.out.println("Expand icon is working");
		}
		else 
		{
			System.out.println("Expand icon is not working");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(collapseIcon);
		System.out.println("Clicked on Collapse icon");
		return true;
	}

	public void switchTab() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(closedTab);
		System.out.println("Switched to Close Tab");
		waitForInvisibility(loaderIcon);
		clickElementJS(openTab);
		System.out.println("Switched to Open Tab");
	}

	public boolean closedtabArchitecturalViewACCDetailsbutton() 
	{
		String Title="Project Details";
		waitForInvisibility(loaderIcon);
		clickElementJS(closedTab);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeArchitectural);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeArchitecturalId);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeViewButton);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeAccDetails);
		if(Title.equals("Project Details")) 
		{
			System.out.println(" Architectural Request Approval pop-up window displayed");
		}
		else 
		{
			System.out.println(" Architectural Request Approval failed to load pop-up window");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(closeProjectDetailClose);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeBoardApprovalCancel);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeApprovalClose);
		return true;
	}

	public void closedtabInvoiceviewDetails() 
	{
		waitForInvisibility(loaderIcon);
		clickElementJS(closeInvoice);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeInvoiceId);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeInvoiceView1);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeAPWork);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeWorkFlow);
		String Label=driver.getTitle();
		System.out.println("Page title is:"+ Label);
		if(Label.equals("Amberwood")) 
		{
			System.out.println("AAP Workflow pop-up window displayed");
		}
		else 
		{
			System.out.println("AAP Workflow pop-up window failed to load");
		}
		waitForInvisibility(loaderIcon);
		clickElementJS(closeWorkFlowFinal);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeBoardCancel);
		waitForInvisibility(loaderIcon);
		clickElementJS(closeInvoiceClose);
	}

	public boolean columnChooserClick() 
	{
		waitForInvisibility(loaderIcon);
		clickElement(resetLayout);
		clickElementJS(columnChooser);
		clickElement(closeColChooser);
		System.out.println("Column Chooser closed");
		return true;
	}
}
