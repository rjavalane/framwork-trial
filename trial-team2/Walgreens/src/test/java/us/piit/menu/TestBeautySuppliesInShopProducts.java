package us.piit.menu;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestBeautySuppliesInShopProducts extends CommonAPI {
    @Test
    public void beautySuppliesInShopProducts(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.beautysuppliesbtn.isEnabled());
        homepage.beautySuppliesBtn();
        homepage.shopBeautyBtn();
        Assert.assertEquals(getTitle(),"Beauty Products | Walgreens");
    }
}
