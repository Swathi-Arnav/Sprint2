Feature:Search for product
  Scenario: Verify that the user can search a product
    Given The User navigates to Home page
    When The User Enter the product name
    Then The Product should be displayed

  Scenario: Verify that the search field is presented with aligned
    Given The User navigates to Home page
    Then The Home page should be displayed

  Scenario: Verify by entering any one character in the search box
    Given The User navigates to Home page
    When The User should enter any one character
    Then Content page should be displayed



  Scenario: Verify by entering the string in the search bar between spaces
    Given The User navigates to Home page
    When The User should enter the string in the search bar between spaces
    Then Content page should be displayed



  Scenario: Verify by entering text that starts with special character
    Given The User navigates to Home page
    When The User should entering text that starts with special character
    Then Content page should be displayed
