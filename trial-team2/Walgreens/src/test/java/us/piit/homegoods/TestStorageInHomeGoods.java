package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestStorageInHomeGoods extends CommonAPI {
    @Test
    public void Storage (){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.storagebtn.isEnabled());
        homepage.StorageBtn();
        Assert.assertTrue(homepage.bathroomstoragebtn.isEnabled());
        homepage.bathroomStorageBtn();
        Assert.assertEquals(getTitle(), "Bathroom Storage & Organization | Walgreens");
    }
}
