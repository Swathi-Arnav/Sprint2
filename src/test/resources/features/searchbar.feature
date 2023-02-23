Feature:Search for product

  Scenario Outline:Verify that the user can able to search
    Given The User navigates to Home page
    When The user enter the search as "<searchfield>".
    Then The result should be displayed.
    Examples:
      | searchfield |
      |Appliances   |
      |Sports       |

  Scenario: Verify that the user can search a product
    Given The User navigates to Home page
    When The User Enter the product name
    Then The Product should be displayed

  Scenario: Verify that search field is present with aligned
    Given The User navigates to Home page
    Then The Home page should be displayed

  Scenario: Verify by entering any one character in the search box
    Given The User navigates to Home page
    When The User should enter any one character
    Then Error page should be displayed

  Scenario: Verify by entering the string in the search bar between spaces
    Given The User navigates to Home page
    When The User should enter the string in the search bar between spaces
    Then Content page should be displayed

  Scenario: Verify by entering text that starts with special character
    Given The User navigates to Home page
    When The User should entering text that starts with special character
    Then Content page should be displayed
