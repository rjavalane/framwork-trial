package us.piit.categoriesliset;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class FoodAndBeverage extends CommonAPI {
    @Test
    public void foodandBeveragelist(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getfoodandbeverage(driver);
        homePage.alibabaTabFoodBeverage();
        Assert.assertEquals(getTitle(),"food beverage, food beverage Suppliers and Manufacturers at Alibaba.com");
    }
}
