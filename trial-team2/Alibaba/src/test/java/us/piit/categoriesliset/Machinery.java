package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.MachineryPage;

public class Machinery extends CommonAPI {
    @Test
    public void machinerytest() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverOverCategories(driver);
        Assert.assertEquals(getTitle(), "Alibaba.com: Manufacturers, Suppliers, Exporters & Importers from the world's largest online B2B marketplace");
        homePage.getmachinery(driver);
        homePage.alibabaTab3();
        Assert.assertEquals(driver.getTitle(), "machinery, machinery Suppliers and Manufacturers at Alibaba.com");
        MachineryPage machineryPage = new MachineryPage(driver);
        machineryPage.getexcavator();
        machineryPage.switchtabhandle();
        Assert.assertEquals(getTitle(), "New 2.0 Ton Mini Excavator Trailer With Cheap Price Crawler Excavator - Buy Home Agricultural Farm Crawler Mini Excavator,Excavator With Rubber Track,Chinese Mini Excavator For Sale Product on Alibaba.com");
    }

}
