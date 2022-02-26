package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestKitchenAndDining extends CommonAPI {
    @Test
    public void KitchenAndDining(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.kitchenanddiningbtn.isEnabled());
        homepage.kitchenAndDiningBtn();
        Assert.assertTrue(homepage.kitchenutensilsbtn.isEnabled());
        homepage.kitchenUtensilsBtn();
        Assert.assertEquals(getTitle(), "Kitchen Utensils | Walgreens");

    }
}
