package featuretest;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "json:target/cucumber.json" })
public class CucumberTest {
}
