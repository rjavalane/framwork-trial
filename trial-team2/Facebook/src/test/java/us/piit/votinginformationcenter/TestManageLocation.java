package us.piit.votinginformationcenter;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.VotingInformationCenter;

import java.util.Set;

public class TestManageLocation extends CommonAPI {
    @Test
    public void testGetInformation(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        VotingInformationCenter votingInformationCenter=new VotingInformationCenter(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        votingInformationCenter.scrollDownToVotingInformationCenterBtn();
        votingInformationCenter.clickOnManageLocationBtn();
        Assert.assertEquals(getTitle(), "Voting Information Center | Facebook");
        votingInformationCenter.clickOnEnterAddressBtn();
        Assert.assertTrue(votingInformationCenter.searchAddressField.isEnabled());
        votingInformationCenter.typeOnSearchAddressField();
        Assert.assertTrue(votingInformationCenter.saveBtn.isEnabled());
        votingInformationCenter.clickOnsaveBtn();
    }
}
