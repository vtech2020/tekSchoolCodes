@Desktop
Feature: Desktop Retail Website Feature


Background: 
			Given User is on Retail website
			When User click on Desktops tab
			And User click on Show all desktops


@ItemsPresentDesktop
Scenario: User verify all items are present in Desktops tab
						
			Then User should see all items are present in Desktop page
			
@addHPLP3065FromDesktopTabToCart
Scenario: User add HP LP3065  from Desktops tab to the cart

          	And User click ADD TO CARToption on HP LP3065 item 
          	And User select quantity '1'
         	And User click add to Cart button
          	Then User should see a message Success: You have added HP LP3065 to your shopping cart!


@AddCanonEOS5DFromDesktopsTabToCart
Scenario: User add Canon EOS5D from Desktops tab to the cart

			And User click ADD TO CART option on Canon EOS5D item
		    And User select color from dropdown Red
		    And User select quantity '1' CanonEOS5D
		    And User click add to Cart button CanonEOS5D
		    Then User should see a message Success: You have added Canon EOS 5D to your shopping cart!


@UserAddRewiewToCanonEOS5D
Scenario Outline: User add a review to Canon EOS 5D item inDesktops tab
			And User click on Canon EOS 5D item
			And User click on write a review link
			And user fill the review information with name '<yourname>' and review '<yourReview>'
			And user fills Rating field Bad or Good
			And User click on Continue Button 
			Then User should see a message with Thank you for your review. It has been submitted to the webmaster for approval.
	
			Examples:
					 |yourname|yourReview|
					 |Tom|Good quality item. Fast and safe shipping. Well packaged.|
				