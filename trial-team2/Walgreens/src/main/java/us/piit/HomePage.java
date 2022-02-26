package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
   @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[2]")
    WebElement accountbtn;
    @FindBy(xpath = "//a[@id='pf-dropdown-register']")
    WebElement registerbtn;
    @FindBy(xpath = "(//strong[text()='Sign in'])[2]")
    public
    WebElement signinbtn;
    @FindBy(css="#ntt-placeholder")
    WebElement homesearchbar;
    @FindBy(css="#pf-icon__search")
    public
    WebElement searchbtn;
    @FindBy(xpath = "//strong[text()='Schedule vaccine']")
    WebElement vaccinebtn;
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[1]")
    WebElement homemenubtn;
    @FindBy(xpath = "//span[text()='Coupons']")
    public
    WebElement couponsbtn;
    @FindBy(xpath = "//strong[text()='Pharmacy Chat']")
    WebElement pharmacychatbtn;
    @FindBy(xpath = "(//div[@class='card__content'])[1]")
    WebElement seehealthservices;
    @FindBy(xpath = "//span[text()='Shop Products']")
    public
    WebElement shopproductsbtn;
    @FindBy(xpath = "//span[text()='Pet']")
    WebElement petdropdownbtn;
    @FindBy(xpath = "//span[text()='Cat Supplies']")
    public
    WebElement catsuppliesbtn;
    @FindBy(xpath = "//a[text()='Cat Food']")
    WebElement catfoodbtn;
    @FindBy(xpath = "(//span[text()='Beauty'])[1]")
    public
    WebElement beautysuppliesbtn;
    @FindBy(xpath = "(//strong[text()='Shop Beauty'])[1]")
    WebElement shopbeautybtn;
    @FindBy(xpath = "//a[text()='Careers']")
    public
    WebElement careerbtn;
    @FindBy(xpath = "(//span[text()='Medicines & Treatments'])[1]")
    public
    WebElement medicinesandtreatmentsbnt;
    @FindBy(xpath = "(//span[text()='Cough, Cold & Flu'])[1]")
    WebElement coughcoldflubtn;
    @FindBy(xpath = "(//a[text()='Adult Cold Remedies'])[1]")
    WebElement adultcoldremedies;
    @FindBy(xpath = "(//span[text()='Vitamins & Supplements'])[1]")
    public
    WebElement vitamiesandsupplements;
    @FindBy(xpath = "//span[text()='Multivitamins']")
    public
    WebElement vitaminesbtn;
    @FindBy(xpath = "//a[contains(text(),\"Men's Multivitamins\")]")
    WebElement mensvitaminesbtn;
    @FindBy(xpath = "//span[contains(text(),'Home Health Care Solutions')]")
    public
    WebElement homehealthcarebtn;
    @FindBy(xpath = "(//span[text()='Home Tests & Monitoring'])[3]")
    WebElement hometestbtn;
    @FindBy(xpath = "(//a[text()='At Home COVID Tests'])[3]")
    WebElement athomecovidtestbtn;
    @FindBy(xpath = "//span[contains(text(),'Home Goods')]")
    public
    WebElement homegoodsbtn;
    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[9]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement homedecorbtn;
    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[9]/div[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]")
    WebElement decorativeaccentsbtn;
    @FindBy (xpath = "//span[text()='Prescriptions']")
    public
    WebElement prescriptionsbtn;
    @FindBy(css = "#refills")
    public
    WebElement prescriptionsrefillsbtn;
    @FindBy(xpath = "//span[text()='Storage & Organization']")
    public
    WebElement storagebtn;
    @FindBy(xpath = "(//a[text()='Bathroom Storage & Organization'])[1]")
    public
    WebElement bathroomstoragebtn;
    @FindBy(xpath = "//span[text()='Home Improvement']")
    public
    WebElement homeimprovementbtn;
    @FindBy(xpath = "//a[text()='Light Bulbs']")
    public
    WebElement lightbulbsbtn;
    @FindBy(xpath = "(//span[text()='Arts & Crafts'])[1]")
    public
    WebElement artsandcraftbtn;
    @FindBy(xpath = "(//a[text()='Painting Supplies'])[1]")
    public
    WebElement paintingsuppliesbtn;
    @FindBy(xpath = "//span[text()='Small Home Appliances']")
    public
    WebElement smallhomeappliancesbtn;
    @FindBy(xpath = "//a[text()='Sewing Tools & Accessories']")
    public
    WebElement sewingtoolsbtn;
    @FindBy(xpath = "//span[text()='Party Supplies, Cards & Gift Wrap']")
    public
    WebElement partysuppliesbtn;
    @FindBy(xpath = "//a[text()='Gift Wrap, Bags & Accessories']")
    public
    WebElement giftwrapbagbtn;
    @FindBy(xpath = "//span[text()='Kitchen & Dining']")
    public
    WebElement kitchenanddiningbtn;
    @FindBy(xpath = "//a[text()='Kitchen Utensils']")
    public
    WebElement kitchenutensilsbtn;
    @FindBy(xpath = "//span[text()='Bed & Bath']")
    public
    WebElement bedandbathbtn;
    @FindBy(xpath = "(//a[text()='Blankets & Throws'])[2]")
    public
    WebElement blanketsandthrowsbtn;
    @FindBy(xpath = "//span[text()='Heating, Cooling & Air Quality']")
    public
    WebElement heatingandcoolingbtn;
    @FindBy(xpath = "//a[text()='Fans']")
    public
    WebElement fansbtn;
    @FindBy(xpath = "//span[text()='Clothing, Shoes & Accessories']")
    public
    WebElement clothingandshoesbtn;
    @FindBy(xpath = "//strong[text()='Sale on Clothing, Shoes & Accessories']")
    public
    WebElement salesonclothingbtn;
    @FindBy(xpath = "//span[text()='Luggage, Travel Gear & Accessories']")
    public
    WebElement luggageandtravelgearbtn;
    @FindBy(xpath = "//strong[text()='Sale on Luggage, Travel Gear & Accessories']")
    public
    WebElement salesonluggagebtn;
    @FindBy(xpath = "(//span[text()='Outdoor Living'])[1]")
    public
    WebElement outdoorlivingbtn;
    @FindBy(xpath = "(//a[text()='All Weather Essentials'])[1]")
    public
    WebElement allweatheressentialbtn;
    @FindBy(xpath = "(//a[@class='lvl-4-title mobile-more__arrow'])[51]")
    public
    WebElement automotivebtn;
    @FindBy(xpath = "body.position-fixed.menu:nth-child(2) div.nav__wrapper-test.testing:nth-child(1) nav.nav__top div.nav__top-container div.contain-header-links div.dropdown.dropdown__menu div.default-dropdown.menu-dropdown.show nav.nav__main ul.nav__main-container li.dropdown.dropdown__mega-container:nth-child(5) ul.mega-dropdown.show-next-lvl.remove-padding li.mega-dropdown__master-title.testing:nth-child(9) div.mega-dropdown__menu.show-next-lvl.remove-padding div.right-links li:nth-child(7) ul.container__list-lvl-2.show-on-mobile.show-next-lvl li:nth-child(9) a:nth-child(1) > strong:nth-child(1)")
    public
    WebElement salesonautomotivebtn;
    @FindBy(xpath = "//span[text()='As Seen On TV']")
    public
    WebElement asseenontvbtn;











   public void  clickOnAccountBtn(){

    public void  clickOnAccountBtn(){

       click(accountbtn);
   }
    public void clickOnRegisterBtn(){
       click(registerbtn);
   }
    public void clickOnSigninBtn(){
       click(signinbtn);
    }
    public void typeOnHomeSearchBar(){type(homesearchbar, "water");}
    public void clickOnSearchBtn(){click(searchbtn);}
    public void clickOnVaccineBtn(){click(vaccinebtn);}
    public void clickOnHomeMenu(){click(homemenubtn);}
    public void clickOnCouponsBtn(){
       click(couponsbtn);
    }
    public void clickOnPharmacyChatBtn(){
       click(pharmacychatbtn);
    }
    public void ScrollToViewService(){
       scrollToView(seehealthservices);
    }
    public void seeHealthServices(){
       click(seehealthservices);
    }
    public void shopProductsBtn(){
       click(shopproductsbtn);
    }
    public void petDropDownbtn(){
       click(petdropdownbtn);
    }
    public void catSuppliesBtn(){
       click(catsuppliesbtn);
    }
    public void catFoodBtn(){
       click(catfoodbtn);
    }
    public void beautySuppliesBtn(){
       click(beautysuppliesbtn);
    }
    public void shopBeautyBtn(){click(shopbeautybtn);}
    public void scrollToViewCarrer(){scrollToView(careerbtn);}
    public void clickOnCareerBtn(){click(careerbtn);}
    public void medicinesAndTreatmentBtn(){click(medicinesandtreatmentsbnt);}
    public void CoughColdFlu(){click(coughcoldflubtn);}
    public void adultColdRemedies(){click(adultcoldremedies);}
    public void vitaminesAndSupplements(){click(vitamiesandsupplements);}
    public void vitaminesBtn(){click(vitaminesbtn);}
    public void mensVitaminesBtn(){click(mensvitaminesbtn);}
    public void homeHealthCareBtn(){click(homehealthcarebtn);}
    public void homeTestBtn(){click(hometestbtn);}
    public void atHomeCovidTestBtn(){click(athomecovidtestbtn);}
    public void homeGoodsBtn(){click(homegoodsbtn);}
    public void homeDecorBtn(){click(homedecorbtn);}
    public void setDecorativeAccentsBtn(){click(decorativeaccentsbtn);}
    public void prescriptionsBtn(){click(prescriptionsbtn);}
    public void prescriptionsRefillsBtn(){click(prescriptionsrefillsbtn);}
    public void StorageBtn(){click(storagebtn);}
    public void bathroomStorageBtn(){click(bathroomstoragebtn);};
    public void homeImprovementBtn(){click(homeimprovementbtn);}
    public void lightBulbsBtn(){click(lightbulbsbtn);}
    public void artsAndCraftBtn(){click(artsandcraftbtn);}
    public void paintingSuppliesBtn(){click(paintingsuppliesbtn);}
    public void smallHomeAppliancesBtn(){click(smallhomeappliancesbtn);}
    public void sewingToolsBtn(){click(sewingtoolsbtn);}
    public void partySuppliesBtn(){click(partysuppliesbtn);}
    public void giftWrapBagBtn(){click(giftwrapbagbtn);}
    public void kitchenAndDiningBtn(){click(kitchenanddiningbtn);}
    public void kitchenUtensilsBtn(){click(kitchenutensilsbtn);}
    public void BedAndBathBtn(){click(bedandbathbtn);}
    public void blanketsAndThrowsBtn(){click(blanketsandthrowsbtn);}
    public void heatingAndCoolingBtn(){click(heatingandcoolingbtn);}
    public void FansBtn (){click(fansbtn);}
    public void clothingAndShoesBtn(){click(clothingandshoesbtn);}
    public void salesOnCothingBtn(){click(salesonclothingbtn);}
    public void luggageAndTravelGearBtn(){click(luggageandtravelgearbtn);}
    public void salesOnLuggageBtn(){click(salesonluggagebtn);}
    public void outdoorLivingBtn(){click(outdoorlivingbtn);}
    public void allWeatherEssentialBtn(){click(allweatheressentialbtn);}
    public void AutomotiveBtn(){click(automotivebtn);}
    public void salesOnAutomotiveBtn(){click(automotivebtn);}
    public void aasSeenOnTVBtn(){click(asseenontvbtn);}



}
