package us.piit;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Climate science center')]")
    WebElement climatScienceBtn;
    @FindBy(xpath = "//a[@aria-current='page']")
    WebElement searchHomePage;
    @FindBy(xpath = "(//div[@aria-label='Menu'])[1]")
    WebElement searchMenu;
    @FindBy(xpath = "//span[text()='Story']")
    WebElement searchStoryBtn;
    @FindBy(css = "div[class='hzruof5a']")
    WebElement createStory;
    @FindBy(xpath = "//div[text()='Create a text story']")
    WebElement createATextStory;
    @FindBy(xpath = "//textarea[@style='overflow-y: auto;']")
    WebElement textStory;
    @FindBy(xpath = "//span[text()='Share to Story']")
    WebElement shareButton;
    @FindBy(xpath = "//span[text()='Group']")
    WebElement serchGroup;
    @FindBy(xpath = "//input[@type='text']")
    WebElement groupName;
    @FindBy(xpath = "//label[@role='button']")
    WebElement choosePrivacy;
    @FindBy(xpath = "//span[text()='Public']")
    WebElement publicOption;
    @FindBy(xpath = "//span[text()='Create']")
    WebElement createButton;
    @FindBy(xpath = "//span[text()='Event']")
    WebElement searchEvent;
    @FindBy(xpath = "//span[text()='Get together with people at a specific location.']")
    WebElement inPersonOption;
    @FindBy(xpath = "//span[text()='Event Name']")
    WebElement eventNameField;
    @FindBy(xpath = "//input[@value='Feb 19, 2022']")
    WebElement startDate;
    @FindBy(xpath = "//input[@value='3:00 PM']")
    WebElement startTime;
    @FindBy(xpath = "//input[@value='Feb 19, 2022']")
    WebElement endDate;
    @FindBy(xpath = "//input[@value='6:00 PM']")
    WebElement endTime;
    @FindBy(xpath = "//span[text()='Only people who are invited']")
    WebElement privateEvent;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//input[@id='jsc_c_ds']")
    WebElement locationEvent;
    @FindBy(xpath = "//span[text()='Description']")
    WebElement descriptionEvent;
    @FindBy(xpath = "//span[text()='Create event']")
    WebElement createEventButton;
    @FindBy(xpath = "//span[text()='COVID-19 Information Center']")
    WebElement coronavirusInfoCenter;
    @FindBy(xpath = "(//span[text()='Follow'])[1]")
    WebElement followBtn;
    @FindBy(xpath = "//body/div[6]/ul[1]/li[1]/div[1]/div[1]")
    WebElement notificationMessage;
    @FindBy(xpath = "//span[text()='News']")
    WebElement newsBtn;
    @FindBy(xpath = "//span[text()='New for you']")
    WebElement forYouBtn;
    @FindBy(xpath = "//span[text()='Earlier']")
    WebElement textTitle;

    public void selectFromDropDownMenu() {
        selectDropdownOption(searchMenu, "Life event");
    }

    public void clickOnEventLink() {
        click(searchEvent);
    }

    public void clickOnInPersonOption() {
        click(inPersonOption);
    }

    public void clickOnStartDayEvent() {
        click(startDate);
    }

    public void clickOnStarTimeEvent() {
        click(startTime);
    }

    public void clickOnEndDayEvent() {
        click(endDate);
    }

    public void clickOnEndTimeEvent() {
        click(endTime);
    }

    public void typeEventName() {
        type(eventNameField, "Jhon's birthday");
    }

    public void typeLocationEvent() {
        type(locationEvent, "446 78th St, Brooklyn, NY 11209-3404, United States");
    }

    public void typeDescriptionEvent() {
        type(descriptionEvent, "Jhon will celebrate his 100 birthday ");
    }

    public void clickOnPrivateEvent() {
        click(publicOption);
    }

    public void clickOnNextButton() {
        click(nextButton);
    }

    public void clickOnCreateEvent() {
        click(createEventButton);
    }
    public void clickOnSearchStoryBtn() {
        click(searchStoryBtn);
    }
    public void clickOnCreateATextStory() {
        click(createATextStory);
    }
    public void typeTextStory() {
        type(textStory, "we learning java");
    }
        public void clickOnShareButton () {
            click(shareButton);
        }
        public void clickOnHomePage () {
            click(searchHomePage);
        }
        public void clickOnMenu () {
            click(searchMenu);
        }

        public String getHomePageTitle () {
            return getTitle();
        }

        public void typeGroupName () {
            type(groupName, "weekend soccer");
        }

        public void clickOnTheLinkGroup () {
            click(serchGroup);
        }

        public void clickOnChoosePrivacy () {
            click(choosePrivacy);
        }
        public void clickOnpublicOption () {
            click(publicOption);
        }
//    public void selectDropdownOption(String option){
//        selectDropdownOption(menuDropdown, option);
//    }
        public void clickOnButtonCreate () {
            click(createButton);
        }
        public void scrollDownToCliatScience () {
            scrollToView(climatScienceBtn);
        }
        public void clickOnClimatScienceBtn () {
            click(climatScienceBtn);
        }
        public void scrollDownToCoronavirusInfoCenter(){
        scrollToView(coronavirusInfoCenter);
        }
        public void clickOnCoronavirusInfoCenterBtn(){
        click(coronavirusInfoCenter);
        }
        public void clickOnFollowBtn(){
        click(followBtn);
        }
        public String getNotificationMessage(){
        return getText(notificationMessage);
        }
        public void scrollDownToNewsBtn(){
        scrollToView(newsBtn);
        }
        public void clickOnNewsBtn(){
        click(newsBtn);
        }
        public void clickOnForYouBtn(){
        click(forYouBtn);
        }
        public String getTextTitle(){
        return getText(textTitle);
        }
    }

