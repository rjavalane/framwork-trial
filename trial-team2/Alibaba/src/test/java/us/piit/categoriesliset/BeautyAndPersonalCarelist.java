package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class BeautyAndPersonalCarelist extends CommonAPI {
    @Test
    public void beautyandCare(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getBeautycare(driver);
        homePage.alibabaTab6();
        Assert.assertEquals(getTitle(),"beauty personal care, beauty personal care Suppliers and Manufacturers at Alibaba.com");
    }
}
