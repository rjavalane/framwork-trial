package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeStreamingPlan extends CommonAPI {
    public ChangeStreamingPlan(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Change plan']")
    WebElement changestreamingplan;
    @FindBy(xpath = "//button[text()='Go Back']")
    WebElement goback;
    @FindBy(xpath = "//a[text()='Manage download devices']")
    WebElement managedownloaddevices;
    @FindBy(xpath = "//button[text()='Back To Account']")
    WebElement backtoaccount;
    @FindBy(xpath = "//a[text()='Activate a device']")
    WebElement activateadevice;
    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement cancel;
    @FindBy(xpath = "//a[text()='Recent device streaming activity']")
    WebElement recentdevicestreamingactivity;
    @FindBy(xpath = "//a[text()='Sign out of all devices']")
    WebElement signoutofalldevices;
    @FindBy(xpath = "//a[text()='Download your personal information']")
    WebElement downloadyourpersonalinformation;
    @FindBy(xpath = "//a[text()='help center.']")
    WebElement helpcenter;
    @FindBy(xpath = "//div[@class='breadcrumb-container']")
    WebElement backtohelphome;
    @FindBy(xpath = "//span[text()='Audio and Subtitles']")
    WebElement audioandsubtitles;
    @FindBy(xpath = "(//span[@class='arrow'])[1]")
    WebElement subtitles;
    @FindBy(xpath = "//span[text()='Media Center']")
    WebElement mediacenter;
    @FindBy(xpath = "(//span[@class='MuiButton-label-477'])[5]")
    WebElement resources;
    @FindBy(xpath = "//span[text()='Company Assets']")
    WebElement companyassets;
    @FindBy(xpath = "//span[text()='About Netflix']")
    WebElement aboutnetflix;
    @FindBy(xpath = "//span[text()='Newsroom']")
    WebElement newsroom;
    @FindBy(xpath = "(//span[@class='nav-link__StyledNavLink-fm5ilr-0 dUCDPp'])[3]")
    WebElement topten;
    @FindBy(xpath = "//span[text()='Privacy Statement']")
    WebElement privacystatment;
    @FindBy(xpath = "//li[@class='footer-link-item footer-link-jobs']")
    WebElement jobs;
    @FindBy(xpath = "//li[@class='footer-link-item footer-link-gift-card']")
    WebElement giftcards;
    @FindBy(xpath = "//li[@class='footer-link-item footer-link-cookies']")
    WebElement cookiepreferences;
    @FindBy(xpath = "//li[@class='footer-link-item footer-link-relations']")
    WebElement investorrelations;
    @FindBy(xpath = "//li[@class='footer-link-item footer-link-terms']")
    WebElement termsofuse;



    public void clickOnChangeStreamingPlan(){click(changestreamingplan);}
    public void clickOnGoBack(){click(goback);}
    public void clickOnManageDownloadDevices(){click(managedownloaddevices);}
    public void clickOnBackToAccount(){click(backtoaccount);}
    public void clickOnActivateADevice(){click(activateadevice);}
    public void clickOnCancel(){click(cancel);}
    public void clickOnRecentDeviceStreamingActivity(){click(recentdevicestreamingactivity);}
    public void clickOnSignOutOfAllDevices(){click(signoutofalldevices);}
    public void clickOnDownloadYourPersonalInformation(){click(downloadyourpersonalinformation);}
    public void clickOnHelpCenter(){click(helpcenter);}
    public void clickOnBackToHelpHome(){click(backtohelphome);}
    public void clickOnAudioAndSubtitles(){click(audioandsubtitles);}
    public void clickOnSubtitles(){click(subtitles);}
    public void clickOnMediaCenter(){click(mediacenter);}
    public void clickOnResources(){click(resources);}
    public void clickOnCompanyAssets(){click(companyassets);}
    public void clickOnAboutNetflix(){click(aboutnetflix);}
    public void clickOnNewsroom(){click(newsroom);}
    public void clickOnTopTen(){click(topten);}
    public void clickOnPrivacyStatment(){click(privacystatment);}
    public void clickOnJobs(){click(jobs);}
    public void clickOnGiftCards(){click(giftcards);}
    public void clickOnCookiePreferences(){click(cookiepreferences);}
    public void clickOnInvestorRelations(){click(investorrelations);}
    public void clickOnTermsOfUse(){click(termsofuse);}










}
