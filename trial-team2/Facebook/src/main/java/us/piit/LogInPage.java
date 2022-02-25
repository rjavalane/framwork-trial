package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends CommonAPI {
    public LogInPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Create new account']")
    WebElement createAccountButton;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@name='reg_email__']")
    WebElement emailField;
    @FindBy(xpath = "//input[@name='reg_email_confirmation__']")
    WebElement emailConfirmationField;
    @FindBy(xpath = "//input[@name='reg_passwd__']")
    WebElement passwordField;
    @FindBy(xpath = "//select[@name='birthday_month']") //
    WebElement month;
    @FindBy(xpath = "//select[@name='birthday_day']")
    WebElement day;
    @FindBy(xpath = "//select[@name='birthday_year']")
    WebElement year;
    @FindBy(xpath = "//label[text()='Male']")
    WebElement gender;
    @FindBy(xpath = "//button[@name='websubmit']")
    WebElement signUpButton;
    @FindBy(xpath = "//span[text()='Welcome to Facebook, Amar']")
    WebElement textDisplay;
    @FindBy(xpath = "//div[text()='The password you’ve entered is incorrect. ']")
    WebElement textMessage;
    @FindBy(xpath = "//input[@name='email']")
    WebElement emailLoginField;
    @FindBy(xpath = "//input[@name='pass']")
    WebElement passwordLoginField;
    @FindBy(xpath = "//button[@name='login']")
    WebElement loginButton;
    @FindBy(xpath = "//a[text()='Find your account and log in.']")
    WebElement errorMessage;
    @FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
    WebElement forgotPasswordBtn;
    @FindBy(xpath = "//input[@id='identify_email']")
    WebElement emailField2;
    @FindBy(xpath = "//button[@id='did_submit']")
    WebElement searchBtn;
    @FindBy(xpath = "//button[@name='reset_action']")
    WebElement continueBtn;


    public String getConfirmationCode() {
        return getText(textDisplay);
    } //

    public String getLoginPageTitle() {
        return getTitle();
    }

    //        public void createAccount(){
//            click(createAccountButton);
//            type(firstNameField,"sidipirlo");
//            type(lastNameField,"caravana");
//            type(emailField,"sidipirlocavana@gmail.com");
//            type(emailConfirmationField,"sidipirlocavana@gmail.com");
//            type(passwordField,"1234cara@");
//            selectDropdownOption(month,"Dec");
//            selectDropdownOption(day,"15");
//            selectDropdownOption(year,"2000");
//            click(gender);
//            click(signUpButton);
//            waitFor(20);
//        }
    public void signInWithValidCredentials() {
        type(emailLoginField, "amararris77@gmail.com");
        type(passwordLoginField, "Ania@02102019");
        click(loginButton);
    }

    public void signInWithInvalidPassword() {
        type(emailLoginField, "wrongusername@gmail.com");
        type(passwordLoginField, "sdfghjk26fghj54898");
        click(loginButton);
    }
    public void signInWithInvalidEmail() {
        type(emailLoginField, "wrongusernameaspoiuegdf@gmail.com");
        type(passwordLoginField, "Ania@02102019");
        click(loginButton);
    }

    public String getTextMassege(){
        return getText(textMessage);
    }
    public String getErrorMessage(){
        return getText(errorMessage);
    }

}

