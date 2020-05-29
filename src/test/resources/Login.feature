Feature: Login

  Background:
    Given I open Browser and Landed on home page
    When I click on sigin
    And I should see drop down on with three sublink
    And I click on  sign-in
    Then I should land on sign-in page

    Scenario: Verify New customer tab on page
      And I should see New to Cath kidston
      When I click on it
      Then I should navigate to register page

  Scenario Outline: Verfiy user login Successfully
    And I enter valid "<username>" "<password>"
    And I check remember box
    And I click on sign-in button
    Then I should successfully sign-in and see welcome massage"Welcome Pranav"
    Examples:
      | username             | password  |
      | ppothiwala@gmail.com | Neelraj11 |

  Scenario Outline: Verify enter email text on empty emial box
    And I enter valid "<username>" "<password>"
    And I check remember box
    Then I should see enter massage"Please enter a valid Email"
    Examples:
      | username     | password  |
      | jdfkkljsfdlk | Neelraj11 |

  Scenario Outline:Verify with invalid credential
    And I enter valid "<username>" "<password>"
    And I check remember box
    Then I should see enter massage"Please enter a valid Email"
    Examples:
      | username        | password |
      | jdfkkl@test.com | kjskljxc |

  Scenario: Verfiy user sign-in with google
    And I click on sign-in with google
    Then I should navigated to sign-in with google page

  Scenario: Verify user sign with facebook
    And I click on sign-in with google
    Then I should navigated to sign-in with google page



