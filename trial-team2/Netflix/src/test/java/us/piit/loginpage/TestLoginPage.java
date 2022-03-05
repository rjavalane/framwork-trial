package us.piit.loginpage;

import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.*;

public class TestLoginPage extends CommonAPI {

    @Test
    public void testSigninWithInvalidPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        //Assert.assertEquals(loginPage.getTextMessage(), "Incorrect password. Please try again or you can reset your password.");
        Assert.assertEquals(loginPage.getTitle(),"Netflix");
    }

   @Test
    public void testSignInWithValidPassWord(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }

   @Test
    public void movieTitle(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        homePage.setIconSearchButton();
       //homePage.setSearchMovie("ozark");


    }
    @Test
    public void tvShow(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.setTvShows();
        loginPage.clickGenres();
        loginPage.clickAction();
        loginPage.clickPlay();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
            public void manageMyAccount(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);

        loginPage.getHelpCenter();
        Assert.assertEquals(loginPage.getTitle(), "Netflix Help Center");

    }
    @Test
    public void planAndPricing(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        loginPage.clickPlansAndPricing();
        loginPage.clickBackToHelpHome();
        Assert.assertEquals(loginPage.getTitle(), "Plans and Pricing");

    }
    @Test
    public void clickMovies(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Movies moviesPage = new Movies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        moviesPage.clickMovies();
        moviesPage.clickGenres();
        moviesPage.clickDocumentaries();
        moviesPage.scrollDocumentaries();
        moviesPage.hoverOverAmericanMurder(driver);
        moviesPage.clickAmericanMurder();

    }

    @Test
            public void clickKids() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        KidsMovies kidsPage = new KidsMovies(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        kidsPage.clickKids();
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
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        loginPage.clickIreceivedanemailstating();
        loginPage.clickBackToHelpHome();
        Assert.assertEquals(loginPage.getTitle(), "I received an email stating there was a new sign-in to my account");

    }
    @Test
    public void clickHowToChangeYourPlan(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickHowToChangeYourPLan();

    }
   @Test
    public void clickHowToStopSomeoneFromUsingYourAccount(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickHowToStopSomeoneFromUsingYourAccount();

    }
    @Test
    public void clickNetflixSays(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickNetflixSays();
    }
    @Test
    public void clickTroubleShoot(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickTroubleShoot();
    }
    @Test
    public void clickBillingAndPayments(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clcickBillingAndPayments();
        Assert.assertEquals(loginPage.getTitle(), "Billing and Payments");
    }
    @Test
    public void clickNetflixSaysYourAccountIsOnHold(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickNetflixSaysYourAccountIsOnHold();
        Assert.assertEquals(loginPage.getTitle(), "Netflix says 'Your account is on hold because of a problem with your last payment.'");

    }
    @Test
    public void clickNetflixGiftCards(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickNetflixGiftCards();
        Assert.assertEquals(loginPage.getTitle(), "Netflix Gift Cards");

    }
    @Test
    public void clickHowtocreateandeditprofiles(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickHowtocreateandeditprofiles();
        Assert.assertEquals(loginPage.getTitle(), "How to create and edit profiles");

    }
    @Test
    public void clickHowToWatchNetflixOnYourTv(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickHowToWatchNetflixOnYourTv();
        Assert.assertEquals(loginPage.getTitle(), "How to watch Netflix on your TV");
    }
    @Test
    public void clickhowtodownloadtitlestowatchoffline(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homePage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        loginPage.getHelpCenter();
        helpCenter.clickhowtodownloadtitlestowatchoffline();
        Assert.assertEquals(loginPage.getTitle(), "How to download titles to watch offline");
    }
    @Test
    public void HoverOverMyList(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        homepage.HoverOverMyList();
        Assert.assertEquals(loginPage.getTitle(), "Home - Netflix");
    }
    @Test
    public void clickOnAccount(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");

    }
    @Test
    public void clickChangeEmail(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnChangeEmail();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");

    }
    @Test
    public void clickChangePassword(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnChangePassword();
        account.clickOnCancel();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");

    }
    @Test
    public void clickChangePhoneNumber(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnChangePhoneNumber();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void clickVerifyPhoneNumber(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnVerifyPhoneNumber();
        account.clickOnCancel();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickManagePaymentInfo(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnManagePaymentInfo();
        account.clickOnBackToAccount();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickAddBackUpPaymentMethod(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnAddBackUpPaymentMethod();
        account.clickOnRedeemAGiftCodeOrSpecialOfferCode();
        Assert.assertEquals(loginPage.getTitle(), "Netflix - Watch TV Shows Online, Watch Movies Online");
    }
    @Test
    public void clickBillingDetails(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnBillingDetails();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void clickBuyGiftCards(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
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
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        account.clickOnWhereToBuyGiftCards();
        account.clickOnBuyInStore();
        account.scrollDownToSeeMore();
    }
    @Test
    public void clickgoback(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnChangeStreamingPlan();
        changeStreamingPlan.clickOnGoBack();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void clickmanagedownloaddevices(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnManageDownloadDevices();
        changeStreamingPlan.clickOnBackToAccount();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickactivateadevice(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnActivateADevice();
        changeStreamingPlan.clickOnCancel();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickrecentdevicestreamingactivity(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnRecentDeviceStreamingActivity();
        Assert.assertEquals(loginPage.getTitle(), "Profile Lock - Account - Netflix");
    }
    @Test
    public void clicksignoutofalldevices(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnSignOutOfAllDevices();
        changeStreamingPlan.clickOnCancel();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickdownloadyourpersonalinformation(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnDownloadYourPersonalInformation();
        changeStreamingPlan.clickOnHelpCenter();
        changeStreamingPlan.clickOnBackToHelpHome();
        Assert.assertEquals(loginPage.getTitle(), "What personal information Netflix holds about you and how to request a copy");
    }
    @Test
    public void clickaudioandsubtitles(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnAudioAndSubtitles();
        changeStreamingPlan.clickOnSubtitles();
        Assert.assertEquals(loginPage.getTitle(), "Netflix");
    }
    @Test
    public void clickmediacenter(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnMediaCenter();
        changeStreamingPlan.clickOnResources();
        changeStreamingPlan.clickOnCompanyAssets();
        Assert.assertEquals(loginPage.getTitle(), "Netflix Media Center");
    }
    @Test
    public void clickaboutnetflix(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnMediaCenter();
        changeStreamingPlan.clickOnResources();
        changeStreamingPlan.clickOnAboutNetflix();
        changeStreamingPlan.clickOnNewsroom();
        Assert.assertEquals(loginPage.getTitle(), "Netflix Media Center");
    }
    @Test
    public void clickNewsRoom(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnMediaCenter();
        changeStreamingPlan.clickOnResources();
        changeStreamingPlan.clickOnAboutNetflix();
        changeStreamingPlan.clickOnNewsroom();
        Assert.assertEquals(loginPage.getTitle(), "Netflix Media Center");
    }
    @Test
    public void clickTopTen(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnMediaCenter();
        changeStreamingPlan.clickOnResources();
        changeStreamingPlan.clickOnAboutNetflix();
        changeStreamingPlan.clickOnTopTen();
    }
    @Test
    public void clickPrivacyStatment(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnPrivacyStatment();
    }
    @Test
    public void clickJobs(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnJobs();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickGiftCards(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnGiftCards();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickcookiepreferences(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnCookiePreferences();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickInvestorRelations(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnInvestorRelations();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }
    @Test
    public void clickTermsOfUse(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        Account account = new Account(driver);
        ChangeStreamingPlan changeStreamingPlan = new ChangeStreamingPlan(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        homepage.setSofAccount();
        loginPage.hoverLogAccount(driver);
        account.scrollDownToAccount();
        account.clcikOnAccount();
        changeStreamingPlan.clickOnTermsOfUse();
        Assert.assertEquals(loginPage.getTitle(), "Account Settings - Netflix");
    }

}























