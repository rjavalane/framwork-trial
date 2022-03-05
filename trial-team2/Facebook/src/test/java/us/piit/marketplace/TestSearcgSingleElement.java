package us.piit.marketplace;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.MarketPlacePage;

public class TestSearcgSingleElement extends CommonAPI {

    @Test
    public void testSearchElement() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        MarketPlacePage marketPlacePage=new MarketPlacePage(driver);
        marketPlacePage.scrollDownIntoView();
        marketPlacePage.clickOnMarketPlace();
        marketPlacePage.searchelements("iphone13");
        marketPlacePage.clickOnItemIphoneProCase();
        waitFor(5);
        Assert.assertEquals(getTitle(),"Marketplace - iPhone 13 max 128 fb | Facebook");
    }
    @Test
    public void testCreateAlert() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        MarketPlacePage marketPlacePage=new MarketPlacePage(driver);
        marketPlacePage.scrollDownIntoView();
        marketPlacePage.clickOnMarketPlace();
        marketPlacePage.searchelements("iphone13");
        marketPlacePage.clickOnNotifyMeBtn();


//        marketPlacePage.clickOnItemIphoneProCase();
//        waitFor(5);
//        Assert.assertEquals(getTitle(),"Marketplace - iPhone 13 max 128 fb | Facebook");
    }
}
