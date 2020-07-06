package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tagex {

	@Given("^user navigates to salesforce  for tag$")
	public void user_navigates_to_salesforce_for_tag() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^user navigates to salesforce  for tag$");
	}

	@When("^enter correct username and password  for tag$")
	public void enter_correct_username_and_password_for_tag() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^enter correct username and password  for tag$");
	}

	@Then("^login should be successful for tag$")
	public void login_should_be_successful_for_tag() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^login should be successful for tag$");
	}
	
}
