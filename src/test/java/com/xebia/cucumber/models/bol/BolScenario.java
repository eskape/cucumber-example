package com.xebia.cucumber.models.bol;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.xebia.cucumber.models.bol.BolTest.driver;

public class BolScenario {

    @Given("^the user is on the homepage of bol$")
    public void openBolHomePage() {
    }

    @When("^the user orders products (\\d+)$")
    public void orderProduct(int arg1) {
        driver.get("http://www.bol.com");
    }

    @Then("^the total price in basket should be \"([^\"]*)\"$")
    public void checkTotalPrice(String arg1) {
        System.out.println(arg1);
    }

    @Then("^the product delivery in basket should be \"([^\"]*)\"$")
    public void checkProductDelivery(String arg1) {
        System.out.println(arg1);
    }


}
