package us.piit.oralcaremenu;

import base.CommonAPI;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestOralCareMenu extends CommonAPI {
    @Test
    public void toothpate() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.toothpastebtn.isEnabled());
        homepage.toothPasteBTN();
        Assert.assertEquals(getTitle(), "Toothpaste | Walgreens");
    }


    @Test
    public void electricToothbrushes() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.electrictoothbrushesbtn.isEnabled());
        homepage.electricToothBrushesBTN();
        Assert.assertEquals(getTitle(), "Electric Toothbrushes, Water Flossers & Replacement Heads | Walgreens");
    }

    @Test
    public void mouthwashAndrinses() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.mouthwashandrinsesbtn.isEnabled());
        homepage.mouthWashAndRinsesBTN();
        Assert.assertEquals(getTitle(), "Mouthwash and Rinses | Walgreens");
    }


    @Test
    public void toothBrushCovers() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.toothbrushcoversbtn.isEnabled());
        homepage.toothBrushCoversBTN();
        Assert.assertEquals(getTitle(), "Toothbrush Covers and Sanitizers | Walgreens");
    }


    @Test
    public void teethWhitening() {
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.teethwhiteningbtn.isEnabled());
        homepage.teethWhitheningBTN();
        Assert.assertEquals(getTitle(),"Teeth Whitening | Walgreens");
    }


    @Test
    public void tongueCleaners(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.tonguecleanersbtn.isEnabled());
        homepage.tongueCleanersBTN();
        Assert.assertEquals(getTitle(),"Toothbrushes | Walgreens");
    }

    @Test
    public void flossAndFlossers(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.flossandflossersbtn.isEnabled());
        homepage.flossAndFlossersBTN();
        Assert.assertEquals(getTitle(),"Floss and Flossers | Walgreens");
    }

    @Test
    public void denturelcare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.denturecarebtn.isEnabled());
        homepage.dentureCareBTN();
        Assert.assertEquals(getTitle(),"Denture Care | Walgreens");
    }


    @Test
    public void bracesCare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.bracescarebtn.isEnabled());
        homepage.bracesCareBTN();
        Assert.assertEquals(getTitle(),"Braces Care | Walgreens");
    }


    @Test
    public void gumCare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.gumcarebtn.isEnabled());
        homepage.gumCareBTN();
        Assert.assertEquals(getTitle(),"Gum Care | Walgreens");
    }


    @Test
    public void oralCareForChildren(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.oralcareforchildrenbtn.isEnabled());
        homepage.oralcareForChildreBTN();
        Assert.assertEquals(getTitle(),"Oral Care for Children | Walgreens");
    }


    @Test
    public void naturalAndOrganicCare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.naturalandorganiccarebtn.isEnabled());
        homepage.naturalAndOrganicBTN();
        Assert.assertEquals(getTitle(),"Natural and Organic Oral Care | Walgreens");
    }


    @Test
    public void oralPainRelief(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.oralcarebtn.isEnabled());
        homepage.oralcareBTN();
        Assert.assertTrue(homepage.oralpainreliefbtn.isEnabled());
        homepage.oralPainreliefBTN();
        Assert.assertEquals(getTitle(),"Oral Pain Relief | Walgreens");
    }
}
