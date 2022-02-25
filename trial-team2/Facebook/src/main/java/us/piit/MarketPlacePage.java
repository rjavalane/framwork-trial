package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class MarketPlacePage extends CommonAPI {

    public MarketPlacePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Marketplace']")
    WebElement marketPlace;
    @FindBy(xpath = "//h1[text()='Marketplace']")
    WebElement text;
    @FindBy(xpath = "(//input[@type='search'])[2]")
    WebElement searchField2;
    @FindBy(xpath = "(//span[text()='Ships to you'])[1]")
    WebElement iteamShoes;
    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    WebElement addtocart;
    @FindBy(xpath = "//span[text()='Search results']")
    WebElement pageTitle;
    @FindBy(xpath = "//span[text()='Cart']")
    WebElement cart;
    @FindBy(xpath = "(//span[text()='Remove'])[1]")
    WebElement removeButton;
    @FindBy(xpath = "(//i[@class='hu5pjgll lzf7d6o1'])[1]")
    WebElement settingIcon;
    @FindBy(xpath = "//span[text()='Set a custom buyer message']")
    WebElement setMessage;
    @FindBy(xpath = "(//input[@dir='ltr'])[4]")
    WebElement typeMessage;
    @FindBy(xpath = "(//span[text()='Save'])[1]")
    WebElement saveButton;
    @FindBy(xpath = "//span[contains(text(),'A seamless, secure way to pay on the apps you alre')]")
    WebElement facebookPayBtn;
    @FindBy(xpath = "//span[contains(text(),'Add Payment Method')]")
    WebElement addPaymentMethodBtn;
    @FindBy(xpath = "//span[contains(text(),'Credit or Debit Card')]")
    WebElement creditOrDebitCardBtn;
    @FindBy(xpath = "//input[@autocomplete='cc-number']")
    WebElement cardNumberField;
    @FindBy(xpath = "//span[contains(text(),'Please enter a valid credit or debit card number.')]")
    WebElement errorMessage;
    @FindBy(xpath = "//input[@autocomplete='cc-exp']")
    WebElement expirationDateField;
    @FindBy(xpath = "//input[@autocomplete='cc-csc']")
    WebElement CVVField;
    @FindBy(xpath = "//span[contains(text(),'United States')]")
    WebElement country;
    @FindBy(xpath = "//input[@autocomplete='name']")
    WebElement nameCardField;
    @FindBy(xpath = "//input[@autocomplete='address-line1']")
    WebElement billingAddress1Field;
    @FindBy(xpath = "//input[@autocomplete='address-line2']")
    WebElement billingAddress2Field;
    @FindBy(xpath = "//input[@autocomplete='address-level2']")
    WebElement cityField;
    @FindBy(xpath = "//input[@autocomplete='address-level1']")
    WebElement stateField;
    @FindBy(xpath = "//input[@autocomplete='postal-code']")
    WebElement zipCodeField;
    @FindBy(xpath = "(//span[text()='Save'])[1]")
    public
    WebElement saveBtn;
    @FindBy(xpath = "//span[contains(text(),'Add credit or debit card')]")
    WebElement textTitle;
    @FindBy(xpath = "//span[contains(text(),'iPhone 13 max 128 fb')]")
    WebElement iphone13Max128;



    public void clickOnSettingIcon(){
        click(settingIcon);
    }
    public void clickOnSetMessage(){
        click(setMessage);
    }
    public void typeMessageCustomBuyer(){
        type(typeMessage, "Is this still available?Please answer for me.");
    }
    public void clickOnSaveButton(){
        click(saveButton);
    }
    public void scrollDownIntoView() {
        scrollToView(marketPlace);
    }
    public void clickOnMarketPlace() {
        Actions action = new Actions(driver);
        action.moveToElement(marketPlace).click().build().perform();
        //click(marketPlace);
    }
    public String getPageTitle() {
        return getText(pageTitle);
    }
    public String getTextMassege() {
        return getText(text);
    }
    public void typeItemToSearch(){
        type(searchField2, "shoes for men size 10");
    }
    public void clickOnItemShoes(){
        click(iteamShoes);
    }
    public void clickOnAddToCart(){
        click(addtocart);
    }
    public void clickOnCart(){
        click(cart);
    }
    public void clickOnRemoveButton(){
        click(removeButton);
    }
    public void scrollDownToFacebookPayBtn(){
        scrollToView(facebookPayBtn);
    }
    public void clickOnFacebookPayBtn(){
        click(facebookPayBtn);
    }
    public void clickOnAddPaymentMethod(){
        click(addPaymentMethodBtn);
    }
    public void clickOnCreditOrDebitCard(){
        click(creditOrDebitCardBtn);
    }
    public void typeOnCartNumberField(){
        type(cardNumberField, "0123456789012345");
    }
    public void typeOnExpirationDateField() {
        type(cardNumberField, "0225");
    }
    public void typeOnCCVField() {
        type(cardNumberField, "012");
    }
    public void clickOnCountry(){
        click(country);
    }
    public void typeNameCardField() {
        type(cardNumberField, "Amar Arris ");
    }
    public void typeOnBillingAddress1Field() {
        type(billingAddress1Field, "465 78th street ");
    }
    public void typeOnBillingAddress2Field() {
        type(billingAddress2Field, "Aprt 1R");
    }
    public void typeOnCityField() {
        type(cityField, "Brooklyn");
    }
    public void typeOnStateField() {
        type(stateField, "New York ");
    }
    public void typeOnZipCodeField() {
        type(zipCodeField, "New York ");
    }
    public void clickOnSaveBtn() {
        type(stateField, "New York ");
    }
    public String getErrorMessage () {
            return getText(errorMessage);
        }
    public String getTextTitle () {
        return getText(textTitle);
    }
    public void searchelements(String itemToSearch) {
        typeAndEnter(searchField2, itemToSearch);
    }
    public void clickOnItemIphoneProCase(){
        Actions action = new Actions(driver);
        action.moveToElement(iphone13Max128).click().build().perform();
       // click(iphoneProCase);
    }
    public void facebookTab() {
        click(marketPlace);
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            String parentTap = iterator.next();
            String newTab = iterator.next();
            driver.switchTo().window(newTab);
            //click();
            waitFor(2);
        }
    }
    public void searchInOneClickAndClear(String itemToSearch){
        typeAndEnter(searchField2, itemToSearch);
        clear(searchField2);
    }






}
