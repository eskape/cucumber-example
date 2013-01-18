package com.xebia.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class Page {

    protected WebDriver driver;


    public Page(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void loseFocusByClickingOnTheBody() {
        driver.findElement(By.tagName("body")).click();
    }

    public void pageRenderSleep() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
