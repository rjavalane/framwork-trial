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

public class TestFeatureProfile extends CommonAPI {

   @Test
    public void testAddWorkPlace() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        profilepage.clickOnOverviewBtn();
        Assert.assertEquals(getTitle(), "Amar Arris | Facebook");
        profilepage.clickOnWorkPlaceOption();
        Assert.assertTrue(profilepage.editWorkPlace.isEnabled());
        profilepage.clickOnEditWorkPlace();
        profilepage.clearOnCompanyField();
        Assert.assertTrue(profilepage.companyField.isEnabled());
        profilepage.typeOnCompanyField();
        profilepage.clearOnPositionField();
        Assert.assertTrue(profilepage.positionField.isEnabled());
        profilepage.typeOnPositionField();
        profilepage.clearOnCityTownField();
        Assert.assertTrue(profilepage.cityTownField.isEnabled());
        profilepage.typeOnCityTownField();
        profilepage.clearOnDescriptionField();
        Assert.assertTrue(profilepage.descriptionField.isEnabled());
        profilepage.typeOnDescriptionField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }
    @Test
    public void testDeleteWorkPlace() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.overviewBtn.isEnabled());
        profilepage.clickOnOverviewBtn();
        Assert.assertEquals(getTitle(), "Amar Arris | Facebook");
        profilepage.clickOnWorkPlaceOption();
        Assert.assertTrue(profilepage.deleteWorkPlace.isEnabled());
        profilepage.clickOnDeleteWorkPlace();
       Assert.assertEquals(profilepage.getAlertDeleteWorkPlace(), "Are you sure you want to remove this workplace from your profile?");
    }

     @Test
    public void testEditHighSchool() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        profilepage.clickOnWorkAndEducationBtn();
        profilepage.clickOnHighSchoolOption();
        profilepage.clickOnEditHighSchool();
        profilepage.clearOnHighSchoolField();
        Assert.assertTrue(profilepage.highSchoolField.isEnabled());
        profilepage.typeOnHighSchoolField();
    }
   @Test
    public void testDeleteHighSchool() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        profilepage.clickOnWorkAndEducationBtn();
        Assert.assertTrue(profilepage.highSchoolOptionBtn.isEnabled());
        profilepage.clickOnHighSchoolOption();
        Assert.assertTrue(profilepage.deleteSchool.isEnabled());
        profilepage.clickOnDeleteSchool();
    }

    @Test
    public void testWebsiteContactLink() {
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
        Assert.assertTrue(profilepage.websiteLinkBtn.isEnabled());
        profilepage.clickOnWebsiteLinkBtn();
        String parent = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for (String window : allwindows
        ) {
            if (!(parent.equals(window))) {
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(), "Google");

            }

        }
    }

   @Test
    public void testAddFamilyMember() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        profilepage.clickOnAboutBtn();
        Assert.assertTrue(profilepage.familyAndRelationshipsBtn.isEnabled());
        profilepage.clickOnFamilyAndRelationshipsBtn();
        Assert.assertTrue(profilepage.addFamilyMemberBtn.isEnabled());
        profilepage.clickOnAddFamilyMemberBtn();
        Assert.assertTrue(profilepage.familyMemberField.isEnabled());
        profilepage.typeOnFamilyMemberField();
        Assert.assertTrue(profilepage.relationshipsBtn.isEnabled());
        profilepage.clickOnRelationshipsBtn();
        Assert.assertTrue(profilepage.brotherOption.isEnabled());
        profilepage.clickOnBrotherOption();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
        Assert.assertEquals(profilepage.getTextName(), "Sidi Ali Arris");
    }
   @Test
    public void testCheckRelationshipStatus() {
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
        Assert.assertTrue(profilepage.familyAndRelationshipsBtn.isEnabled());
        profilepage.clickOnFamilyAndRelationshipsBtn();
        Assert.assertEquals(profilepage.getStatusOptionDisplayed(), "Married");

    }
    @Test
    public void testCheckDetaitlsAboutYou () {
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
        Assert.assertEquals(profilepage.getTextDetails(), "I like practice sport , read books and travelling");
    }
   @Test
    public void testAddLivedCity () {
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
        Assert.assertTrue(profilepage.placesLived.isEnabled());
        profilepage.clickOnPlaceLivedBtn();
        Assert.assertTrue(profilepage.addCityBtn.isEnabled());
        profilepage.clickOnAddCityBtn();
        Assert.assertTrue(profilepage.cityField.isEnabled());
        profilepage.typeOnCityField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }
    @Test
    public void testDeleteLivedCity () {
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
        Assert.assertTrue(profilepage.placesLived.isEnabled());
        profilepage.clickOnPlaceLivedBtn();
        Assert.assertTrue(profilepage.options.isEnabled());
        profilepage.clickOnOptions();
        Assert.assertTrue(profilepage.deleteBtn.isEnabled());
        profilepage.clickOnDeleteBtn();
        Assert.assertEquals(profilepage.getTextMessage(), "Are you sure you want to remove this city from your profile?");
    }
    @Test
    public void testEditLivedCity () {
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
        Assert.assertTrue(profilepage.placesLived.isEnabled());
        profilepage.clickOnPlaceLivedBtn();
        Assert.assertTrue(profilepage.options.isEnabled());
        profilepage.clickOnOptions();
        Assert.assertTrue(profilepage.editCityBtn.isEnabled());
        profilepage.clickOnEditCityBtn();
        Assert.assertTrue(profilepage.cityField.isEnabled());
        profilepage.clearCityField();
        Assert.assertTrue(profilepage.cityField.isEnabled());
        profilepage.typeOnNewCityField();
        Assert.assertTrue(profilepage.saveButton.isEnabled());
        profilepage.clickOnSaveButton();
    }
   @Test
    public void testChangeSelectAudienceOption() {
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
        Assert.assertTrue(profilepage.placesLived.isEnabled());
        profilepage.clickOnPlaceLivedBtn();
        Assert.assertTrue(profilepage.editPrivacy.isEnabled());
        profilepage.clickOnEditPrivacy();
        Assert.assertTrue(profilepage.publicOption.isEnabled());
        profilepage.clickOnPublicOption();

    }
    @Test
    public void testEditHobbies() {
        LogInPage loginPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        loginPage.signInWithValidCredentials();
        homePage.clickOnHomePage();
        profilepage.clickOnAmarBtn();
        WebElement aboutBtn = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='About']")));
        Assert.assertTrue(profilepage.postsBtn.isEnabled());
        profilepage.clickOnPostsBtn();
        Assert.assertTrue(profilepage.editHobbiesBtn.isEnabled());
        profilepage.clickOnEditHobbiesBtn();
        Assert.assertTrue(profilepage.readingHobbie.isEnabled());
        profilepage.clickOnReadingHobbie();
        Assert.assertTrue(profilepage.saveBtn.isEnabled());
        profilepage.clickOnSaveBtn();

    }


}
