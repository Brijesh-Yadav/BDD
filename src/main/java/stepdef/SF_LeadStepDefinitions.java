package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SF_LeadStepDefinitions {
	
	public String check = "";
	
	@Given("^navigate to lead tab$")
	public void navigate_to_lead_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		check = "hello";
		System.out.println("navigate_to_lead_tab ");
	}

	@When("^create new lead$")
	public void create_new_lead() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(check);
		System.out.println("create_new_lead");
	}

	@Then("^lead is created$")
	public void lead_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lead_is_created");
	}


}
