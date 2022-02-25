package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrescriptionsPage extends CommonAPI {
    public  PrescriptionsPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//strong[text()='Auto Refills']")
    WebElement prescriprionautorefillbtn;








    public void prescriptionAutoRefillsBtn(){click(prescriprionautorefillbtn);}
}
