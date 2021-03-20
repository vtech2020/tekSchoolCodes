@Account
Feature: Account Feature

Background:
			Given User is on Retail website
			And User click  on MyAccount
			When User click on Login 
			And User enter username 'donDraper@yaho.com' and password 'donalddr14' 
			And User click on Login button 
			Then User should be logged in to MyAccount dashboard
			

@RegUserCheckPmnt
Scenario Outline: Register as an Affiliate userwith Cheque Payment Method

			And User click on‘Register for an Affiliate Account’link
			And User fill affiliate form with below information company '<company>' website '<website>' tax '<taxID>' payee name '<payeeName>'
				
			And User chooses payment method button
			And User check on About us check box
			And And User click on Continue button
			Then User should see a success message
										
			Examples:
			|company|website|taxID|payeeName|
			|advertising|sterLinCooper.u|222222|Cooper|
			
			
@EditAffiliateFromChequeToBT
Scenario Outline: Edit your affiliate information from Cheque payment method to Bank Transfer
		And User click on Edit your affiliate information link
		And user click on Bank Transfer radio button
		And User fill Bank information with below information bank name '<bankName>' bank branch number '<bankBranchNo>' swift code '<swiftCode>' account name '<accountName>' account number '<accountNumber>'
		And And User click on Continue button
		Then User should see a success message  
Examples:
|bankName|bankBranchNo|swiftCode|accountName|accountNumber|
|Trust|123|12365|Credit|1236547|



@EditYourAccountInfo
Scenario Outline: Edit your account Information

And User click onEdit your account information link
And User modify below information first name '<firstname>' last name '<lastName>' email '<email>' telephone '<telephone>'
And And User click on Continue button
Then User should see a message ‘Success: Your account has been successfully updated.’

Examples:
|firstname|lastName|email|telephone|
|Don|Draper-Cooper|donal-coper.gm|1233547|

			
			
			
			

