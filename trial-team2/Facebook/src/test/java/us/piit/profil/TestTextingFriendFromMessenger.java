package us.piit.profil;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.ProfilPage;

public class TestTextingFriendFromMessenger extends CommonAPI {

    @Test
    public void testSendingMessageFromMessenger(){

        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        ProfilPage profilPage=new ProfilPage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        profilPage.clickOnMessengerBtn();
        profilPage.typeOnSearchMessengerField();
        profilPage.clickOnNameProfile();
        profilPage.typeOnMessageField();
        profilPage.clickOnSendBtn();

    }


}
