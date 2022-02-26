package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class LuggageAndBages extends CommonAPI {
    @Test
    public void luaggageandbages(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getluggage(driver);
        homePage.alibabaTabLuggage();
        Assert.assertEquals(getTitle(),"luggage bags cases, luggage bags cases Suppliers and Manufacturers at Alibaba.com");
    }
}
