package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Opportunity {
	
	@Given("^navigate to opportunity tab$")
	public void navigate_to_opportunity_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("navigate to opportunity tab");
	}

	@When("^create new opportunity$")
	public void create_new_opportunity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("create new opportunity");
	}

	@Then("^opportunity is created$")
	public void opportunity_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("opportunity is created");
	}

}
