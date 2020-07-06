package stepdef;

import cucumber.api.java.en.Given;

public class SalesforceLogin {
	
	@Given("^login into salesforce application$")
	public void login_into_salesforce_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Logged into Salesforce");
	}

}
