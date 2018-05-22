package testcucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import testcucumber.Practice;

public class Stepdefs {
	private String name;
	private String reply;
	@Given("^My name is Bob$")
	public void my_name_is_Bob() {
	    this.name = "Bob";
	}

	@When("^I enter the name Bob$")
	public void i_enter_the_name_Bob() {
	    this.reply = Practice.practiceMethod(name);
	}

	@Then("^I should be greated with \"([^\"]*)\"$")
	public void i_should_be_greated_with(String arg1) {
	    assertEquals(arg1, reply);
	}
}