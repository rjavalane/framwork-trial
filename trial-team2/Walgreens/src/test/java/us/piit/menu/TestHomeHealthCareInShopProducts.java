package us.piit.menu;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.CommandLineArgs;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestHomeHealthCareInShopProducts extends CommonAPI {
    @Test
    public void homeHealthCare() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homehealthcarebtn.isEnabled());
        homepage.homeHealthCareBtn();
        homepage.homeTestBtn();
        homepage.atHomeCovidTestBtn();
        Assert.assertEquals(getTitle(), "At Home Covid Tests – Rapid Antigen & PCR Test Kits | Walgreens");

    }
}