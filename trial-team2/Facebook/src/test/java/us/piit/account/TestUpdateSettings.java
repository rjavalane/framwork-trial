package us.piit.account;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.AccountPage;
import us.piit.HomePage;
import us.piit.LogInPage;

import java.util.Set;

public class TestUpdateSettings extends CommonAPI {

    @Test
    public void testLogOut() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnAccountIcon();
        accountPage.clickOnLogOut();
        Assert.assertEquals(getTitle(), "Facebook - Log In or Sign Up");

    }

    @Test
    public void testFeedbackOption() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnAccountIcon();
        accountPage.clickOnFeedback();
        Assert.assertEquals(accountPage.getTextMassege(), "Give Feedback to Facebook");
        accountPage.clickOnSomethingWentWongIcon();
        Assert.assertEquals(accountPage.getText(), "Something went wrong");
        accountPage.clickOnChooseAnAreaLink();
        accountPage.typeOnDetailsField();
        Assert.assertTrue(accountPage.submitButton.isEnabled());
        accountPage.clickOnSubmitButton();
    }

    @Test
    public void testGetHelp() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        Assert.assertEquals(getTitle(), "Facebook - Log In or Sign Up");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnAccountIcon();
        accountPage.clickOnhelpSupport();
        accountPage.clickOnhelpCenter();
        accountPage.typeOnSearchHelpArticlesField();

    }

    @Test
    public void testChangeLangauge() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnAccountIcon();
        accountPage.clickOnSettingPrivacy();
        accountPage.clickOnLanguageOption();


        String parent = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for (String window : allwindows
        ) {
            if (!(parent.equals(window))) {
                driver.switchTo().window(window);
                accountPage.clickOnEditLink();
                accountPage.selectDropdownLanguages();
                accountPage.clickOnSaveChanges();
                Assert.assertEquals(accountPage.getProfilePageTitle(), "Settings & Privacy | Facebook");

            }

        }
    }
}






