package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class ToolsAndHardwar extends CommonAPI {
    @Test
    public void ToolsandHardwarlist(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.gettoolsHardwar(driver);
        homePage.alibabaTab8();
        Assert.assertEquals(getTitle(),"tools hardware, tools hardware Suppliers and Manufacturers at Alibaba.com");
    }
}

