package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestLuggageAndTravelGear extends CommonAPI {
    @Test
    public void LuggageAndTravelGear() {
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
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