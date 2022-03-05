package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreatePage extends CommonAPI {
    @Test
    public void createEvent() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        Assert.assertEquals(getTitle(), "Facebook - Log In or Sign Up");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.clickOnPageBtn();
        homePage.typeOnPageNameField();
        homePage.typeOnCategoryField();
        homePage.clickOnPublicServiceCategory();
        Assert.assertTrue(homePage.createPageBtn.isEnabled());
        homePage.clickOnCreatePageBtn();
        Assert.assertTrue(homePage.titlePageCreated.isEnabled());

    }
}
