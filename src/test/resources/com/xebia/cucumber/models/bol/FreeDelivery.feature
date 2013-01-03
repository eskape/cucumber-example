Feature: Free Delivery
    As a marketing manager 
    I want the system to offer free delivery on certain items 
    So I can entice customers to order more

    Scenario Outline: System offers free delivery
        Given the user is on the homepage of bol
        When the user orders products <product>
        Then the total price in basket should be <totalPrice>
        And the product delivery in basket should be <productDelivery>

      Examples:
        | product          | totalPrice | productDelivery |
        | 1001004000957827 | "€ 7,99"   | "Niet Gratis"   |
        | 1001004006392590 | "€ 35,99"  | "Gratis"        |

