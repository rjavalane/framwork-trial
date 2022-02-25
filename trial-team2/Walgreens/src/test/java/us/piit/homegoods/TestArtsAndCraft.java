package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestArtsAndCraft extends CommonAPI {
    @Test
    public void ArtsAndCraft(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.artsandcraftbtn.isEnabled());
        homepage.artsAndCraftBtn();
        Assert.assertTrue(homepage.paintingsuppliesbtn.isEnabled());
        homepage.paintingSuppliesBtn();
        Assert.assertEquals(getTitle(), "Painting Supplies | Walgreens");


    }
}
