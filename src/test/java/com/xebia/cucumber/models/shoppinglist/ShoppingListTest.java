package com.xebia.cucumber.models.shoppinglist;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-shoppinglist-report", "json-pretty:target/cucumber-shoppinglist-report.json"})
public class ShoppingListTest {
}
