package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void scrollDownToVotingInformationCenterBtn(){
        scrollToView(votingInformationCenterBtn);
        click(votingInformationCenterBtn);
    }
    public void clickOnCheckRegistrationBtn(){
        click(checkRegistrationBtn);
    }
    public void clickOnCountyBtn(){
        click(selectCountyBtn);
    }
    public void selectDropdownCounty(String option) {
        selectDropdownOption(selectCountyBtn, "King (Brooklyn)");
    }
    public void typeOnLastNameField(){
        type(lastNameField, "");
    }







}
