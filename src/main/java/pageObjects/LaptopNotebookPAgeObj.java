package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

	public class LaptopNotebookPAgeObj extends Base {
	
			public LaptopNotebookPAgeObj() {
		
		PageFactory.initElements(driver, this);	
		
	
}
		
	// Scenario: Add and Remove a Mac book from Cart
	
	@FindBy(xpath="//img[@alt='MacBook']")
	private WebElement MacBookPhoto;
	
	// button[@id='button-cart']
	
	@FindBy(id="button-cart")
	private WebElement MacBookAddCartBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement MacBookSuccessMsg;
			
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement MacBookCartBtn;
			
	@FindBy(xpath="//i[@class='fa fa-times']")
	private WebElement MackBookCartRedX;
	
	@FindBy(xpath="//p[contains(text(),'cart is empty')]")
	private WebElement MacBookCartEmptyMsg;
	
	
	//Scenario Comparison chart
	
	@FindBy(xpath="//button[contains(@onclick, \"compare.add('43')\")]")
	private WebElement MacBookCompareIcon;
	
	@FindBy(xpath="//button[contains(@onclick, \"compare.add('44')\")]")
	private WebElement MacBookAirCompareIcon;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement productComparisonSuccessMsg;
		
	@FindBy(xpath="//a[contains(text(),'product comparison')]")
	private WebElement productComparisonLink;
	
	@FindBy(xpath="//div[@id='content']")
	private WebElement productComparisonChart;
	
	@FindBy(xpath="//h1[contains(text(),'Product Comparison')]")
	private WebElement productComparisonChartTitle;
	
	@FindBy(xpath="//a[contains(@href, 'id=43')]")
	private WebElement ComparisonChartMacbookColumn;
	
	@FindBy(xpath="//a[contains(@href, 'id=43')]")
	private WebElement ComparisonChartMacbookAirColumn;
		
	
	//scenario adding to wish list
	
	@FindBy(xpath="//button[contains(@onclick, \"wishlist.add('46')\")]")
	private WebElement SonyVAIOAddWishListIcon;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageAddToWishList;
	
	//scenario checking price tag
	
	@FindBy(xpath="//img[@alt='MacBook Pro']")
	private WebElement MacBookProIcon;
	
	@FindBy(xpath="//h2[contains(text(),'$2,000.00')]")
	private WebElement MacbookProPriceTag;
	
	
	
	
	//methods for Add/Remove Mackbook Cart
	
	
	public void clickOn_MacBookPhoto() {
		WebDriverUtility.clickOnElement(MacBookPhoto);
	}
	
	
	public void clickOn_MacBookAddCartBtn() {
		WebDriverUtility.clickOnElement(MacBookAddCartBtn);
	}
	
	
	public boolean addToCart_For_MacBook_outcome() {
		boolean successMessage = MacBookSuccessMsg.isDisplayed();
		return successMessage;
	}
	
	
	public String  MacBookCartBtn_text_add() {
		String cartMsg = WebDriverUtility.getText(MacBookCartBtn);
		return cartMsg;
		
	}
		
		//boolean successMessage = cartMsg.contentEquals("1 item(s)-$602.00");
		//return successMessage;
	

	public void clickOn_MacBook_CartBtn() {
		WebDriverUtility.clickOnElement(MacBookCartBtn);
	}
	
	
	public void clickOn_MackBookCartRedX() {
		WebDriverUtility.clickOnElement(MackBookCartRedX);
	}
	
	
	public boolean MacBookCartBtn_info_remove() {
		String cartMsg = WebDriverUtility.getText(MacBookCartBtn);
		boolean successMessage = cartMsg.contains("$0.00");
		return successMessage;
	}
	
	
	
	//methods for comparison chart test
	
	
		public void clickOn_MacBookCompareIcon() {
			WebDriverUtility.clickOnElement(MacBookCompareIcon);
		}
		
		
		public void clickOn_MacBookAirCompareIcon() {
			WebDriverUtility.clickOnElement(MacBookAirCompareIcon);
		}
		
		
		public boolean productComparisonSuccessMsg() {
				String message = productComparisonSuccessMsg.getText();
				boolean successMessage = message.contains("Success: You have added");
				return successMessage;
		} 
		
		
		public void clickOn_comparisonLink() {
			WebDriverUtility.clickOnElement(productComparisonLink);
		}
		
	
		
		public boolean productComparisonChart(){
			boolean successMessage;
			if (productComparisonChart.isDisplayed()&&ComparisonChartMacbookColumn.isDisplayed()&&ComparisonChartMacbookAirColumn.isDisplayed()) {
				successMessage=true;
			} else successMessage = false;
			return successMessage;
		}
		
		
		//scenario adding to wish list
		
				
		
		public void clickOn_SonyVAIO_AddToWishList() {
			WebDriverUtility.clickOnElement(SonyVAIOAddWishListIcon);
		}
		
		public boolean SuccessMsg_AddToWishList(){
			String message = successMessageAddToWishList.getText();
			boolean successMessage = message.contains("You must login or create an account");
			return successMessage;
		}
	
		
		//methods for checking price tag
						
		public void clickOn_MacBookPro() {
			WebDriverUtility.clickOnElement(MacBookProIcon);
		}
		
		public boolean PriceTag_MacbookPro(){
			String message = MacbookProPriceTag.getText();
			boolean successMessage = message.contains("$2,000.00");
			return successMessage;
		}
	
	
	
	
	
	

			
			
			
	
			
			
			
			
			
			
			
			
}
