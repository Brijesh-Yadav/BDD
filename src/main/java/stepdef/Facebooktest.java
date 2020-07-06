package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooktest {

	WebDriver driver = null;

	@Given("^user navigates to Facebook$")
	public void user_navigates_to_Facebook() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^I enter correct username and password$")
	public void i_enter_correct_username_and_password(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.id("u_0_v")).click();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

	@When("^I enter correct email address and password$")
	public void i_enter_correct_email_address_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^I enter correct phone number and password$")
	public void i_enter_correct_phone_number_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
