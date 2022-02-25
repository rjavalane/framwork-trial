package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestClothingAndShoes extends CommonAPI {
    @Test
    public void ClothingAndShoes(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.clothingandshoesbtn.isEnabled());
        homepage.clothingAndShoesBtn();
        Assert.assertTrue(homepage.salesonclothingbtn.isEnabled());
        homepage.salesOnCothingBtn();
        Assert.assertEquals(getTitle(),"Clothing, Shoes & Accessories | Walgreens");
    }
}
