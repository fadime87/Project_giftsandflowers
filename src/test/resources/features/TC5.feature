Feature: TC5
  @YaAlim
  Scenario: Search Product
    Given Navigate to url 'https://www.giftsandflowers.co.ke/'
    Then clickk 'Search' button
    Then Verfy TEXT ' Sweet Hugs ' is visible successfuly
    Then Click 'Edit' Button
    Then Write ' This is for you ' Text
    Then Click on ' Save ' buttonnn
    Then Verfy text 'Saved' is visible successfully
    Then Click 'Add To Cart'