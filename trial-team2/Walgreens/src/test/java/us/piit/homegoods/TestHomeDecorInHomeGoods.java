package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestHomeDecorInHomeGoods extends CommonAPI {
    @Test
    public void HomeDecor(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        homepage.homeDecorBtn();
        homepage.setDecorativeAccentsBtn();
        Assert.assertEquals(getTitle(), "Decorative Accents | Walgreens");

    }
}
