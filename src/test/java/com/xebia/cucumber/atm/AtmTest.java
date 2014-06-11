package com.xebia.cucumber.atm;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-atm-report", "json:target/cucumber-atm-report.json"})
public class AtmTest {
}
