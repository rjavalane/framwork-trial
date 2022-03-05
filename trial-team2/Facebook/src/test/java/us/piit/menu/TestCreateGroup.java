package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreateGroup extends CommonAPI {
   @Test
    public void createGroup() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.clickOnTheLinkGroup();
        homePage.typeGroupName();
        homePage.clickOnChoosePrivacy();
        homePage.clickOnpublicOption();
        Assert.assertTrue(homePage.createButton.isEnabled());
        homePage.clickOnButtonCreate();
        Assert.assertEquals(homePage.getHomePageTitle(),"Create group | Facebook");

    }
}