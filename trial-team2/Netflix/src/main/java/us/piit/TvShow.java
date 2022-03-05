package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvShow extends CommonAPI {
    public TvShow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//li[@class='navigation-tab'])[2]")
    WebElement tvshow;
    @FindBy(xpath = "//div[@label='Genres']")
    WebElement genres;
    @FindBy(xpath = "(//a[@class='sub-menu-link'])[2]")
    public
    WebElement anime;
    @FindBy(xpath = "//span[text()='More Info']")
    WebElement moreinfo;
    //@FindBy(xpath = "(//div[@class='medium ltr-ae5w18-baseCss'])[3]")
    //WebElement play;
    @FindBy(xpath = "//a[text()='Black Stories']")
    public
    WebElement blackstories;
    @FindBy(xpath = "//a[text()='British']")
    public
    WebElement british;
    @FindBy(xpath = "//a[text()='Classic & Cult']")
    public
    WebElement classicandcult;
    @FindBy(xpath = "//a[text()='Comedies']")
    public
    WebElement comedies;
    @FindBy(xpath = "//a[text()='Crime']")
    public
    WebElement crime;
    @FindBy(xpath = "//a[text()='Critics Choice Awards']")
    public
    WebElement criticschoiceawards;
    @FindBy(xpath = "//a[text()='Docuseries']")
    public
    WebElement docuseries;
    @FindBy(xpath = "(//a[text()='Dramas']")
    public
    WebElement dramas;
    @FindBy(xpath = "//a[text()='Horror']")
    WebElement horror;
    @FindBy(xpath = "//a[text()='International']")
    WebElement international;
    @FindBy(xpath = "//a[text()='K-Dramas']")
    WebElement kdramas;
    @FindBy(xpath = "(//a[text()='Kids'])[2]")
    WebElement kids;
    @FindBy(xpath = "//a[text()='LGBTQ']")
    WebElement lgbtq;
    @FindBy(xpath = "//a[text()='Mysteries']")
    WebElement mysteries;
    @FindBy(xpath = "//a[text()='Reality']")
    WebElement reality;
    @FindBy(xpath = "//a[text()='Romance']")
    WebElement romance;
    @FindBy(xpath = "//a[text()='Sci-Fi & Fantasy']")
    WebElement scifiandfantasy;
    @FindBy(xpath = "//a[text()='Science & Nature']")
    WebElement scienceandnature;
    @FindBy(xpath = "//a[text()='Spanish-Language']")
    WebElement spanishlanguage;
    @FindBy(xpath = "//a[text()='Stand-Up & Talk Shows']")
    WebElement standupandtalkshows;
    @FindBy(xpath = "//a[text()='Teen']")
    WebElement teen;
    @FindBy(xpath = "//a[text()='Thriller']")
    WebElement thriller;






    public void clickOnTvShow(){click(tvshow);}
    public void clickOnGenres(){click(genres);}
    public void clickOnAnime(){click(anime);}
    public void clickOnMoreInfo(){click(moreinfo);}
    //public void clickOnPlay(){click(play);}
    public void clickOnBlackStories(){click(blackstories);}
    public void clickOnBritish(){click(british);}
    public void clickOnClassicAndCult(){click(classicandcult);}
    public void clickOnComedies(){click(comedies);}
    public void clickOnCrime(){click(crime);}
    public void clickOnCriticsChoiceAwards(){click(criticschoiceawards);}
    public void clickOnDocuseries(){click(docuseries);}
    public void clickOnDramas(){click(dramas);}
    public void clickOnHorror(){click(horror);}
    public void clickOnInternational(){click(international);}
    public void clickOnKDramas(){click(kdramas);}
    public void clickOnKids(){click(kids);}
    public void clickOnLgbtq(){click(lgbtq);}
    public void clickOnMysteries(){click(mysteries);}
    public void clickOnReality(){click(reality);}
    public void clickOnRomance(){click(romance);}
    public void clickOnSciFiAndFantasy(){click(scifiandfantasy);}
    public void clickONScienceAndNature(){click(scienceandnature);}
    public void clickOnSpanishLanguage(){click(spanishlanguage);}
    public void clickOnStandUpAndTalkShows(){click(standupandtalkshows);}
    public void clickOnTeen(){click(teen);}
    public void clickOnThriller(){click(thriller);}

}

