package us.piit.votinginformationcenter;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.VotingInformationCenter;

import java.util.Set;

public class TestCheckingRegistrationToVote extends CommonAPI {

    @Test
    public void testCheckingRegistrationWithValidCredentials(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        VotingInformationCenter votingInformationCenter=new VotingInformationCenter(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        votingInformationCenter.scrollDownToVotingInformationCenterBtn();
        votingInformationCenter.clickOnCheckRegistrationBtn();
        Assert.assertEquals(getTitle(), "Voting Information Center | Facebook");

        String parent=driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        for (String window:allwindows
             ) {if(!(parent.equals(window))){
                 driver.switchTo().window(window);
            Assert.assertEquals(getTitle(), "Voter Search Screen for VoterLookUp");
            votingInformationCenter.selectDropdownCounty();
            votingInformationCenter.typeOnLastNameField();
            votingInformationCenter.typeOnfirstNameField();
            votingInformationCenter.typeOnDobField();
            votingInformationCenter.typeOnZipCodeField();
            votingInformationCenter.clickOnSearchSubmitBtn();
            Assert.assertEquals(votingInformationCenter.getTextTitle(), "NY State Board of Elections");
        }
        }
    }

}
