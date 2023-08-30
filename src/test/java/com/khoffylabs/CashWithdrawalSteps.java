package com.khoffylabs;

//import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CashWithdrawalSteps {
    
    @Given("^I have \\$(\\d+) in my Account$")
    public void iHave$InMyAccount(int amount) {
        //throw new PendingException();
    }
    
    @When("I request ${int}")
    public void I_request(int i) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int i) {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
