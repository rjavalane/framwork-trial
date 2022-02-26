package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestSmallHomeAppliances extends CommonAPI {
    @Test
    public void SmallHomeAppliances(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.smallhomeappliancesbtn.isEnabled());
        homepage.smallHomeAppliancesBtn();
        Assert.assertTrue(homepage.sewingtoolsbtn.isEnabled());
        homepage.sewingToolsBtn();
        Assert.assertEquals(getTitle(), "Sewing Tools & Accessories | Walgreens");

    }
}
