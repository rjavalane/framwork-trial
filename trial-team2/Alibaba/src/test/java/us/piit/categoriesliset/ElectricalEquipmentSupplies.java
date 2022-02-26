package us.piit.categoriesliset;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.util.logging.Handler;

public class ElectricalEquipmentSupplies extends CommonAPI {
    @Test
    public void electricalequipment(){
        HomePage homePage=new HomePage(driver);
        homePage.hoverOverCategories(driver);
        homePage.getElectricalEquipment(driver);
        homePage.alibabaTab9();
        Assert.assertEquals(getTitle(),"electrical equipment supplies, electrical equipment supplies Suppliers and Manufacturers at Alibaba.com");
    }
}
