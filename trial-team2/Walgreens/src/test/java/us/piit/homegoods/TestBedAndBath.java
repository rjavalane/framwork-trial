package us.piit.homegoods;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestBedAndBath extends CommonAPI {
    @Test
    public void bedAndBath(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.bedandbathbtn.isEnabled());
        homepage.BedAndBathBtn();
        Assert.assertTrue(homepage.blanketsandthrowsbtn.isEnabled());
        homepage.blanketsAndThrowsBtn();
        Assert.assertEquals(getTitle(),"Blankets & Throws | Walgreens");
    }
}
