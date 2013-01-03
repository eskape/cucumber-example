Feature: Free Delivery
    As a marketing manager 
    I want the system to offer free delivery on certain items 
    So I can entice customers to order more

    Scenario Outline: System offers free delivery
        Given the user has no products in basket
        When the user orders products <product>
        Then the total price in basket should be <totalPrice>
        And the product delivery in basket should be <productDelivery>

      Examples:
        | product                          | totalPrice | productDelivery |
        | "influence/1001004004861415"     | "€ 13,99"  | "€ 1,99"        |
        | "agile-testing/1001004006392590" | "€ 35,99"  | "Gratis"        |

