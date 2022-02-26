package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class MachineryPage extends CommonAPI {
    public MachineryPage(WebDriver driver){
        super.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'New 2.0 ton mini excavator trailer with cheap pric')]")
    WebElement excavator;
    @FindBy(xpath = "//div[@id='J-action-cs']")
    WebElement contact;

    public void getexcavator(){
        scrollToView(excavator);
        click(excavator);


    }

    public void switchtabhandle() {
        click(contact);

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
