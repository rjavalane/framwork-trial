package us.piit.marketplace;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.MarketPlacePage;

public class TestAddPaymentMethod extends CommonAPI {

    @Test
    public void testAddInvalidCreditCardPayment(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        MarketPlacePage marketPlacePage=new MarketPlacePage(driver);
        marketPlacePage.scrollDownToFacebookPayBtn();
        marketPlacePage.clickOnFacebookPayBtn();
        marketPlacePage.clickOnAddPaymentMethod();
        marketPlacePage.clickOnCreditOrDebitCard();
        Assert.assertEquals(marketPlacePage.getTextTitle(), "Add credit or debit card");
        marketPlacePage.typeOnCartNumberField();
        marketPlacePage.typeOnExpirationDateField();
        marketPlacePage.typeOnCCVField();
        marketPlacePage.clickOnCountry();
        marketPlacePage.typeNameCardField();
        marketPlacePage.typeOnBillingAddress1Field();
        marketPlacePage.typeOnBillingAddress2Field();
        marketPlacePage.typeOnCityField();
        marketPlacePage.typeOnStateField();
        marketPlacePage.typeOnZipCodeField();
        Assert.assertTrue(marketPlacePage.saveBtn.isEnabled());
        marketPlacePage.clickOnSaveBtn();
        Assert.assertEquals(marketPlacePage.getErrorMessage(), "Please enter a valid credit or debit card number.");
    }
}
