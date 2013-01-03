package com.xebia.cucumber.models.bol;

import com.xebia.seleniumpages.bol.ProductPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.xebia.cucumber.models.bol.BolTest.driver;

public class BolScenario {

    @Given("^the user has no products in basket$")
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }

    @When("^the user orders products \"([^\"]*)\"$")
    public void orderProduct(String product) {
        String url = String.format("http://www.bol.com/nl/p/%s/", product);
        driver.get(url);
        String[] parts = product.split("/");
        ProductPage articlePage = new ProductPage(driver, parts[1]);
        articlePage.orderProduct();
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
