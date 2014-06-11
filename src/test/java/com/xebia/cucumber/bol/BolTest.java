package com.xebia.cucumber.bol;

import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-bol-report", "json:target/cucumber-bol-report.json"})
public class BolTest {

    public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws MalformedURLException {
        if (driver == null) {
            driver = new ChromeDriver();
            //DesiredCapabilities capability = DesiredCapabilities.chrome();
            //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        }
        driver.get("about:blank");
    }

    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }


}
