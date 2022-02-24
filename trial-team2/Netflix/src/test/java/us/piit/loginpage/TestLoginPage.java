package us.piit.loginpage;

import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.*;

public class TestLoginPage extends CommonAPI {

    //@Test
    public void testSigninWithInvalidPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        //Assert.assertEquals(loginPage.getTextMessage(), "Incorrect password. Please try again or you can reset your password.");
        Assert.assertEquals(loginPage.getTitle(),"Netflix");
    }

   //@Test
    public void testSignInWithValidPassWord(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }

   //@Test
    public void movieTitle(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        homePage.setIconSearchButton();
        waitFor(2);
       //homePage.setSearchMovie("ozark");


    }
    //@Test
    public void tvShow(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.setTvShows();
        waitFor(2);
        loginPage.clickGenres();
        loginPage.clickAction();
        loginPage.clickPlay();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    //@Test
            public void manageMyAccount(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        Assert.assertEquals(loginPage.getTitle(), "Netflix Help Center");

    }
    //@Test
    public void planAndPricing(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        loginPage.clickPlansAndPricing();
        loginPage.clickBackToHelpHome();
        Assert.assertEquals(loginPage.getTitle(), "Plans and Pricing");

    }
    //@Test
    public void clickMovies(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MoviesPage moviesPage = new MoviesPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        moviesPage.clickMovies();
        moviesPage.clickGenres();
        moviesPage.clickDocumentaries();
        waitFor(2);
        moviesPage.scrollDocumentaries();
        moviesPage.hoverOverAmericanMurder(driver);
        waitFor(2);
        moviesPage.clickAmericanMurder();

    }

    //@Test
            public void clickKids() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        KidsPage kidsPage = new KidsPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        kidsPage.clickKids();
        waitFor(2);
        kidsPage.hoverOverAvatar(driver);
        //kidsPage.clickMoreInfo();
       // kidsPage.clickClose();
    }

    @Test
    public void clickIreceivedanemailstating(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        loginPage.clickIreceivedanemailstating();
        loginPage.clickBackToHelpHome();
        waitFor(3);
        Assert.assertEquals(loginPage.getTitle(), "I received an email stating there was a new sign-in to my account");

    }
    //@Test
    public void clickHowToChangeYourPlan(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowToChangeYourPLan();
        waitFor(2);

    }
   //@Test
    public void clickHowToStopSomeoneFromUsingYourAccount(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowToStopSomeoneFromUsingYourAccount();

    }
    //@Test
    public void clickNetflixSays(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickNetflixSays();
    }
    //@Test
    public void clickTroubleShoot(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickTroubleShoot();
    }
    //@Test
    public void clickBillingAndPayments(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clcickBillingAndPayments();
        Assert.assertEquals(loginPage.getTitle(), "Billing and Payments");
    }
    //@Test
    public void clickNetflixSaysYourAccountIsOnHold(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickNetflixSaysYourAccountIsOnHold();
        Assert.assertEquals(loginPage.getTitle(), "Netflix says 'Your account is on hold because of a problem with your last payment.'");

    }
    //@Test
    public void clickNetflixGiftCards(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickNetflixGiftCards();
        Assert.assertEquals(loginPage.getTitle(), "Netflix Gift Cards");

    }
    //@Test
    public void clickHowtocreateandeditprofiles(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowtocreateandeditprofiles();
        Assert.assertEquals(loginPage.getTitle(), "How to create and edit profiles");

    }
    //@Test
    public void clickHowToWatchNetflixOnYourTv(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowToWatchNetflixOnYourTv();
        Assert.assertEquals(loginPage.getTitle(), "How to watch Netflix on your TV");
    }
    //@Test
    public void clickhowtodownloadtitlestowatchoffline(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickhowtodownloadtitlestowatchoffline();
        Assert.assertEquals(loginPage.getTitle(), "How to download titles to watch offline");
    }
    //@Test
    public void HoverOverMyList(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        homepage.HoverOverMyList();
        waitFor(4);
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
    }
    //@Test
    public void clickOnAccount(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");

    }
    //@Test
    public void clickChangeEmail(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnChangeEmail();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");

    }
    //@Test
    public void clickChangePassword(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnChangePassword();
        waitFor(2);
        account.clickOnCancel();
        waitFor(2);
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");

    }
    //@Test
    public void clickChangePhoneNumber(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnChangePhoneNumber();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    //@Test
    public void clickVerifyPhoneNumber(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnVerifyPhoneNumber();
        account.clickOnCancel();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    //@Test
    public void clickManagePaymentInfo(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnManagePaymentInfo();
        account.clickOnBackToAccount();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    //@Test
    public void clickAddBackUpPaymentMethod(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnAddBackUpPaymentMethod();
        account.clickOnRedeemAGiftCodeOrSpecialOfferCode();
        Assert.assertEquals(loginPage.getTitle(), "Netflix - Watch TV Shows Online, Watch Movies Online");
    }
    //@Test
    public void clickBillingDetails(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnBillingDetails();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    //@Test
    public void clickBuyGiftCards(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnRedeemGiftCardOrPromoCode();
        account.clickOnBuyGiftCards();
        Assert.assertEquals(loginPage.getTitle(), "Netflix - Watch TV Shows Online, Watch Movies Online");
    }
    @Test
    public void clickwheretobuygiftcards(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        waitFor(3);
        account.clcikOnAccount();
        account.clickOnWhereToBuyGiftCards();
        account.scrollDownToSeeMore();


    }





    }























