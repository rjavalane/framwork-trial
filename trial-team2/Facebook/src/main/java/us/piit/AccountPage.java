package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends CommonAPI {
    public AccountPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@aria-label='Account'])[1]")
    WebElement accountIcon;
    @FindBy(xpath = "//span[text()='Log Out']")
    WebElement logOut;
    @FindBy(xpath = "//span[text()='Give feedback']")
    WebElement giveFeedbackLink;
    @FindBy(xpath = "//span[text()='Give Feedback to Facebook']")
    WebElement textMessage;
    @FindBy(xpath = "//span[text()='Something went wrong']")
    WebElement text;
    @FindBy(xpath = "//span[text()='Something went wrong']")
    WebElement somethingWentWongIcon;
    @FindBy(xpath = "//span[text()='Choose an area']")
    WebElement chooseAnAreaLink;
    @FindBy(xpath = "(//span[text()='Other'])[2]")
    WebElement otherWord;
    @FindBy(xpath = "//textarea[@style='overflow-y: auto;']")
    WebElement detailsField;
    @FindBy(xpath = "//span[text()='Submit']")
    public
    WebElement submitButton;
    @FindBy(xpath = "//span[text()='Help & Support']")
    WebElement helpSupport;
    @FindBy(xpath = "//span[text()='Help Center']")//(//span[text()='Marketplace'])[3]
    WebElement helpCenter;
    @FindBy(xpath = "//input[@aria-autocomplete='list']")
    WebElement searchHelpArticlesField;
    @FindBy(xpath = "(//span[text()='Marketplace'])[1]")
    WebElement marketPlaceIcon;
    @FindBy(xpath = "(//span[text()='Yes'])[3]")
    WebElement yesButton;
    @FindBy(xpath = "//textarea[@style='overflow-y: hidden;']")
    WebElement description;
    @FindBy(xpath = "//span[text()='How can we help you?']")
    WebElement textDisplayed;
    @FindBy(xpath = "//span[text()='Settings & privacy']")
    WebElement settingPrivacy;
    @FindBy(xpath = "//span[text()='Language']")//(//span[text()='Marketplace'])[3]
    WebElement languageOption;
    @FindBy(xpath = "(//span[@class='uiIconText fbSettingsListItemEdit'])[1]")
    WebElement editLink;
    @FindBy(xpath = "//select[@name='new_language']")
    WebElement languages;
    @FindBy(xpath = "(//input[@value='Save changes']")
    WebElement saveChangesButton;
    @FindBy(xpath = "//span[text()='Messenger']")
    WebElement messengerBtn;
    @FindBy(xpath = "(//input[@aria-label='Search Messenger'])")
    WebElement searchMessengerField;
    @FindBy(xpath = "(//span[text()='Amirouche Boudissa'])[1]")
    WebElement nameProfile;
    @FindBy(xpath = "//div[@aria-label='Message']")
    WebElement messageField;
    @FindBy(xpath = "//div[@aria-label='Press enter to send']")
    public
    WebElement sendBtn;
    @FindBy(xpath = "//span[text()='Managing Your Account']")
    WebElement managingYourAccountBtn;
    @FindBy(xpath = "(//span[text()='General']")
    WebElement loginAndPasswordBtn;


    public void clickOnLoginAndPasswordBtn() {
        Actions action = new Actions(driver);
        action.moveToElement(loginAndPasswordBtn).click().build().perform();
    }
    public void clickOnManagingYourAccountBtn(){click(managingYourAccountBtn);}
    public void clickOnSettingPrivacy(){click(settingPrivacy);}
    public void clickOnLanguageOption(){click(languageOption);}
    public void clickOnEditLink(){click(editLink);}

    public void clickOnSaveChanges(){click(saveChangesButton);}
    public void selectDropdownLanguages() {
        selectDropdownOption(languages, "Deutsch");
    }
    public void clickOnhelpSupport(){click(helpSupport);}
    public void clickOnhelpCenter(){click(helpCenter);}
   // public void clickOnSearchField(){click(searchField);}
    public void scrollDownIntoMarketPlaceIcon(){scrollToView(marketPlaceIcon); }
    public void clickOnMarketPlaceIcon(){
        Actions action = new Actions(driver);
        action.moveToElement(marketPlaceIcon).click().build().perform();}

    public void clickOnYesButton(){
        Actions action = new Actions(driver);
        action.moveToElement(yesButton).click().build().perform();
    }
//       click(yesButton);
//        acceptAlert();}

    public void typeOnSearchHelpArticlesField(){type(searchHelpArticlesField, "How can i unlock my account?");}
    public String getProfilePageTitle(){
        return getTitle();
    }
    public void clickOnAccountIcon(){
        click(accountIcon);
    }
    public void clickOnLogOut(){
        click(logOut);
    }
    public void clickOnFeedback(){click(giveFeedbackLink);}
    public String getTextMassege() {return getText(textMessage);}
    public void clickOnSomethingWentWongIcon(){click(somethingWentWongIcon);}
    public String getText() {return getText(text);}
    public void clickOnChooseAnAreaLink(){               //click(chooseAnAreaLink);}
    Actions action = new Actions(driver);
    action.moveToElement(chooseAnAreaLink).click().build().perform();}
    public void clickOnOtherOption(){click(otherWord);}
    public void scrollDownIntoView() {scrollToView(otherWord);}
    public void typeOnDetailsField(){type(detailsField, "the site bugs");}
    public void clickOnSubmitButton(){click(submitButton);}
    public String getTextDisplayed() {return getText(textDisplayed);}
    public void scrollDownIntoMessengerBtn(){scrollToView(messengerBtn);click(messengerBtn);}
    public void typeOnSearchMessengerField(){ type(searchMessengerField, "Amirouche Boudissa");}
    public void clickOnNameProfile(){//click(nameProfile);}
         Actions action = new Actions(driver);
        action.moveToElement(nameProfile).click().build().perform();}
                                                                                         //
    public void typeOnMessageField(){type(messageField, "Hey, i hope everything is going good for you");}
    public void clickOnSendBtn(){
        click(sendBtn);
    }
                                                                                     //click(sendBtn);
}
