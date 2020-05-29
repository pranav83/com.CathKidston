package com.CathKidston;


import org.openqa.selenium.WebElement;
import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class HeaderCathKidston extends BaseMain {

    Actions act = new Actions(driver);

    public HeaderCathKidston() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'New Arrivals')]")
    private WebElement newArrival;
    @FindBy(xpath = "//a[contains(text(),'Bestsellers')]")
    private WebElement bestSeller;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Collections & Prints')]")
    private WebElement collectionPrints;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Bags')]")
    private WebElement bagsCollection;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Accessories')]")
    private WebElement textAccessories;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Clothing')]")
    private WebElement textClothing;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Home')]")
    private WebElement textHome;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Beauty')]")
    private WebElement textBeauty;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Cath Kids')]")
    private WebElement cathKids;
    @FindBy(xpath = "//a[contains(@class,'d-none d-md-block')][contains(text(),'Gifts')]")
    private WebElement cathGifts;
    @FindBy(xpath = "//a[contains(@class,'b-main_nav-link m-has_sub_menu m-highlighted-cat d-none d-md-block')]")
    private WebElement cathSale;
    @FindBy(xpath = "//a[contains(@class,'b-main_nav-link _b-nav-link_1')]")
    private WebElement linkBlogs;
    //New Arrivals SubMenu
    @FindBy(xpath = "//a[@class='b-main_nav-link_level_2 m-has_sub_menu d-none d-md-inline-block'][contains(text(),'Shop New Arrivals')]")
    private WebElement shopNewArrivals;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedShopNewArrivals;
    @FindBy(xpath = "//li[1]//div[1]//div[1]//ul[1]//li[3]//ul[1]//li[3]//a[1]//span[1]")
    private WebElement newArrivalsBag;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedBags;
    @FindBy(xpath = "//li[1]//div[1]//div[1]//ul[1]//li[3]//ul[1]//li[4]//a[1]//span[1]")
    private WebElement newAccessories;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedAccessoirs;
    @FindBy(xpath = "//li[1]//div[1]//div[1]//ul[1]//li[3]//ul[1]//li[5]//a[1]//span[1]")
    private WebElement newClothing;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedClothing;
    @FindBy(xpath = "//span[text()='Home']")
    private WebElement newHome;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedHome;
    @FindBy(xpath = "//span[text()='Cath Kids']")
    private WebElement newCathKids;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedCathKids;
    @FindBy(xpath = "//li[1]//div[1]//div[1]//ul[1]//li[3]//ul[1]//li[8]//a[1]")
    private WebElement newViewAll;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedViewAll;
    //Verify BestSeller Elements
    @FindBy(xpath = "//a[contains(text(),'Bestsellers')]")
    private WebElement headerBestSeller;
    @FindBy(xpath = "//h1[@class='b-category_header-name']")
    private WebElement nameDisplayedBestSeller;


    public void navigateTo() {
        driver.get("https://www.cathkidston.com/en-gb/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

    public void mouseHover() {
        Actions act = new Actions(driver);
        act.moveToElement(newArrival).build().perform();
        act.moveToElement(bestSeller).build().perform();
        act.moveToElement(collectionPrints).build().perform();
        act.moveToElement(bagsCollection).build().perform();
        act.moveToElement(textAccessories).build().perform();
        act.moveToElement(textClothing).build().perform();
        act.moveToElement(textHome).build().perform();
        act.moveToElement(textBeauty).build().perform();
        act.moveToElement(cathKids).build().perform();
        act.moveToElement(cathGifts).build().perform();
        act.moveToElement(cathSale).build().perform();
        act.moveToElement(linkBlogs).build().perform();
    }

    public void mouseHoverNewArrivals() {
        Actions act1 = new Actions(driver);
        act1.moveToElement(newArrival).build().perform();
    }

    public void setShopNewArrivals() {
        shopNewArrivals.click();
    }

    public boolean setNameDisplayedShopNewArrivals() {
        Assert.assertTrue(nameDisplayedShopNewArrivals.isDisplayed());
        return true;

    }


    public void setNewArrivalsBag() {
        driver.navigate().back();
        act.moveToElement(newArrival).build().perform();
        newArrivalsBag.click();

    }

    public boolean nameDisplayedNewArrivalsBag() {

        Assert.assertTrue(nameDisplayedBags.isDisplayed());
        return true;
    }

    public void setNewAccessories() throws InterruptedException {
        driver.navigate().back();
        act.moveToElement(newArrival).build().perform();
        Thread.sleep(2000);
        newAccessories.click();
    }

    public boolean nameDisplayedNewAccessories() {
        Assert.assertTrue(nameDisplayedAccessoirs.isDisplayed());
        return true;
    }

    public void setNewClothing() {
        driver.navigate().back();
        act.moveToElement(newArrival).build().perform();
        newClothing.click();
    }

    public boolean nameDisplayedNewClothing() {
        Assert.assertTrue(nameDisplayedClothing.isDisplayed());
        return true;
    }

    public void setNewHome() {
        driver.navigate().back();
        act.moveToElement(newArrival).build().perform();
        newHome.click();
    }

    public boolean nameDispalyedNewHome() {

        Assert.assertTrue(nameDisplayedHome.isDisplayed());
        return true;
    }

    public void setNewCathKids() {
        driver.navigate().back();
        act.moveToElement(newArrival).build().perform();
        newCathKids.click();

    }

    public boolean nameDisplayedNewCathKids() {
        Assert.assertTrue(nameDisplayedCathKids.isDisplayed());
        return true;
    }

    public void setNewViewAll() {
        driver.navigate().back();
        act.moveToElement(newArrival).build().perform();
        newViewAll.click();
    }

    public boolean nameDisplayedNewViewAll() {
        Assert.assertTrue(nameDisplayedViewAll.isDisplayed());
        return true;
    }

    public void setHeaderBestSeller() {

        act.moveToElement(headerBestSeller).build().perform();

    }

    public void clickonBestSeller() {

        headerBestSeller.click();
    }

    public boolean setNameDisplayedBestSeller() {
        Assert.assertTrue(nameDisplayedBestSeller.isDisplayed());
        return true;
    }


}
