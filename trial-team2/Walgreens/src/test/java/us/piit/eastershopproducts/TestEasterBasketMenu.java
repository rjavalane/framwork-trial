package us.piit.eastershopproducts;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestEasterBasketMenu extends CommonAPI {
    @Test
    public void easterBaskets(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.easterbasketbtn.isEnabled());
        homepage.easterBasketBTN();
        Assert.assertTrue(homepage.subeasterbasketsbtn.isEnabled());
        homepage.subEasterBasketsBTN();
        Assert.assertEquals(getTitle(),"Easter Baskets: Traditional, Plastic Buckets, & Novelty | Walgreens");
    }


    @Test
    public void easterGRass(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.easterbasketbtn.isEnabled());
        homepage.easterBasketBTN();
        Assert.assertTrue(homepage.eastergrassbtn.isEnabled());
        homepage.easterGrassBTN();
        Assert.assertEquals(getTitle(),"Easter Grass | Walgreens");
    }


    @Test
    public void easterPremadeBaskets(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.easterbasketbtn.isEnabled());
        homepage.easterBasketBTN();
        Assert.assertTrue(homepage.easterpremadebasketsbtn.isEnabled());
        homepage.easterPremadebasketsBTN();
        Assert.assertEquals(getTitle(),"Easter Premade Baskets | Walgreens");
    }


    @Test
    public void easterToyAndPlush(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.easterbasketbtn.isEnabled());
        homepage.easterBasketBTN();
        Assert.assertTrue(homepage.eastertoysplushbtn.isEnabled());
        homepage.easterToysPlushBTN();
        Assert.assertEquals(getTitle(),"Easter Toys & Plush | Walgreens");
    }


    @Test
    public void shopEasterBaskets(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.easterbasketbtn.isEnabled());
        homepage.easterBasketBTN();
        Assert.assertTrue(homepage.shopeasterbasketsbtn.isEnabled());
        homepage.shopEasterBasketsBTN();
        Assert.assertEquals(getTitle(),"Easter Basket Stuffers - Eggs, Grass, Chocolate, Toys | Walgreens");
    }


    @Test
    public void salesEasterBaskets(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.easterbasketbtn.isEnabled());
        homepage.easterBasketBTN();
        Assert.assertTrue(homepage.saleseasterbasketsbtn.isEnabled());
        homepage.salesEasterBasketsBTN();
        Assert.assertEquals(getTitle(),"Easter Baskets | Walgreens");
    }

}
