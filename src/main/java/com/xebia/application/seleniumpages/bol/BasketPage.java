package com.xebia.application.seleniumpages.bol;

import com.xebia.application.seleniumpages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends Page {


    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public String getDeliveryCosts() {
        return driver.findElement(By.id("qft_shopping_basket_shipping_costs")).findElement(By.className("price_value")).getText();
    }

    public String getTotalPrice() {
        return driver.findElement(By.id("qft_shopping_basket_price")).findElement(By.className("price_value")).getText();
    }


}
