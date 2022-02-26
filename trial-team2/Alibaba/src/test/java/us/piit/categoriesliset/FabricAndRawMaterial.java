package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class FabricAndRawMaterial extends CommonAPI {
    @Test
    public void fabricandRawMaterillist(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getfabric(driver);
        homePage.alibabaTab5();
        Assert.assertEquals(getTitle(),"fabric textile raw material, fabric textile raw material Suppliers and Manufacturers at Alibaba.com");
    }
}
