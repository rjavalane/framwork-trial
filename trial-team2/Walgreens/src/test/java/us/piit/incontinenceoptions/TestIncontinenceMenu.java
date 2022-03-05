package us.piit.incontinenceoptions;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestIncontinenceMenu extends CommonAPI {
    @Test
    public void padsAndLiners(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.padsandlinersbtn.isEnabled());
        homepage.padsAnsLinersBTN();
        Assert.assertEquals(getTitle(),"Pads and Liners | Walgreens");
    }


    @Test
    public void protectiveunderwearsbtn(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.protectiveunderwearbtn.isEnabled());
        homepage.protectiveUnderWearBTN();
        Assert.assertEquals(getTitle(),"Protective Underwear and Briefs | Walgreens");
    }


    @Test
    public void clothesAndWipes(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.clothsandwipesbtn.isEnabled());
        homepage.clothsAndWipesBTN();
        Assert.assertEquals(getTitle(),"Cloths and Wipes | Walgreens");
    }


    @Test
    public void cleansersAndLotions(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.cleansersandlotionsbtn.isEnabled());
        homepage.cleansersAndLotionsBTN();
        Assert.assertEquals(getTitle(),"Cleansers, Creams and Lotions | Walgreens");
    }

    @Test
    public void beddingProtection(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.beddingprotectionbtn.isEnabled());
        homepage.beddingProtectionBTN();
        Assert.assertEquals(getTitle(),"Bedding Protection | Walgreens");
    }

    @Test
    public void bedpansAndurinals(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.bedpansandurinalsbtn.isEnabled());
        homepage.bedPansAndUrinalsBTN();
        Assert.assertEquals(getTitle(),"Bedpans and Urinals | Walgreens");
    }


    @Test
    public void heavyabsorbency(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.heavyabsorbencybtn.isEnabled());
        homepage.heavyAbsorbencyBTN();
        Assert.assertEquals(getTitle(),"Heavy Absorbency | Walgreens");
    }


    @Test
    public void moderateabsorbency(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.moderateabsorbencybtn.isEnabled());
        homepage.moderateAbsorbencyBTN();
        Assert.assertEquals(getTitle(),"Moderate Absorbency | Walgreens");
    }


    @Test
    public void shopincontinence(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.shopincontinencebtn.isEnabled());
        homepage.shopIncontinenceBTN();
        Assert.assertEquals(getTitle(),"Incontinence Products");
    }


    @Test
    public void salesonincontinence(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.incontinencebtn.isEnabled());
        homepage.IncontinenceBTN();
        Assert.assertTrue(homepage.salesonincontinencebtn.isEnabled());
        homepage.salesOnIncontinenceBTN();
        Assert.assertEquals(getTitle(),"Incontinence | Walgreens");
    }
}
