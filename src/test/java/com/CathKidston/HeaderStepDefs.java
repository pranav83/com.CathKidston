package com.CathKidston;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderStepDefs extends BaseMain {
    HeaderCathKidston hck = new HeaderCathKidston();

    @Given("^I open Browser and Landed on home page$")
    public void i_open_Browser_and_Landed_on_home_page() {
        hck.navigateTo();

    }

    @Given("^I hover mouse on header$")
    public void i_hover_mouse_on_header() {
        hck.mouseHover();
    }

    @Then("^I should verify submenu on each header menu$")
    public void i_should_verify_submenu_on_each_header_menu() {
        hck.mouseHover();
    }

    @Given("^I hover mouse on New Arrivals on Header menu$")
    public void i_hover_mouse_on_New_Arrivals_on_Header_menu() {
hck.mouseHoverNewArrivals();
    }

    @When("^I click on each link on New Arrivals$")
    public void i_click_on_each_link_on_New_Arrivals() throws InterruptedException {
hck.setShopNewArrivals();
hck.setNewArrivalsBag();
hck.setNewAccessories();
hck.setNewClothing();
hck.setNewHome();
hck.setNewCathKids();
hck.setNewViewAll();
    }

    @Then("^I should land to relevant page$")
    public void i_should_land_to_relevant_page() {
hck.setNameDisplayedShopNewArrivals();
hck.nameDisplayedNewArrivalsBag();
hck.nameDisplayedNewAccessories();
hck.nameDisplayedNewClothing();
hck.nameDispalyedNewHome();
hck.nameDisplayedNewCathKids();
hck.nameDisplayedNewViewAll();

    }

    @And("^I hover mouse on Bestseller$")
    public void iHoverMouseOnBestseller() {
        hck.setHeaderBestSeller();
    }

    @When("^I click on Bestseller$")
    public void iClickOnBestseller() {
        hck.clickonBestSeller();
    }

    @Then("^I should should land on Bestseller page$")
    public void iShouldShouldLandOnBestsellerPage() {
        hck.setNameDisplayedBestSeller();
    }
}

