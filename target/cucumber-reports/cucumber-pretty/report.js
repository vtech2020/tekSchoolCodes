$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AccountRetailFeature.feature");
formatter.feature({
  "line": 2,
  "name": "Account Feature",
  "description": "",
  "id": "account-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Account"
    }
  ]
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Register as an Affiliate userwith Cheque Payment Method",
  "description": "",
  "id": "account-feature;register-as-an-affiliate-userwith-cheque-payment-method",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@RegUserCheckPmnt"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on‘Register for an Affiliate Account’link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User fill affiliate form with below information company \u0027\u003ccompany\u003e\u0027 website \u0027\u003cwebsite\u003e\u0027 tax \u0027\u003ctaxID\u003e\u0027 payee name \u0027\u003cpayeeName\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User chooses payment method button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User check on About us check box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "And User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should see a success message",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "account-feature;register-as-an-affiliate-userwith-cheque-payment-method;",
  "rows": [
    {
      "cells": [
        "company",
        "website",
        "taxID",
        "payeeName"
      ],
      "line": 25,
      "id": "account-feature;register-as-an-affiliate-userwith-cheque-payment-method;;1"
    },
    {
      "cells": [
        "advertising",
        "sterLinCooper.u",
        "222222",
        "Cooper"
      ],
      "line": 26,
      "id": "account-feature;register-as-an-affiliate-userwith-cheque-payment-method;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2411557400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click  on MyAccount",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter username \u0027donDraper@yaho.com\u0027 and password \u0027donalddr14\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2109356500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 69922100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login()"
});
formatter.result({
  "duration": 3617471100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "donDraper@yaho.com",
      "offset": 21
    },
    {
      "val": "donalddr14",
      "offset": 55
    }
  ],
  "location": "LoginTestStepDefinition.user_enter_username_sdet_tekschool_us_and_password_sdet(String,String)"
});
formatter.result({
  "duration": 501364100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1766707800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "duration": 3310507100,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Register as an Affiliate userwith Cheque Payment Method",
  "description": "",
  "id": "account-feature;register-as-an-affiliate-userwith-cheque-payment-method;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@RegUserCheckPmnt"
    },
    {
      "line": 1,
      "name": "@Account"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on‘Register for an Affiliate Account’link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User fill affiliate form with below information company \u0027advertising\u0027 website \u0027sterLinCooper.u\u0027 tax \u0027222222\u0027 payee name \u0027Cooper\u0027",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User chooses payment method button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User check on About us check box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "And User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should see a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_on_Register_for_an_Affiliate_Account_link()"
});
formatter.result({
  "duration": 630671800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "advertising",
      "offset": 57
    },
    {
      "val": "sterLinCooper.u",
      "offset": 79
    },
    {
      "val": "222222",
      "offset": 101
    },
    {
      "val": "Cooper",
      "offset": 121
    }
  ],
  "location": "AccountTestStepDefinitions.user_fill_affiliate_form_with_below_information(String,String,String,String)"
});
formatter.result({
  "duration": 606012200,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_chooses_payment_method_button()"
});
formatter.result({
  "duration": 345197500,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_check_on_About_us_check_box()"
});
formatter.result({
  "duration": 400495400,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_on_Continue_button()"
});
formatter.result({
  "duration": 1552883000,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_should_see_a_success_message()"
});
formatter.result({
  "duration": 356848200,
  "status": "passed"
});
formatter.after({
  "duration": 711933500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Edit your affiliate information from Cheque payment method to Bank Transfer",
  "description": "",
  "id": "account-feature;edit-your-affiliate-information-from-cheque-payment-method-to-bank-transfer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@EditAffiliateFromChequeToBT"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User click on Edit your affiliate information link",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click on Bank Transfer radio button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User fill Bank information with below information bank name \u0027\u003cbankName\u003e\u0027 bank branch number \u0027\u003cbankBranchNo\u003e\u0027 swift code \u0027\u003cswiftCode\u003e\u0027 account name \u0027\u003caccountName\u003e\u0027 account number \u0027\u003caccountNumber\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "And User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User should see a success message",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "account-feature;edit-your-affiliate-information-from-cheque-payment-method-to-bank-transfer;",
  "rows": [
    {
      "cells": [
        "bankName",
        "bankBranchNo",
        "swiftCode",
        "accountName",
        "accountNumber"
      ],
      "line": 37,
      "id": "account-feature;edit-your-affiliate-information-from-cheque-payment-method-to-bank-transfer;;1"
    },
    {
      "cells": [
        "Trust",
        "123",
        "12365",
        "Credit",
        "1236547"
      ],
      "line": 38,
      "id": "account-feature;edit-your-affiliate-information-from-cheque-payment-method-to-bank-transfer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1543695300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click  on MyAccount",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter username \u0027donDraper@yaho.com\u0027 and password \u0027donalddr14\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2297356900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 72804000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login()"
});
formatter.result({
  "duration": 3607733300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "donDraper@yaho.com",
      "offset": 21
    },
    {
      "val": "donalddr14",
      "offset": 55
    }
  ],
  "location": "LoginTestStepDefinition.user_enter_username_sdet_tekschool_us_and_password_sdet(String,String)"
});
formatter.result({
  "duration": 467954800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1343251200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "duration": 3327011700,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Edit your affiliate information from Cheque payment method to Bank Transfer",
  "description": "",
  "id": "account-feature;edit-your-affiliate-information-from-cheque-payment-method-to-bank-transfer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Account"
    },
    {
      "line": 29,
      "name": "@EditAffiliateFromChequeToBT"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User click on Edit your affiliate information link",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user click on Bank Transfer radio button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User fill Bank information with below information bank name \u0027Trust\u0027 bank branch number \u0027123\u0027 swift code \u002712365\u0027 account name \u0027Credit\u0027 account number \u00271236547\u0027",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "And User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User should see a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_on_Edit_AffiliateInfo()"
});
formatter.result({
  "duration": 347593500,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_on_BankTransferBtn()"
});
formatter.result({
  "duration": 51238000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Trust",
      "offset": 61
    },
    {
      "val": "123",
      "offset": 88
    },
    {
      "val": "12365",
      "offset": 105
    },
    {
      "val": "Credit",
      "offset": 126
    },
    {
      "val": "1236547",
      "offset": 150
    }
  ],
  "location": "AccountTestStepDefinitions.user_fills_bank_info(String,String,String,String,String)"
});
formatter.result({
  "duration": 665637400,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_on_Continue_button()"
});
formatter.result({
  "duration": 1513456100,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_should_see_a_success_message()"
});
formatter.result({
  "duration": 387078800,
  "status": "passed"
});
formatter.after({
  "duration": 704331400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 43,
  "name": "Edit your account Information",
  "description": "",
  "id": "account-feature;edit-your-account-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@EditYourAccountInfo"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User click onEdit your account information link",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User modify below information first name \u0027\u003cfirstname\u003e\u0027 last name \u0027\u003clastName\u003e\u0027 email \u0027\u003cemail\u003e\u0027 telephone \u0027\u003ctelephone\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "And User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User should see a message ‘Success: Your account has been successfully updated.’",
  "keyword": "Then "
});
formatter.examples({
  "line": 50,
  "name": "",
  "description": "",
  "id": "account-feature;edit-your-account-information;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastName",
        "email",
        "telephone"
      ],
      "line": 51,
      "id": "account-feature;edit-your-account-information;;1"
    },
    {
      "cells": [
        "Don",
        "Draper-Cooper",
        "donal-coper.gm",
        "1233547"
      ],
      "line": 52,
      "id": "account-feature;edit-your-account-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1455759300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click  on MyAccount",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter username \u0027donDraper@yaho.com\u0027 and password \u0027donalddr14\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2490314200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 60975800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login()"
});
formatter.result({
  "duration": 3575156400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "donDraper@yaho.com",
      "offset": 21
    },
    {
      "val": "donalddr14",
      "offset": 55
    }
  ],
  "location": "LoginTestStepDefinition.user_enter_username_sdet_tekschool_us_and_password_sdet(String,String)"
});
formatter.result({
  "duration": 519685400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1237990500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDefinition.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "duration": 3311648200,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Edit your account Information",
  "description": "",
  "id": "account-feature;edit-your-account-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@EditYourAccountInfo"
    },
    {
      "line": 1,
      "name": "@Account"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User click onEdit your account information link",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User modify below information first name \u0027Don\u0027 last name \u0027Draper-Cooper\u0027 email \u0027donal-coper.gm\u0027 telephone \u00271233547\u0027",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "And User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User should see a message ‘Success: Your account has been successfully updated.’",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_onEdit_your_account_information_link()"
});
formatter.result({
  "duration": 645365100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Don",
      "offset": 42
    },
    {
      "val": "Draper-Cooper",
      "offset": 58
    },
    {
      "val": "donal-coper.gm",
      "offset": 80
    },
    {
      "val": "1233547",
      "offset": 107
    }
  ],
  "location": "AccountTestStepDefinitions.user_modify_below_information(String,String,String,String)"
});
formatter.result({
  "duration": 565038200,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_click_on_Continue_button()"
});
formatter.result({
  "duration": 1528255300,
  "status": "passed"
});
formatter.match({
  "location": "AccountTestStepDefinitions.user_should_see_a_message_Success_Your_account_has_been_successfully_updated()"
});
formatter.result({
  "duration": 45037012500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027alert alert-success alert-dismissible\u0027]\"}\n  (Session info: chrome\u003d89.0.4389.90)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-5HJL2MH\u0027, ip: \u0027192.168.0.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\rayl5\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51995}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: bf74b3afd61bdbb2598312a24d9f94c8\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027alert alert-success alert-dismissible\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.getText(Unknown Source)\r\n\tat pageObjects.AccountRetailPageObj.edit_account_successMsg(AccountRetailPageObj.java:209)\r\n\tat stepDefinitions.AccountTestStepDefinitions.user_should_see_a_message_Success_Your_account_has_been_successfully_updated(AccountTestStepDefinitions.java:115)\r\n\tat ✽.Then User should see a message ‘Success: Your account has been successfully updated.’(Features/AccountRetailFeature.feature:48)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 696206400,
  "status": "passed"
});
});