Feature:TC3
  @YaHak
  Scenario: Adding products to the card from the Home section
    Given Navigate to url 'https://www.giftsandflowers.co.ke/'
    Then Click on 'Home' page
    Then Click 'Flowers' buttonn
    Then Verify that page 'Flowers' is visible successfully
    Then Select Product 'Red & White Rose Bouquet'
    Then veryf that text 'Red & White Rose Bouquet'
    Then Click 'Edit' Button
    Then Write ' All the best ' text
    Then Click on ' Save ' buttonnn
    Then Verfy text 'Saved' is visible successfully
    Then Click 'Add To Cart'
    Then Click on 'Close' buttons