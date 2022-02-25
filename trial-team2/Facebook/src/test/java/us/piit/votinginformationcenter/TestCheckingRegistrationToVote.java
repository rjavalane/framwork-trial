package us.piit.votinginformationcenter;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.ProfilPage;
import us.piit.VotingInformationCenter;

public class TestCheckingRegistrationToVote extends CommonAPI {

    @Test
    public void testCheckingRegistration(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        VotingInformationCenter votingInformationCenter=new VotingInformationCenter(driver);
        //Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        votingInformationCenter.scrollDownToVotingInformationCenterBtn();
        votingInformationCenter.clickOnCheckRegistrationBtn();
        //votingInformationCenter.clickOnCountyBtn();
        //votingInformationCenter.selectDropdownCounty("Kings (Brooklyn)");
        votingInformationCenter.typeOnLastNameField();






    }
}
