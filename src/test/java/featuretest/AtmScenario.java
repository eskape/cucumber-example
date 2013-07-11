package featuretest;

import com.xebia.models.atm.ATM;
import com.xebia.models.atm.Account;
import com.xebia.models.atm.CreditCard;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class AtmScenario {

    private ATM atm;
    private Account account;
    private CreditCard creditCard;

    private int money;

    @Given("^the account balance is (\\d*)$")
    public void createAccount(int balance) {
        account = new Account(balance);
    }

    @Given("^the card is valid$")
    public void createCreditCard() {
        creditCard = new CreditCard(account);
    }

    @Given("^the machine contains (\\d*)$")
    public void createATM(int money) {
        atm = new ATM(money);
    }

    @When("^the Account Holder requests (\\d*)$")
    public void requestMoney(int amount) {
        money = atm.requestMoney(creditCard, amount);
    }

    @Then("^the ATM should dispense (\\d*)$")
    public void checkMoney(int amount) {
        assertThat(money, is(amount));
    }

    @Then("^the account balance should be (\\d*)$")
    public void checkBalance(int newBalance) {
        assertThat(creditCard.getAccount().getBalance(), is(newBalance));
    }

    @Then("^the card should be returned$")
    public void cardShouldBeReturned() {
        assertFalse(creditCard.isInUse());
    }

}
