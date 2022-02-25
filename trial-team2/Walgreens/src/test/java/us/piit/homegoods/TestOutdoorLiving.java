package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestOutdoorLiving extends CommonAPI {
    @Test
    public void OutdoorLiving(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.outdoorlivingbtn.isEnabled());
        homepage.outdoorLivingBtn();
        Assert.assertTrue(homepage.allweatheressentialbtn.isEnabled());
        homepage.allWeatherEssentialBtn();
        Assert.assertEquals(getTitle(),"All Weather Essentials | Walgreens");
    }
}
