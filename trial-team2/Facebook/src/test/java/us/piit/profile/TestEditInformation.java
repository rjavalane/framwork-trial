package us.piit.profile;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.ProfilePage;

import java.util.Set;

public class TestEditInformation extends CommonAPI {
     @Test
    public void testSelectRadioButtonNamePronnunciationOption() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.editRadioOptionBtn.isEnabled());
        profilepage.clickOnEditRadioOptions();
        Assert.assertTrue(profilepage.editNameNronunciationBtn.isEnabled());
        profilepage.clickOnEditNamePronunciationBtn();
        Assert.assertTrue(profilepage.radioUhmarr.isEnabled());
        profilepage.clickOnRadioUhmarr();
        Assert.assertTrue(profilepage.radioUhrees.isEnabled());
        profilepage.clickOnRadioUhrees();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }

    @Test
    public void testEditSelectRadioButtonNamePronunciationOption() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.editRadioOptionBtn.isEnabled());
        profilepage.clickOnEditRadioOptions();
        Assert.assertTrue(profilepage.editNameNronunciationBtn.isEnabled());
        profilepage.clickOnEditNamePronunciationBtn();
        Assert.assertTrue(profilepage.radioAmer.isEnabled());
        profilepage.clickOnRadioAmer();
        Assert.assertTrue(profilepage.radioAris.isEnabled());
        profilepage.clickOnRadioAris();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }

     @Test
    public void testDeleteRadioButtonNamePronunciationOption() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.editRadioOptionBtn.isEnabled());
        profilepage.clickOnEditRadioOptions();
        Assert.assertTrue(profilepage.deleteNamePronunciationBtn.isEnabled());
        profilepage.clickOnDeleteNamePronunciation();
        Assert.assertEquals(profilepage.getAlertMessage(), "Are you sure you want to delete your name pronunciation?");
    }

    @Test
    public void testAddFavoriteQuotes() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.editYourFavoriteQuotationsBtn.isEnabled());
        profilepage.clickOnEditYourFavoriteQuotationsBtn();
        profilepage.clearFavoriteQuotesField();
        Assert.assertTrue(profilepage.favoriteQuotesField.isEnabled());
        profilepage.typeOnFavoriteQuotesField();
        profilepage.clickOnSaveButton();
        Assert.assertEquals(profilepage.getTextConfirmation(), "The life has no limitations except the ones you make.");
    }

    @Test
    public void testAddMaidenName() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.addMaidenNameBtn.isEnabled());
        profilepage.clickOnAddMaidenNameBtn();
        Assert.assertTrue(profilepage.nameType.isEnabled());
        profilepage.clickOnNameType();
        Assert.assertTrue(profilepage.nameOption.isEnabled());
        profilepage.clickOnNameOption();
        Assert.assertTrue(profilepage.nameField.isEnabled());
        profilepage.typeOnNameField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }

    @Test
    public void testEditMaidenName() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.options.isEnabled());
        profilepage.clickOnOptions();
        Assert.assertTrue(profilepage.editName.isEnabled());
        profilepage.clickOnEditName();
        profilepage.clearNameField();
        Assert.assertTrue(profilepage.newNameField.isEnabled());
        profilepage.typeOnNewNameField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }

    @Test
    public void testDeleteMaidenName() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.aboutBtn.isEnabled());
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.detailsAboutYouBtn.isEnabled());
        profilepage.clickOnDetailsAboutYouBtn();
        Assert.assertTrue(profilepage.options.isEnabled());
        profilepage.clickOnOptions();
        Assert.assertTrue(profilepage.deleteName.isEnabled());
        profilepage.clickOnDeleteName();
        Assert.assertEquals(profilepage.getConfirmationMessage(), "Are you sure you want to delete this name?");
    }

    @Test
    public void testEditAddress() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.contactAndBasicInfoBtn.isEnabled());
        profilepage.clickOnContactAndBasicInfoBtn();
        Assert.assertTrue(profilepage.editAddressBtn.isEnabled());
        profilepage.clickOnEditAddressBtn();
        profilepage.clearAddressField();
        Assert.assertTrue(profilepage.addressField.isEnabled());
        profilepage.typeOnAddressField();
        profilepage.clearCityTownField();
        Assert.assertTrue(profilepage.cityTownField.isEnabled());
        profilepage.typeOnNewCityTownField();
        profilepage.clearZipField();
        Assert.assertTrue(profilepage.zipField.isEnabled());
        profilepage.typeOnZipField();
        profilepage.clearNeighborhoodField();
        Assert.assertTrue(profilepage.neighborhoodField.isEnabled());
        profilepage.typeOnNeighborhoodField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }

    @Test
    public void testAddLanguage() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.contactAndBasicInfoBtn.isEnabled());
        profilepage.clickOnContactAndBasicInfoBtn();
        profilepage.scrollDownIntoAddALanguageBtn();
        Assert.assertTrue(profilepage.addALanguageBtn.isEnabled());
        profilepage.clickOnAddALanguageBtn();
        Assert.assertTrue(profilepage.languagesField.isEnabled());
        profilepage.typeOnLanguagesField();
        Assert.assertTrue(profilepage.frenchLanguage.isEnabled());
        profilepage.clickOnFranchLanguage();
        Assert.assertTrue(profilepage.contactAndBasicInfoBtn.isEnabled());
        profilepage.clickOnSaveButton();
    }

    @Test
    public void testEditPoliticalViews() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 2))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.contactAndBasicInfoBtn.isEnabled());
        profilepage.clickOnContactAndBasicInfoBtn();
        Assert.assertTrue(profilepage.politicalViewsBtn.isEnabled());
        profilepage.clickOnPoliticalViewsBtn();
        profilepage.clearPoliticalViewsField();
        Assert.assertTrue(profilepage.politicalViewsField.isEnabled());
        profilepage.typeOnPoliticalViewsField();
        profilepage.clearOnDescriptionField();
        Assert.assertTrue(profilepage.descriptionField.isEnabled());
        profilepage.typeOnNewDescriptionField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }

    @Test
    public void testEditHomeTown() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        Assert.assertTrue(profilepage.amarBtn.isEnabled());
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        Assert.assertTrue(profilepage.homeTownOption.isEnabled());
        profilepage.clickOnHomeTownOption();
        Assert.assertTrue(profilepage.editHomeTown.isEnabled());
        profilepage.clickOnEditHomeTown();
        Assert.assertTrue(profilepage.homeTownField.isEnabled());
        profilepage.typeOnHomeTownField();
        profilepage.clickOnTownName();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
        Assert.assertEquals(profilepage.getTitle(), "Amar Arris | Facebook");
    }

    @Test
    public void testDeleteHomeTown() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        Assert.assertTrue(profilepage.amarBtn.isEnabled());
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        Assert.assertTrue(profilepage.homeTownOption.isEnabled());
        profilepage.clickOnHomeTownOption();
        Assert.assertTrue(profilepage.deleteHomeTown.isEnabled());
        profilepage.clickOnDeleteHomeTown();
        Assert.assertEquals(profilepage.getDeleteMessage(), "Are you sure you want to remove this city from your profile?");
    }
    @Test
    public void testEditCurrentCity() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        Assert.assertTrue(profilepage.amarBtn.isEnabled());
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        Assert.assertTrue(profilepage.currentCityOption.isEnabled());
        profilepage.clickOnCurrentCityOption();
        Assert.assertTrue(profilepage.editCurrentCity.isEnabled());
        profilepage.clickOnEditCurrentCity();
        Assert.assertTrue(profilepage.currentCityField.isEnabled());
        profilepage.typeOnCurrentCityField();
        profilepage.clickOnNewCurrentCity();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
        Assert.assertEquals(profilepage.getTitle(), "Amar Arris | Facebook");
    }
    @Test
    public void testDeleteCurrentCity() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        Assert.assertTrue(profilepage.amarBtn.isEnabled());
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        Assert.assertTrue(profilepage.currentCityOption.isEnabled());
        profilepage.clickOnCurrentCityOption();
        Assert.assertTrue(profilepage.deleteCurrentCity.isEnabled());
        profilepage.clickOnDeleteCurrentCity();
        Assert.assertEquals(profilepage.getDeleteMessage(), "Are you sure you want to remove this city from your profile?");
    }
    @Test
    public void testLinkMyHighSchool() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        Assert.assertTrue(profilepage.amarBtn.isEnabled());
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        profilepage.hoverOverMyHighSchoolName(driver);
        profilepage.clickOnLinkHighSchool();
        String parent=driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        for (String window:allwindows
        ) {
            if (!(parent.equals(window))) {
                driver.switchTo().window(window);
                Assert.assertEquals(profilepage.getTitle(), "Université Mouloud Mammeri de Tizi-Ouzou - UMMTO");
            }
        }
    }
    @Test
    public void testLinkCurrentCity() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        Assert.assertTrue(profilepage.amarBtn.isEnabled());
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        profilepage.hoverOverMyCurrentCity(driver);
        Assert.assertTrue(profilepage.linkCurrentCity.isEnabled());
        profilepage.clickOnLinkCurrentCity();
        String parent=driver.getWindowHandle();
        Set<String> allwindows=driver.getWindowHandles();
        for (String window:allwindows
        ) {
            if (!(parent.equals(window))) {
                driver.switchTo().window(window);
                Assert.assertEquals(profilepage.getTitle(), "Home - Office of the Brooklyn Borough President Antonio Reynoso");
            }
        }
    }


}