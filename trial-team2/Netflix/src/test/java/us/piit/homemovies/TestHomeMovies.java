package us.piit.homemovies;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import us.piit.HomeMovies;
import us.piit.HomePage;
import us.piit.LoginPage;
import us.piit.TvShow;

public class TestHomeMovies extends CommonAPI {


    @Test
    public void testNetflixOscar(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnNetflixOscars();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testMovies(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnAction();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testAnime(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnAnime();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");

    }
    @Test
    public void testBlackStories(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnBlackStories();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testchildrenandfamily(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnChildrenAndFamily();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");

    }
    @Test
    public void testClassics(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnClassics();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testComedies(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnClassics();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testCrime(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnCrime();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testCriticsChoiceAwards(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnCriticsChoiceAwards();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testCult(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnCult();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testDocumentaries(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnDocumentaries();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testDramas(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnDramas();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testFaithAndSpirituality(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnFaithAndSpirituality();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testFantasy(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnFantasy();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testHorror(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnHorror();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testIndependent(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnIndependent();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testInternational(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnInternational();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testLgbtq(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnLgbtq();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testMusicAndMusicals(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnMusicAndMusicals();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testRomance(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnRomance();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testSciFi(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnSciFi();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testSports(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnSports();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testStandUpComedy(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnStandUpComedy();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void testThriller(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HomeMovies homeMovies = new HomeMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homeMovies.clickOnMovies();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        homeMovies.clickOnGenres();
        homeMovies.clickOnThriller();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
}
