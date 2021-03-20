package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObj extends Base {
	
		public DesktopPageObj() {
		
				PageFactory.initElements(driver, this);	
				
			
}

		
			
		
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
		private WebElement appleCinema30Picture;
		
		@FindBy(xpath="//a[contains(text(),'Apple Cinema 30')]")
		private WebElement appleCinema30LinkText;
		
		@FindBy(xpath="//p[contains(text(),'The 30-inch Apple Cinema HD Display delivers an am')]")
		private WebElement appleCinema30DescriptionText;
		
		@FindBy(xpath="//span[@class='price-new' and @xpath='1']")
		private WebElement appleCinema30PriceNew;
		
		@FindBy(xpath="//span[@class='price-old' and @xpath='1']")
		private WebElement appleCinema30PriceOld;
		
		@FindBy(xpath="//span[@class='price-tax' and @xpath='1']")
		private WebElement appleCinema30PriceTax;
		
		
		
				
		@FindBy(xpath="//a[contains(text(),'Canon EOS 5D')]")
		private WebElement CanonEOS5DTextLink;
		
		@FindBy(xpath="//a[contains(text(),'HP LP3065')]")
		private WebElement HPLP3065TextLink;
		
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
		private WebElement HPLP3065AddToCartBtn;
				
		
		@FindBy(xpath="//a[contains(text(),'HTC Touch HD')]")
		private WebElement HTCTouchHDTextLink;
		
		@FindBy(xpath="//a[contains(text(),'iPhone')]")
		private WebElement iPhoneTextLink;
		
		@FindBy(xpath="//a[contains(text(),'MacBook')]")
		private WebElement iPodClassicTextLink;
		
		@FindBy(xpath="//a[contains(text(),'MacBook Air')]")
		private WebElement MacBookAirTextLink;
		
		@FindBy(xpath="//a[contains(text(),'Palm Treo Pro')]")
		private WebElement PalmTreoProTextLink;
		
		@FindBy(xpath=" //a[contains(text(),'Product 8')]")
		private WebElement Product8TextLink;
		
		@FindBy(xpath="//a[contains(text(),'Samsung SyncMaster 941BW')]")
		private WebElement samsungSyncMaster941BwTextLink;
		
		@FindBy(xpath="//a[contains(text(),'Sony VAIO')]")
		private WebElement SonyVAIOTextLink;
		
		
		
		
		//elements for the page of HP LP3065
		
		@FindBy(id="input-quantity")
		private WebElement QtyHPLP3065Field;
		
		@FindBy(id="button-cart")
		private WebElement AddToCart_For_HPLP3065_Page_Btn;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement addToCart_For_HPLP3065_successMessageAlert;
		
		
		//elements for Canon EOS 5D
		
		@FindBy(xpath="//img[@title='Canon EOS 5D']")
		private WebElement CanonEOS5D_photo;
		
		@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
		private WebElement addToCart_CanonEOS5D_Btn;
		
		 		
		@FindBy(id="input-option226")
		private WebElement CanonEOS5D_Select_Color_DropDown;
		
										
		@FindBy(id="input-quantity")
		private WebElement quantity_CanonEOS5D_Field;
		
		@FindBy(xpath="//button[@id='button-cart']")
		private WebElement addToCart_For_CanonEOS5D_Page_Btn;
		
		@FindBy(xpath="//body/div[@id='product-product']/div[1]")
		private WebElement addToCart_For_CanonEOS5D_successMessageAlert;
		
		
		//Elements for Canon EOS 5D review case
		
		@FindBy(xpath="//a[contains(text(), 'Write a review')]")
		private WebElement WriteReviewLink_CanonEOS5D;
				
		@FindBy(id="input-name")
		private WebElement yourNameField_Review;
		
		////textarea[@id='input-review']
		
		@FindBy(id="input-review")
		private WebElement yourReviewField;
						
		@FindBy(xpath="//input[contains(@value, '5') and @name='rating']")
		private WebElement ratingRadioBtnGood;
		
		//button[@id='button-review']
		@FindBy(id="button-review")
		private WebElement continueBtnReview;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement SuccessMessageReview;
		
		
		//methods to check if the product is present on the page
		
		public boolean appleCinema30LinkTextIsDisplayed() {
			
			if(appleCinema30LinkText.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		
		
		public boolean CanonEOS5DTextLinkIsDisplayed() {
			
			if(CanonEOS5DTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		public boolean HPLP3065TextLinkIsDisplayed() {
			
			if(HPLP3065TextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
				
		public boolean HTCTouchHDTextLinkIsDisplayed() {
			
			if(HTCTouchHDTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		
		public boolean iPhoneTextLinkIsDisplayed() {
			
			if(HPLP3065TextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		

		public boolean iPodClassicTextLinkIsDisplayed() {
	
			if(iPodClassicTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		

		public boolean MacBookAirTextLinkIsDisplayed() {
	
			if(MacBookAirTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}

		public boolean PalmTreoProTextLinkIsDisplayed() {
	
			if(PalmTreoProTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
	}
		

		public boolean Product8TextLinkIsDisplayed() {
	
			if(Product8TextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		
		

		public boolean samsungSyncMaster941BwTextLinkIsDisplayed() {
	
			if(samsungSyncMaster941BwTextLink.isDisplayed()) 
				return true;
			else 
				return false;	
		}
		

		public boolean SonyVAIOTextLinkIsDisplayed() {
	
			if(SonyVAIOTextLink.isDisplayed()) 
				return true;
			else 
		return false;	
		}
		
		
				
		public void clickOnAddToCartHPLP3065() {
			WebDriverUtility.clickOnElement(HPLP3065AddToCartBtn);
		}

		
		public void EnterQantityHPLP3065(String quantity) {
			if ( QtyHPLP3065Field.isEnabled()) {
			WebDriverUtility.clearText(QtyHPLP3065Field);
			WebDriverUtility.enterValue(QtyHPLP3065Field, quantity);
			} else System.out.println("Quantity field for HPLP3065 is not displayed");

		}
		
		
		public void clickOnAddToCart_For_HPLP3065_Page_Btn() {
			WebDriverUtility.clickOnElement(AddToCart_For_HPLP3065_Page_Btn);
		}
		
		
		public boolean addToCart_For_HPLP3065_outcome() {
				boolean successMessage = addToCart_For_HPLP3065_successMessageAlert.isDisplayed();
				return successMessage;

			}
		
		public String addToCart_For_HPLP3065_outcomeText() {
			    String text = addToCart_For_HPLP3065_successMessageAlert.getText();
			    return text;
		}
		
		
		
		
		//methods for Canon EOS 5D
		
		
		
		public void clickOnAddToCart_CanonEOS5D_Btn() {
			WebDriverUtility.clickOnElement(addToCart_CanonEOS5D_Btn);
		}

		
		
		public void select_Red_CanonEOS5D() {
			//WebDriverUtility.clickOnElement(WebElement CanonEOS5D_Select_Color_DropDown);
			WebDriverUtility.selectByVisibleText(CanonEOS5D_Select_Color_DropDown, "Red");
		
		}
		
		
		public void enter_Qantity_CanonEOS5D(String quantity) {
			if (quantity_CanonEOS5D_Field.isEnabled()) {
			WebDriverUtility.clearText(quantity_CanonEOS5D_Field);
			WebDriverUtility.enterValue(quantity_CanonEOS5D_Field, quantity);
			} else System.out.println("Quantity field for CanonEOS5D is not displayed");
			
		}
		
	
		public void clickOnAddToCart_For_CanonEOS5D_Page_Btn() {
			WebDriverUtility.clickOnElement(addToCart_For_CanonEOS5D_Page_Btn);
		}

		
		public boolean addToCart_For_CanonEOS5D_outcome() {
			boolean successMessage = addToCart_For_CanonEOS5D_successMessageAlert.isDisplayed();
			return successMessage;

		}
	
		public String addToCart_For_CanonEOS5D_outcomeText() {
		    String text = addToCart_For_CanonEOS5D_successMessageAlert.getText();
		    return text;
	}
		
		
		
		// methods for for Canon EOS 5D review case
		
		public void clickOn_CanonEOS5D_photo() {
			WebDriverUtility.clickOnElement(CanonEOS5D_photo);
		}
		
		public void clickOnWriteReview() {
			WebDriverUtility.clickOnElement(WriteReviewLink_CanonEOS5D);
		}
		
		public void writeNameRevievField(String yourname ) {
			WebDriverUtility.clickOnElement(yourNameField_Review);
			yourNameField_Review.sendKeys(yourname);
		}
		
		public void writeRevievField(String yourReview ) {
			WebDriverUtility.clickOnElement(yourReviewField);
			yourReviewField.sendKeys(yourReview);
		}
	
	
			
		public void clickOn_RatingRadioBtn_Good() {
			WebDriverUtility.clickOnElement(ratingRadioBtnGood);
		}
		
		
		public void clickOn_Continue_Btn() {
			WebDriverUtility.clickOnElement(continueBtnReview);
		}
		
		
		
		
		public boolean review_For_CanonEOS5D_outcome() {
			boolean successMessage = SuccessMessageReview.isDisplayed();
			return successMessage;
		}

}

		
		
		





