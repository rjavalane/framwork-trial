package us.piit.tvshow;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.Account;
import us.piit.HomePage;
import us.piit.LoginPage;
import us.piit.TvShow;

public class TestTvShow extends CommonAPI {


    @Test
    public void testAnime() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.anime.isEnabled());
        tvShow.clickOnAnime();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        //WebElement play = (new WebDriverWait(driver, 4))
        //.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='medium ltr-ae5w18-baseCss'])[3]")));
        //tvShow.clickOnPlay();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testBlackStories() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.blackstories.isEnabled());
        tvShow.clickOnBlackStories();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testBritish() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.british.isEnabled());
        tvShow.clickOnBritish();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testClassicAndCult() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.classicandcult.isEnabled());
        tvShow.clickOnClassicAndCult();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testComedies() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.comedies.isEnabled());
        tvShow.clickOnComedies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testCrime() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.crime.isEnabled());
        tvShow.clickOnCrime();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testCriticsChoiceAwards() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.criticschoiceawards.isEnabled());
        tvShow.clickOnCriticsChoiceAwards();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testDocuseries() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnGenres();
        Assert.assertTrue(tvShow.docuseries.isEnabled());
        tvShow.clickOnDocuseries();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }

    @Test
    public void testDramas() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        //Assert.assertTrue(tvShow.dramas.isEnabled());
        tvShow.clickOnGenres();
        tvShow.clickOnDramas();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");

    }
    @Test
    public void testHorror(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnHorror();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testInternational(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnInternational();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testKDramas(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnKDramas();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testKids(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnKids();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testLgbtq(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnLgbtq();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testMysteries(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        Assert.assertEquals(loginPage.getTitle(), "TV Shows - Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testReality(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnReality();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testRomance(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnRomance();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testSciFiAndFantasy(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnSciFiAndFantasy();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testScienceAndNature(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickONScienceAndNature();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testSpanishLanguage(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnSpanishLanguage();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testStandUpAndTalkShows(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnStandUpAndTalkShows();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testTeen(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnTeen();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }
    @Test
    public void testThriller(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        TvShow tvShow = new TvShow(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        tvShow.clickOnTvShow();
        tvShow.clickOnGenres();
        tvShow.clickOnThriller();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        tvShow.clickOnMoreInfo();
        Assert.assertEquals(loginPage.getTitle(), "- Netflix");
    }



}
