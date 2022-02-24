package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account extends CommonAPI {
    public Account(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Account'])[1]")
    WebElement account;
    @FindBy(xpath = "//a[text()='Change email']")
    WebElement changeemail;
    @FindBy(xpath = "//a[text()='Change password']")
    WebElement changepassword;
    @FindBy(xpath = "//button[@id='btn-cancel']")
    WebElement cancel;
    @FindBy(xpath = "//a[text()='Change phone number']")
    WebElement changephonenumber;
    @FindBy(xpath = "//a[text()='Verify phone number']")
    WebElement verifyphonenumber;
    @FindBy(xpath = "//a[text()='Manage payment info']")
    WebElement managepaymentinfo;
    @FindBy(xpath = "//a[text()='Back to Account']")
    WebElement backtoaccount;
    @FindBy(xpath = "//a[text()='Add backup payment method']")
    WebElement addbackuppaymentmethod;
    @FindBy(xpath = "//a[text()='Redeem a gift code or special offer code']")
    WebElement redeemagiftcodeorspecialoffercode;
    @FindBy(xpath = "//a[text()='Billing details']")
    WebElement billingdetails;
    @FindBy(xpath = "//a[text()='Redeem gift card or promo code']")
    WebElement redeemgiftcardorpromocode;
    @FindBy(xpath = "//div[@class='buyGiftCardContainer']")
    WebElement buygiftcards;
    @FindBy(xpath = "//a[text()='Where to buy gift cards']")
    WebElement wheretobuygiftcards;
    @FindBy(xpath = "//button[text()='See more']")
    WebElement seemore;



    public void clcikOnAccount(){click(account);}
    public void scrollDownToAccount(){scrollToView(account);}
    public void clickOnChangeEmail(){click(changeemail);}
    public void clickOnChangePassword(){click(changepassword);}
    public void clickOnCancel(){click(cancel);}
    public void clickOnChangePhoneNumber(){click(changephonenumber);}
    public void clickOnVerifyPhoneNumber(){click(verifyphonenumber);}
    public void clickOnManagePaymentInfo(){click(managepaymentinfo);}
    public void clickOnBackToAccount(){click(backtoaccount);}
    public void clickOnAddBackUpPaymentMethod(){click(addbackuppaymentmethod);}
    public void clickOnRedeemAGiftCodeOrSpecialOfferCode(){click(redeemagiftcodeorspecialoffercode);}
    public void clickOnBillingDetails(){click(billingdetails);}
    public void clickOnRedeemGiftCardOrPromoCode(){click(redeemgiftcardorpromocode);}
    public void clickOnBuyGiftCards(){click(buygiftcards);}
    public void clickOnWhereToBuyGiftCards(){click(wheretobuygiftcards);}
    public void scrollDownToSeeMore(){click(seemore);}




}

