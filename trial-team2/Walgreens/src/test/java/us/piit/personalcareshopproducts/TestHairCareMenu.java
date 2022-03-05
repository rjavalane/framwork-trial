package us.piit.personalcareshopproducts;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class TestHairCareMenu extends CommonAPI {
    @Test
    public void hairColor(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.haircolorbtn.isEnabled());
        homepage.hairColorBTN();
        Assert.assertEquals(getTitle(),"Hair Color | Walgreens");
    }


    @Test
    public void shampooAndConditioner(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.shampooandconditionerbtn.isEnabled());
        homepage.shampooAndConditionerBTN();
        Assert.assertEquals(getTitle(),"Shampoo & Conditioner | Walgreens");
    }


    @Test
    public void texturedHaircare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.texturedhaircarebtn.isEnabled());
        homepage.texturedHairCareBTN();
        Assert.assertEquals(getTitle(),"Textured Hair Care | Walgreens");
    }


    @Test
    public void salonHairCare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.salonhaircarebtn.isEnabled());
        homepage.salonHairCareBTN();
        Assert.assertEquals(getTitle(),"Salon Hair Care | Walgreens");
    }


    @Test
    public void stylingProducts(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.stylingproductsbtn.isEnabled());
        homepage.stylingProductsBTN();
        Assert.assertEquals(getTitle(),"Styling Products | Walgreens");
    }


    @Test
    public void hairAndScalpTreatments(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.hairandscalptreatmentbtn.isEnabled());
        homepage.hairAndScalpTreatmentsBTN();
        Assert.assertEquals(getTitle(),"Hair and Scalp Treatments | Walgreens");
    }


    @Test
    public void stylingToolsAndAppliances(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.stylingtoolsandappliancesbtn.isEnabled());
        homepage.stylingToolsAndAppliancesBTN();
        Assert.assertEquals(getTitle(),"Styling Tools & Appliances | Walgreens");
    }


    @Test
    public void hairBrushesAccessories(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.hairbrushesaccessoriesbtn.isEnabled());
        homepage.hairBrushesAccessoriesBTN();
        Assert.assertEquals(getTitle(),"Hair Brushes & Accessories | Walgreens");
    }


    @Test
    public void shopHairCare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.shophaircarebtn.isEnabled());
        homepage.shopHairCareBTN();
        Assert.assertEquals(getTitle(),"Hair Care Products");
    }


    @Test
    public void salesOnHairCare(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.personalcarebtn.isEnabled());
        homepage.personalCareBTN();
        Assert.assertTrue(homepage.haircarebtn.isEnabled());
        homepage.hairCareBTN();
        Assert.assertTrue(homepage.salesonhaircarebtn.isEnabled());
        homepage.salesOnHaircareBTN();
        Assert.assertEquals(getTitle(),"Hair Care | Walgreens");

    }
}
