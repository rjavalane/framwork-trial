package us.piit.account;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.AccountPage;

public class TestTextingFriendFromMessenger extends CommonAPI {

    @Test
    public void testSendingMessageFromMessenger(){

        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        HomePage homePage=new HomePage(driver);
        AccountPage accountPage=new AccountPage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        accountPage.scrollDownIntoMessengerBtn();
        accountPage.typeOnSearchMessengerField();
        accountPage.clickOnNameProfile();
        accountPage.typeOnMessageField();
        Assert.assertTrue(accountPage.sendBtn.isEnabled());
        accountPage.clickOnSendBtn();
        Assert.assertEquals(getTitle(),"Messenger | Facebook");


    }


}
