package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

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
    @FindBy(xpath = "//a[@data-element-name='Shop Products']")
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
    @FindBy(xpath = "//a[@data-element-name='Easter']")
    public
    WebElement easterbtn;
    @FindBy(xpath = "//a[@data-element-name='Easter Candy & Chocolate']")
    public
    WebElement candyandchocolatbtn;
    @FindBy(xpath = "//a[@data-element-name='Easter Candy']")
    public
    WebElement eastercandybtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Chocolate Bunnies'])[1]")
    public
    WebElement chocolatebunniesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Premium Chocolate & Gifting'])[1]")
    public
    WebElement premiumchocolatebtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Egg Candy Fillers'])[1]")
    public
    WebElement eggcandyfillersbtn;
    @FindBy(xpath = "//a[@data-element-name='Easter Peeps']")
    public
    WebElement easterpeepsbtn;
    @FindBy(xpath = "//a[@data-element-name='Easter Jelly Beans']")
    public
    WebElement easterjellybeansbtn;
    @FindBy(xpath = "//a[@data-element-name='Shop Easter Candy & Chocolate']")
    public
    WebElement shopeastercandychocolatebtn;
    @FindBy(xpath = "//a[@data-element-name='Sale on Easter Candy & Chocolate']")
    public
    WebElement saleseastercandychocolatebtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Baskets'])[1]")
    public
    WebElement easterbasketbtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Baskets'])[2]")
    public
    WebElement subeasterbasketsbtn;
    @FindBy(xpath = "//a[@data-element-name='Easter Grass']")
    public
    WebElement eastergrassbtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Premade Baskets'])[1]")
    public
    WebElement easterpremadebasketsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Easter Toys & Plush'])[1]")
    public
    WebElement eastertoysplushbtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Easter Baskets'])[1]")
    public
    WebElement shopeasterbasketsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Sale on Easter Baskets'])[1]")
    public
    WebElement saleseasterbasketsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Personal Care'])[1]")
    public
    WebElement personalcarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Hair Care'])[2]")
    public
    WebElement haircarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Hair Color'])[2]")
    public
    WebElement haircolorbtn;
    @FindBy(xpath = "(//a[@data-element-name='Shampoo & Conditioner'])[2]")
    public
    WebElement shampooandconditionerbtn;
    @FindBy(xpath = "(//a[@data-element-name='Textured Hair Care'])[2]")
    public
    WebElement texturedhaircarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Salon Hair Care'])[2]")
    public
    WebElement salonhaircarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Styling Products'])[2]")
    public
    WebElement stylingproductsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Hair & Scalp Treatments'])[2]")
    public
    WebElement hairandscalptreatmentbtn;
    @FindBy(xpath = "(//a[@data-element-name='Styling Tools & Appliances'])[2]")
    public
    WebElement stylingtoolsandappliancesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Hair Brushes & Accessories'])[2]")
    public
    WebElement hairbrushesaccessoriesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Hair Care'])[2]")
    public
    WebElement shophaircarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Sale on Hair Care'])[2]")
    public
    WebElement salesonhaircarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Oral Care'])[1]")
    public
    WebElement oralcarebtn;
    @FindBy (xpath = "//a[@data-element-name='Toothpaste']")
    public
    WebElement toothpastebtn;
    @FindBy(xpath = "(//a[@data-element-name='Electric Toothbrushes, Water Flossers & Replacement Heads'])[1]")
    public
    WebElement electrictoothbrushesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Mouthwash & Rinses'])[1]")
    public
    WebElement mouthwashandrinsesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Toothbrush Covers & Sanitizers'])[1]")
    public
    WebElement toothbrushcoversbtn;
    @FindBy(xpath = "(//a[@data-element-name='Teeth Whitening'])[1]")
    public
    WebElement teethwhiteningbtn;
    @FindBy(xpath = "(//a[@data-element-name='Manual Toothbrushes & Tongue Cleaners'])[1]")
    public
    WebElement tonguecleanersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Floss & Flossers'])[1]")
    public
    WebElement flossandflossersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Denture Care'])[1]")
    public
    WebElement denturecarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Braces Care'])[1]")
    public
    WebElement bracescarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Gum Care'])[1]")
    public
    WebElement gumcarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Oral Care for Children'])[1]")
    public
    WebElement oralcareforchildrenbtn;
    @FindBy(xpath = "(//a[@data-element-name='Natural & Organic Oral Care'])[1]")
    public
    WebElement naturalandorganiccarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Oral Pain Relief'])[1]")
    public
    WebElement oralpainreliefbtn;
    @FindBy(xpath = "(//a[@data-element-name='Incontinence'])[1]")
    public
    WebElement incontinencebtn;
    @FindBy(xpath = "(//a[@data-element-name='Pads & Liners'])[1]")
    public
    WebElement padsandlinersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Protective Underwear & Briefs'])[1]")
    public
    WebElement protectiveunderwearbtn;
    @FindBy(xpath = "(//a[@data-element-name='Cloths & Wipes'])[1]")
    public
    WebElement clothsandwipesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Cleansers, Creams & Lotions'])[1]")
    public
    WebElement cleansersandlotionsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Bedding Protection'])[1]")
    public
    WebElement beddingprotectionbtn;
    @FindBy(xpath = "(//a[@data-element-name='Bedpans & Urinals'])[1]")
    public
    WebElement bedpansandurinalsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Heavy Absorbency'])[1]")
    public
    WebElement heavyabsorbencybtn;
    @FindBy(xpath = "(//a[@data-element-name='Moderate Absorbency'])[1]")
    public
    WebElement moderateabsorbencybtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Incontinence'])[1]")
    public
    WebElement shopincontinencebtn;
    @FindBy(xpath = "(//a[@data-element-name='Sale on Incontinence'])[1]")
    public
    WebElement salesonincontinencebtn;
    @FindBy(xpath = "(//a[@data-element-name='Sun Care'])[2]")
    public
    WebElement suncarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Sunscreen for Body'])[2]")
    public
    WebElement sunscreenforbodybtn;
    @FindBy(xpath = "(//a[@data-element-name='Sunscreen for Face'])[2]")
    public
    WebElement sunscreenforfacebtn;
    @FindBy(xpath = "(//a[@data-element-name='Sunscreen for Children'])[2]")
    public
    WebElement sunscreenforchildrenbtn;
    @FindBy(xpath = "(//a[@data-element-name='Self Tanners'])[2]")
    public
    WebElement selftannersbtn;
    @FindBy(xpath = "(//a[@data-element-name='After Sun Care'])[2]")
    public
    WebElement aftersuncarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Bags & Accessories'])[2]")
    public
    WebElement bagsandaccessoriesbtn;
    @FindBy(xpath = "(//a[@data-element-name='Natural & Organic Sun Care'])[3]")
    public
    WebElement naturalorganicsuncarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Sun Care'])[2]")
    public
    WebElement shopsuncarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Sale on Sun Care'])[2]")
    public
    WebElement salesonsuncarebtn;
    @FindBy(xpath = "(//a[@data-element-name='Electronics & Office'])[1]")
    public
    WebElement electronicsandofficebtn;
    @FindBy(xpath = "(//a[@data-element-name='Calendars & Planners'])[1]")
    public
    WebElement calendarsandplannersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Calendars'])[1]")
    public
    WebElement calendarsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Planners'])[1]")
    public
    WebElement plannersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Calendars & Planners'])[1]")
    public
    WebElement shopcalendarsandplannersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Binders, Folders & Filing'])[1]")
    public
    WebElement bindersfoldersbtn;
    @FindBy(xpath = "(//a[@data-element-name='File Dividers & Tabs'])[1]")
    public
    WebElement filedividerbtn;
    @FindBy (xpath = "(//a[@data-element-name='Sheet Protectors'])[1]")
    public
    WebElement sheetprotectorsbtn;
    @FindBy(xpath = "(//a[@data-element-name='Binders'])[1]")
    public
    WebElement bindersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Folders'])[1]")
    public
    WebElement foldersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Binders, Folders & Filing'])[1]")
    public
    WebElement shopbindersfoldersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Markers & Highlighters'])[1]")
    public
    WebElement markersandhighlightersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Permanent Markers'])[1]")
    public
    WebElement permanentmarkersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Highlighters'])[1]")
    public
    WebElement highlightersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Dry Erase Markers'])[1]")
    public
    WebElement dryerasemarkersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Washable Markers'])[1]")
    public
    WebElement washablemarkersbtn;
    @FindBy(xpath = "(//a[@data-element-name='Shop Markers & Highlighters'])[1]")
    public
    WebElement shopmarkersandhighlightersbtn;



   public void shopMarkersAndHighlightersBTN(){click(shopmarkersandhighlightersbtn);}
   public void washableMarkersBTN(){click(washablemarkersbtn);}
   public void dryEraseMarkersBTN(){click(dryerasemarkersbtn);}
   public void highlightersBTN(){click(highlightersbtn);}
   public void permanentMarkersBTN(){click(permanentmarkersbtn);}
   public void markersAndHighlightersBTN(){click(markersandhighlightersbtn);}
   public void shopbindersFoldersBTN(){click(shopbindersfoldersbtn);}
   public void foldersBTN(){click(foldersbtn);}
   public void bindersBTN(){click(bindersbtn);}
   public void sheetProtectorsBTN(){click(sheetprotectorsbtn);}
   public void fileDividersBTN(){click(filedividerbtn);}
   public void bindersFoldersBTN(){click(bindersfoldersbtn);}
   public void shopCalendarsAndPlannersBTN(){click(shopcalendarsandplannersbtn);}
   public void plannersBTN(){click(plannersbtn);}
   public void calendarsBTN(){click(calendarsbtn);}
   public void calendarsAndPlannersBTN(){click(calendarsandplannersbtn);}
   public void electronisAndOfficeBTN(){click(electronicsandofficebtn);}
   public void salesOnSunCareBTN(){click(salesonsuncarebtn);}
   public void shopSunCareBTN(){click(shopsuncarebtn);}
   public void naturalOrganicsuncareBTN(){click(naturalorganicsuncarebtn);}
   public void bagsAndAccessoriesBTN(){click(bagsandaccessoriesbtn);}
   public void afterSunCareBTN(){click(aftersuncarebtn);}
   public void selfTannersBTN(){click(selftannersbtn);}
   public void sunscreenForChildrenBTN(){click(sunscreenforchildrenbtn);}
   public void sunscreenForFaceBTN(){click(sunscreenforfacebtn);}
   public void sunscreenforBodyBTN(){click(sunscreenforbodybtn);}
   public void sunCareBTN(){click(suncarebtn);}
   public void salesOnIncontinenceBTN(){click(salesonincontinencebtn);}
   public void shopIncontinenceBTN(){click(shopincontinencebtn);}
   public void moderateAbsorbencyBTN(){click(moderateabsorbencybtn);}
   public void heavyAbsorbencyBTN(){click(heavyabsorbencybtn);}
   public void bedPansAndUrinalsBTN(){click(bedpansandurinalsbtn);}
   public void beddingProtectionBTN(){click(beddingprotectionbtn);}
   public void cleansersAndLotionsBTN(){click(cleansersandlotionsbtn);}
   public void clothsAndWipesBTN(){click(clothsandwipesbtn);}
   public void protectiveUnderWearBTN(){click(protectiveunderwearbtn);}
   public void padsAnsLinersBTN(){click(padsandlinersbtn);}
   public void IncontinenceBTN(){click(incontinencebtn);}
   public void oralPainreliefBTN(){click(oralpainreliefbtn);}
   public void naturalAndOrganicBTN(){click(naturalandorganiccarebtn);}
   public void oralcareForChildreBTN(){click(oralcareforchildrenbtn);}
   public void gumCareBTN(){click(gumcarebtn);}
   public void bracesCareBTN(){click(bracescarebtn);}
   public void dentureCareBTN(){click(denturecarebtn);}
   public void flossAndFlossersBTN(){click(flossandflossersbtn);}
   public void tongueCleanersBTN(){click(tonguecleanersbtn);}
   public void teethWhitheningBTN(){click(teethwhiteningbtn);}
   public void toothBrushCoversBTN(){click(toothbrushcoversbtn);}
   public void mouthWashAndRinsesBTN(){click(mouthwashandrinsesbtn);}
   public void electricToothBrushesBTN(){click(electrictoothbrushesbtn);}
   public void oralcareBTN(){click(oralcarebtn);}
   public void toothPasteBTN (){click(toothpastebtn);}
   public void candyAndChocolatBTN(){click(candyandchocolatbtn);}
   public void easterBtn(){click(easterbtn);}
   public void easterCandyBTN(){click(eastercandybtn);}
   public void chocolateBunniesBTN(){click(chocolatebunniesbtn);}
   public void premiumChocolateBTN(){click(premiumchocolatebtn);}
   public void eggCandyFillersBTN(){click(eggcandyfillersbtn);}
   public  void easterPeepsBTN(){click(easterpeepsbtn);}
   public void easterJellyBeansBTN(){click(easterjellybeansbtn);}
   public void shopEasterCandyChocolateBTN(){click(shopeastercandychocolatebtn);}
   public void salesEasterCandyChocolateBTN(){click(saleseastercandychocolatebtn);}
   public void easterBasketBTN(){click(easterbasketbtn);}
   public void subEasterBasketsBTN(){click(subeasterbasketsbtn);}
   public void easterGrassBTN(){click(eastergrassbtn);}
   public void easterPremadebasketsBTN(){click(easterpremadebasketsbtn);}
   public void easterToysPlushBTN(){click(eastertoysplushbtn);}
   public void shopEasterBasketsBTN(){click(shopeasterbasketsbtn);}
   public void salesEasterBasketsBTN(){click(saleseasterbasketsbtn);}
   public void personalCareBTN(){click(personalcarebtn);}
   public void hairCareBTN(){click(haircarebtn);}
   public void hairColorBTN(){click(haircolorbtn);}
   public void shampooAndConditionerBTN(){click(shampooandconditionerbtn);}
   public void texturedHairCareBTN(){click(texturedhaircarebtn);}
   public void salonHairCareBTN(){click(salonhaircarebtn);}
   public void stylingProductsBTN(){click(stylingproductsbtn);}
   public void hairAndScalpTreatmentsBTN(){click(hairandscalptreatmentbtn);}
   public void stylingToolsAndAppliancesBTN(){click(stylingtoolsandappliancesbtn);}
   public void hairBrushesAccessoriesBTN(){click(hairbrushesaccessoriesbtn);}
   public void shopHairCareBTN(){click(shophaircarebtn);}
   public void salesOnHaircareBTN(){click(salesonhaircarebtn);}



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
    public void FansBtn(){click(fansbtn);}
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
