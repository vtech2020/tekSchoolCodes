package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class AccountRetailPageObj extends Base {
	
	public AccountRetailPageObj() {
	
			PageFactory.initElements(driver, this);	
			
		
	} 
	
	
	/* practice
	@FindBy(xpath="//span[contains(text(), 'My Account')]")
	private WebElement MyAccountButton;
	
	@FindBy(xpath="//a[contains(text(), 'Login')]")
	private WebElement loginOption;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;*/
	
	
	//elements for creating Affiliate user test
	
	@FindBy(xpath="//a[contains(text(), 'affiliate account')]")
	private WebElement affiliateAccountLink;
	
	@FindBy(id="input-company")
	private WebElement companyField;
	
	@FindBy(id="input-website")
	private WebElement websiteField;
	
	@FindBy(id="input-tax")
	private WebElement taxField;
	
	@FindBy(xpath="//input[@value='cheque']")
	private WebElement chequeRadioBtn;
	
	@FindBy(id="input-cheque")
	private WebElement checkPayeeName;
	
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement aboutUsCheckBx;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBtn;
		
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement affiliateAcctSuccess;
	
	
	//elements for edit affiliate user test
	
	@FindBy(xpath="//a[contains(text(), 'Edit your affiliate')]")
	private WebElement edit_affiliate_Info_Link;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTrasferRadioBtn;
	
	@FindBy(id="input-bank-name")
	private WebElement bankNameField;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement bankBrunchNo_Field;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement bankSwiftCode_Field;
	
	@FindBy(id="input-bank-account-name")
	private WebElement accountName_Field;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumber_Field;
	
	
	//elements for edit your account test
	
	@FindBy(xpath="//a[contains(text(), 'Edit your account')]")
	WebElement editYourAcctLink;
	
	@FindBy(id="input-firstname")
	WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	WebElement lastNameField;
	
	@FindBy(id="input-email")
	WebElement emailField;
	
	@FindBy(id="input-telephone")
	WebElement telephoneField;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement editAcctSuccessMsg;
	
	
		
	// methods for create affiliate account
	
	public void clickOn_regAffiliateAccount() {
		WebDriverUtility.clickOnElement(affiliateAccountLink);
	}

	public void enterCompany(String company) {
		companyField.sendKeys(company);
	}
	
	public void enterWebsite(String website) {
		websiteField.sendKeys(website);
	}
	
	public void entertax(String taxID) {
		taxField.sendKeys(taxID);
	}
	
	public void payeeName(String payeeName) {
		checkPayeeName.sendKeys(payeeName);
	}
	
	public void clickOn_checkBtn() {
		WebDriverUtility.clickOnElement(checkPayeeName);
	}
	
	public void clickOn_abouUs() {
		WebDriverUtility.clickOnElement(aboutUsCheckBx);
	}
	
	public void clickOn_continue() {
		WebDriverUtility.clickOnElement(continueBtn);
	}
	
	public boolean affiliateAcct_success(){
		String message = affiliateAcctSuccess.getText();
		boolean successMessage = message.contains("Success");
		return successMessage;
	}
	
	
	// methods for edit affiliate account
	
	public void clickOn_edit_affiliate_info() {
		WebDriverUtility.clickOnElement(edit_affiliate_Info_Link);
	}
	
	public void clickOn_BankTransferRadioBtn() {
		WebDriverUtility.clickOnElement(bankTrasferRadioBtn);
	}
	
	public void enterBankName(String bankName) {
		bankNameField.sendKeys(bankName);
	}
		
	public void enterBankBranch(String bankBranchNo) {
		bankBrunchNo_Field.sendKeys(bankBranchNo);
	}
	
	public void enterSwiftCode(String swiftCode) {
		bankSwiftCode_Field.sendKeys(swiftCode);
	}
	
	public void enterAccountName(String accountName) {
		accountName_Field.sendKeys(accountName);
	}
	
	public void enterAccountNumber(String accountNumber) {
		accountNumber_Field.sendKeys(accountNumber);
	}
	
	//methods for update your account test
	
	public void clickOn_edit_your_account_Link() {
		WebDriverUtility.clickOnElement(editYourAcctLink);
	}
	
	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	
	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		telephoneField.sendKeys(telephone);
	}
	
	public boolean edit_account_successMsg(){
		String message = editAcctSuccessMsg.getText();
		boolean successMessage = message.contains("Success: Your account has been successfully updated.");
		return successMessage;
	}
	
}

		
		


