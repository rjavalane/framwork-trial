package us.piit.homegoods;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestAutomotive extends CommonAPI {
    @Test
    public void Automotive(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homegoodsbtn.isEnabled());
        homepage.homeGoodsBtn();
        Assert.assertTrue(homepage.automotivebtn.isEnabled());
        homepage.AutomotiveBtn();
        Assert.assertTrue(homepage.salesonautomotivebtn.isEnabled());
        homepage.salesOnAutomotiveBtn();
        Assert.assertEquals(getTitle(),"Automotive");
    }
}
