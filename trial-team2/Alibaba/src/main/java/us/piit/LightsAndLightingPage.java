package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class LightsAndLightingPage extends CommonAPI {
    public LightsAndLightingPage(WebDriver driver){
        super.driver=driver;
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//span[contains(text(),'High Power Camp Waterproof Flash Light Set Powerfu')]")
    WebElement flashlight;



    public void getflashlight(){
        scrollToView(flashlight);
    }
    public void switchtabhandle() {
        click(flashlight);

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            String parentTap = iterator.next();
            String newTab = iterator.next();
            driver.switchTo().window(newTab);


            waitFor(2);
        }
    }
}
