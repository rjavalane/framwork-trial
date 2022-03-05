package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreateEvent extends CommonAPI {
    @Test
    public void createEvent() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.clickOnEventLink();
        homePage.clickOnInPersonOption();
        Assert.assertEquals(homePage.getHomePageTitle(),"Create event | Facebook");
        homePage.typeEventName();
        homePage.clickOnStartDayEvent();
        homePage.clickOnStartDate();
        homePage.clickOnStarTimeEvent();
        homePage.clickOnStartTime();
        homePage.clickOnEndDateAndTime();
        homePage.clickOnEndDayEvent();
        homePage.clickOnEndDate();
        homePage.clickOnEndTimeEvent();
        homePage.clickOnEndTime();
        homePage.clickOnChoosePrivacy();
        homePage.clickOnPrivateEvent();
        Assert.assertTrue(homePage.nextButton.isEnabled());
        homePage.clickOnNextButton();
        homePage.typeLocationEvent();
        homePage.clickOnNextButton();
        homePage.typeDescriptionEvent();
        homePage.clickOnNextButton();
        homePage.clickOnCreateEvent();
        Assert.assertEquals(homePage.getTextMessageEvent(), "SATURDAY AT 3 PM – 6 PM");
    }

}
