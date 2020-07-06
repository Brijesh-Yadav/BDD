package stepdef;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepsdef {
	
	@Given("^user navigates to salesforce for datatable$")
	public void user_navigates_to_salesforce_for_datatable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^user navigates to salesforce for datatable$");
	}

	@When("^enter correct username and password for datatable$")
	public void enter_correct_username_and_password_for_datatable(DataTable arg1) throws Throwable {
	    
	    // List<String>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		List<List<String>> ls = arg1.raw();
		String usero = ls.get(0).get(0);
		String pswdon = ls.get(0).get(1);
		
		String usero2 = ls.get(1).get(0);
		String pswdon2 = ls.get(1).get(1);
		
		String usero3 = ls.get(2).get(0);
		String pswdon3 = ls.get(2).get(1);
		
		
		System.out.println("^enter correct username and password for datatable$");
		
		System.out.println("user name "+usero);
		System.out.println("pswd name "+pswdon);
		
		System.out.println("user name2 "+usero2);
		System.out.println("pswd name2 "+pswdon2);
		
		System.out.println("user name 3 "+usero3);
		System.out.println("pswd name 3"+pswdon3);

	}

	@Then("^login should be successful for datatable$")
	public void login_should_be_successful_for_datatable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^login should be successful for datatable$");
	}

}
