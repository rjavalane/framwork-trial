package us.piit.search;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.FriendsPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestSearch extends CommonAPI {
    @Test
    public void testsearchFriend() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        FriendsPage friendsPage = new FriendsPage(driver);
        friendsPage.typeName();
        Assert.assertEquals(friendsPage.getFriendsPageTitle(),"Facebook");
        waitFor(3);
        friendsPage.hoverOverImageName(driver);
        waitFor(3);
        //friendsPage.clickaddfriend();


    }
    @Test
    public void testSearchPageClimateScienceCenter(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        //homePage.selectFromDropDownMenu();
        homePage.clickOnMenu();
        waitFor(3);
        homePage.scrollDownToCliatScience();
        waitFor(3);
        homePage.clickOnClimatScienceBtn();
        Assert.assertEquals(getTitle(),"Climate science center | Facebook");
        waitFor(6);
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
        waitFor(5);
        Assert.assertEquals(homePage.getNotificationMessage(), "You'll receive a notification when the Coronavirus (COVID-19) Information Center has updates.");
        waitFor(5);
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
