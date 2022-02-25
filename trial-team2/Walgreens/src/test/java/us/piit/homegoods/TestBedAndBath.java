package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestBedAndBath extends CommonAPI {
    @Test
    public void BedAndBath(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.bedandbathbtn.isEnabled());
        homepage.BedAndBathBtn();
        Assert.assertTrue(homepage.blanketsandthrowsbtn.isEnabled());
        homepage.blanketsAndThrowsBtn();
        Assert.assertEquals(getTitle(),"Blankets & Throws | Walgreens");
    }
}
