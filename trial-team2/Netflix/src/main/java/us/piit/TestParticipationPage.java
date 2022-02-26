package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestParticipationPage extends CommonAPI {
    public TestParticipationPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Test participation']")
    WebElement testparticipation;
    @FindBy(xpath = "//span[text()='Audio and Subtitles']")
    WebElement audioandsubtitles;




    public void clickOnTestParticipation(){click(testparticipation);}
    public void clickOnAudioAndSubtitles(){click(audioandsubtitles);}

}
