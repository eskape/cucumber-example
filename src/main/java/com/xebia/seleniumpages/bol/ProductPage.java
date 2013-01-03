package com.xebia.seleniumpages.bol;

import com.thoughtworks.selenium.Wait;
import com.xebia.seleniumpages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Page {

    private String productId;

    public ProductPage(WebDriver driver, String productId) {
        super(driver);
        this.productId = productId;
    }

    public void orderProduct() {
        driver.findElement(By.name("/atg/commerce/order/purchase/CartModifierFormHandler.addItemToOrder")).click();
        waitForProductInBasket();
    }

    private void waitForProductInBasket() {
        new Wait(String.format("Couldn't find product id in basket [%s]", productId)) {
            public boolean until() {
                try {
                    driver.findElement(By.xpath(String.format("//div[@data-product_id='%s']", productId)));
                    return true;
                } catch (NoSuchElementException e) {
                    return false;
                } catch (StaleElementReferenceException sere) {
                    return false;
                }
            }
        };

    }


}
