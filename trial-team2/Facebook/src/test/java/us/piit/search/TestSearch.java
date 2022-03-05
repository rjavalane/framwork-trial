package us.piit.search;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.FriendsPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestSearch extends CommonAPI {

    @Test
    public void testSearchPageClimateScienceCenter(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.scrollDownToCliatScience();
        homePage.clickOnClimatScienceBtn();
        Assert.assertEquals(getTitle(),"Climate science center | Facebook");
    }
   @Test
    public void testSearchCoronavirusInformationCenterAndFollowIt(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.scrollDownToCoronavirusInfoCenter();
        homePage.clickOnCoronavirusInfoCenterBtn();
        Assert.assertEquals(getTitle(), "Coronavirus (COVID-19) Information Center | Facebook");
        homePage.clickOnFollowBtn();
        Assert.assertEquals(homePage.getNotificationMessage(), "You'll receive a notification when the Coronavirus (COVID-19) Information Center has updates.");

    }
    @Test
    public void testSearchActualNewsPage(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.scrollDownToNewsBtn();
        homePage.clickOnNewsBtn();
        homePage.clickOnForYouBtn();
        Assert.assertEquals(homePage.getTextTitle(), "Earlier");
        Assert.assertEquals(getTitle(), "News | Facebook");
    }


}
