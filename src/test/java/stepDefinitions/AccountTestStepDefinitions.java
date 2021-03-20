package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.AccountRetailPageObj;
import utilities.WebDriverUtility;

public class AccountTestStepDefinitions extends Base {
	
	AccountRetailPageObj accountRetailObj = new AccountRetailPageObj(); 
	
		
	@And("^User click on‘Register for an Affiliate Account’link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
	    accountRetailObj.clickOn_regAffiliateAccount();
	    logger.info("user cl=icked on create affiliate account link");
	    WebDriverUtility.screenShot();
	}

	@And("^User fill affiliate form with below information company '(.+)' website '(.+)' tax '(.+)' payee name '(.+)'$")
	public void user_fill_affiliate_form_with_below_information(String company, String website, String taxID, String payeeName) throws Throwable {
	    accountRetailObj.enterCompany(company);
	    logger.info("user entered company name");
	    accountRetailObj.enterWebsite(website);
	    logger.info("user entered website");
	    accountRetailObj.entertax(taxID);
	    logger.info("user entered tax id");
	    accountRetailObj.payeeName(payeeName);
	    logger.info("user entered payee name");
	    WebDriverUtility.screenShot();
	}
	
	
	@And("^User chooses payment method button$")
	public void user_chooses_payment_method_button() throws Throwable {
	    accountRetailObj.clickOn_checkBtn();
	    logger.info("user checked check payment");
	    WebDriverUtility.screenShot();
	}

	@And("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
	    accountRetailObj.clickOn_abouUs();
	    logger.info("user clicked on about us");
	    WebDriverUtility.screenShot();
	}

	@And("^And User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		WebDriverUtility.wait(1000);
	    accountRetailObj.clickOn_continue();
	    logger.info("user clicked on continue btn");
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		Assert.assertTrue(accountRetailObj.affiliateAcct_success());
		logger.info("create affiliate account success message is checked");
		WebDriverUtility.screenShot();
	}
	
	@And("^User click on Edit your affiliate information link$")
	public void user_click_on_Edit_AffiliateInfo() throws Throwable {
	    accountRetailObj.clickOn_edit_affiliate_info();
	    logger.info("user clicked on edit affoliate account info");	 	    
	}
	
	@And("^user click on Bank Transfer radio button$")
	public void user_click_on_BankTransferBtn() throws Throwable {
	    accountRetailObj.clickOn_BankTransferRadioBtn();
	    logger.info("user clicked on ebank transfer info");	 	    
	}
	
	@And("^User fill Bank information with below information bank name '(.+)' bank branch number '(.+)' swift code '(.+)' account name '(.+)' account number '(.+)'$")
	public void user_fills_bank_info(String bankName, String bankBranchNo, String swiftCode, String accountName, String accountNumber) {
		accountRetailObj.enterBankName(bankName);
		logger.info("user entered bank name");
		accountRetailObj.enterBankBranch(bankBranchNo);
		logger.info("user entered bank branch number");
		accountRetailObj.enterSwiftCode(swiftCode);
		logger.info("user entered Swift code");
		accountRetailObj.enterAccountName(accountName);
		logger.info("user entered account name");
		accountRetailObj.enterAccountNumber(accountNumber);
		logger.info("user entered account number");
		WebDriverUtility.screenShot();
	}
	
	
	@Then("^User click onEdit your account information link$")
	public void user_click_onEdit_your_account_information_link() throws Throwable {
	    accountRetailObj.clickOn_edit_your_account_Link();
	    logger.info("User clicked on Edit your account link");
	}

	@Then("^User modify below information first name '(.+)' last name '(.+)' email '(.+)' telephone '(.+)'$")
	public void user_modify_below_information(String firstname, String lastName, String email, String telephone) throws Throwable {
	    accountRetailObj.enterFirstName(firstname);
	    logger.info("User entered first name");
	    accountRetailObj.enterLastName(lastName);
	    logger.info("User entered last name");
	    accountRetailObj.enterEmail(email);
	    logger.info("User entered last name");
	    accountRetailObj.enterTelephone(telephone);
	    logger.info("User entered telephone");
	    WebDriverUtility.screenShot();
	}

	
	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
	    Assert.assertTrue(accountRetailObj.edit_account_successMsg());
	    logger.info("success message verified");
	    WebDriverUtility.screenShot();
	}

	
	
}
