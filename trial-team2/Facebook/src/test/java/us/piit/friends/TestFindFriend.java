package us.piit.friends;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.FriendsPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestFindFriend extends CommonAPI {
    @Test
    public void testsearchFriend() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        FriendsPage friendsPage = new FriendsPage(driver);
        friendsPage.typeName();
        Assert.assertEquals(friendsPage.getFriendsPageTitle(),"Facebook");
        friendsPage.hoverOverImageName(driver);
        //friendsPage.clickaddfriend();

    }
}
