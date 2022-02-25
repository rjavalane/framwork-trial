package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestPartySupplies extends CommonAPI {
    @Test
    public void PartySupplies(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.partysuppliesbtn.isEnabled());
        homepage.partySuppliesBtn();
        Assert.assertTrue(homepage.giftwrapbagbtn.isEnabled());
        homepage.giftWrapBagBtn();
        Assert.assertEquals(getTitle(), "Gift Wrap, Bags & Accessories | Walgreens");
    }

}
