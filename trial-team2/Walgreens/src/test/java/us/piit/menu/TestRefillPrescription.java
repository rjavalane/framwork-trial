package us.piit.menu;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.PrescriptionsPage;
import us.piit.SigninPage;

import java.time.Duration;

public class TestRefillPrescription extends CommonAPI {
    @Test
    public void refillPrescription (){
        HomePage homepage = new HomePage(driver);
        PrescriptionsPage prescriptionpage = new PrescriptionsPage(driver);
        SigninPage signinpage = new SigninPage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        wait.until(ExpectedConditions.elementToBeClickable(homepage.shopproductsbtn));
        Assert.assertTrue(homepage.prescriptionsbtn.isEnabled());
        homepage.prescriptionsBtn();
        Assert.assertTrue(homepage.prescriptionsrefillsbtn.isEnabled());
        homepage.prescriptionsRefillsBtn();
        signinpage.typeCorrectEmail();
        signinpage.typeCorrectPassword();
        signinpage.clickSubmitbtn();
        waitFor(5);
        Assert.assertEquals(getTitle(), "Your Prescriptions | Walgreens");
        prescriptionpage.prescriptionAutoRefillsBtn();
        Assert.assertEquals(getTitle(), "Manage Auto Refills | Manage Prescriptions | Pharmacy & Health | Walgreens");



    }
}
