package us.piit.newandpopular;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LoginPage;
import us.piit.NewAndPopular;

public class TestNewAndPopular extends CommonAPI {


    @Test
    public void testPiecesOfHer() {
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        NewAndPopular newAndPopular = new NewAndPopular(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        newAndPopular.clickOnNewAndPopular();
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
        newAndPopular.clickOnIconSearch("pieces of her");
        newAndPopular.hoverOverOnPiecesOfHer();
        newAndPopular.clickOnPiecesOfHer();
        Assert.assertEquals(loginPage.getTitle(), "PIECES OF HER - Netflix");
    }
    @Test
    public void testRestless(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        NewAndPopular newAndPopular = new NewAndPopular(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        newAndPopular.clickOnNewAndPopular();
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
        newAndPopular.clickOnIconSearch("restless");
       Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
    }
    @Test
    public void testGoodGirls(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        NewAndPopular newAndPopular = new NewAndPopular(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        newAndPopular.clickOnNewAndPopular();
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
        newAndPopular.clickOnIconSearch("Good Girls");
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
    }
    @Test
    public void testTheAdamProject(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        NewAndPopular newAndPopular = new NewAndPopular(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        newAndPopular.clickOnNewAndPopular();
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
        newAndPopular.clickOnIconSearch("The Adam Project");
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
    }
    @Test
    public void testChipAndPotato(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        NewAndPopular newAndPopular = new NewAndPopular(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        newAndPopular.clickOnNewAndPopular();
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
        newAndPopular.clickOnIconSearch("Chip And Potato");
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
    }


    }


