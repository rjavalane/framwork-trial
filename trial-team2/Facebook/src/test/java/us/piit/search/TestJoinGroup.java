package us.piit.search;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.GroupsPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestJoinGroup extends CommonAPI {

    @Test
    public void testSenRequestToGroup() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        GroupsPage groupsPage = new GroupsPage(driver);
        groupsPage.clickOnGroupsIcon();
        groupsPage.clickOnSearchIcon();
        groupsPage.typeOnSearchField();
        groupsPage.hoverOverGroupeName(driver);
        groupsPage.clickOnJoinGroupButtuon();
        Assert.assertEquals(getTitle(), "Azeffoun les bouteilles - Search Results | Facebook");

    }

    //@Test
    public void testCancelRequestToGroup() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        GroupsPage groupsPage = new GroupsPage(driver);
        groupsPage.clickOnGroupsIcon();
        groupsPage.clickOnSearchIcon();
        groupsPage.typeOnSearchField();
        groupsPage.hoverOverGroupeName(driver);
        groupsPage.clickOnCancelRequest();
        Assert.assertEquals(getTitle(), "Azeffoun les bouteilles - Search Results | Facebook");
    }
}