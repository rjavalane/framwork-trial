package us.piit.votinginformationcenter;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.VotingInformationCenter;

import java.util.Set;

public class TestGetInformationFromTheCenter extends CommonAPI {

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
        votingInformationCenter.clickOnGetInformationBtn();
        Assert.assertEquals(getTitle(), "Voting Information Center | Facebook");

        String parent=driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        for (String window:allwindows
        ) {if(!(parent.equals(window))){
            driver.switchTo().window(window);
            Assert.assertEquals(getTitle(), "Voting Assistance Guide");
            votingInformationCenter.hoverOverGeneralInformationBtn(driver);
            votingInformationCenter.clickOnAboutTheLawsBtn();
            Assert.assertEquals(getTitle(), "About the Laws");
        }
        }
    }
}
