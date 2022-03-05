package us.piit;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends CommonAPI {
    public ProfilePage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ("//span[text()='Amar']"))
    public
    WebElement amarBtn;
    @FindBy(xpath = "//span[text()='About']")
    public
    WebElement aboutBtn;
    @FindBy(xpath = "//span[text()='Overview']")
    public
    WebElement overviewBtn;
    @FindBy(xpath = "(//div[@aria-label='Options'])[1]")
    WebElement workPlaceOption;
    @FindBy(xpath = "//span[text()='Edit Workplace']")
    public
    WebElement editWorkPlace;
    @FindBy(xpath = ("//label[@aria-label='Company']"))
    public
    WebElement companyField;
    @FindBy(xpath = "//label[@aria-label='Position']")
    public
    WebElement positionField;
    @FindBy(xpath = "//label[@aria-label='City/Town']")
    public
    WebElement cityTownField;
    @FindBy(xpath = "//label[@aria-label='Description']")
    public
    WebElement descriptionField;
    @FindBy(xpath = "//div[@aria-label='Save']")
    public
    WebElement saveButton;
    @FindBy(xpath = "//span[text()='Delete workplace']")
    public
    WebElement deleteWorkPlace;
    @FindBy(xpath = "//span[text()='Are you sure you want to remove this workplace from your profile?']")
    WebElement alertDeleteWorkPlace;
    @FindBy(xpath = "//span[text()='Work and education']")
    WebElement workEducationBtn;
    @FindBy(xpath = "(//div[@aria-label='Options'])[2]")
    public
    WebElement highSchoolOptionBtn;
    @FindBy(xpath = "//span[text()='Edit school']")
    WebElement editHighSchoolBtn;
    @FindBy(xpath = "//label[@aria-label='School']")
    public
    WebElement highSchoolField;
    @FindBy(xpath = "//span[text()='Delete school']")
    public
    WebElement deleteSchool;
    @FindBy(css = "#jsc_c_wp")
    public
    WebElement schoolField;
    @FindBy(xpath = "//span[text()='Contact and basic info']")
    public
    WebElement contactAndBasicInfoBtn;
    @FindBy(xpath = "//a[text()='http://www.google.com/']")
    public
    WebElement websiteLinkBtn;
    @FindBy(xpath = "//span[text()='Family and relationships']")
    public
    WebElement familyAndRelationshipsBtn;
    @FindBy(xpath = ("//span[text()='Add a family member']"))
    public
    WebElement addFamilyMemberBtn;
    @FindBy(xpath = "//label[@aria-label='Family Member']")
    public
    WebElement familyMemberField;
    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
    public
    WebElement relationshipsBtn;
    @FindBy(xpath = "//span[text()='Brother']")
    public
    WebElement brotherOption;
    @FindBy(xpath = "//span[text()='Sidi Ali Arris']")
    WebElement textName;
    @FindBy(xpath = "//span[text()='Married']")
    WebElement statusOptionDisplayed;
    @FindBy(xpath = "//span[text()='Details about you']")
    public
    WebElement detailsAboutYouBtn;
    @FindBy(xpath = "//span[text()='I like practice sport , read books and travelling']")
    WebElement textDetails;
    @FindBy(xpath = "(//span[text()='Places lived'])[1]")
    public
    WebElement placesLived;
    @FindBy(xpath = "//span[text()='Add city']")
    public
    WebElement addCityBtn;
    @FindBy(xpath = "//label[@aria-label='City']")
    public
    WebElement cityField;
    @FindBy(xpath = "(//div[@aria-label='Options'])[2]")
    public
    WebElement options;
    @FindBy(xpath = "//span[text()='Delete']")
    public
    WebElement deleteBtn;
    @FindBy(xpath = "//span[text()='Are you sure you want to remove this city from your profile?']")
    WebElement textMessage;
    @FindBy(xpath = "//span[text()='Edit city']")
    public
    WebElement editCityBtn;
    @FindBy(xpath = "(//div[@aria-label='Edit Privacy'])[1]")
    public
    WebElement editPrivacy;
    @FindBy(xpath = "//span[text()='Public']")
    public
    WebElement publicOption;
    @FindBy(xpath = "//span[text()='Add a name pronunciation']")
    public
    WebElement addANamePronunciationBtn;
    @FindBy(xpath = "//input[@name='uh-MARR']")
    public
    WebElement radioUhmarr;
    @FindBy(xpath = "//input[@name='uh-REES']")
    public
    WebElement radioUhrees;
    @FindBy(xpath = "//div[@aria-label='Options']")
    public
    WebElement editRadioOptionBtn;
    @FindBy(xpath = "//span[text()='Edit name pronunciation']")
    public
    WebElement editNameNronunciationBtn;
    @FindBy(xpath = "//input[@name='A-mer']")
    public
    WebElement radioAmer;
    @FindBy(xpath = "//input[@name='A-ris']")
    public
    WebElement radioAris;
    @FindBy(xpath = "//span[text()='Delete name pronunciation']")
    public
    WebElement deleteNamePronunciationBtn;
    @FindBy(xpath = "//span[text()='Are you sure you want to delete your name pronunciation?']")
    WebElement alertMessage;
    @FindBy(xpath = "(//div[@aria-label='Edit'])[2]")
    public
    WebElement editYourFavoriteQuotationsBtn;
    @FindBy(xpath = "//label[@aria-label='Favorite quotes']")
    public
    WebElement favoriteQuotesField;
    @FindBy(xpath = "//textarea[text()='The life has no limitations except the ones you make.']")
    WebElement textConfirmation;
    @FindBy(xpath = "//span[text()='Add a nickname, a birth name...']")
    public
    WebElement addMaidenNameBtn;
    @FindBy(xpath = "//label[@aria-label='Name Type']")
    public
    WebElement nameType;
    @FindBy(xpath = "//label[@aria-label='Name']")
    public
    WebElement nameField;
    @FindBy(xpath = "(//span[text()='Maiden Name'])[2]")
    public
    WebElement nameOption;
    @FindBy(xpath = "//span[text()='Edit name']")
    public
    WebElement editName;
    @FindBy(xpath = "//span[text()='Delete name']")
    public
    WebElement deleteName;
    @FindBy(xpath = "//label[@aria-label='Name']")
    public
    WebElement newNameField;
    @FindBy(xpath = "//span[text()='Are you sure you want to delete this name?']")
    WebElement confirmationMessage;
    @FindBy(xpath = "//div[@aria-label='Edit address']")
    public
    WebElement editAddressBtn;
    @FindBy(xpath = "//label[@aria-label='Address']")
    public
    WebElement addressField;
    @FindBy(xpath = "//label[@aria-label='ZIP']")
    public
    WebElement zipField;
    @FindBy(xpath = "//label[@aria-label='Neighborhood']")
    public
    WebElement neighborhoodField;
    @FindBy(xpath = "(//i[@data-visualcompletion='css-img'])[12]")
    public
    WebElement addALanguageBtn;
    @FindBy(xpath = "//label[@aria-label='Languages']")
    public
    WebElement languagesField;
    @FindBy(xpath = "//span[text()='French (language)']")
    public
    WebElement frenchLanguage;
    @FindBy(xpath = "//div[@aria-label='Add your political views']")
    public
    WebElement politicalViewsBtn;
    @FindBy(xpath = "//label[@aria-label='Political Views']")
    public
    WebElement politicalViewsField;
    @FindBy(xpath = "(//div[@aria-label='Options'])[4]")
    public
    WebElement homeTownOption;
    @FindBy(xpath = "//span[text()='Edit hometown']")
    public
    WebElement editHomeTown;
    @FindBy(xpath = "//label[@aria-label='Hometown']")
    public
    WebElement homeTownField;
    @FindBy(xpath = "//span[text()='Aït Chafa, Tizi Ouzou, Algeria']")
    WebElement townName;
    @FindBy(xpath = "//span[text()='Delete hometown']")
     public
    WebElement deleteHomeTown;
    @FindBy(xpath = "//span[text()='Are you sure you want to remove this city from your profile?']")
    WebElement deleteMessage;
    @FindBy(xpath = "(//div[@aria-label='Options'])[3]")
    public
    WebElement currentCityOption;
    @FindBy(xpath = "//span[text()='Edit current city']")
    public
    WebElement editCurrentCity;
    @FindBy(xpath = "//label[@aria-label='Current City']")
    public
    WebElement currentCityField;
    @FindBy(xpath = "//span[text()='Brooklyn, New York']")
    WebElement newCurrentCity;
    @FindBy(xpath = "//span[text()='Delete current city']")
    public
    WebElement deleteCurrentCity;
    @FindBy(xpath = "//span[text()='Bibliothèque Universitaire UMMTO Bastos']")
    public
    WebElement myHighSchoolName;
    @FindBy(xpath = "//span[text()='Brooklyn, New York']")
    WebElement myCurrentCity;
    @FindBy(xpath = "//a[text()='http://www.ummto.dz/']")
    WebElement linkHighSchool;
    @FindBy(xpath = "//a[text()='http://www.brooklyn-usa.org/']")
    public
    WebElement linkCurrentCity;
    @FindBy(xpath = "(//span[text()='Posts'])[1]")
    public
    WebElement postsBtn;
    @FindBy(xpath = "//div[@aria-label='Edit hobbies']")
    public
    WebElement editHobbiesBtn;
    @FindBy(xpath = "//span[text()='Reading']")
    public
    WebElement readingHobbie;
    @FindBy(xpath = "(//span[text()='Save'])[1]")
    public
    WebElement saveBtn;

    public void clickOnPostsBtn(){click(postsBtn);}
    public void clickOnEditHobbiesBtn(){click(editHobbiesBtn);}
    public void clickOnReadingHobbie(){click(readingHobbie);}
    public void clickOnSaveBtn(){click(saveBtn);}

    public void clickOnLinkCurrentCity(){click(linkCurrentCity);}
    public void clickOnLinkHighSchool(){click(linkHighSchool);}
    public void hoverOverMyCurrentCity(WebDriver driver){hoverOver(driver, myCurrentCity);}
    public void hoverOverMyHighSchoolName(WebDriver driver){hoverOver(driver, myHighSchoolName);}
    public void clickOnDeleteCurrentCity(){click(deleteCurrentCity);}
    public void clickOnNewCurrentCity(){click(newCurrentCity);}
    public void typeOnCurrentCityField(){type(currentCityField, "Brooklyn");}
    public void clickOnEditCurrentCity(){click(editCurrentCity);}
    public void clickOnCurrentCityOption(){click(currentCityOption);}
    public void clickOnDeleteHomeTown(){click(deleteHomeTown);}
    public String getDeleteMessage(){return getText(deleteMessage);}
    public void clickOnTownName(){click(townName);}
    public void typeOnHomeTownField(){type(homeTownField, "AitChafa");}
    public void clickOnEditHomeTown(){click(editHomeTown);}
    public void clickOnHomeTownOption(){click(homeTownOption);}
    public void typeOnNewDescriptionField(){type(descriptionField, "I'am Not interested");}
    public void typeOnPoliticalViewsField(){type(politicalViewsField, "non");}
    public void clearPoliticalViewsField(){
        Actions action=new Actions(driver);
        action.moveToElement(politicalViewsField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void clickOnPoliticalViewsBtn(){click(politicalViewsBtn);}
    public void scrollDownIntoAddALanguageBtn(){scrollToView(addALanguageBtn);click(addALanguageBtn);}
    public void clickOnFranchLanguage(){click(frenchLanguage);}
    public void typeOnLanguagesField(){type(languagesField, "French (Language)");}
    public void clickOnAddALanguageBtn(){click(addALanguageBtn);}
    public void pressOnAddALanguageBtn(){pressEnter(addALanguageBtn);}
    public void typeOnNeighborhoodField(){type(neighborhoodField, "BayRidge");}
    public void clearNeighborhoodField(){
        Actions action=new Actions(driver);
        action.moveToElement(neighborhoodField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnZipField(){type(zipField, "11209");}
    public void clearZipField(){
        Actions action=new Actions(driver);
        action.moveToElement(zipField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnNewCityTownField(){type(cityTownField, "Brooklyn");}
    public void clearCityTownField(){
        Actions action=new Actions(driver);
        action.moveToElement(cityTownField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnAddressField(){type(addressField, "446 78th Street");}
    public void clearAddressField(){
        Actions action=new Actions(driver);
        action.moveToElement(addressField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void clickOnEditAddressBtn(){click(editAddressBtn);}
    public String getConfirmationMessage(){return getText(confirmationMessage);}
    public void clearNameField(){
        Actions action=new Actions(driver);
        action.moveToElement(nameField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void clickOnDeleteName(){click(deleteName);}
    public void clickOnEditName(){click(editName);}
    public void typeOnNameField(){type(nameField, "Yugurthen");}
    public void typeOnNewNameField(){type(newNameField, "Masensen");}
    public void clickOnNameType(){click(nameType);}
    public void clickOnNameOption(){click(nameOption);}
    public void clickOnAddMaidenNameBtn(){click(addMaidenNameBtn);}
    public void clearFavoriteQuotesField(){
        Actions action=new Actions(driver);
        action.moveToElement(favoriteQuotesField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnFavoriteQuotesField(){type(favoriteQuotesField, "The life has no limitations except the ones you make.");}
    public void clickOnEditYourFavoriteQuotationsBtn(){click(editYourFavoriteQuotationsBtn);}
    public String getAlertMessage(){return getText(alertMessage);}
    public String getTextConfirmation(){return getText(textConfirmation);}
    //public String getConfirmationAddress(){return getText();}
    public void clickOnDeleteNamePronunciation(){click(deleteNamePronunciationBtn);}
    public void clickOnRadioAris(){click(radioAris);}
    public void clickOnRadioAmer(){click(radioAmer);}
    public void clickOnEditNamePronunciationBtn(){click(editNameNronunciationBtn);}
    public void clickOnEditRadioOptions(){click(editRadioOptionBtn);}
    public void clickOnRadioUhrees(){click(radioUhrees);}
    public void clickOnRadioUhmarr(){click(radioUhmarr);}
    public void clickOnAddANamePronuciationBtn(){click(addANamePronunciationBtn);}
    public void clickOnPublicOption(){click(publicOption);}
    public void clickOnEditPrivacy(){click(editPrivacy);}
    public void typeOnNewCityField(){type(cityField, "Bougie, Bejaia, Algeria");}
    public void clearCityField(){
        Actions action=new Actions(driver);
        action.moveToElement(cityField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void clickOnEditCityBtn(){click(editCityBtn);}
    public void clickOnDeleteBtn(){click(deleteBtn);}
    public void clickOnOptions(){click(options);}
    public void typeOnCityField(){type(cityField, "Hassi Messaoud");}
    public void clickOnAddCityBtn(){click(addCityBtn);}
    public void clickOnPlaceLivedBtn(){click(placesLived);}
    public void clickOnDetailsAboutYouBtn(){click(detailsAboutYouBtn);}
    public String getTextMessage(){return getText(textMessage);}
    public String getTextDetails(){return getText(textDetails);}
    public String getStatusOptionDisplayed(){return getText(statusOptionDisplayed);}
    public void clickOnContactAndBasicInfoBtn(){click(contactAndBasicInfoBtn);}
    public void clickOnWebsiteLinkBtn(){click(websiteLinkBtn);}
    public void clickOnFamilyAndRelationshipsBtn(){click(familyAndRelationshipsBtn);}
    public void clickOnAddFamilyMemberBtn(){click(addFamilyMemberBtn);}
    public void typeOnFamilyMemberField(){type(familyMemberField, "Sidi Ali Arris");}
    public void clickOnRelationshipsBtn(){click(relationshipsBtn);}
    public void clickOnBrotherOption(){
        Actions action = new Actions(driver);
        action.moveToElement(brotherOption).click().build().perform();}
    public void clickOnAmarBtn(){click(amarBtn);}
    public void clickOnAboutBtn(){click(aboutBtn);}
    public void clickOnOverviewBtn(){click(overviewBtn);}
    public void clickOnWorkPlaceOption(){click(workPlaceOption);}
    public void clickOnEditWorkPlace(){click(editWorkPlace);}
    public void clearOnCompanyField(){
        Actions action=new Actions(driver);
        action.moveToElement(companyField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnCompanyField(){type(companyField,"Total");}
    public void clearOnPositionField(){
        Actions action=new Actions(driver);
        action.moveToElement(positionField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnPositionField(){type(positionField, "engeneer ");}
    public void clearOnCityTownField(){
        Actions action=new Actions(driver);
        action.moveToElement(companyField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnCityTownField(){type(cityTownField, "south Algeria");}
    public void clearOnDescriptionField(){
        Actions action=new Actions(driver);
        action.moveToElement(descriptionField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnDescriptionField(){type(descriptionField, "oil and gas domain");}
    public void clickOnSaveButton(){click(saveButton);}
    public void clickOnDeleteWorkPlace(){click(deleteWorkPlace);}
    public String getAlertDeleteWorkPlace(){return getText(alertDeleteWorkPlace);}
    public void clickOnWorkAndEducationBtn(){click(workEducationBtn);}
    public void clickOnHighSchoolOption(){click(highSchoolOptionBtn);}
    public void clickOnEditHighSchool(){
        Actions action = new Actions(driver);
        action.moveToElement(editHighSchoolBtn).click().build().perform();}
        //click(editHighSchoolBtn);}
    public void clearOnHighSchoolField(){
        Actions action=new Actions(driver);
        action.moveToElement(highSchoolField).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();}
    public void typeOnHighSchoolField(){type(schoolField, "Algers univercity ");}
    public String getPageTitle(){return getTitle();}
    public String getTextName(){return getText(textName);}
    public void clickOnDeleteSchool(){click(deleteSchool);}


}
