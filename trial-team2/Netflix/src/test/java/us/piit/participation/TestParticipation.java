package us.piit.participation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.*;

public class TestParticipation extends CommonAPI {


    @Test
    public void clickTestParticipation(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        Participation testParticipationPage = new Participation(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        testParticipationPage.clickOnTestParticipation();
        testParticipationPage.clickOnAudioAndSubtitles();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");

    }


    }


