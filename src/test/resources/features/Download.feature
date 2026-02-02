Feature: Download Document Functionality


  Scenario: Verify Login with Valid Credentials
    Given The user navigates to the SauceDemo login page
    When The user logs in with valid credentials
    And Adds two items to the cart
    And Views the cart and verifies the items
    And proceeds to checkout
    And fills in checkout information
    And completes the purchase
    Then the user should see the "THANK YOU FOR YOUR ORDER" confirmation message