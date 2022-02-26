package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LightsAndLightingPage;

public class LightsAndLighting extends CommonAPI {
    @Test
    public void lightAndlightingtools(){
        HomePage homePage=new HomePage(driver);
        LightsAndLightingPage lightsAndLightingPage= new LightsAndLightingPage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getLightsTools(driver);
        homePage.alibabaTab4();
        Assert.assertEquals(getTitle(),"lights lighting, lights lighting Suppliers and Manufacturers at Alibaba.com");
        lightsAndLightingPage.getflashlight();
        lightsAndLightingPage.switchtabhandle();
        Assert.assertEquals(getTitle(),"High Power Camp Waterproof Flash Light Set Powerful Usb Rechargeable Tactical Torches Flashlights,Led Flashlight Manufacturer - Buy Tactical Led Flashlight Manufacturers,Aluminum Flashlight,Zoomable Flashlight Product on Alibaba.com");

    }
}
