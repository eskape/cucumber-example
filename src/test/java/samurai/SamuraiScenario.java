package samurai;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SamuraiScenario {
    @Given("^something happens in the context$")
    public void something_happens_in_the_context() throws Throwable {
    }

    @Given("^the following skills are allowed \"([^\"]*)\"$")
    public void the_following_skills_are_allowed(String arg1) throws Throwable {
        System.out.println(arg1);
    }

    @When("^a ninja faces a samurai$")
    public void a_ninja_faces_a_samurai() throws Throwable {
    }

    @Then("^he should expect the following attack techniques$")
    public void he_should_expect_the_following_attack_techniques() throws Throwable {
    }
}
