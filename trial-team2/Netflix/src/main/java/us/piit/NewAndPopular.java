package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndPopular extends CommonAPI {
    public NewAndPopular(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='New & Popular']")
    WebElement newandpopular;
    @FindBy(xpath = "//button[@class='searchTab']")
    WebElement iconsearch;
    @FindBy(xpath = "//p[text()='PIECES OF HER']")
    WebElement piecesofher;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement play;
    @FindBy(xpath = "(//img[@class='boxart-image boxart-image-in-padded-container'])[1]")
    WebElement PiescesOfHer;
    @FindBy(xpath = "(//*[@class='Hawkins-Icon Hawkins-Icon-Standard'])[1]")
    WebElement playPiecesOfHer;
    @FindBy(xpath = "//p[text()='Restless']")
    WebElement restless;
    @FindBy(xpath = "//div[@id='container-adult']")
    WebElement goodgirls;
    @FindBy(xpath = "//div[@class='click-to-change-JAW-indicator']")
    WebElement theadamproject;
    @FindBy(xpath = "//div[@class='previewModal--player-titleTreatmentWrapper']")
    WebElement chipandpotato;


    public void clickOnNewAndPopular(){click(newandpopular);}
    public void clickOnIconSearch(String movie){type(iconsearch, movie);}
    //public void clickOnIconSearch(){type(iconsearch, "Restless");}
    public void hoverOverOnPiecesOfHer(){click(PiescesOfHer);}
    public void clickOnPiecesOfHer(){click(playPiecesOfHer);}
    public void clickOnRestless(){click(restless);}
    //public void clickOnGoodGirls(){click(goodgirls);}





}
