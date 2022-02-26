package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class SportAndEntertaiment extends CommonAPI {
    @Test
    public void sportequipmentlist(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getsportequipment(driver);
        homePage.alibabaTabsportequipment();
        Assert.assertEquals(getTitle(),"sports entertainment, sports entertainment Suppliers and Manufacturers at Alibaba.com");
    }
}
