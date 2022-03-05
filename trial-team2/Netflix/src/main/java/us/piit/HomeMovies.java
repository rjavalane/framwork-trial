package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeMovies extends CommonAPI {
    public HomeMovies(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Movies']")
    WebElement movies;
    @FindBy(xpath = "//div[@label='Genres']")
    WebElement genres;
    @FindBy(xpath = "//a[text()='2022 Netflix Oscars']")
    WebElement netflixoscars;
    @FindBy(xpath = "//a[text()='Action']")
    WebElement action;
    @FindBy(xpath = "//a[text()='Anime']")
    WebElement anime;
    @FindBy(xpath = "//a[text()='Black Stories']")
    WebElement blackstories;
    @FindBy(xpath = "//a[text()='Children & Family']")
    WebElement childrenandfamily;
    @FindBy(xpath = "//a[text()='Classics']")
    WebElement classics;
    @FindBy(xpath = "//a[text()='Comedies']")
    WebElement comedies;
    @FindBy(xpath = "//a[text()='Crime']")
    WebElement crime;
    @FindBy(xpath = "//a[text()='Critics Choice Awards']")
    WebElement criticschoiceawards;
    @FindBy(xpath = "//a[text()='Cult']")
    WebElement cult;
    @FindBy(xpath = "//a[text()='Documentaries']")
    WebElement documentaries;
    @FindBy(xpath = "//a[text()='Dramas']")
    WebElement dramas;
    @FindBy(xpath = "//a[text()='Faith & Spirituality']")
    WebElement faithandspirituality;
    @FindBy(xpath = "//a[text()='Fantasy']")
    WebElement fantasy;
    @FindBy(xpath = "//a[text()='Horror']")
    WebElement horror;
    @FindBy(xpath = "//a[text()='Independent']")
    WebElement independent;
    @FindBy(xpath = "//a[text()='International']")
    WebElement international;
    @FindBy(xpath = "//a[text()='LGBTQ']")
    WebElement lgbtq;
    @FindBy(xpath = "//a[text()='Music & Musicals']")
    WebElement musicandmusicals;
    @FindBy(xpath = "//a[text()='Romance']")
    WebElement romance;
    @FindBy(xpath = "//a[text()='Sci-Fi']")
    WebElement scifi;
    @FindBy(xpath = "//a[text()='Sports']")
    WebElement sports;
    @FindBy(xpath = "//a[text()='Stand-Up Comedy']")
    WebElement standUpComedy;
    @FindBy(xpath = "//a[text()='Thriller']")
    WebElement thriller;



    public void clickOnMovies(){click(movies);}
    public void clickOnGenres(){click(genres);}
    public void clickOnNetflixOscars(){click(netflixoscars);}
    public void clickOnAction(){click(action);}
    public void clickOnAnime(){click(anime);}
    public void clickOnBlackStories(){click(blackstories);}
    public void clickOnChildrenAndFamily(){click(childrenandfamily);}
    public void clickOnClassics(){click(classics);}
    public void clickOnComedies(){click(comedies);}
    public void clickOnCrime(){click(crime);}
    public void clickOnCriticsChoiceAwards(){click(criticschoiceawards);}
    public void clickOnCult(){click(cult);}
    public void clickOnDocumentaries(){click(documentaries);}
    public void clickOnDramas(){click(dramas);}
    public void clickOnFaithAndSpirituality(){click(faithandspirituality);}
    public void clickOnFantasy(){click(fantasy);}
    public void clickOnHorror(){click(horror);}
    public void clickOnIndependent(){click(independent);}
    public void clickOnInternational(){click(international);}
    public void clickOnLgbtq(){click(lgbtq);}
    public void clickOnMusicAndMusicals(){click(musicandmusicals);}
    public void clickOnRomance(){click(romance);}
    public void clickOnSciFi(){click(scifi);}
    public void clickOnSports(){click(sports);}
    public void clickOnStandUpComedy(){click(standUpComedy);}
    public void clickOnThriller(){click(thriller);}



}
