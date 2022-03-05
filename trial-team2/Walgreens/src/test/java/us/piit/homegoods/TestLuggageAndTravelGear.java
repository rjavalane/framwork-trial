package us.piit.homegoods;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestLuggageAndTravelGear extends CommonAPI {
    @Test
    public void luggageAndTravelGear() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.luggageandtravelgearbtn.isEnabled());
        homepage.luggageAndTravelGearBtn();
        Assert.assertTrue(homepage.salesonluggagebtn.isEnabled());
        homepage.salesOnLuggageBtn();
        Assert.assertEquals(getTitle(),"Luggage, Travel Gear & Accessories | Walgreens");
    }
}