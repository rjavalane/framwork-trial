package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class VotingInformationCenter extends CommonAPI {
    public VotingInformationCenter(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Voting Information Center']")
    WebElement votingInformationCenterBtn;
    @FindBy(xpath = "//span[text()='Check registration']")
    WebElement checkRegistrationBtn;
    @FindBy(xpath = "//select[@name='SelectedCountyId']")
    WebElement selectCountyBtn;
    @FindBy(xpath = "//input[@id='lname']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@id='fname']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='dob']")
    WebElement dobField;
    @FindBy(xpath = "//input[@id='zip']")
    WebElement zipCodeField;
    @FindBy(xpath = "//input[@id='submitbtn']")
    WebElement searchSubmitBtn;
    @FindBy(xpath = "//b[text()='NY State Board of Elections']")
    WebElement textTitle;
    @FindBy(xpath = "//span[text()='Get information']")
    WebElement getInformationBtn;
    @FindBy(xpath = "//a[text()='General Information']")
    WebElement generalInformationBtn;
    @FindBy(xpath = "(//a[text()='About the Laws'])[1]")
    WebElement aboutTheLawsBtn;
    @FindBy(xpath = "(//span[text()='Manage Location'])[1]")
    WebElement manageLocationBtn;
    @FindBy(xpath = "//span[text()='Enter Address']")
    WebElement enterAddressBtn;
    @FindBy(xpath = "(//input[@role='combobox'])[2]")
    WebElement searchAddressField;
    @FindBy(xpath = "(//span[text()='Save'])[1]")
    WebElement saveBtn;
    @FindBy(xpath = "(//span[text()='77 77th St, Brooklyn'])[1]")
    WebElement addressDisplayed;

    public void clickOnManageLocationBtn(){click(manageLocationBtn);}
    public void clickOnEnterAddressBtn(){click(enterAddressBtn);}
    public void typeOnSearchAddressField(){type(searchAddressField, "77 77th St, Brooklyn, NY 11209-2920, United States");}
    public void clickOnsaveBtn(){click(saveBtn);}
    public String getAddressDisplayed(){return getText(addressDisplayed);}
    public void clickOnGetInformationBtn(){click(getInformationBtn);}
    public void hoverOverGeneralInformationBtn(WebDriver driver){hoverOver(driver, generalInformationBtn);}
    public void clickOnAboutTheLawsBtn(){click(aboutTheLawsBtn);}
    public void scrollDownToVotingInformationCenterBtn(){
        scrollToView(votingInformationCenterBtn);
        click(votingInformationCenterBtn);
    }
    public void clickOnCheckRegistrationBtn(){click(checkRegistrationBtn);}
    public void clickOnCountyBtn(){click(selectCountyBtn);}
    public void selectDropdownCounty() {
        selectDropdownOption(selectCountyBtn, "Kings (Brooklyn)");
    }
    public void typeOnLastNameField(){
        type(lastNameField, "Chamekh");
    }
    public void typeOnfirstNameField(){
        type(lastNameField, "Nassera");
    }
    public void typeOnDobField(){
        type(lastNameField, "03/13/1978");
    }
    public void typeOnZipCodeField(){
        type(lastNameField, "11209");
    }
    public void clickOnSearchSubmitBtn(){click(searchSubmitBtn);}
    public String getTextTitle(){return getText(textTitle);}
    public String getTitle(){return getTitle();}








}
