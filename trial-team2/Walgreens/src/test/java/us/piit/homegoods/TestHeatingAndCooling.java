package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestHeatingAndCooling extends CommonAPI {
    @Test
    public void HEatingAndCooling(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.heatingandcoolingbtn.isEnabled());
        homepage.heatingAndCoolingBtn();
        Assert.assertTrue(homepage.fansbtn.isEnabled());
        homepage.FansBtn();
        Assert.assertEquals(getTitle(), "Fans | Walgreens");

    }
}
