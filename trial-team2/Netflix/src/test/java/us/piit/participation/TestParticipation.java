package us.piit.participation;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.*;

public class TestParticipation extends CommonAPI {


    @Test
    public void clickTestParticipation(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        TestParticipationPage testParticipationPage = new TestParticipationPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        testParticipationPage.clickOnTestParticipation();
        testParticipationPage.clickOnAudioAndSubtitles();

    }

}
