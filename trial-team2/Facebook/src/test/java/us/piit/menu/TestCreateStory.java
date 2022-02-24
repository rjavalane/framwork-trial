package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreateStory extends CommonAPI {

    @Test
    public void testCreateStory(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnMenu();
        homePage.clickOnSearchStoryBtn();
        homePage.clickOnCreateATextStory();
        homePage.typeTextStory();
        homePage.clickOnShareButton();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Create Stories | Facebook");
    }




}
