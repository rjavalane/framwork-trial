package us.piit.suncareproducts;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestSunscreenOptions extends CommonAPI {
    @Test
    public void sunscreenForBody(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.sunscreenforbodybtn.isEnabled());
        homepage.sunscreenforBodyBTN();
        Assert.assertEquals(getTitle(),"Sunscreen for Body | Walgreens");
    }


    @Test
    public void sunscreenForFace(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.sunscreenforfacebtn.isEnabled());
        homepage.sunscreenForFaceBTN();
        Assert.assertEquals(getTitle(),"Sunscreen for Face | Walgreens");
    }


    @Test
    public void sunscreenforchildren(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.sunscreenforchildrenbtn.isEnabled());
        homepage.sunscreenForChildrenBTN();
        Assert.assertEquals(getTitle(),"Sunscreen for Children | Walgreens");
    }


    @Test
    public void selftanners(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.selftannersbtn.isEnabled());
        homepage.selfTannersBTN();
        Assert.assertEquals(getTitle(),"Self Tanners | Walgreens");
    }


    @Test
    public void aftersuncare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.aftersuncarebtn.isEnabled());
        homepage.afterSunCareBTN();
        Assert.assertEquals(getTitle(),"After Sun Care | Walgreens");
    }


    @Test
    public void bagsandaccessories(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.bagsandaccessoriesbtn.isEnabled());
        homepage.bagsAndAccessoriesBTN();
        Assert.assertEquals(getTitle(),"Sunglasses | Walgreens");
    }


    @Test
    public void naturanorganiccare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.naturalorganicsuncarebtn.isEnabled());
        homepage.naturalOrganicsuncareBTN();
        Assert.assertEquals(getTitle(),"Natural and Organic Sun Care | Walgreens");
    }


    @Test
    public void shopsuncare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.shopsuncarebtn.isEnabled());
        homepage.shopSunCareBTN();
        Assert.assertEquals(getTitle(),"Sun Care Products");
    }


    @Test
    public void salesonsuncare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        waitFor(1);
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.suncarebtn.isEnabled());
        homepage.sunCareBTN();
        Assert.assertTrue(homepage.salesonsuncarebtn.isEnabled());
        homepage.salesOnSunCareBTN();
        Assert.assertEquals(getTitle(),"Sun Care | Walgreens");
    }
}
