package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class OfficeAndSchoolSupplies extends CommonAPI {
    @Test
    public void officeAndSchoolSupplieslist(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getSchoolsupplies(driver);
        homePage.alibabaTab7();
        Assert.assertEquals(getTitle(),"office school supplies, office school supplies Suppliers and Manufacturers at Alibaba.com");
    }
}
