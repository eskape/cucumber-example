package com.xebia.cucumber.shoppinglist;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-shoppinglist-report", "json:target/cucumber-shoppinglist-report.json"})
public class ShoppingListTest {
}
