package us.piit.search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class SearchSingleElement extends CommonAPI {

    @Test

    public void searchelement() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchelements("monitor");
        Assert.assertEquals(getTitle(),"Monitor-Monitor Manufacturers, Suppliers and Exporters on Alibaba.comTouch Screen Monitors");
    }
    @Test

    public void searchecellphone() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchelements("cellphone");
       Assert.assertEquals(getTitle(),"Cellphone-Cellphone Manufacturers, Suppliers and Exporters on Alibaba.comMobile Phones");
    }
}
