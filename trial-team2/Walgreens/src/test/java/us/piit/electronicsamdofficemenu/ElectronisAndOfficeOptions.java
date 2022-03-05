package us.piit.electronicsamdofficemenu;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.time.Duration;

public class ElectronisAndOfficeOptions extends CommonAPI {
    @Test
    public void calendars(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.calendarsandplannersbtn.isEnabled());
        homepage.calendarsAndPlannersBTN();
        Assert.assertTrue(homepage.calendarsbtn.isEnabled());
        homepage.calendarsBTN();
        Assert.assertEquals(getTitle(),"Calendars | Walgreens");
    }


    @Test
    public void planners(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.calendarsandplannersbtn.isEnabled());
        homepage.calendarsAndPlannersBTN();
        Assert.assertTrue(homepage.plannersbtn.isEnabled());
        homepage.plannersBTN();
        Assert.assertEquals(getTitle(),"Planners | Walgreens");
    }


    @Test
    public void shopCalendarsAndPlanners(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.calendarsandplannersbtn.isEnabled());
        homepage.calendarsAndPlannersBTN();
        Assert.assertTrue(homepage.shopcalendarsandplannersbtn.isEnabled());
        homepage.shopCalendarsAndPlannersBTN();
        Assert.assertEquals(getTitle(),"Calendars & Planners | Walgreens");
    }


    @Test
    public void filedividers(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.bindersfoldersbtn.isEnabled());
        homepage.bindersFoldersBTN();
        Assert.assertTrue(homepage.filedividerbtn.isEnabled());
        homepage.fileDividersBTN();
        Assert.assertEquals(getTitle(),"File Dividers & Tabs | Walgreens");
    }


    @Test
    public void sheetprotectors(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.bindersfoldersbtn.isEnabled());
        homepage.bindersFoldersBTN();
        Assert.assertTrue(homepage.sheetprotectorsbtn.isEnabled());
        homepage.sheetProtectorsBTN();
        Assert.assertEquals(getTitle(),"Sheet Protectors | Walgreens");
    }


    @Test
    public void binders(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.bindersfoldersbtn.isEnabled());
        homepage.bindersFoldersBTN();
        Assert.assertTrue(homepage.bindersbtn.isEnabled());
        homepage.bindersBTN();
        Assert.assertEquals(getTitle(),"Binders | Walgreens");
    }


    @Test
    public void folders(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.bindersfoldersbtn.isEnabled());
        homepage.bindersFoldersBTN();
        Assert.assertTrue(homepage.foldersbtn.isEnabled());
        homepage.foldersBTN();
        Assert.assertEquals(getTitle(),"Folders | Walgreens");
    }


    @Test
    public void shopbindersfolders(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.bindersfoldersbtn.isEnabled());
        homepage.bindersFoldersBTN();
        Assert.assertTrue(homepage.shopbindersfoldersbtn.isEnabled());
        homepage.shopbindersFoldersBTN();
        Assert.assertEquals(getTitle(),"Binders, Folders & Filing");
    }


    @Test
    public void permanentmarkers(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.markersandhighlightersbtn.isEnabled());
        homepage.markersAndHighlightersBTN();
        Assert.assertTrue(homepage.permanentmarkersbtn.isEnabled());
        homepage.permanentMarkersBTN();
        Assert.assertEquals(getTitle(),"Permanent Markers | Walgreens");
    }


    @Test
    public void highlighters(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.markersandhighlightersbtn.isEnabled());
        homepage.markersAndHighlightersBTN();
        Assert.assertTrue(homepage.highlightersbtn.isEnabled());
        homepage.highlightersBTN();
        Assert.assertEquals(getTitle(),"Highlighters | Walgreens");
    }


    @Test
    public void dryerasemarkers(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.markersandhighlightersbtn.isEnabled());
        homepage.markersAndHighlightersBTN();
        Assert.assertTrue(homepage.dryerasemarkersbtn.isEnabled());
        homepage.dryEraseMarkersBTN();
        Assert.assertEquals(getTitle(),"Dry Erase Markers | Walgreens");
    }


    @Test
    public void washablemarkers(){
        HomePage homepage = new HomePage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
        homepage.electronisAndOfficeBTN();
        Assert.assertTrue(homepage.markersandhighlightersbtn.isEnabled());
        homepage.markersAndHighlightersBTN();
        Assert.assertTrue(homepage.washablemarkersbtn.isEnabled());
        homepage.washableMarkersBTN();
        Assert.assertEquals(getTitle(),"Washable Markers | Walgreens");
      }


      @Test
      public void shopmarkersandhighlighters(){
          HomePage homepage = new HomePage(driver);
          WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));

          Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
          homepage.clickOnHomeMenu();
          wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
          Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
          homepage.shopProductsBtn();
          Assert.assertTrue(homepage.electronicsandofficebtn.isEnabled());
          homepage.electronisAndOfficeBTN();
          Assert.assertTrue(homepage.markersandhighlightersbtn.isEnabled());
          homepage.markersAndHighlightersBTN();
          Assert.assertTrue(homepage.shopmarkersandhighlightersbtn.isEnabled());
          homepage.shopMarkersAndHighlightersBTN();
          Assert.assertEquals(getTitle(),"Markers & Highlighters");
      }


}
