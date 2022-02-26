package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestHomeImprovementInHomeGoods extends CommonAPI {
    @Test
    public void HomeImprovement(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.homeimprovementbtn.isEnabled());
        homepage.homeImprovementBtn();
        Assert.assertTrue(homepage.lightbulbsbtn.isEnabled());
        homepage.lightBulbsBtn();
        Assert.assertEquals(getTitle(), "Light Bulbs | Walgreens");
    }
}
