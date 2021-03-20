package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.LaptopNotebookPAgeObj;
import utilities.WebDriverUtility;

public class LaptopNotebookStepDefinitions extends Base {
	
		LaptopNotebookPAgeObj laptopNotebookPage = new LaptopNotebookPAgeObj();
		
		@And("^Userclick on MacBook item$")
		public void userclick_on_MacBook_item() throws Throwable {
			laptopNotebookPage.clickOn_MacBookPhoto();
			logger.info("User clicked on MacBook item");    
		}

		@And("^User click add MacBook to Cart button$")
		public void user_click_add_MacBook_to_Cart_button() throws Throwable {
			laptopNotebookPage.clickOn_MacBookAddCartBtn();
			logger.info("User clicked on add MacBook to Cart button");    
		}

		@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
		public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
			Assert.assertTrue(laptopNotebookPage.addToCart_For_MacBook_outcome());
			logger.info("add MacBook to Cart success message is checked");
			WebDriverUtility.screenShot();
		}

		
		@And("^User should see in the cart one item-602.00$")
		public void user_should_see_in_the_cart_one_item_s_$() throws Throwable {
			laptopNotebookPage.MacBookCartBtn_text_add();
			String message = "$602.00";
				if (laptopNotebookPage.MacBookCartBtn_text_add().contains(message)) {
				logger.info("MacBook Cart text is checked");
				} else {
				Assert.assertTrue(false);
				logger.info("MacBook Cart text does not match");
				}
			WebDriverUtility.screenShot();	
		}
					
			
			
		/*	Assert.assertTrue(laptopNotebookPage.MacBookCartBtn_text_add());
			logger.info("MacBook Cart text is checked");
			WebDriverUtility.screenShot();*/
		
		
		
	/*	@And("^User should see in the cart one item(s)-$602.00&")
		public void user_should_see_tem_s_showed_to_the_cart() throws Throwable {
			Assert.assertTrue(laptopNotebookPage.MacBookCartBtn_text_add());
			logger.info("MacBook Cart text is checked");
			WebDriverUtility.screenShot();
		}*/

		@And("^User click on cart option$")
		public void user_click_on_cart_option() throws Throwable {
			laptopNotebookPage.clickOn_MacBook_CartBtn();
			logger.info("User clicked on add MacBook cart option"); 
		}

		@And("^User click on red X button to remove the item from cart$")
		public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
			laptopNotebookPage.clickOn_MackBookCartRedX();;
			logger.info("User clicked on X button in cart option");
		}

		/* @Then("^Item should be removed ad cart should show zero item(s)$")
		public void item_should_be_removed_and_cart_should_show_item_s() throws Throwable {
			Assert.assertTrue(laptopNotebookPage.MacBookCartBtn_info_remove());
			logger.info("item is removed from the cart");
			WebDriverUtility.screenShot();
		}*/
	

		/*@Then("^Item should be removed ad cart should show zero items$")
		public void item_should_be_removed_ad_cart_should_show_zero_item_s() throws Throwable {
			    WebDriverUtility.wait(1000);
			    String message = "$0.00";
					if (laptopNotebookPage.MacBookCartBtn_info_remove().contains(message)) {
					logger.info("MacBook Cart text is checked after removal");
					} else {
					Assert.assertTrue(false);
					logger.info("MacBook Cart is not empty after removal");
					}
			WebDriverUtility.screenShot();
		}*/
		
		@Then("^Item should be removed ad cart should show zero items$")
		public void item_should_be_removed_ad_cart_should_show_zero_item_s() throws Throwable {
			    WebDriverUtility.wait(1000);
				Assert.assertTrue(laptopNotebookPage.MacBookCartBtn_info_remove());
		    	logger.info("item is removed from the cart");
			WebDriverUtility.screenShot();
		}

		
		//comparison chart  test steps
		
		@And("^User click on product comparison icon on MacBook$")
		public void user_click_product_comparison_icon_MacBook() throws Throwable {
			laptopNotebookPage.clickOn_MacBookCompareIcon();
			logger.info("User clicked on comparison icon on MacBook ");
		}
			
			
		@And("^User click on product comparison icon on MacBook Air$")
		public void user_click_product_comparison_icon_MacBookAir() throws Throwable {
			laptopNotebookPage.clickOn_MacBookAirCompareIcon();
			logger.info("User clicked on comparison icon on MacBook Air ");
			WebDriverUtility.screenShot();
		}
		
		@Then("^User should see a message Success: You have added MacBook Air to your product comparison!$")
		public void user_see_comparison_add_success_message() {
			laptopNotebookPage.productComparisonSuccessMsg();
			logger.info("user checked added to product comparison success message");
			WebDriverUtility.screenShot();
		}
		
		@And("^User click on Product comparison link$")
		public void user_click_comparison_link() {
			laptopNotebookPage.clickOn_comparisonLink();
			logger.info("user clicked on comparison link");
		}
		
		
		
		@Then("^User should see Product Comparison Chart$")
		public void user_see_comparison_chart() {
			laptopNotebookPage.productComparisonChart();
			logger.info("the presense of the comparison chart is checked");
			WebDriverUtility.screenShot();
		}
		
		
		@And("^User click on hearticon to add Sony VaIO laptop to wish list$")
		public void user_click_Add_SonyVAIO_WishList() {
			laptopNotebookPage.clickOn_SonyVAIO_AddToWishList();
			logger.info("User clicked on add to wish list icon for Sony VAIO");
		}
		
		
		@Then("^User should get a message You must login or create an account to save Sony VAIO to your wish list$")
		public void add_to_wish_list_alert_message() {
			laptopNotebookPage.SuccessMsg_AddToWishList();
			logger.info("add to wish list message is checked");
			WebDriverUtility.screenShot();
		}
		
		
		@And("^User click on MacBook Pro item$")
		public void user_click_on_MacBook_Pro_item() throws Throwable {
		    laptopNotebookPage.clickOn_MacBookPro();
		    logger.info("user clicked on macbook pro item");
		}
		

		@Then("^User should see ‘\\$(\\d+),(\\d+)\\.(\\d+)’price tag is present on UI$")
		public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
		    laptopNotebookPage.PriceTag_MacbookPro();
		    logger.info("price Mackbook pro is checked");
		    WebDriverUtility.screenShot();
		}
		
}
		
		
		
		
		
		

	
	


