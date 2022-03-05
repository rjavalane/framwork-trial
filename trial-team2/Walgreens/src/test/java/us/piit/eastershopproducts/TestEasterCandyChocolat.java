package us.piit.eastershopproducts;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestEasterCandyChocolat extends CommonAPI {
    @Test
    public void easterCandy (){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.eastercandybtn.isEnabled());
        homepage.easterCandyBTN();
        Assert.assertEquals(getTitle(), "Easter Candy | Walgreens");
    }




    @Test
    public void easterChocolateBunnies(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.chocolatebunniesbtn.isEnabled());
        homepage.chocolateBunniesBTN();
        Assert.assertEquals(getTitle(), "Easter Chocolate Bunnies | Walgreens");
    }


    @Test
    public void premiumChocolateGifting(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.premiumchocolatebtn.isEnabled());
        homepage.premiumChocolateBTN();
        Assert.assertEquals(getTitle(),"Easter Premium Chocolate & Gifting | Walgreens");
    }

    @Test
    public void eggCandyFillers(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.eggcandyfillersbtn.isEnabled());
        homepage.eggCandyFillersBTN();
        Assert.assertEquals(getTitle(),"Easter Egg Candy Fillers | Walgreens");
    }

    @Test
    public void easterPeeps(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.easterpeepsbtn.isEnabled());
        homepage.easterPeepsBTN();
        Assert.assertEquals(getTitle(), "Easter Peeps | Walgreens");
    }

    @Test
    public void easterJellyBeans(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.easterjellybeansbtn.isEnabled());
        homepage.easterJellyBeansBTN();
        Assert.assertEquals(getTitle(),"Easter Jelly Beans | Walgreens");
    }

    @Test
    public void easterCandyAndChocolate(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.shopeastercandychocolatebtn.isEnabled());
        homepage.shopEasterCandyChocolateBTN();
        Assert.assertEquals(getTitle(), "Easter Candy & Chocolate");
    }

    @Test
    public  void salesEasterCandyChocolate(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.easterbtn.isEnabled());
        homepage.easterBtn();
        Assert.assertTrue(homepage.candyandchocolatbtn.isEnabled());
        homepage.candyAndChocolatBTN();
        Assert.assertTrue(homepage.saleseastercandychocolatebtn.isEnabled());
        homepage.salesEasterCandyChocolateBTN();
        Assert.assertEquals(getTitle(),"Easter Candy & Chocolate | Walgreens");
    }
}