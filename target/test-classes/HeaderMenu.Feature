@SmokePack
Feature: Header Menu

  Background:
    Given I open Browser and Landed on home page

  Scenario: Verify mouse hover on header menu with sub menu drop down
    And I hover mouse on header
    Then I should verify submenu on each header menu

  Scenario: Verify sublinks menu on New Arrivals
    And I hover mouse on New Arrivals on Header menu
    When I click on each link on New Arrivals
    Then I should land to relevant page

  Scenario: Verify sublink  on BestSeller
    And I hover mouse on Bestseller
    When I click on Bestseller
    Then I should should land on Bestseller page
