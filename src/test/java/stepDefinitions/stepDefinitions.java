package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinitions {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("User logs in");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("User enters username and password");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("My Username is: " + strArg1 + " And Password is: " + strArg2);
    }
    
    @Then("^Browse all blogs$")
    public void browse_all_blogs() throws Throwable {
        System.out.println("User browses all blogs");
    }

    @And("^Blogs are displayed$")
    public void blogs_are_displayed() throws Throwable {
        System.out.println("All blogs are displayed");
    }

}