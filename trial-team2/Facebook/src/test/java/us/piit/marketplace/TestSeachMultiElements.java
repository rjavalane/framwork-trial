package us.piit.marketplace;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.MarketPlacePage;
import utility.DataReader;

import java.util.List;

public class TestSeachMultiElements extends CommonAPI {
    DataReader dr = new DataReader();

    public List<String> getItemsFromExcel(){
        return dr.getEntireColumnForGivenHeader("..\\Facebook\\src\\data\\my-data.xlsx", "Sheet1",  "list");
    }
    @Test
    public void searchItems(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(getTitle(),"Facebook - Log In or Sign Up");
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        MarketPlacePage marketPlacePage=new MarketPlacePage(driver);
        marketPlacePage.scrollDownIntoView();
        marketPlacePage.clickOnMarketPlace();
        for (String item: getItemsFromExcel()) {
            marketPlacePage.searchInOneClickAndClear(item);
        }

    }
}
