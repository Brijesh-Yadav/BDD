package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.BaseClass;

public class Test2 extends BaseClass{
	
	@Given("^I am on Github home page$")
	public void i_am_on_Github_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser("https://www.google.com/");
		System.out.println("I am on Github home page");
	}

	@When("^I specify Username as “xxxxxxxxxxxxxxxxxxxx” and Password as “xxx”$")
	public void i_specify_Username_as_xxxxxxxxxxxxxxxxxxxx_and_Password_as_xxx() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I specify Username as “xxxxxxxxxxxxxxxxxxxx” and Password as “xxx”");
	}

	@When("^Click on SignIn button$")
	public void click_on_SignIn_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on SignIn button”");
	}

	@Given("^I click on Your Profile option$")
	public void i_click_on_Your_Profile_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on Your Profile option$”");
	}

	@When("^I click on edit profile button$")
	public void i_click_on_edit_profile_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on edit profile button$”");
	}

	@When("^Uploaded new picture$")
	public void uploaded_new_picture() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Uploaded new picture$”");
	}

	@Then("^I should be seeing new profile picture$")
	public void i_should_be_seeing_new_profile_picture() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be seeing new profile picture$”");
	}

}
