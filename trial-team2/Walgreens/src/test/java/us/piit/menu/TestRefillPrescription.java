package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.PrescriptionsPage;
import us.piit.SigninPage;

public class TestRefillPrescription extends CommonAPI {
    @Test
    public void RefillPrescription (){
        HomePage homepage = new HomePage(driver);
        PrescriptionsPage prescriptionpage = new PrescriptionsPage(driver);
        SigninPage signinpage = new SigninPage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.prescriptionsbtn.isEnabled());
        homepage.prescriptionsBtn();
        Assert.assertTrue(homepage.prescriptionsrefillsbtn.isEnabled());
        homepage.prescriptionsRefillsBtn();
        signinpage.typeCorrectEmail();
        signinpage.typeCorrectPassword();
        signinpage.clickSubmitbtn();
        waitFor(10);
        //Assert.assertEquals(getTitle(), "Your Prescriptions | Walgreens");
        prescriptionpage.prescriptionAutoRefillsBtn();
        Assert.assertEquals(getTitle(), "Manage Auto Refills | Manage Prescriptions | Pharmacy & Health | Walgreens");



    }
}
