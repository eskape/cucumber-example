package com.xebia.cucumber.bol;

import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-bol-report", "json-pretty:target/cucumber-bol-report.json"})
public class BolTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        driver.get("about:blank");
    }

    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.close();
        }
    }


}
