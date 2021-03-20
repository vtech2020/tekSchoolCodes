package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopTestStepDefinitions extends Base {
	
	DesktopPageObj desktopPage = new DesktopPageObj();
	
	@Then("^User should see all items are present in Desktop page$")
				public void all_items_are_present_in_Desktop_page() throws Throwable {
		
						Assert.assertTrue(desktopPage.appleCinema30LinkTextIsDisplayed());
						logger.info("appleCinema30 is checked");
						WebDriverUtility.screenShot();
						
						Assert.assertTrue(desktopPage.CanonEOS5DTextLinkIsDisplayed());
						logger.info("CanonEOS5DT is checked");
						
						Assert.assertTrue(desktopPage.HPLP3065TextLinkIsDisplayed());
						logger.info("HPLP3065 is checked");
						
						Assert.assertTrue(desktopPage.HTCTouchHDTextLinkIsDisplayed());
						logger.info("HTCTouchHD is checked");
						
						Assert.assertTrue(desktopPage.iPhoneTextLinkIsDisplayed());
						logger.info("iPhoneTextLink is checked");
									
						Assert.assertTrue(desktopPage.iPodClassicTextLinkIsDisplayed());
						logger.info("iPodClassic is checked");
						
						Assert.assertTrue(desktopPage.MacBookAirTextLinkIsDisplayed());
						logger.info("MacBookAir is checked");
						
						Assert.assertTrue(desktopPage.PalmTreoProTextLinkIsDisplayed());
						logger.info("PalmTreoPro is checked");
						
						Assert.assertTrue(desktopPage.Product8TextLinkIsDisplayed());
						logger.info("Product8 is checked");
						
						Assert.assertTrue(desktopPage.samsungSyncMaster941BwTextLinkIsDisplayed());
						logger.info("samsungSyncMaster941Bw is checked");
						
						Assert.assertTrue(desktopPage.SonyVAIOTextLinkIsDisplayed());
						logger.info("SonyVAIO is checked");
						
						WebDriverUtility.screenShot();
					
						
												
				}
	
		
	@And("^User click ADD TO CARToption on HP LP3065 item$")
			public void user_click_ADD_TO_CARToption_on_HP_LP_item() throws Throwable {
	    			desktopPage.clickOnAddToCartHPLP3065();
	    			logger.info("User clicked on Add to cart option on HP LP3065");    
	}
	
	

	@And("^User select quantity '(.+)'$")
			public void user_select_quantity(String quantity) throws Throwable {
					desktopPage.EnterQantityHPLP3065(quantity);
					logger.info("User selected quantity: " + quantity);
					WebDriverUtility.screenShot();
					
	}

	@And("^User click add to Cart button$")
			public void user_click_add_to_Cart_button() throws Throwable {
	    			desktopPage.clickOnAddToCart_For_HPLP3065_Page_Btn();
	    			logger.info("User clicked on Add To Cart on HP LP3065 page");
	    			WebDriverUtility.screenShot();
	}
	

	@Then("^User should see a message Success: You have added HP LP3065 to your shopping cart!$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart() throws Throwable {
			Assert.assertTrue(desktopPage.addToCart_For_HPLP3065_outcome());
			WebDriverUtility.screenShot();
			logger.info("Success message for HP LP3065 added to cart is displayed");
			
			/*String message=desktopPage.addToCart_For_HPLP3065_outcomeText();
			logger.info("Success message is:" + message);
			Assert.assertEquals("Success: You have added HP LP3065 to your shopping cart!", message);
			logger.info("Success message for HP LP3065 is correct");*/
			
			//Success: you have added HP LP3065 to your Shopping cart!
		
			
	}
	
	
	// Canon EOS 5D
	
	@And("^User click ADD TO CART option on Canon EOS5D item$")
		public void user_click_ADD_TO_CARToption_on_Canon_EOS_D_item() throws Throwable {
			desktopPage.clickOnAddToCart_CanonEOS5D_Btn();
			logger.info("User clicked on Add to cart option on Canon EOS 5D");
	}
	
	/* @And("^User click ADD TO CART option on Canon EOS5D item&")
			public void user_click_ADD_TO_CARToption_on_Canon_EOS_D_item() throws Throwable {
				desktopPage.clickOnAddToCart_CanonEOS5D_Btn();
				logger.info("User clicked on Add to cart option on Canon EOS 5D"); 
	} */

	@And("^User select color from dropdown Red$")
			public void user_select_color_from_dropdown_Red() throws Throwable {
				desktopPage.select_Red_CanonEOS5D();;
				logger.info("User chose red color forCanon EOS 5D");
				WebDriverUtility.screenShot();
	}
		
	@And("^User select quantity '(.+)' CanonEOS5D$")
			public void user_select_quantity_CanonEOS5D(String quantity) throws Throwable {
				desktopPage.enter_Qantity_CanonEOS5D(quantity);
				logger.info("User selected quantity for CanonEOS5D: " + quantity);
				WebDriverUtility.screenShot();
	}
				

	@And("^User click add to Cart button CanonEOS5D$")
			public void user_click_add_to_Cart_buttont() throws Throwable {
	    		desktopPage.clickOnAddToCart_For_CanonEOS5D_Page_Btn();
	    		logger.info("User clicked on Add to cart option on Canon EOS 5D Page"); 
	}

	@Then("^User should see a message Success: You have added Canon EOS 5D to your shopping cart!$")
			public void user_should_see_a_message_Success_you_have_added_CanonEOS5D_to_your_Shopping_cart() throws Throwable {
				Assert.assertTrue(desktopPage.addToCart_For_CanonEOS5D_outcome());
				WebDriverUtility.screenShot();
				logger.info("Success message forCanon EOS 5D added to cart is displayed");
}
	
	//review case
	
	@And("^User click on Canon EOS 5D item$")
			public void user_click_Canon_EOS5D() throws Throwable {
				desktopPage.clickOn_CanonEOS5D_photo();
				logger.info("User clicked on Canon EOS 5D item");
				WebDriverUtility.screenShot();
	}
	
	@And("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
			desktopPage.clickOnWriteReview();
			logger.info("User clicked on write a review link");
			WebDriverUtility.screenShot();
	    
	}

	@And("^user fill the review information with name '(.+)' and review '(.+)'$")
	public void user_fill_the_review_information(String yourname, String yourReview) throws Throwable {
			desktopPage.writeNameRevievField(yourname);
			logger.info("user wrote the name in the review field");
			desktopPage.writeRevievField(yourReview);
			logger.info("user wrote review");
			WebDriverUtility.screenShot();
	   
	}
	
		
	@And("^user fills Rating field Bad or Good$")
			public void user_fills_Rating_field() throws Throwable {
			     desktopPage.clickOn_RatingRadioBtn_Good();
			     logger.info("user clicked on review button");
				 WebDriverUtility.screenShot();
	}
				 
	@And("^User click on Continue Button$")
			public void user_click_Continue_Button () throws Throwable {
				desktopPage.clickOn_Continue_Btn();
				logger.info("user clicked on continue button");
				
	}
	
	@Then("^User should see a message with Thank you for your review. It has been submitted to the webmaster for approval.$")
			public void should_see_review_approval_message ( ) throws Throwable {
			Assert.assertTrue(desktopPage.review_For_CanonEOS5D_outcome());
			WebDriverUtility.screenShot();
			logger.info("Success message for Canon review is checked");
	}
}
	
	
