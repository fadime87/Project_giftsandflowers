Feature: TC4
  @YaCemil
  Scenario: Remove Product in Cart
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
    Then Click ' x ' icon
    Then Verfy Text 'NO PRODUCTS IN THE CART.' is visible successfuly
    Then click 'RETURN TO SHOP' Button